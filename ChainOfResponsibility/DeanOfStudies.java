package ChainOfResponsibility;

public class DeanOfStudies extends Leader{
    public void handleRequest(int LeaveDays){
        if(LeaveDays<=20) {
            System.out.println("���񴦳���׼�����"+LeaveDays+"�졣");       
        }else{
              if(getNext()!=null) {
                getNext().handleRequest(LeaveDays);          
            }else{
                  System.out.println("�������̫�࣬û������׼�ü�����");
            }
        } 
    } 
}
