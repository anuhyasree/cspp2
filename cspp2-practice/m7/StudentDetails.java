import java.util.*;

public class StudentDetails{
	
	String name;
	String rollnumber;
	float marks1,marks2,marks3;

	public StudentDetails(String name, String rollnumber,
	 float m1, float m2, float m3){
	this.name = name;
	this.rollnumber = rollnumber;
	this.marks1 = m1;
	this.marks2 = m2;
	this.marks3 = m3;

	}
	public static float Calculate (float m1,float m2,float m3){
		return (m1+m2+m3)/3;
	}
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		String name = n.next();
		String rollnumber = n.next();
		float m1 = n.nextFloat();
		float m2 = n.nextFloat();
		float m3 = n.nextFloat();
		System.out.println("StudentDetails: "+name+","
			+rollnumber+","+m1+","+m2+","+m3);
		float gpa = Calculate(m1,m2,m3);
		System.out.println(java.lang.Math.floor(gpa*10)/10);
		
	}
}