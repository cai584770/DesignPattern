package ChainOfResponsibility;

public class Dean extends Leader{
    public void handleRequest(int LeaveDays){
        if(LeaveDays<=10) {
            System.out.println("Ժ����׼�����" + LeaveDays + "�졣");       
        }else{
              if(getNext() != null) {
                getNext().handleRequest(LeaveDays);             
            }else{
                  System.out.println("�������̫�࣬û������׼�ü�����");
            }
        } 
    } 
}
