package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;

public class ModelFactory {

    private static ModelFactory instance;
    private static Empresa empresa;

    //Genera los datos de prueba

    private ModelFactory() {
        generarDatosDePrueba();
    }

    //Singleton para una unica instancia

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    //Llama al metodo para asignar tecnicos

    public boolean asignarTecnico(){
        return empresa.asignarTecnico();
    }

    //Llama al metodo para mostrar los proyectos

    public String mostrarProyectos(){
        return empresa.mostrarProyectos();
    }

    //Llama al metodo para gestionar un proyecto

    public String gestionarProyecto(String idGerente, String nombreProyecto){
        return empresa.gestionarProyecto(idGerente, nombreProyecto);
    }

    //Llama al metodo para gestionar un equipo

    public String gestionarEquipo(String idGerente, String codigoEquipo) {
        return empresa.gestionarEquipo(idGerente, codigoEquipo);
    }

    //Llama al metodo para hacer una contribucion

    public String gestionarContribucion(String id){
        return empresa.gestionarContribucion(id);
    }

    //Metodo para crear datos de prueba

    public static void generarDatosDePrueba() {
        empresa = new Empresa();
        empresa.setNombre("EmpresaDaniel");

        // Crear departamentos utilizando el builder
        Departamento departamento1 = Departamento.builder()
                .nombre("Finanzas").codigo("001").build();
        Departamento departamento2 = Departamento.builder()
                .nombre("Recursos humanos").codigo("002").build();
        Departamento departamento3 = Departamento.builder()
                .nombre("Administrativo").codigo("003").build();

        // Crear proyectos utilizando el builder
        Proyecto proyecto1 = Proyecto.builder()
                .nombre("Proyecto1").codigo("001").build();
        Proyecto proyecto2 = Proyecto.builder()
                .nombre("Proyecto2").codigo("002").build();
        Proyecto proyecto3 = Proyecto.builder()
                .nombre("Proyecto3").codigo("003").build();

        // Crear instancias de Tecnico utilizando el builder
        Tecnico tecnico1 = Tecnico.builder().nombre("Pedro Lopez").id("1010")
                .departamento(departamento1).proyecto(proyecto1).build();
        Tecnico tecnico2 = Tecnico.builder().nombre("Luisa Fernandez").id("2020")
                .departamento(departamento1).proyecto(proyecto1).build();
        Tecnico tecnico3 = Tecnico.builder().nombre("Jose Ramirez").id("3030")
                .departamento(departamento2).proyecto(proyecto2).build();
        Tecnico tecnico4 = Tecnico.builder().nombre("Sandra Ortiz").id("4040")
                .departamento(departamento2).proyecto(proyecto2).build();
        Tecnico tecnico5 = Tecnico.builder().nombre("Camilo Garcia").id("5050")
                .departamento(departamento3).proyecto(proyecto3).build();
        Tecnico tecnico6 = Tecnico.builder().nombre("Cesar Orozco").id("6060")
                .departamento(departamento3).proyecto(proyecto3).build();

        // Crear instancias de Gerente utilizando GerenteBuilder
        Gerente gerente1 = Gerente.builder().nombre("Juan Perez").id("1515")
                .departamento(departamento1).proyecto(proyecto1).build();
        Gerente gerente2 = Gerente.builder().nombre("Maria Gomez").id("2525")
                .departamento(departamento2).proyecto(proyecto2).build();
        Gerente gerente3 = Gerente.builder().nombre("Carlos Ruiz").id("3535")
                .departamento(departamento3).proyecto(proyecto3).build();

        // Añadir los objetos a las listas
        empresa.getListDepartamento().add(departamento1);
        empresa.getListDepartamento().add(departamento2);
        empresa.getListDepartamento().add(departamento3);

        empresa.getListProyecto().add(proyecto1);
        empresa.getListProyecto().add(proyecto2);
        empresa.getListProyecto().add(proyecto3);

        empresa.getListTecnico().add(tecnico1);
        empresa.getListTecnico().add(tecnico2);
        empresa.getListTecnico().add(tecnico3);
        empresa.getListTecnico().add(tecnico4);
        empresa.getListTecnico().add(tecnico5);
        empresa.getListTecnico().add(tecnico6);

        empresa.getListGerente().add(gerente1);
        empresa.getListGerente().add(gerente2);
        empresa.getListGerente().add(gerente3);
    }
}
