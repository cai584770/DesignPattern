package Flyweight;
/*
 * �ο���վ��https://blog.csdn.net/qq_40378034/article/details/104101065
 */
public class client {
	public static void main(String[] args) {
		Flyweight fw0 = FlyweightFactory.getFlyweight("a");
        Flyweight fw1 = FlyweightFactory.getFlyweight("b");
        Flyweight fw2 = FlyweightFactory.getFlyweight("a");
        Flyweight fw3 = FlyweightFactory.getFlyweight("b");
        
        fw1.operation("abc");
        System.out.printf("[���(����Ա�)] - [%s]\n", fw0 == fw2);
        System.out.printf("[���(����״̬)] - [%s]\n", fw1.getType());
	}
}
