
public class Part extends Component{
	
	private CatalogueEntry entry;
	
	public Part(CatalogueEntry cat){
		
		this.entry = cat;
	}
	
	public String getName(){
		return this.entry.getName();
	}
	
	public long getNumber(){
		return this.entry.getNumber();
	}
	
	@Override
	public double getCost() {
		
		return this.entry.getCost();
	}

	@Override
	public int getNumParts() {
	
		return 1;
	}

}
