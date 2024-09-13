package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.ProyectoBuilder;

import java.util.LinkedList;

public class Proyecto {
    private String nombre;
    private String codigo;
    private LinkedList<Empleado> listEmpleado;

    //Construcor de Proyecto

    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        listEmpleado = new LinkedList<>();
    }

    //Metodo para crear un proyecto con el builder

    public static ProyectoBuilder builder(){return new ProyectoBuilder();}

    //Metodo para agregar tecnicos a la lista de empleados asociados

    public void agregarTecnico(Tecnico tecnico) {
        listEmpleado.add(tecnico);
    }

    //Metodo toString

    @Override
    public String toString() {
        return "[" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", Empleados Asociados=" + datosTecnico() +
                ']';
    }


    //Metodo para mostrar los datos del tecnico asociado

    public String datosTecnico() {
        String mensaje = "";
        for (Empleado empleado: listEmpleado){
            mensaje += " nombre = " + empleado.getNombre() + " id = " + empleado.getId() + " ";
        }
        return mensaje;
    }

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

    public LinkedList<Empleado> getListEmpleadosAsociados() {
        return listEmpleado;
    }

    public void setListEmpleadosAsociados(LinkedList<Empleado> listEmpleadosAsociados) {
        this.listEmpleado = listEmpleadosAsociados;
    }
}
