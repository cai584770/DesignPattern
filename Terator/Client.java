package Terator;

public class Client {
	public static void diaplay(Television tv) {
		TVIterator i = tv.createIterator();
		System.out.println("µÁ ”∆µµ¿:");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}

	}
}
