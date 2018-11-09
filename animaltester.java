import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.Scanner;
import java.util.Random;

public class animaltester
{
	public static int dcount = 0;
	public static int ccount = 0;
	public static boolean timerFinished = false;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is the name of your dog? ");
		String dogName = in.nextLine();
		System.out.print("What is the name of your cat? ");
		String catName = in.nextLine();

		final Dog myDog = new Dog(dogName);
		final Cat myCat = new Cat(catName);
		final Random rand = new Random();

		class CountDown implements ActionListener
        {
			private int dogecount = 0;
			private int kittycount = 0;

		    public CountDown(int initialCount)
            {
				count = initialCount;
            }

            public void actionPerformed(ActionEvent event)
            {
				if (count > 0)
				{
					int num = rand.nextInt(2);
					if (num == 1)
					{
						myCat.makeNoise();
						kittycount++;
					}
					else
					{
						myDog.makeNoise();
						dogecount++;
					}
				}
				else
					timerFinished = true;
		    }

		    public int kitcount()
		    {
				return kittycount;
			}

			public int dogcount()
			{
				return dogecount;
			}
		    private int count;
	    }

       	CountDown listener = new CountDown(100);

       	final int DELAY = 500; // milliseconds between timer ticks
       	Timer t = new Timer(DELAY, listener);
       	t.start();
       	JOptionPane.showMessageDialog(null, "Quit?");

       	if(listener.kitcount() > listener.dogcount())
       		System.out.println(catName + " made the most noise.");
       	else
       		System.out.println(dogName + " made the mose noise.");
       		//MORE CODE HERE TO DETERMINE WHO MADE THE MOST NOISE
		System.exit(0);
	}
}