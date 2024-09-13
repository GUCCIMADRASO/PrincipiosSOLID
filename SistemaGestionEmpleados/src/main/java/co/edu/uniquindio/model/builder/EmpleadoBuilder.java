package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Proyecto;

public abstract class EmpleadoBuilder<T extends EmpleadoBuilder<T>> {
    protected String nombre;
    protected String id;
    protected Departamento departamento;
    protected Proyecto proyecto;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    public T id(String id) {
        this.id = id;
        return self();
    }

    public T departamento(Departamento departamento) {
        this.departamento = departamento;
        return self();
    }

    public T proyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
        return self();
    }

    // Metodo abstracto para construir el objeto
    public abstract Empleado build();

    // Metodo para obtener la instancia actual del Builder
    protected abstract T self();
}