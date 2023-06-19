public class mutithreading extends Thread{
    @Override
    public void run() {
        try{
           for(int i=0;i<5;i++){

            System.out.println(currentThread().getName());
            // sleep(2000);
            yield();
        } 
        }
        catch(Exception e ){

        }
    }
    public static void main(String[] args) {
        mutithreading t1=new mutithreading();
        mutithreading t2=new mutithreading();
        t1.setName("thread1");
        t2.setName("thread2");
        t1.setPriority(1);
        t2.setPriority(10);
        t2.start();
        t1.start();
        // t1.interrupt();    //-->intterupt is used karte hain jab mei chahta hu ki thad waiting state mei entry lete hi wapas na nikle 
    }
}


// public class mutithreading implements Runnable{
//     int seat=1;
//     public synchronized void run(){
//         if(seat>0){

//             System.out.println("seat booked by "+Thread.currentThread().getName());
//             seat--;
//         }
//         else{

//         }
//     }
//     public static void main(String[] args) {
//         mutithreading obj =new mutithreading();
//         Thread t1 =new Thread(obj);
//         Thread t2 =new Thread(obj);
//         Thread t3 =new Thread(obj);
//         t1.setName("vasu");
//         t2.setName("radha");
//         t3.setName("krishna");
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

// public class mutithreading implements Runnable{
//     int seat=2;
//     public void run(){
//         synchronized(this){
//             if(seat>0){

//             System.out.println("seat booked by "+Thread.currentThread().getName());
//             seat--;
//             }
//             else{

//             }
//         } 
//     }
//     public static void main(String[] args) {
//         mutithreading obj =new mutithreading();
//         Thread t1 =new Thread(obj);
//         Thread t2 =new Thread(obj);
//         Thread t3 =new Thread(obj);
//         t1.setName("vasu");
//         t2.setName("radha");
//         t3.setName("krishna");
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }