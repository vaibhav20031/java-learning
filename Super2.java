public class Super2 extends Super1{
    void sound(){
        System.out.println("jdhv");
        super.sound();
    }
    public static void main(String[] args) {
        Super2 obj=new Super2();
        obj.sound();
    }
}
