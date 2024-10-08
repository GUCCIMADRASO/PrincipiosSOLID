package co.edu.uniquindio.model;

import co.edu.uniquindio.service.IContribuyente;

public abstract class Empleado implements IContribuyente {
    private String nombre;
    private String id;
    private Departamento departamento;
    private Proyecto proyecto;

    //Construcor de Empleado

    public Empleado(String nombre, String id, Departamento departamento, Proyecto proyecto) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
        this.proyecto = proyecto;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Proyecto getProyecto() {return proyecto;}

    public void setProyecto(Proyecto proyecto) {this.proyecto = proyecto;}
}
