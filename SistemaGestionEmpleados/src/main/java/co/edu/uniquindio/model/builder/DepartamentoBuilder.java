package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import java.util.LinkedList;

public class DepartamentoBuilder {
    private String nombre;
    private String codigo;
    private LinkedList<Empleado> listEmpleado;

    public DepartamentoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DepartamentoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public DepartamentoBuilder listEmpleado(LinkedList<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
        return this;
    }

    public Departamento build() {return new Departamento(nombre,codigo,listEmpleado);}
}
