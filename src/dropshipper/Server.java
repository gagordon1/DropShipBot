package dropshipper;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;

/*
 * Server handles HTTP requests from a client and responds with a graphical display of the system.
 */
public class Server{
    
    //enum type representing web sites where buying 
    //items are supported
    public static enum BuyWebsite {
        ALIEXPRESS
    }
    
    //enum type representing web sites where selling 
    //items are supported
    public static enum SellWebsite {
        EBAY
    }
	
   /**
    * Initializes a server on a specified port.
    * @param port server port number
    * @throws IOException if an error occurs starting the server
    */
   public Server(int port) throws IOException{
		throw new RuntimeException("Not implemented!");
	}
   
   /**
    * Given a request matching the request grammar, take the item from its 
    * supplied web site and URL, then create a valid listing for it on the 
    * specified sell web site. Assigns the item a unique internal global id 
    * and adds the item to the listing tracker as a selling item.
    * @param exchange HTTP request/response, modified by this method to send a
    *           response to the client and close the exchange
    */
   public void handleAddListing(HttpExchange exchange) {
       throw new RuntimeException("Not implemented!"); 
   }
   
   /**
    * Given a request matching the request grammar, get the item from its unique 
    * identifier, remove it from the site where it is listed and remove it from 
    * the tracker.
    * Responds with an error code if the request is malformed.
    * Responds with a message matching our grammar if the listing is not
    * properly removed from the selling web site afterwards
    * @param exchange HTTP request/response, modified by this method to send a
    *           response to the client and close the exchange
    *           
    */
   public void handleRemoveListing(HttpExchange exchange) {
       throw new RuntimeException("Not implemented!");
   }
   
   /**
    * Given a request matching the request grammar, check each item in the system
    * for changes and move them accordingly. 
    * Responds with an error code if the request is malformed.
    * @param exchange HTTP request/response, modified by this method to send a
    *           response to the client and close the exchange
    */
   public void handleRefreshListings(HttpExchange exchange) {
       throw new RuntimeException("Not implemented!");
   }
   
   
   /**
    * Given a request matching the request grammar, outputs a string matching our 
    * response grammar that represents the state of the tracker system.
    * Responds with an error code if the request is malformed.
    * @param exchange HTTP request/response, modified by this method to send a
    *           response to the client and close the exchange
    */
   public void handleDisplay(HttpExchange exchange) {
       throw new RuntimeException("Not implemented!");
   }
   
   /**
    * Given a request matching the request grammar, updates a google sheet
    * with data about the system. (Sold items, purchased items, revenue, 
    * expenditures etc.) TODO: be more clear about which data points etc.
    * 
    * @param exchange HTTP request/response, modified by this method to send a
    *           response to the client and close the exchange
    */
   public void handleUpdateLedger(HttpExchange exchange) {
       throw new RuntimeException("Not implemented!");
   }
   

	public static void main(String[] args) {
		System.out.println("Howdy!");
	}


}
