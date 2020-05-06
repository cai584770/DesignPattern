package Mediator;

/*
 * 参考网站：https://blog.csdn.net/codedancing/article/details/104729660
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

        alice.send("Bob", "明天是你生日，祝你生日快乐！");
        bob.send("Alice", "谢谢你！我的好朋友！");
        bob.send("John", "周末有空一起打球？");
        john.send("Bob", "好呀，不见不散！");
	}
}
