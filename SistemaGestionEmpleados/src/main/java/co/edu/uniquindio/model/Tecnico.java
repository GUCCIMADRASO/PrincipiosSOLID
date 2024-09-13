package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.TecnicoBuilder;

public class Tecnico extends Empleado {

    //Constructor de Tecnico que usa los atributos de Empleado

    public Tecnico(String nombre, String id, Departamento departamento, Proyecto proyecto) {
        super(nombre, id, departamento, proyecto);
    }

    //Metodo para crear un tecnico con el builder

    public static TecnicoBuilder builder() {return new TecnicoBuilder();}

    //Implementacion del metodo contribuir

    @Override
    public String contribuir(){
        return "El tecnico hizo una contribucion";
    }

}
