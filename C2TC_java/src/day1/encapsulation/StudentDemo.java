package day1.encapsulation;

public class StudentDemo {
public static void main(String[]args) {
	Student ob=new Student();
	ob.setId(101);
	ob.setName("charu");
	System.out.println(ob.getId());
	System.out.println(ob.getName());
	System.out.print(ob.toString());
}
}
