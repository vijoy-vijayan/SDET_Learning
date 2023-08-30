package foundation.week10;


public class Week10_Day2_Practice_StringBehaviour2 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a); // 10
		changeNo(a);
		System.out.println(a); //10

		Student vijoy = new Student(15, 50);

		String x=new String("Bijoy");

		String y="kjlkjkk";
		System.out.println(vijoy.age + " " + vijoy.rollNo);
		changeStudent(vijoy);

		System.out.println(vijoy.age + " " + vijoy.rollNo);

	}

	private static void changeNo(int no) {
		no = 20;
		System.out.println(no); // 20
	}

	private static void changeStudent(Student s) {
		s.age = 100;
		System.out.println(s.age + " " + s.rollNo);
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






