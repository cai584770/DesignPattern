package Decorator;

public class client {
	public static void main(String[] args) {
		 Shape circle = new Circle();
	      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
	      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Բ");
	      circle.draw();
	 
	      System.out.println("Բ����ɫ");
	      redCircle.draw();
	 
	      System.out.println("���Σ���ɫ");
	      redRectangle.draw();
	}
}

