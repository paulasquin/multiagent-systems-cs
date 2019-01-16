import jade.core.Runtime;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;
import jade.wrapper.StaleProxyException;

public class Launcher{
	public static void main(String [] args) throws ControllerException
	{	
		Runtime rt = Runtime.instance();
		rt.setCloseVM(true);
		Profile pMain = new ProfileImpl("localhost", 8888, null);
		AgentContainer mc = rt.createMainContainer(pMain);
		
		for (int i = 0 ; i < 2 ; i++)
		{
			// Create agents
			AgentController agent = mc.createNewAgent("Agent Smith #" + i, TestAgent.class.getName(), new Object[] {i, "name"});
			agent.start();
		}
	}
	
}
