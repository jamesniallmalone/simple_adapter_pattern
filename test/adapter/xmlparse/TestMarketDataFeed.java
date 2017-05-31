package adapter.xmlparse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMarketDataFeed {

	private MarketDataFeedImplementation mdfi;

	@Before
	public void initialise(){
		mdfi = new MarketDataFeedImplementation("FOOBAR");
	}
	
	@Test
	public void testMarketDataFeedImplementation() {
		assertNotNull("Item should not be null",mdfi);
	}

	@Test
	public void testRetrieveStockPrice() {
		assertEquals("Magic number not returned", 20.50, mdfi.retrieveStockPrice(), 0);
	}

	@Test
	public void testReturnStockData() {
		assertEquals("Magic number not returned", "FOOBAR, 20.5", mdfi.returnStockData());
	}

}
