package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Proyecto;
import java.util.LinkedList;

public class ProyectoBuilder {
    private String nombre;
    private String codigo;
    private LinkedList<Empleado> listEmpleado;

    public ProyectoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ProyectoBuilder codigo(String codigo){
        this.codigo = codigo;
        return this;
    }

    public Proyecto build(){return new Proyecto(nombre, codigo);}
}
