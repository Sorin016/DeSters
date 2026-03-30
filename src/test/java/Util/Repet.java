package Util;


public class Repet {
    public static void main(String[] args) throws InterruptedException {
        Count cc=new Count();
        Runnable r1=()->{
            for(int i=0;i<=1000;i++){
                cc.count();
            }
        };
        Runnable r2=()->{
            for(int i=0;i<=1000;i++){
                cc.count();
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cc.count);
    }
}
class Count{
    int count=1;
    public synchronized void count(){
        count++;
    }
}