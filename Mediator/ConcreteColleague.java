package Mediator;

public class ConcreteColleague extends AbstractColleague{
    public ConcreteColleague(String username) {
        super(username);
    }

    @Override
    public void receive(Message message) {
        System.out.println(String.format("[%s] �ѽ��գ�%s [%s�����ڣ�%s]\n", username, message.getContent(), message.getSender(), message.getSendTime()));
    }

    @Override
    public void send(String receiver, String content) {
        message = new Message(receiver, content);
        System.out.println(String.format("[%s] ���͸� [%s]��%s", username, receiver, content));
        mediator.relay(this);
    }
}
