import java.io.*;
public class writingfile {
    public static void main(String[] args){
        try{
            FileWriter f=new FileWriter("C:\\Users\\Admin\\Desktop\\filehandling\\file1.txt");
            try{

                f.write("this is file handling \n");
                f.write("witing in file");
            }
            finally{
                f.close();
            }
        }
        catch(Exception e){
            System.out.println("handled");
        }
    }
}
