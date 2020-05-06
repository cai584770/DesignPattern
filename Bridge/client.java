package Bridge;

public class client {
	public static void main(String[] args) {
		Abstraction ab = new RefineAbstraction();
		
		ab.setImplementor(new ConcreteImplementorA());
		ab.Operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.Operation();
	}
}
