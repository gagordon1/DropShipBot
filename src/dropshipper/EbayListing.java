package dropshipper;

import java.io.IOException;
import java.util.List;

/*
 * Immutable listing object
 */
public class EbayListing implements Listing {
    /**
     * Initializes a new e-bay listing object based on a source URL
     * that contains all necessary information to create the e-bay
     * listing.
     * @param sourceUrl the URL of the source item
     * @param markup the multiplier applied to the buy price 
     *     (source price + estimated shipping) to calculate the listing price.
     * @throws IOException if reading the page fails
     */
    public EbayListing(String sourceUrl, double markup) throws IOException {
        throw new RuntimeException("Not implemented!");
    }
    
    public String getSourceUrl(){
        throw new RuntimeException("Not implemented!");
    }
    
    public String getTitle(){
        throw new RuntimeException("Not implemented!");
    }

    public double getSourcePrice(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the start price of the listing
     */
    public double getListPrice() {
        throw new RuntimeException("Not implemented!");
    }

    public String getDescription(){
        throw new RuntimeException("Not implemented!");
    }
    
    public String getTimeOfListing(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return 2 character ISO country code of seller's registration address
     */
    public String getCountry(){
        throw new RuntimeException("Not implemented!");
    }
    
    public int getQuantity(){
        throw new RuntimeException("Not implemented!");
    }
    
    public String getCurrency(){
        throw new RuntimeException("Not implemented!");
    }

    public List<String> getImageURLs(){
        throw new RuntimeException("Not implemented!");
    }
    /**
     * locations must have the same shipping cost.
     * @return the locations where shipping is supported
     */
    public List<String> getShipToLocations(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the buy it now price of the listing (must be 30% higher than start price)
     */
    public double getBuyItNowPrice() {
        throw new RuntimeException("Not implemented!");
    }
    /**
     * Condition Id may be:
     *  - 1000: new
     *  - 1500: unused but open
     *  - 1750: new with defects
     *  - 2750: seller refurbished
     *  - 3000: used
     *  - 2750: like new
     * @return the condition Id of the item
     */
    public int getConditionId() {
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return the time (in days) the seller commits to to ship the good
     */
    public int getDispatchTimeMax(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * Duration is one of:
     *  {Days_10, Days_5, Days_7, Days_3, GTC (Good til cancelled)}
     *  where GTC is the only supported listing duration for fixed-price listings
     * @return the duration of the listing
     */
    public String ListingDuration(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * This is the type of the e-bay listing which can be one of:
     *     - "Chinese" - auction style
     *     - "FixedPriceItem" - fixed price style
     * @return the listing type
     */
    public String getListingType(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * If specified, must also specify country
     * @return the geographical region of the item
     */
    public String getLocation(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * Valid payment methods include "PayPal" and "CCAccepted"
     * @return a valid payment method
     */
    public String getPaymentMethod(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * Only if paypal is offered as payment method
     * @return e-mail address associated with the PayPal account
     */
    public String getPayPalEmailAddress(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * max length is 10
     * @return the primary category ID for the item
     */
    public String getPrimaryCategoryID(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return lowest price willing to sell the item]
     */
    public double getReservePrice(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return "ReturnsAccepted" or "ReturnsNotAccepted"
     */
    public String getReturnsAcceptedOption(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return 1 for free shipping
     */
    public int getFreeShipping(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return 0.0 if free shipping
     */
    public double getShippingServiceCost(){
        throw new RuntimeException("Not implemented!");
    }
    
    /**
     * @return unique identifier of the e-bay site where the item is listed
     */
    public int getSiteId(){
        throw new RuntimeException("Not implemented!");
    }
    
    
}
