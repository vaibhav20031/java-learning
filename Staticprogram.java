// public class Staticprogram  {
//     static int a =10;
//     // public void show(){
//     //     a=20;
//     //     System.out.println(a);
//     // }
//     static class a extends Staticprogram{
//         public void show(){
//             a=20;
//             System.out.println("value of a in static class is :"+a);
//         }
//     }

//     public static void main(String[] args){
//         System.out.println("    VAIBHAV AGGARWAL \n IT -A ");
//         System.out.println("value of static variable :"+a);
//         // Staticprogram obj=new Staticprogram();
//         a obj=new a();
//         obj.show();
//     }
// }

final class Staticprogram{
    // final int a =10;
    final int a;
    // final static int c=30;
    final static int b;
    Staticprogram(){
        a=100;
    }
    static{
        b=40;
    }
    void show(){
        System.out.println("value of final variable A= "+a);
        System.out.println("value of static final variable B = "+b);
        // System.out.println("c is "+c);
        // System.out.println("d is"+d);
    }
    public static void main(String[] args){
        System.out.println("  VAIBHAV AGGARWAL \n  ROLL- 21 ");
        Staticprogram obj=new Staticprogram();
        obj.show();
    }
}