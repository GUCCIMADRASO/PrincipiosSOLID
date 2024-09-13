package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Tecnico;
import co.edu.uniquindio.model.builder.TecnicoBuilder;
import java.util.LinkedList;

public interface ICrudTecnico {
    boolean crearTecnico(String id, TecnicoBuilder tecnico);
    boolean eliminarTecnico(String id);
    boolean modificarTecnico(String id, TecnicoBuilder tecnico);
    Tecnico getTecnicoCrud(String id);
    LinkedList<Tecnico> getListTecnicosCrud();
}
