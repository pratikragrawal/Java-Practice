class Parent {
    Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    static {
        System.out.println("Child Static Block");
    }
    {
        System.out.println("Child Instance initializer Block");
    }
    Child() {
        System.out.println("Child constuctor");
    }
}
public class oop {
    public static void main(String[] args) {
        System.out.println("Main Metod start");
        Child obj = new Child();
        System.out.println("Main Method End");
    }
    
}
