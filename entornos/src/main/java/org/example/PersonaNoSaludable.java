package org.example;

public class PersonaNoSaludable extends Persona{

    private int colesterol = 100;

    public void llegartarde(Hora horita) {
        System.out.println(nombre + " llega tarde a las " + horita.obtenerHora());
    }

    @Override
    public void ejercicio() {
        System.out.println(nombre + " no hace ejercicio regularmente.");
    }

    @Override
    public void alimentacion() {
        System.out.println(nombre + " come comida chatarra.");
    }

    @Override
    public void bebida() {
        System.out.println(nombre + " bebe muchas bebidas azucaradas.");
    }
}
