package myPractice.classMethodsLearning;

public class StringLearning extends Object {

    public static void main(String[] args)
    {
        int no=10;

        System.out.println(no);

        changeNo(no);

        System.out.println(no);

        Student vijoy = new Student(15, 50);
        System.out.println(vijoy.age + " " + vijoy.rollNo);//15, 50
        changeStudent(vijoy);//100,50
        System.out.println(vijoy.age + " " + vijoy.rollNo);//100,50


        String name="Siva";

        int x=10;



        String name2=new String("Siva");

        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

        if(name==name2)
            System.out.println("Same");
        else
            System.out.println("Different");


    }

    private static void changeNo(int no)
    {
        no=20;
        System.out.println(no);
    }
    private static void changeStudent(Student s) {
        s.age = 100;
        System.out.println(s.age + " " + s.rollNo);//100,50
    }
}

class Student {
    int age;
    int rollNo;
    Student (int age, int rollNo) {
        this.age = age;
        this.rollNo = rollNo;
    }
}
