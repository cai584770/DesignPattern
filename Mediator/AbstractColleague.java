package Mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public abstract class AbstractColleague {

    protected Mediator mediator;
    protected String username;
    protected Message message;

    public AbstractColleague(String username) {
        this.username = username;
    }

    public abstract void receive(Message message);
    public abstract void send(String receiver, String content);

    public Message getMessage() {
        return message;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractColleague that = (AbstractColleague) o;
        return Objects.equals(mediator, that.mediator) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator, username);
    }

    class Message {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        private String sender;
        private String receiver;
        private String content;
        private String sendTime;

        public Message(String receiver, String content) {
            this.sender = AbstractColleague.this.username;
            this.receiver = receiver;
            this.content = content;
            this.sendTime = dateFormat.format(Calendar.getInstance().getTime());
        }

        public String getContent() {
            return content;
        }

        public String getSendTime() {
            return sendTime;
        }

        public String getSender() {
            return sender;
        }

        public String getReceiver() {
            return receiver;
        }

    }

}