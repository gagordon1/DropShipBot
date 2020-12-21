package dropshipper;

import java.io.IOException;

/*
 * Immutable listing object
 */
public class EbayListing implements Listing {
    /**
     * Initializes a new e-bay listing object based on a source URL
     * that contains all necessary information to create the e-bay
     * listing.
     * @param sourceUrl the URL of the source item
     * @throws IOException if reading the page fails
     */
    public EbayListing(String sourceUrl) throws IOException {
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the URL for the source of the listed item
     */
    public String getSourceUrl(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the title of the listed item
     */
    public String getTitle(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the price of the item on the source web site in USD
     */
    public double getSourcePrice(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the description of the listed item
     */
    public String getDescription(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return time of listing in UTC ISO format 
     *    (e.g: 2019-11-14T00:55:31.820Z)
     */
    public String getTimeOfListing(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the country location of the listing
     *     as a 2 character valid ISO country code.
     */
    public String getCountry(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return quantity of items in the listing
     */
    public int getQuantity(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return three character currency of the listing
     */
    public String getCurrency(){
        throw new RuntimeException("Not implemented!");
    }
}
