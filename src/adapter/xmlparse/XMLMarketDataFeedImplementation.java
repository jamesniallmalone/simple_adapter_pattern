package adapter.xmlparse;

public class XMLMarketDataFeedImplementation implements XMLMarketDataFeed 
{
	private double stockPrice;
	
	public XMLMarketDataFeedImplementation(String sym){}
	
	public void setStock(String sym)
	{
		stockPrice = 20.50;
	}
	
	public String returnStockDataXML(String sym) 
	{
		setStock(sym);
		return "<xml>\n\t<stock>\n\t\t<stocksymbol>" + sym + "</stocksymbol>\n\t\t<stockprice>" + stockPrice + "</stockprice>\n\t</stock>\n</xml>";
	}
	

}
