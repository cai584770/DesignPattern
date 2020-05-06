package Decorator;

public class client {
	public static void main(String[] args) {
		 Shape circle = new Circle();
	      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
	      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Ô²");
	      circle.draw();
	 
	      System.out.println("Ô²£ººìÉ«");
	      redCircle.draw();
	 
	      System.out.println("¾ØÐÎ£ººìÉ«");
	      redRectangle.draw();
	}
}

