package Adapter;

public class client {
	public static void main(String[] args) {
        System.out.println("��������ģʽ���ԣ�");
        Target target = new ClassAdapter();
        target.request();
	}
}