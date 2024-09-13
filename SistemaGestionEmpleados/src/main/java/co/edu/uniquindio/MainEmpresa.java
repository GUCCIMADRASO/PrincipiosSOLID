package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;

public class MainEmpresa {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        requerimientos(modelFactory);

        System.out.println("***************************************************************************");
    }

    //Metodo para llamar los requerimientos del enunciado

    public static void requerimientos(ModelFactory modelFactory) {
        asignarTecnico(modelFactory);
        mostrarProyectos(modelFactory);
        gestionarProyecto(modelFactory);
        gestionarEquipo(modelFactory);
        gestionarContribucion(modelFactory);
    }

    //Llama al metodo para asignar tecnicos

    public static void asignarTecnico(ModelFactory modelFactory){
        boolean estado = modelFactory.asignarTecnico();
        System.out.println("***************************************************************************");
        System.out.println("Los tecnicos se han asignado con un estado de: " + estado);
    }

    //Llama al metodo para mostrar los proyectos

    public static void mostrarProyectos(ModelFactory modelFactory){
        String mensaje = modelFactory.mostrarProyectos();
        System.out.println("***************************************************************************");
        System.out.println(mensaje);
    }

    //Llama al metodo para gestionar un proyecto

    public static void gestionarProyecto(ModelFactory modelFactory){
        String mensaje = modelFactory.gestionarProyecto("1515","Proyecto2");
        System.out.println("***************************************************************************");
        System.out.println(mensaje);
    }

    //Llama al metodo para gestionar un equipo

    public static void gestionarEquipo(ModelFactory modelFactory){
        String mensaje = modelFactory.gestionarEquipo("2525","001");
        System.out.println("***************************************************************************");
        System.out.println(mensaje);
    }

    //Llama al metodo para hacer una contribucion

    public static void gestionarContribucion(ModelFactory modelFactory){
        String mensajeGerente = modelFactory.gestionarContribucion("3535");
        String mensajeTecnico = modelFactory.gestionarContribucion("2020");
        System.out.println("***************************************************************************");
        System.out.println(mensajeGerente);
        System.out.println("***************************************************************************");
        System.out.println(mensajeTecnico);
    }
}
