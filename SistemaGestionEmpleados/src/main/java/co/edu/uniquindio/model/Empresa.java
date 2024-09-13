package co.edu.uniquindio.model;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private final LinkedList<Gerente> listGerente = new LinkedList<>();
    private final LinkedList<Tecnico> listTecnico = new LinkedList<>();
    private final LinkedList<Proyecto> listProyecto = new LinkedList<>();
    private final LinkedList<Departamento> listDepartamento = new LinkedList<>();


    //Metodo para asignar técnicos

    public boolean asignarTecnico() {
        boolean tecnicoAsignado = false;
        for (Proyecto proyecto : listProyecto) {
            for (Tecnico tecnico : listTecnico) {
                if (tecnico.getProyecto().getCodigo().equalsIgnoreCase(proyecto.getCodigo())) {
                    proyecto.agregarTecnico(tecnico);
                    tecnicoAsignado = true;
                }
            }
        }
        return tecnicoAsignado;
    }

    //Metodo para mostrar los proyectos con sus empleados asociados

    public String mostrarProyectos() {
        String proyectos = " ";
        for (Proyecto proyecto : listProyecto) {
            proyectos += proyecto.toString() + ", ";
        }
        return proyectos;
    }

    //Metodo para gestionar proyectos

    public String gestionarProyecto(String idGerente, String nombreProyecto) {
        String mensaje = " ";
        for (Gerente gerente : listGerente) {
            if (gerente.getId().equals(idGerente)) {
                Proyecto proyecto = gerente.gestionarProyectos(listProyecto, nombreProyecto);
                if (proyecto != null) {
                     mensaje += "Bienvenid@ Gerente " + gerente.getNombre();
                     mensaje += " // proyecto encontrado: " + proyecto;
                }
            }
        }
        return mensaje;
    }

    //Metodo para gestionar equipos

    public String gestionarEquipo(String idGerente, String codigoEquipo) {
        String mensaje = " ";
        for (Gerente gerente : listGerente) {
            if (gerente.getId().equals(idGerente)) {
                Proyecto proyecto = gerente.gestionarEquipo(listProyecto, codigoEquipo);
                if (proyecto != null) {
                    mensaje += "Bienvenid@ Gerente " + gerente.getNombre();
                    mensaje += " // equipo encontrado: " + proyecto.datosTecnico();
                }
            }
        }
        return mensaje;
    }

    //Metodo para hacer contribucion

    public String gestionarContribucion(String id) {

        String mensaje = " ";
        Gerente gerenteEncontrado = null;
        Tecnico tecnicoEncontrado = null;

        // Buscar en la lista de gerentes
        for (Gerente gerente : listGerente) {
            if (gerente.getId().equals(id)) {
                gerenteEncontrado = gerente;
                mensaje += "Bienvenid@ Gerente " + gerente.getNombre();
                break;
            }
        }

        // Si no se encontró el gerente, buscar en la lista de técnicos
        if (gerenteEncontrado == null) {
            for (Tecnico tecnico : listTecnico) {
                if (tecnico.getId().equals(id)) {
                    tecnicoEncontrado = tecnico;
                    mensaje += "Bienvenid@ Tecnico " + tecnico.getNombre();
                    break;
                }
            }
        }

        // Realizar contribución si se encuentra un gerente o un técnico
        if (gerenteEncontrado != null) {
            mensaje += " // " + gerenteEncontrado.contribuir();
        } else if (tecnicoEncontrado != null) {
            mensaje += " // " + tecnicoEncontrado.contribuir();
        } else {
            mensaje += "No se encontró ningún gerente o técnico con el ID proporcionado.";
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

    public LinkedList<Gerente> getListGerente() {
        return listGerente;
    }

    public LinkedList<Tecnico> getListTecnico() {
        return listTecnico;
    }

    public LinkedList<Proyecto> getListProyecto() {
        return listProyecto;
    }

    public LinkedList<Departamento> getListDepartamento() {
        return listDepartamento;
    }
}
