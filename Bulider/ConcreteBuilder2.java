package Bulider;

public class ConcreteBuilder2 extends Builder{
	private Product product = new Product();
	
	@Override
	public void BuildPartA() {
		product.Add("����X");
	}

	@Override
	public void BuildPartB() {
		product.Add("����Y");
	}

	@Override
	public Product GetResult() {
		return product;
	}
}
