package Terator;

public class Client {
	public static void diaplay(Television tv) {
		TVIterator i = tv.createIterator();
		System.out.println("����Ƶ��:");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}

	}
}
