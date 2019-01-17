import jade.core.Agent;

public class TestAgent extends Agent {
	
	private int myID;
	private String myName;
	
	
	// Getters and setters
	public int getMyID() {
		return myID;
	}

	public void setMyID(int myID) {
		this.myID = myID;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	protected void setup()
	{
		// Get arguments and provide type
		myID = (int)getArguments()[0];
		myName = (String)getArguments()[1];
		
		System.out.println("Hello Neo from agent " + myID + ", " + myName);
		
		// Adding behaviour
		addBehaviour(new SayingHelloBehaviour());
	}

}
