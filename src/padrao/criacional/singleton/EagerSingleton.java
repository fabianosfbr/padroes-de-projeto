package padrao.criacional.singleton;

public class EagerSingleton {

	// cria uma instância da classe.
	private static EagerSingleton instance = new EagerSingleton();

	// construtor privado, para que ela não possa ser instanciada fora da classe.
	private EagerSingleton() {

	}

	// obtém a única instância criada do objeto.
	public static EagerSingleton getInstance() {
		
		if (instance == null) {
			instance = new EagerSingleton();
		}
		return instance;
	
	}
}
