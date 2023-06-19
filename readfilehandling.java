// import java.io.*;
// public class readfilehandling {
//     public static void main(String[] args){
//         try{
//             FileReader f=new FileReader("C:\\Users\\Admin\\Desktop\\filehandling\\file1.txt");
        
//             try{
//                 int i;
//                 while((i=f.read())!=-1){
//                     System.out.print((char)i);
//                 }
//             }
//             finally{
//                 f.close();
//             }
//         }
        
//         catch(Exception e){
//             System.out.println("handled exception");
//         }
//     }
// }


import java.io.*;
public class readfilehandling {
    public static void main(String[] args){
        try{
            FileReader f=new FileReader("C:\\Users\\Admin\\Desktop\\filehandling\\file1.txt");
            FileWriter f2=new FileWriter("E:\\java learning\\file2.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    // System.out.print((char)i);
                    f2.write((char)i); 
                }
                
            }
            finally{
                f.close();
                f2.close();
                System.out.println("cotent copied succsessfully");
            }
        }
        
        catch(Exception e){
            System.out.println("handled exception");
        }
    }
}
