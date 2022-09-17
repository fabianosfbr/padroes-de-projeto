package padrao.estrutural.decorator;

public abstract class Beverage {
	private String description;
    
	public Beverage(String description) {
		
		this.description = description;
	}
	
	public Beverage() {
		
	} 
    
	public String getDescription() {
		return description;
	}
    
	public abstract double cost();
}