package dropshipper;

import java.util.List;

public interface Scraper {
    
    /**
     * @return the title of the target item
     */
    public String getTitle();
    
    /**
     * @return the price of the item on the source web site in USD
     */
    public double getSourcePrice();
    
    /**
     * @return the description of the listed item
     */
    public String getDescription();
    
    /**
     * @return the country location of the listing
     *     as a 2 character valid ISO country code.
     */
    public String getCountry();
    
    /**
     * @return quantity of items in the listing
     */
    public int getQuantity();
    
    /**
     * @return three character currency of the listing
     */
    public String getCurrency();
    
    /**
     * @return "ReturnsAccepted" or "ReturnsNotAccepted"
     */
    public String getReturnsAcceptedOption();
    
    /**
     * locations must have the same shipping cost.
     * @return the locations where shipping is supported
     */
    public List<String> getShipToLocations();
    
    /**
     * @return list of valid image URLs for the listing
     */
    public List<String> getImageURLs();
    
    
    /**
     * @return the cost of shipping to the shipTo locations
     */
    public double getShippingCost();
    
    /**
     * @return range of the amount of days shipping is expected to take
     *     in the form of [minimum, maximum]
     */
    public int[] getExpectedShippingTime();
    

}
