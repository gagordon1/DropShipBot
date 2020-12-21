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
        final double startPriceMarkup = 1.3;
        final double reservePriceMarkup = 1.5;
        final double buyItNowPriceMarkup = 1.7;
        final int internalId = 1;
        final Duration duration = Duration.TEN;
        final EbayListing listing = new EbayListing(url, internalId, startPriceMarkup, reservePriceMarkup,
                buyItNowPriceMarkup,  duration);
        
        
        final String correctTitle = "Sportrendy Men's Shirt Dress Casual Long Sleeve Slim Fit Fashion Dragon Stylish ";
        final double sourcePrice = 17.99;
        final double listPrice = 23.39;
        final String description = null;//TODO
        final String timeOfListing = null; //HARD TO CHECK TODO
        final String country = "US";
        final int quantity = 1;
        final String currency = "USD";
        final List<String> imageURLs = List.of(
                "https://ae01.alicdn.com/kf/Hef1f2a3e6b1d43aab587d2f5f1dd19e7k/Original-Apple-Magic-Mouse-1-Wireless-Bluetooth-Mouse-for-Mac-Book-Macbook-Air-Mac-Pro-Ergonomic.jpg_Q90.jpg_.webp",
                "https://ae01.alicdn.com/kf/H311f262da96144748abb9d5caeeed74eL/Original-Apple-Magic-Mouse-1-Wireless-Bluetooth-Mouse-for-Mac-Book-Macbook-Air-Mac-Pro-Ergonomic.jpg_Q90.jpg_.webp",
                "https://ae01.alicdn.com/kf/H9c0e25d4bbf94d10b6190415ae2a8716k/Original-Apple-Magic-Mouse-1-Wireless-Bluetooth-Mouse-for-Mac-Book-Macbook-Air-Mac-Pro-Ergonomic.jpg_Q90.jpg_.webp",
                "https://ae01.alicdn.com/kf/H1ad8923ec31a416792c173278e96732ej/Original-Apple-Magic-Mouse-1-Wireless-Bluetooth-Mouse-for-Mac-Book-Macbook-Air-Mac-Pro-Ergonomic.jpg_Q90.jpg_.webp",
                "https://ae01.alicdn.com/kf/H61d5f19556794853843b40f33cdc827ad/Original-Apple-Magic-Mouse-1-Wireless-Bluetooth-Mouse-for-Mac-Book-Macbook-Air-Mac-Pro-Ergonomic.jpg_Q90.jpg_.webp",
                "https://ae01.alicdn.com/kf/H1dccc455b49549a29d4929775d0ff5ccx/Original-Apple-Magic-Mouse-1-Wireless-Bluetooth-Mouse-for-Mac-Book-Macbook-Air-Mac-Pro-Ergonomic.jpg_Q90.jpg_.webp"
                );
        final boolean shipsToUS = true;
        
        final double buyItNowPrice = 39.763;
        
        final int conditionId = 1000;
        
        final int dispatchTime = 3; //TODO
        
        final String listingDuration = "Days_3";
        
        final String listingType = "Chinese";
        
        //IF can't tell say Houston, Texas
        final String location = "Houston, Texas";
        
        final String paymentMethod = "PayPal";
        
        final String payPalEmailAddress = "garrettg45@gmail.com";
        
        final String primaryCategoryId = "23160";
        
        final double reservePrice = 35.09;
        
        final int freeShipping = 1;
        
        final double shippingServiceCost = 0.0;
        
        final int siteId = 0;
        
        
        final List<Object> correctValues = List.of(
                internalId,
                url,
                correctTitle,
                sourcePrice,
                listPrice,
                description,
                timeOfListing,
                country,
                quantity,
                currency,
                imageURLs,
                shipsToUS,
                buyItNowPrice,
                conditionId,
                dispatchTime,
                listingDuration,
                location,
                paymentMethod,
                payPalEmailAddress,
                primaryCategoryId,
                reservePrice,
                freeShipping,
                shippingServiceCost,
                siteId
                );
                
        assertCorrectEbayValues(listing, correctValues);
        
    
        
    }
    
    
    private void assertCorrectEbayValues(EbayListing listing, List<Object> values) {
        
        
    }
    /**
     * Given a web site, this copies the HTML data and makes a local copy in
     * the testFiles directory
     * @param urlString the string representing the HTTP URL
     * @param testFileName the name of the file to be created
     * @throws IOException if there is an error reading the web page or creating the file.
     */
    public static void createTestFileFromUrl(String testFileName, String urlString) throws IOException {
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