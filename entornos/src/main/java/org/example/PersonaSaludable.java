package org.example;

public class PersonaSaludable extends Persona {

    private int resistencia = 100;
    private Hora hora;

    public boolean madrugar(Hora hora) {
        System.out.println(nombre + " intenta madrugar a las " + hora.obtenerHora());
        return hora.obtenerHora() < 6; // Supongamos que madrugar es antes de las 6 AM
    }

    @Override
    public void ejercicio() {
        System.out.println(nombre + " hace ejercicio regularmente.");
    }

    @Override
    public void alimentacion() {
        System.out.println(nombre + " sigue una dieta balanceada.");
    }

    @Override
    public void bebida() {
        System.out.println(nombre + " bebe suficiente agua diariamente.");
    }
}

