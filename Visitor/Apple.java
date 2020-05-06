package Visitor;

public class Apple implements IProduct{
	public void accept(AVisitor visitor) {
		visitor.visit(this);
	}
}
