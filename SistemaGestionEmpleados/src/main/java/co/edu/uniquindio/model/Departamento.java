package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.DepartamentoBuilder;

import java.util.LinkedList;

public class Departamento {
    private String nombre;
    private String codigo;
    private LinkedList<Empleado> listEmpleado;

    //Construcor de Departamento

    public Departamento(String nombre, String codigo, LinkedList<Empleado> listEmpleado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listEmpleado = listEmpleado;
    }

    //Metodo para crear un departamento con el builder

    public static DepartamentoBuilder builder() {return new DepartamentoBuilder();}

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LinkedList<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(LinkedList<Empleado> listEmpleado) {
        this.listEmpleado = this.listEmpleado;
    }
}
