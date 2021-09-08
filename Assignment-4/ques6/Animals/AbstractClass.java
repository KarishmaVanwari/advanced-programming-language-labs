package Animals;

abstract class features
{
	abstract void facial();
	abstract void skin();
	abstract void color();
}

public class AbstractClass extends features
{
	public void facial()
	{
		System.out.println("This is facial feature of the animal");
	}

	public void skin()
	{
		System.out.println("This is skin tone of the animal");
	}

	public void color()
	{
		System.out.println("This is the color of the animal");
	}
}