package dropshipper;

import java.util.List;

/*
 * Immutable scraper object that collects the necessary data
 * to make a listing for an item
 */
public class AliExpressScraper implements Scraper{
    
    /**
     * Initializes a scraper 
     * @param itemUrl the URL of the target item
     */
    public AliExpressScraper(String itemUrl){
        // TODO Auto-generated method stub
    }

    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }

    public double getSourcePrice() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getCountry() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getQuantity() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String getCurrency() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getReturnsAcceptedOption() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<String> getShipToLocations() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<String> getImageURLs() {
        // TODO Auto-generated method stub
        return null;
    }

    public double getShippingCost() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int[] getExpectedShippingTime() {
        // TODO Auto-generated method stub
        return null;
    }

}
