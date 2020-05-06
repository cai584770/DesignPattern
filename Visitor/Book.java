package Visitor;

public class Book implements IProduct{
	public void accept(AVisitor visitor) {
		visitor.visit(this);
	}
}
