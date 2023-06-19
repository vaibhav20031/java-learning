import java.lang.*;
public class mutithread2 {
    public static void main(String[] args) throws InterruptedException{
        multithred t=new multithred();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("krishna");
        }
    }
}
