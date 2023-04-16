// public class exception {
//     public static void main(String[] args){
//         int a =2,b=0;
//         try{
            
//             System.out.println(a/b);                
            
//         }
//         catch(Exception e){
//             System.out.println("handled cant divide zero");
//         }
//     }
// }
                //  ------->  file handling 

import java.io.*;
public class exception {
    public static void main(String[] args){

        try{
            File f =new File("C:\\Users\\Admin\\Desktop\\filehandling\\file1.txt");  
            if(f.createNewFile()){
                System.out.println("file created");
            }     
            else{
                System.out.println("file already created");
            } 
        }
        catch(Exception e){
            System.out.println(" exception handled ");
        }
    }
}
