import java.io.IOException;
import java.lang.*;
public class multithred extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("radha");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception{
        multithred t=new multithred();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("krishna");
            Thread.sleep(1000);
        }
    }
}
