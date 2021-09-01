package Animals;

interface Body_parts
{
	void Method1();
    	void Method2();
    	void Method3();
}

public class Bear implements Body_parts
{
	public void Method1()
	{
		System.out.println("This is method 1 of interface 'Body_parts'");
	}

	public void Method2()
	{
		System.out.println("This is method 2 of interface 'Body_parts'");
	}

	public void Method3()
	{
		System.out.println("This is method 3 of interface 'Body_parts'");
	}
}