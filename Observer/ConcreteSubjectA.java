package Observer;
import Observer.ObserverO;

public class ConcreteSubjectA extends SubjectS{

	public ConcreteSubjectA() {
		super();
	}
	
	public void notifyObserver() {
		
		System.out.println("AĿ�귢���ı���");
		for (ObserverO obs : observers) {
			obs.response();
		}
	}
}