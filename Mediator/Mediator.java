package Mediator;

public interface Mediator {
	void register(AbstractColleague colleague);
    void relay(AbstractColleague colleague);
}
