// super()
// final() 
public class speciaterms{
    int a;
    String name;
     speciaterms(){
        a=10;
        name ="vaibhav";
    }
     speciaterms(speciaterms obj){
        a=obj.a;
        name=obj.name ;
    }
     void show(){
        System.out.println(name+" "+a);
    }
    public static void main(String[] args){
        speciaterms obj=new speciaterms();
        obj.show();
        speciaterms obj2=new speciaterms(obj);
        obj2.show();
    }
    
}