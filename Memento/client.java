package Memento;

public class client {
	public static void main(String[] args) {
        Originator or=new Originator();
        Caretaker cr=new Caretaker();       
        or.setState("S0"); 
        System.out.println("��ʼ״̬:"+or.getState());           
        cr.setMemento(or.createMemento()); //����״̬      
        or.setState("S1"); 
        System.out.println("�µ�״̬:"+or.getState());        
        or.restoreMemento(cr.getMemento()); //�ָ�״̬
        System.out.println("�ָ�״̬:"+or.getState());
	}
}
