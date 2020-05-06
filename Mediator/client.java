package Mediator;

/*
 * �ο���վ��https://blog.csdn.net/codedancing/article/details/104729660
 */

public class client {
	public static void main(String[] args) {
        Mediator mediator = new WeChatMediator();

        AbstractColleague alice = new ConcreteColleague("Alice");
        AbstractColleague bob = new ConcreteColleague("Bob");
        AbstractColleague john = new ConcreteColleague("John");

        mediator.register(alice);
        mediator.register(bob);
        mediator.register(john);

        alice.send("Bob", "�����������գ�ף�����տ��֣�");
        bob.send("Alice", "лл�㣡�ҵĺ����ѣ�");
        bob.send("John", "��ĩ�п�һ�����");
        john.send("Bob", "��ѽ��������ɢ��");
	}
}
