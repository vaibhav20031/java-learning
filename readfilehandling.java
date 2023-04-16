import java.io.*;
public class readfilehandling {
    public static void main(String[] args){
        try{
            FileReader f=new FileReader("C:\\Users\\Admin\\Desktop\\filehandling\\file1.txt");
            try{
                int i;
                while((i=f.read())!=-1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }
        }
        catch(Exception e){
            System.out.println("handled exception");
        }
    }
}
