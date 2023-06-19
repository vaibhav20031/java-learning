// 11111111111111111111111111111111111111111111111111111111111111111111111111111111111
// // import java.io.*;
// // public class demo{
// //     void check_balanace(){
// //         int balance=0;
        
// //         if(balance==0){
// //             throw new ArithmeticException("insufficient balance");
// //         }
// //         else{
// //             System.out.println("balance is"+balance);
// //         }
// //     }
// //     public static void main(String[] args) {
// //         demo obj =new demo();
// //         try{

// //             obj.check_balanace();
// //         }
// //         catch(Exception e ){
// //             e.printStackTrace();
// //             System.out.println(e.getMessage());
// //             System.out.println(e);
// //         }
// //     }
// // }



// import java.io.*;
// class CustomException extends Exception{
//     CustomException(String s){   //constructor 
//         super(s);   
//     }
// }
//  class demo {
//     void check_balanace()throws Exception{
//         int balance=0;
        
//         if(balance==0){
//             throw new CustomException("insufficient balance");
//         }
//         else{
//             System.out.println("balance is"+balance);
//         }
//     }
//     public static void main(String[] args) {
//         demo obj =new demo();
//         try{

//             obj.check_balanace();
//         }
//         catch(Exception e ){
//             e.printStackTrace();
//             System.out.println(e.getMessage());
//             System.out.println(e.getMessage());
//             System.out.println(e);
//         }
//     }
// }

import java.util.StringTokenizer;

class CustomException{
    public static void main(String[] args) {
        StringTokenizer obj=new StringTokenizer("vaibhavaggarwal","a");
        while(obj.hasMoreTokens()){
            System.out.println(obj.nextToken());
        }
    }
}
