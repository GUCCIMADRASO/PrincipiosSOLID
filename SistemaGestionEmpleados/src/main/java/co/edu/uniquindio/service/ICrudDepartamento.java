package co.edu.uniquindio.service;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.builder.DepartamentoBuilder;
import java.util.LinkedList;

public interface ICrudDepartamento {
    boolean crearDepartamento(String codigo, DepartamentoBuilder departamento);
    boolean eliminarDepartamento(String codigo);
    boolean modificarDepartamento(String codigo, DepartamentoBuilder departamento);
    Departamento getDepartamentoCrud(String codigo);
    LinkedList<Departamento> getListDepartamentoCrud();
}
