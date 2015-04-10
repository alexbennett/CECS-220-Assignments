package problem_3;

public class Event
{
	public static void main(String... args)
	{
		Speaker doctor = new Guest("Dr. Doctor");
		Speaker dog = new Guest("Spot");
		Speaker president = new Guest("Barack Obama");

		doctor.announce("Cancer has been cured!");
		((Guest) doctor).introduce((Guest) dog);

		dog.announce("...woof");
		((Guest) dog).introduce((Guest) president);

		president.announce("The future rewards those who press on. I don't have time to feel sorry for myself. I don't have time to complain. I'm going to press on.");
	}

	public static class Guest implements Speaker
	{
		private String name, announcement;

		public Guest(String name)
		{
			this.name = name;
		}

		public void introduce(Guest guest)
		{
			System.out.println("Now introducing " + guest.getName() + "!\n");
		}

		public String getName()
		{
			return name;
		}

		public void speak()
		{
			System.out.println("\"" + announcement + "\"");
		}

		public void announce(String str)
		{
			announcement = str;
			speak();
		}
	}

	public interface Speaker
	{
		void speak();

		void announce(String str);
	}
}
