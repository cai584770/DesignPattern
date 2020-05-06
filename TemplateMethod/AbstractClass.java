package TemplateMethod;

public abstract class AbstractClass {
	public abstract void PrimitOperation1();
	public abstract void PrimitOperation2();
	
	public void TemplateMethod() {
		PrimitOperation1();
		PrimitOperation2();
		System.out.println(" ");
	}
}
