// public class practice extends practice2{
//     int a=100;
//     void show(){
//         super.show();
//     }
//     public static void main(String[] args){
//         practice obj =new practice();
//         obj.show();
//     }
// }
                //  this---> used to call default constructir of same class 
                // this---> used to call parameteried construcor of same clas with ths keyword 
// public class practice{
//     practice(){
//         this(20);
//         System.out.println("default");
//     }
//     practice(int a){
//         // this();
//         System.out.println(a);
//     }
//     public static void main(String[] args ){
//         // practice obj=new practice(10);
//         practice obj2=new practice();
//     }
// }

                       //statuc block --->dont need object 
                    //   instance bock---> need object 

// class practice{
//     {
//         System.out.println("i am instance block");
//     }
//     static{
//         System.out.println("i am static block");
//     }
//     public static void main(String[] args){
//         practice obj=new practice();     //static can run without object 
//     }
// }

