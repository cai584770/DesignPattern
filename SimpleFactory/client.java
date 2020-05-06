package SimpleFactory;

public class client {
	public static void main(String[] args) {
		Factory factor = new Factory();
		
		Fruit fruit =  factor.CreatFruit("A");
		fruit.eat();
	}
}
