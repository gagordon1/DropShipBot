package dropshipper;

import java.io.IOException;

/*
 * Tracks listings as they move from selling -> sold -> shipped -> delivered 
 * and flags "issue" listings if they move off that track.
 */
public interface Tracker {
    
    /**
     * Refreshes the items in the system.
     * More specifically: 
     *     - If an item that is selling has been sold, move it to sold
     *     - If an item that has been sold has been shipped, move it to shipped
     *     - If an item has been delivered, move it to delivered
     *       
     *       ISSUES: buying URL no longer available, item is out of stock or low on stock
     *     - If there is an issue with an item that is selling, remove it's listing
     *       on the specified web site. Move it to the issues category and update the item
     *       with the reason for the issue
     *     - If there is an issue with an item that has been sold, shipped or delivered,
     *       move item to the issues category and update the item with the reason for the issue
     */
    public void refresh();
    
    
    /**
     * Lists a new item and adds it to the selling category of the tracker
     * Assigns the item the next id above the most recent added
     * @param listing the item and its details
     * @throws IOException if there is an error listing the item 
     */
    public void addListing(Listing listing) throws IOException;
    
    
    
}
