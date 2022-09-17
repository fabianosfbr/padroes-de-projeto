package padrao.criacional.singleton;

public class EagerSingleton {

	// cria uma inst�ncia da classe.
	private static EagerSingleton instance = new EagerSingleton();

	// construtor privado, para que ela n�o possa ser instanciada fora da classe.
	private EagerSingleton() {

	}

	// obt�m a �nica inst�ncia criada do objeto.
	public static EagerSingleton getInstance() {
		
		if (instance == null) {
			instance = new EagerSingleton();
		}
		return instance;
	
	}
}
