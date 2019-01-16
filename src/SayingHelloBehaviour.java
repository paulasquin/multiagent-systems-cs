import jade.core.behaviours.Behaviour;

public class SayingHelloBehaviour extends Behaviour {
	private int counter = 0;
	
	@Override
	public void action()
	{
		System.out.println("Hello " + counter + " from "  + ((TestAgent)myAgent).getMyID());
		counter++;
	}
	
	@Override
	public boolean done() {
		return counter >= 10;
	}

}
