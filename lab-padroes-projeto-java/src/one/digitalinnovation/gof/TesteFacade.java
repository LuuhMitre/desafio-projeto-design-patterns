package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;

public class TesteFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Luana", "123456");

    }    
}
