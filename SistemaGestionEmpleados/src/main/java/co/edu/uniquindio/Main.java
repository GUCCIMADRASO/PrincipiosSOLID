package co.edu.uniquindio;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Tecnico> listTecnico = new LinkedList<>();
        LinkedList<Gerente> listGerente = new LinkedList<>();
        LinkedList<Proyecto> listProyecto = new LinkedList<>();
        LinkedList<Departamento> listDepartamento = new LinkedList<>();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            mostrarMenu();

            try {
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        generarDatosDePrueba(listTecnico,listGerente,listProyecto,listDepartamento);
                        break;
                    case 2:
                        asignarTecnico(listTecnico,listProyecto);
                        break;
                    case 3:
                        mostrarProyectos(listProyecto);
                        break;
                    case 4:
                        gestionarProyecto(listGerente,listProyecto);
                        break;
                    case 5:
                        gestionarEquipo(listGerente,listProyecto);
                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    //Menu en consola

    private static void mostrarMenu() {
        System.out.println("1. Generar datos de prueba");
        System.out.println("2. Asignar tecnicos a sus respectivos proyectos");
        System.out.println("3. Mostrar proyectos");
        System.out.println("4. Gestionar proyecto (Gerente)");
        System.out.println("5. Gestionar equipos (Gerente)");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. Salir");
        System.out.println("Escribe una de las opciones: ");
    }

    //Metodo para capturar datos

    private static String obtenerDato(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    //Metodo para crear datos de prueba

    public static void generarDatosDePrueba(LinkedList<Tecnico> listTecnico,
                                            LinkedList<Gerente> listGerente,
                                            LinkedList<Proyecto> listProyecto,
                                            LinkedList<Departamento> listDepartamento) {

        // Crear departamentos
        Departamento departamento1 = new Departamento("Finanzas","001");
        Departamento departamento2 = new Departamento("Recursos humanos","002");
        Departamento departamento3 = new Departamento("Administrativo","003");

        listDepartamento.add(departamento1);
        listDepartamento.add(departamento2);
        listDepartamento.add(departamento3);

        // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Proyecto1","001");
        Proyecto proyecto2 = new Proyecto("Proyecto2","002");
        Proyecto proyecto3 = new Proyecto("Proyecto3","003");

        listProyecto.add(proyecto1);
        listProyecto.add(proyecto2);
        listProyecto.add(proyecto3);

        // Crear tecnicos
        Tecnico tecnico1 = new Tecnico("Pedro Lopez", "1010","Tecnico",departamento1,proyecto1);
        Tecnico tecnico2 = new Tecnico("Luisa Fernandez", "2020","Tecnico",departamento1,proyecto1);
        Tecnico tecnico3 = new Tecnico("Jose Ramirez", "3030","Tecnico",departamento2,proyecto2);
        Tecnico tecnico4 = new Tecnico("Sandra Ortiz", "4040","Tecnico",departamento2,proyecto2);
        Tecnico tecnico5 = new Tecnico("Camilo Garcia", "5050","Tecnico",departamento3,proyecto3);
        Tecnico tecnico6 = new Tecnico("Cesar Orozco", "6060","Tecnico",departamento3,proyecto3);

        listTecnico.add(tecnico1);
        listTecnico.add(tecnico2);
        listTecnico.add(tecnico3);
        listTecnico.add(tecnico4);
        listTecnico.add(tecnico5);
        listTecnico.add(tecnico6);

        // Crear gerentes
        Gerente gerente1 = new Gerente("Juan Perez","1515","Gerente",departamento1,proyecto1);
        Gerente gerente2 = new Gerente("Maria Gomez","2525","Gerente",departamento2,proyecto2);
        Gerente gerente3 = new Gerente("Carlos Ruiz","3535","Gerente",departamento3,proyecto3);

        listGerente.add(gerente1);
        listGerente.add(gerente2);
        listGerente.add(gerente3);

        System.out.println("**********************************************************");
        System.out.println("Se han creado correctamente los datos de prueba");
        System.out.println("**********************************************************");

    }

    // metodo para asignar tecnicos

    public static void asignarTecnico(LinkedList<Tecnico> listTecnico,
                                    LinkedList<Proyecto> listProyecto) {
        // Recorre la lista de técnicos
        for (Tecnico tecnico : listTecnico) {
            // Busca el proyecto correspondiente al código del proyecto del técnico
            for (Proyecto proyecto : listProyecto) {
                if (tecnico.getProyecto().getCodigo().equalsIgnoreCase(proyecto.getCodigo())) {
                    proyecto.agregarTecnico(tecnico);
                    break; // Sale del ciclo una vez que se ha agregado el técnico al proyecto correspondiente
                }
            }
        }
        System.out.println("**********************************************************");
        System.out.println("Se han asignado correctamente los tecnicos a cada proyecto");
        System.out.println("**********************************************************");
    }

    //Metodo para mostrar los proyectos con sus empleados asociados

    public static void mostrarProyectos(LinkedList<Proyecto> listProyecto) {
        for (Proyecto proyecto : listProyecto) {
            System.out.println("**********************************************************");
            System.out.println(proyecto.toString());
            System.out.println("**********************************************************");
        }
    }

    //Metodo para gestionar proyectos

    public static void gestionarProyecto(LinkedList<Gerente> listGerente, LinkedList<Proyecto> listProyecto) {
        Scanner sn = new Scanner(System.in);
        String idGerente = obtenerDato(sn, "Ingrese su id: ");
        for (Gerente gerente : listGerente) {
            if (gerente.getId().equals(idGerente)) {
                System.out.println("Bienvenido " + gerente.getNombre());
                String nombreProyecto = obtenerDato(sn, "Ingrese el nombre del proyecto: ");
                Proyecto proyecto = gerente.gestionarProyectos(listProyecto, nombreProyecto);
                if (proyecto != null) {
                    System.out.println("Proyecto encontrado: " + proyecto.toString());
                }
            }
        }
    }

    //Metodo para gestionar equipos

    public static void gestionarEquipo(LinkedList<Gerente> listGerente, LinkedList<Proyecto> listProyecto) {
        Scanner sn = new Scanner(System.in);
        String idGerente = obtenerDato(sn, "Ingrese su id: ");
        for (Gerente gerente : listGerente) {
            if (gerente.getId().equals(idGerente)) {
                System.out.println("Bienvenido " + gerente.getNombre());
                String codigoProyecto = obtenerDato(sn, "Ingrese el codigo del equipo: ");
                Proyecto proyecto = gerente.gestionarEquipo(listProyecto, codigoProyecto);
                if (proyecto != null) {
                    System.out.println("Equipo encontrado: " + proyecto.datosTecnico());
                }
            }
        }
    }
}
