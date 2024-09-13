package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.builder.GerenteBuilder;
import java.util.LinkedList;

public interface ICrudGerente {
    boolean crearGerente(String id, GerenteBuilder gerente);
    boolean eliminarGerente(String id);
    boolean modificarGerente(String id, GerenteBuilder gerente);
    Gerente getGerenteCrud(String id);
    LinkedList<Gerente> getListGerenteCrud();
}
