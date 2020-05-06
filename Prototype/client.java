package Prototype;

public class client {
	public static void main(String[] args){
		ConcretePrototype cp = new ConcretePrototype();
		ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
		clonecp.show();
	}
}
