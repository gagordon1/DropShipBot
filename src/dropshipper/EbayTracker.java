package dropshipper;

import java.io.IOException;
import java.util.List;

public class EbayTracker implements Tracker {

    public synchronized void refresh() {
        // TODO Auto-generated method stub
        
    }

    public synchronized void addListing(Listing listing) throws IOException {
        // TODO Auto-generated method stub
        
    }

    public synchronized void removeListing(int internalId) throws IOException {
        // TODO Auto-generated method stub
        
    }

    public synchronized List<Listing> getSelling() {
        // TODO Auto-generated method stub
        return null;
    }

    public synchronized List<Listing> getSold() {
        // TODO Auto-generated method stub
        return null;
    }

    public synchronized List<Listing> getShipped() {
        // TODO Auto-generated method stub
        return null;
    }

    public synchronized List<Listing> getDelivered() {
        // TODO Auto-generated method stub
        return null;
    }

}
