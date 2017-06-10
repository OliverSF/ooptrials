import java.util.*;

public class Assemblies extends Component{
	
	private ArrayList<Component> assemblies = new ArrayList<Component>();
	
	public void addComponent(Component comp){
		
		assemblies.add(comp);
	}
	
	
	@Override
	public double getCost() {
		
		double totalCost = 0;
		for(Component comp : assemblies){
			totalCost+= comp.getCost();
		}
		return totalCost;
		
	}

	@Override
	public int getNumParts() {
		
		int numParts = 0;
		for(Component comp : assemblies){
			numParts += comp.getNumParts();
		}
		return numParts;
	}

}
