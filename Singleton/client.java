package Singleton;

public class client {
	public static void main(String[] args) {
        President zt1=President.getInstance();
        zt1.getName();    
        President zt2=President.getInstance();
        zt2.getName();
        
        if(zt1==zt2){
           System.out.println("������ͬһ�ˣ�");
        }else{
           System.out.println("���ǲ���ͬһ�ˣ�");
        }
	}
}
