package dropshipper;

/*
 * Immutable listing object
 */
public interface Listing {
    
    public static enum Issues{
        ITEM_URL_NOT_AVAILABLE,
        ITEM_LOW_ON_STOCK,
        ITEM_OUT_OF_STOCK,
        ITEM_CANNOT_BE_SHIPPED
    }
    
    
    /**
     * @return the URL for the source of the listed item
     */
    public String getSourceUrl();
    
    /**
     * @return the title of the listed item
     */
    public String getTitle();
    
    /**
     * @return the price of the item on the source web site in USD
     */
    public double getSourcePrice();
    
    /**
     * @return the price of the item on the sell web site in USD
     */
    public double getListPrice();
    
    /**
     * @return the description of the listed item
     */
    public String getDescription();
    
    /**
     * @return time of listing in UTC ISO format 
     *    (e.g: 2019-11-14T00:55:31.820Z)
     */
    public String getTimeOfListing();
    
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
}
