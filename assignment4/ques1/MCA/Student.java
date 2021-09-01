package MCA;

public class Student
{
	String name;
	int rollNo;
	int marks[]=new int[4];

	public Student(String name,int rollNo,int score1,int score2,int score3, int score4)
	{
		this.name=name;
		this.rollNo=rollNo;
		
		marks[0]=score1;
		marks[1]=score2;
		marks[2]=score3;		
		marks[3]=score4;		
	}

	public void display(int total,float percentage)
	{
		System.out.println("Student name : "+name);
		System.out.println("Student roll number : "+rollNo);
		System.out.println("Total marks : "+total);
		System.out.print("Percentage : "+percentage+"%");	
	}		
}