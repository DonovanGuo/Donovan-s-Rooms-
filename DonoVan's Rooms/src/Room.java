import java.io.InputStream;
import java.util.Random;

public class Room 
{
	Person occupant;
	int xLoc,yLoc;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter the riddler's room, you must answer his questions to move!");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	private String [] riddleeasy = {"What Has four legs initially, two afterwards, and three finally?", 
									 "What Dissapears the moment it is said?",
									 "What's brown and sticky?",
									 "What can you never have for Breakfast"};
	 
	private String [] riddlemed = {"What taste better than it smells?",
									"What animal asks but never answers",
									"What loses its head in the morning but gets it back at night"};
	
	private String [] riddlehard = {"The more there is the less you see, what am I?",
									"What is full of holes but can still hold water?"};
	
	Random ra = new Random ();
	String easyriddle = (riddleeasy[ra.nextInt(riddleeasy.length)]);
	String medriddle = (riddlemed[ra.nextInt(riddlemed.length)]);
	String hardriddle = (riddlehard[ra.nextInt(riddlehard.length)]);
	
	private void riddleordie()
	{
		
	}
	

	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
