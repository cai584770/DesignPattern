package Observer;
import Observer.ObserverO;

public class ConcreteSubjectB extends SubjectS{
	public ConcreteSubjectB() {
		super();
	}
	
	public void notifyObserver() {
		
		System.out.println("BĿ�귢���ı���");
		for (ObserverO obs : observers) {
			obs.response();
		}
	}
}
