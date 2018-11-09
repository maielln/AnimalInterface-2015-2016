public class Dog implements animal
{
	private String Name;

	public Dog(String name)
	{
		Name = name;
	}

	public void makeNoise()
	{
		bark();
	}

	public String getName()
	{
		return Name;
	}

	public void bark()
	{
		System.out.println(Name + ": BARK!");
	}
}