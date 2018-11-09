public class Cat implements animal
{
	private String Name;

	public Cat(String name)
	{
		Name = name;
	}

	public void makeNoise()
	{
		meow();
	}

	public String getName()
	{
		return Name;
	}

	public void meow()
	{
		System.out.println(Name + ": MEOW!");
	}


}