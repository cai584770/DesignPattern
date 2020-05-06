package State;

public class ConcreteStateA extends State{

	@Override
	public void Handle(Context context) {
        System.out.println("µ±Ç°×´Ì¬ÊÇ A.");
        context.setState(new ConcreteStateB());
	}
}
