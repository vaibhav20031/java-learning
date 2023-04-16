class hello2 extends hello{                //polymorphism
    void show(){
        System.out.println("hello2");
    };
    public static void main(String[] args){
        hello obj=new hello2();
        obj.show();
    }
}
