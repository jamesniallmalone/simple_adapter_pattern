package adapter.xmlparse;

public class MarketDataFeedImplementation implements MarketDataFeed 
{
	private String stockCode;

	public MarketDataFeedImplementation(String code) 
	{
		stockCode = code;
	}

	@Override
	public double retrieveStockPrice() 
	{
		return 20.50;
	}

	@Override
	public String returnStockData() {
		return stockCode + ", " + retrieveStockPrice();
	}

}
