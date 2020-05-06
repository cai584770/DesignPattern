package Flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String type;

    public ConcreteFlyweight(String type) {
        this.type = type;
    }

    @Override
    public void operation(String name) {
        System.out.printf("[����(����״̬)] - [%s] - [����(����״̬)] - [%s]\n", type, name);
    }

    @Override
    public String getType() {
        return type;
    }
}
