package adapter.xmlparse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestXMLMarketDataFeed {
	
	private XMLMarketDataFeedImplementation xmdfi;

	@Before
	public void initialise(){
		xmdfi = new XMLMarketDataFeedImplementation("FOOBAR");
	}
	
	@Test
	public void testXMLMarketDataFeedImplementation() {
		assertNotNull("Item should not be null",xmdfi);
	}

	@Test
	public void testReturnStockDataXML() {
		//
		assertEquals("Magic number not returned", 
				"<xml>\n\t<stock>\n\t\t<stocksymbol>FOOBAR</stocksymbol>\n\t\t<stockprice>20.5</stockprice>\n\t</stock>\n</xml>", 
				xmdfi.returnStockDataXML("FOOBAR"));
	}
	
	

}
