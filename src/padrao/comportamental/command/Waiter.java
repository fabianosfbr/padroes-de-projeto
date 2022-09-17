package padrao.comportamental.command;

public class Waiter {
	
	private Order order;

	public Waiter(Order order) {
		this.order = order;
	}

	public void execute() {
		this.order.execute();
	}
}
