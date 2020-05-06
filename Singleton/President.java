package Singleton;

public class President {
    private static volatile President instance=null;    //��֤instance�������߳���ͬ��

    private President(){
        System.out.println("����һ����ͳ��");
    }
    
    public static synchronized President getInstance(){
        if(instance==null){
               instance=new President();
        }else{
           System.out.println("�Ѿ���һ����ͳ�����ܲ�������ͳ��");
        }
        return instance;
    }
    
    public void getName(){
        System.out.println("����������ͳ�������ա�");
    }  
}
