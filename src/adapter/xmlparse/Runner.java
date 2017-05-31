package adapter.xmlparse;

/* Name: Adapter.
 * 
 * Type: Structural
 * 
 * Intent: Converts the interface of a class into another interface that the clients expect.
 * 
 * Solution: Provides a stable interface to similar components with different interfaces.
 * 
 * Example: Currently use "old" solution, which returns data as XXX,YYYY. ie: a String, a comma, and the price. (MarketDataFeedImplementation).
 *          We find a better solution which uses XML (XMLMarketDataFeedImplementation). We could rewrite the client to match the new class,
 *          or we could create an adapter which implements the old interface.
 *          
 *          XMLAdapter creates a bridge to the new implementation, and this is executed in the same way as before.
 *          
 *          Next task will be to remove the stale code, which can now be done safely.
 */

public class Runner 
{
	public static void main(String[] args) 
	{
		//OLD
		System.out.println("-- old version --");
		MarketDataFeed myData = new MarketDataFeedImplementation("IMG");
		Client myclient = new Client(myData);
		System.out.println(myclient.getMarketData() + "\n");
		
		//New (with Adapter) 
		System.out.println("-- xml adapter version --");
		MarketDataFeed XML_myData = new XMLAdapter("IMG");
		Client xml_myclient = new Client(XML_myData);
		System.out.println(xml_myclient.getMarketData() + "\n");

	}

}
