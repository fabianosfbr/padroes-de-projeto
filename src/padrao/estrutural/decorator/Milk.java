package padrao.estrutural.decorator;

public class Milk extends AddOn {

	public Milk(Beverage beverage) {
		super(beverage);
		
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "with Milk";
	}

	@Override
	public double cost() {
		
		return beverage.cost() + 12;
	}

}
