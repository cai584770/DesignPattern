package State;

public class ConcreteStateA extends State{

	@Override
	public void Handle(Context context) {
        System.out.println("��ǰ״̬�� A.");
        context.setState(new ConcreteStateB());
	}
}
