package adapter.xmlparse;

public interface XMLMarketDataFeed {
	public void setStock(String sym);
	public String returnStockDataXML(String sym);
}
