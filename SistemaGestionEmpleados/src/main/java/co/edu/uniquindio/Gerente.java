package co.edu.uniquindio;

import java.util.LinkedList;

public class Gerente extends Empleado implements Contribuyente {

    public LinkedList<Tecnico> equipos;
    //Constructor de Gerente que usa los atributos de Empleado

    public Gerente(String nombre, String id,String rol, Departamento departamento, Proyecto proyecto) {
        super(nombre, id, rol, departamento, proyecto);
        equipos = new LinkedList<>();
    }

    //Implementacion del metodo contribuir

    @Override
    public String contribuir() {
        return "El gerente hizo una contribucion";
    }

    //Metodo para gestionar un proyecto

    public Proyecto gestionarProyectos(LinkedList<Proyecto> proyectos, String nombreProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equalsIgnoreCase(nombreProyecto)) {
                return proyecto; // Retorna el proyecto encontrado
            }
        }
        System.out.println("El proyecto con el nombre: " + nombreProyecto + " no ha sido encontrado.");
        return null; // Retorna null si no se encuentra ningún proyecto
    }

    //Metodo para gestionar un equipo

    public Proyecto gestionarEquipo(LinkedList<Proyecto> proyectos, String codigoProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getCodigo().equalsIgnoreCase(codigoProyecto)) {
                return proyecto; // Retorna el equipo encontrado
            }
        }
        System.out.println("El equipo con el codigo: " + codigoProyecto + " no ha sido encontrado.");
        return null; // Retorna null si no se encuentra ningún equipo
    }
}
