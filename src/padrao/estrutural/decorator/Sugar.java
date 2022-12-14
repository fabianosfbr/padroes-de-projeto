package padrao.estrutural.decorator;

public class Sugar extends AddOn {

	public Sugar( Beverage beverage) {
		super(beverage);
		
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "with sugar";
	}

	@Override
	public double cost() {
		
		return beverage.cost() + 5;
	}

}
