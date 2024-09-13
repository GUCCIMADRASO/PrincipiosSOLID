package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Proyecto;
import co.edu.uniquindio.model.builder.ProyectoBuilder;
import java.util.LinkedList;

public interface ICrudProyecto {
    boolean crearProyecto(String codigo, ProyectoBuilder proyecto);
    boolean eliminarProyecto(String codigo);
    boolean modificarProyecto(String codigo, ProyectoBuilder proyecto);
    Proyecto getProyectoCrud(String codigo);
    LinkedList<Proyecto> getListProyectoCrud();
}
