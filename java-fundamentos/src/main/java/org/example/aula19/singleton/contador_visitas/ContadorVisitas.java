package org.example.aula19.singleton.contador_visitas;

public class ContadorVisitas {
    private static ContadorVisitas instancia;
    private int total = 0;

    private ContadorVisitas(){}

    public static ContadorVisitas getInstancia(){
        if (instancia == null) {instancia = new ContadorVisitas();}
        return instancia;
    }

    public void registrarVisita(){
        total += 1;
    }

    public int getTotal(){
        return total;
    }

}
