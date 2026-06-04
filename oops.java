class Pen {
    String colour;
    String type;// ballpoint; gel

    public void write()  {
        System.out.println("Writing something");
    }
    public void printcolour()  {
        System.out.println(this.colour);
    }
}

class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("contructor called");
    }
}
public class oops {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "pratik";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "rudransh";
        s2.age = 20;

        s1.printinfo() ;
        s2.printinfo() ;
        }
}

