package myPractice.javaLearning;

//import static myPractice.javaLearning.Calculator.add;

import java.util.Arrays;

public class JavaBasics {


    int x;


    public static void main(String args[])
    {

        /*Arrays.asList();

        Integer.parseInt("4546");*/

        //RestAssured methods;
        /*System.out.println("Hi Java");

       // System.out.println(add());

        Calculator obj =new Calculator();

        System.out.println(obj.add());*/

        for(int i=0;i<10;i++)       //0,1,3,4
        {
            if(i==5)
            {
                break;
            }

            if((i==2)||(i==3))
                continue;

            System.out.println(i);


        }


    }

    public static void main(String args)
    {
        System.out.println("Hi Python");
    }





}

class Calculator
{
    int add()
    {
        System.out.println("Calculator method");
        sub();
        return 10;

    }

    int sub()
    {
        System.out.println("Sub Method");
        return 5;
    }
}
