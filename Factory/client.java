package Factory;

public class client {
	public static void main(String[] args) {
		Factory factor = new AFactory();
		Fruit fruit = factor.CreateFruit();
		fruit.eat();
	}
}
