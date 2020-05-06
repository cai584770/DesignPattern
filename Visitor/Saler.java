package Visitor;

public class Saler extends AVisitor{

	public void visit(Apple apple) {
		System.out.println("收银员" + name + "给苹果过秤，然后计算其价格。");
	}

	public void visit(Book book) {
		System.out.println("收银员" + name + "直接计算书 的价格。");
	}
	
}
