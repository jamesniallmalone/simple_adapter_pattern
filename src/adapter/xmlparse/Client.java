package adapter.xmlparse;

public class Client {
	
	private MarketDataFeed myData;
	
	public Client(MarketDataFeed feed){
		myData = feed;
	}
	
	public String getMarketData(){
		return myData.returnStockData();
	}

}
