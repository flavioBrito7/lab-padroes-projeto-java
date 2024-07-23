package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 *
 * @author Flavio Brito
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
