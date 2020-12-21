package dropshipper;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import dropshipper.EbayListing.Duration;

public class EbayListingTest{
    
    /*
     * Testing Strategy:
     * 
     * Create e-bay listings from valid supported web sites:
     * currently: AliExpress
     * 
     * partitions:
     *     web site: AliExpress,
     *     URL: valid, invalid
     *     Condition: new, not new
     *     Currency: USD, not USD
     *     Duration: 3, 5, 7, 10
     *     ShipToLocations: 1, >1
     *     Title: length < 80, length > 80
     *     BuyItNowPrice: 30% higher than start price, Not 30% higher
     *     
     * 
     */
    
    
    /**
     * Tests that assertions are enabled.
     */
    @Test
    public void testAssertionsEnabled() {
        assertThrows(AssertionError.class, () -> { assert false; });
    }
    
    /*
     * Partitions:
     *     web site: AliExpress
     *     URL: valid
     *     Condition: new
     *     Currency: USD
     *     Duration: 10
     *     ShipToLocations: >1
     *     Title: >80
     *     BuyItNowPrice: 30% higher
     */
    @Test
    public void testDragonLongSleeve() throws IOException{
        final String url = "file:///Users/garrettgordon/Desktop/DropShipBot/testSites/dragonLongSleeve";
        final double startPrice = 20.0;
        final double reservePrice = 25.0;
        final double buyItNowPrice = 30;
        final int internalId = 1;
        final Duration duration = Duration.TEN;
        
        Listing listing = new EbayListing(url, internalId, startPrice, reservePrice, buyItNowPrice,  duration);
        assertCorrectEbayValues(listing, new ArrayList<>());
        
    
        
    }
    
    
    private void assertCorrectEbayValues(Listing listing, List<String> values) {
        
    }
    /**
     * Given a web site, this copies the HTML data and makes a local copy in
     * the testFiles directory
     * @param urlString the string representing the HTTP URL
     * @param testFileName the name of the file to be created
     * @throws IOException if there is an error reading the web page or creating the file.
     */
    public static void createTestFileFromUrl(String urlString, String testFileName) throws IOException {
        URL url = new URL(urlString);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;

        StringBuilder op = new StringBuilder();

        while ((line = br.readLine()) != null) {
            op.append(line);
            op.append(System.lineSeparator());
        }
        File output = new File("testSites/" + testFileName);
        output.createNewFile();
        FileWriter writer = new FileWriter(output);
        writer.append(op);
        writer.close();
    }
    
    
    
    
}