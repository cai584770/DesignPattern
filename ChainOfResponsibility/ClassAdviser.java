package ChainOfResponsibility;

public class ClassAdviser extends Leader{
    public void handleRequest(int LeaveDays){
        if(LeaveDays<=2) {
            System.out.println("��������׼�����" + LeaveDays + "�졣");       
        }else{
            if(getNext() != null) {
                getNext().handleRequest(LeaveDays);             
            }else{
                  System.out.println("�������̫�࣬û������׼�ü�����");
            }
        } 
    } 
}