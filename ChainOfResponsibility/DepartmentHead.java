package ChainOfResponsibility;

public class DepartmentHead extends Leader{
    public void handleRequest(int LeaveDays){
        if(LeaveDays<=7) {
            System.out.println("ϵ������׼�����" + LeaveDays + "�졣");       
        }else{
            if(getNext() != null) {
                  getNext().handleRequest(LeaveDays);             
            }else{
                System.out.println("�������̫�࣬û������׼�ü�����");
           }
        } 
    } 
}