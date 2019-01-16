import jade.core.Agent;

public class TestAgent extends Agent {
	
	private int myID;
	private String myName;
	
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
		myID = (int)getArguments()[0];
		myName = (String)getArguments()[1];
		System.out.println("Hello Neo from agent " + myID + ", " + myName);
		addBehaviour(new SayingHelloBehaviour());
	}

}
