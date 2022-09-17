package padrao.estrutural.decorator;

public class HouseBlend extends Beverage {

	
	public HouseBlend(String description) {
		super(description);		
	}
	
	public HouseBlend() {
				
	}
	


	@Override
	public double cost() {
		
		return 25;
	}

}
