import jade.core.behaviours.Behaviour;

public class SayingHelloBehaviour extends Behaviour {
	
	private int counter = 0;
	// final means this value can't be changed afterward.
	public static final int MAX = 10;
	
	@Override
	public void action(){
		if (counter == 0)
			System.out.println("Agent " + ((TestAgent)myAgent).getMyID() + " start");
		
		System.out.println("Hello " + counter + " from "  + ((TestAgent)myAgent).getMyID());
		counter++;

		//Making the agent to wait
		block(100);
		
		if (counter==MAX)
			System.out.println("Agent " + ((TestAgent)myAgent).getMyID() + " finish");
	}
	
	@Override
	public boolean done() {
		return counter >= MAX;
	}

}
