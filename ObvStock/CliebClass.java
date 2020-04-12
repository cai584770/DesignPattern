package ObvStock;

public class CliebClass {
	public static void main(String[] args) {
		AStockPrice futures1 = new StockFutures("111"); 
		AStockPrice futures2 = new StockFutures("222"); 
		AStockPrice futures3 = new StockFutures("333"); 
		
		AStockPrice common5 = new StockCommon("555");
		AStockPrice common6 = new StockCommon("666");
		AStockPrice common7 = new StockCommon("777");
		
		IStockHolder buy1 = new BuyHolder("buy1"); 
		IStockHolder buy2 = new BuyHolder("buy2"); 
		IStockHolder buy3 = new BuyHolder("buy3"); 
		
		IStockHolder sell1 = new SellHolder("sell1");
		IStockHolder sell2 = new SellHolder("sell2");
		IStockHolder sell3 = new SellHolder("sell3");
		
		buy1.AddHolder(futures1);
		buy1.AddHolder(futures2);
		buy1.AddHolder(common5);
		
		buy2.AddHolder(futures1);
		buy2.AddHolder(futures3);
		buy2.AddHolder(common6);
		
		buy3.AddHolder(futures3);
		buy3.AddHolder(futures3);
		buy3.AddHolder(common7);
		
		sell1.AddHolder(futures1);
		sell1.AddHolder(futures2);
		sell1.AddHolder(common5);
		
		sell2.AddHolder(futures1);
		sell2.AddHolder(futures3);
		sell2.AddHolder(common7);
		
		sell3.AddHolder(futures1);
		sell3.AddHolder(common6);
		sell3.AddHolder(common5);
		
		for (int i = 0; i > -5; i--) {
			futures1.setPrice(1 + i);
			futures2.setPrice(1 + i);
			futures3.setPrice(1 + i);
			
			common5.setPrice(1 + i);
			common6.setPrice(1 + i);
			common7.setPrice(1 + i);
		}
	}
}
