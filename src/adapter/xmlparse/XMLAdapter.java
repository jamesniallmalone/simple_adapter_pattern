package adapter.xmlparse;

import java.util.regex.*;  

public class XMLAdapter implements MarketDataFeed 
{
	private XMLMarketDataFeedImplementation feed;
	private String stockCode;

	public XMLAdapter(String symbol) 
	{
		feed = new XMLMarketDataFeedImplementation(symbol);
		stockCode = symbol;
	}

	public double retrieveStockPrice() 
	{
		/*XMLMarketDataFeed does not contain a function for retrieving stock price itself. 
		 * Work with what we are given, parse the stockprice out of returned info*/
		
		String xmlfeed = feed.returnStockDataXML(stockCode);
		
		Pattern r = Pattern.compile("<stockprice>((.+)?)</stockprice>");
		Matcher m = r.matcher(xmlfeed);
		
		return Double.parseDouble(m.group(1));
	}

	public String returnStockData() 
	{
		//Our goal was to be able to call "returnStockDataXML" without modifying either Client or XmlMarketDataFeedImplemetation. This allows us to do so.
		return feed.returnStockDataXML(stockCode);
	}

}
