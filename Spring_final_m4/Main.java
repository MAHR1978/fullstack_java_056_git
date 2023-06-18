package Spring_final_m4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Claudia Lima | Dario perez | Marco Hernandez MarquitoHR
 *
 */

public class Main {
	 
		 private static List<Usuario> usuarios = new ArrayList<>();
		    private static List<Revision> revisiones = new ArrayList<>();
		    private static List<Capacitacion> capacitaciones = new ArrayList<>();
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        do {
		            mostrarMenu();
		            opcion = scanner.nextInt();
		            scanner.nextLine(); // Limpiar el buffer

		            switch (opcion) {
		                case 1:
		                    registrarCliente(scanner);
		                    break;
		                case 2:
		                    registrarProfesional(scanner);
		                    break;
		                case 3:
		                    registrarAdministrativo(scanner);
		                    break;
		                case 4:
		                    mostrarUsuarios();
		                    break;
		                case 5:
		                    analizarUsuarios();
		                    break;
		                case 6:
		                    registrarRevisión(scanner);
		                    break;
		                case 7:
		                    mostrarRevisiones();
		                    break;
		                case 8:
		                	registrarCapacitacion(scanner);
		                	break;
		                case 9:
		                	mostrarCapacitaciones();
		                	break;
		                case 10:
		                    System.out.println("¡Hasta luego!");
		                   
		                    break;
		                default:
		                    System.out.println("Opción inválida. Por favor, intenta nuevamente.");
		                    break;
		            }

		            System.out.println();
		        } while (opcion != 10);

		        scanner.close();
		    }
		  

		    private static void mostrarMenu() {
		        System.out.println("--------------------------Menú-----------------------");
		        System.out.println("1. Registrar cliente                                |");
		        System.out.println("2. Registrar profesional                            |");
		        System.out.println("3. Registrar administrativo                         |");
		        System.out.println("4. Mostrar usuarios                                 |");
		        System.out.println("5. Analizar usuarios                                |");
		        System.out.println("6. Registrar revisión                               |");
		        System.out.println("7. Mostrar revisiones                               |");
		        System.out.println("8. Registrar capacitaciones                         |");
		        System.out.println("9. Mostrar capacitaciones                           |");
		        System.out.println("10. Salir                                           |");
		        System.out.println("Ingresa tu opción:                                  |");
		        System.out.println("-----------------------------------------------------");
		    }

		    private static void registrarCliente(Scanner scanner) {
		    	System.out.println("------------------Registro de Cliente------------------");
		        System.out.print("Ingrese el RUN(solo numeros): ");
		        int run = scanner.nextInt();
		        scanner.nextLine(); // Limpiar el buffer
		        
		        System.out.print("Ingrese los nombres: ");
		        String nombres = scanner.nextLine();
		        System.out.print("Ingrese los apellidos: ");
		        String apellidos = scanner.nextLine();
		        System.out.print("Ingrese el teléfono: ");
		        String telefono = scanner.nextLine();
		        System.out.print("Ingrese la AFP: ");
		        String afp = scanner.nextLine();
		        System.out.print("Ingrese el sistema de salud (1 para Fonasa, 2 para Isapre): ");
		        int sistemaSalud = scanner.nextInt();
		        scanner.nextLine(); // Limpiar el buffer
		        System.out.print("Ingrese la dirección: ");
		        String direccion = scanner.nextLine();
		        System.out.print("Ingrese la comuna: ");
		        String comuna = scanner.nextLine();
		        System.out.print("Ingrese la edad: ");
		        int edad = scanner.nextInt();
		        
		
		        Cliente cliente = new Cliente(run,nombres, apellidos , telefono, afp, sistemaSalud, direccion, comuna,edad);
		        usuarios.add(cliente);
		        System.out.println("Cliente registrado exitosamente.");
		        System.out.println("--------------------------------------------------------------------------");
		    }

		    private static void registrarProfesional(Scanner scanner) {
		    	System.out.println("------------------Registro de profesional-----------------------------------");
		        System.out.print("Ingrese el nombre : ");
		        String nombre = scanner.nextLine();
		        System.out.print("Ingrese la fecha de nacimiento : ");
		        String fechaNacimiento = scanner.nextLine();
		        System.out.print("Ingrese el RUN(solo numeros) : ");
		        int run = scanner.nextInt();
		        scanner.nextLine(); // Limpiar el buffer

		        System.out.print("Ingrese el título : ");
		        String titulo = scanner.nextLine();
		        System.out.print("Ingrese la fecha de ingreso: ");
		        String fechaIngreso = scanner.nextLine();

		        Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);
		        usuarios.add(profesional);
		        System.out.println("Profesional registrado exitosamente !!");
		        System.out.println("-----------------------------------------------------------------------------");
		    }

		    private static void registrarAdministrativo(Scanner scanner) {
		    	System.out.println("------------------Registro de Administrativo------------------");
		        System.out.print("Ingrese el nombre: ");
		        String nombre = scanner.nextLine();
		        System.out.print("Ingrese la fecha de nacimiento: ");
		        String fechaNacimiento = scanner.nextLine();
		        System.out.print("Ingrese el RUN(solo numeros): ");
		        int run = scanner.nextInt();
		        scanner.nextLine(); // Limpiar el buffer

		        System.out.print("Ingrese el área: ");
		        String area = scanner.nextLine();
		        System.out.print("Ingrese la experiencia previa: ");
		        String experienciaPrevia = scanner.nextLine();

		        Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);
		        usuarios.add(administrativo);
		        System.out.println("Administrativo registrado exitosamente.");
		        System.out.println("--------------------------------------------------------------------------");
		    }

		    private static void registrarRevisión(Scanner scanner) {
		    	System.out.println("------------------Registro de Revision------------------");
		        System.out.print("Ingrese el identificador de la revisión: ");
		        int idRevisión = scanner.nextInt();
		        scanner.nextLine(); // Limpiar el buffer

		        System.out.print("Ingrese el identificador de la visita en terreno: ");
		        int idVisitaTerreno = scanner.nextInt();
		        scanner.nextLine(); // Limpiar el buffer
		        
		        System.out.print("Ingrese dia de la revisión: ");
		        String dia = scanner.nextLine();
		        System.out.print("Ingrese hora de la revisión: ");
		        String hora = scanner.nextLine();
		        System.out.print("Ingrese lugar de la revisión: ");
		        String lugar = scanner.nextLine();
		        System.out.print("Ingrese tipo de la revisión: ");
		        String tipo = scanner.nextLine();
		        System.out.print("Ingrese observaciones de la revisión: ");
		        String observaciones = scanner.nextLine();
		        
		        Revision revisión = new Revision(idRevisión, idVisitaTerreno, dia, hora, lugar,tipo,observaciones);
		        revisiones.add(revisión);
		        System.out.println("Revisión registrada exitosamente.");
		        System.out.println("-------------------------------------------------------------------------------");
		        
		    }
		    private static void registrarCapacitacion(Scanner scanner) {
		    	System.out.println("------------------Registro de Capacitacion------------------");
		    	//int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes)
		    	 System.out.print("ingrese identificador :");
		    	 int  id = scanner.nextInt();
		    	 System.out.print("ingrese Rut cliente :"); 
		    	 int  rutcliente = scanner.nextInt();
		    	 System.out.print("ingrese dia de la capacitacion :");
		    	 String dia =scanner.next();
		    	 System.out.print("ingrese hora de la capacitacion :");
		    	 String hora = scanner.next();
		    	 
		    	 System.out.print("ingrese lugar capacitacion :");
		    	 String lugar = scanner.next();
		    	 System.out.print("ingrese duracion capacitacion :");
		    	 String duracion = scanner.next();
		    	 System.out.print("ingrese cantidad de Asistentes capacitacion :");
		    	 int cantidadasis = scanner.nextInt();
		    	 Capacitacion capacitacion = new Capacitacion(id,rutcliente,dia,hora,lugar,duracion,cantidadasis);
		    	 capacitaciones.add(capacitacion);
		    	 System.out.println("capacitacion registrada exitosamente");
		    	 System.out.println("-------------------------------------------------------------------------------");
		    	
		    }
		    private static void mostrarUsuarios() {
		        if (usuarios.isEmpty()) {
		            System.out.println("No hay usuarios registrados.");
		        } else {
		            System.out.println("Usuarios registrados:");
		            for (Usuario usuario : usuarios) {
		            	System.out.println(usuario);
		               // System.out.println(usuario.());
		            }
		        }
		    }

		    private static void analizarUsuarios() {
		        if (usuarios.isEmpty()) {
		            System.out.println("No hay usuarios registrados.");
		        } else {
		            System.out.println("Análisis de usuarios:");
		            for (Usuario usuario : usuarios) {
		                System.out.println(usuario);
		            }
		        }
		    }

		    private static void mostrarRevisiones() {
		        if (revisiones.isEmpty()) {
		            System.out.println("No hay revisiones registradas.");
		        } else {
		            System.out.println("Revisiones registradas:");
		            for (Revision revision : revisiones) {
		                System.out.println(revision);
		            }
		        }
		    }
		    private static void mostrarCapacitaciones() {
		        if (capacitaciones.isEmpty()) {
		            System.out.println("No hay capacitaciones registradas.");
		        } else {
		            System.out.println("Capacitaciones registradas:");
		            for (Capacitacion capacitacion : capacitaciones) {
		                System.out.println(capacitacion);
		            }
		        }
		    }    
	   

	}


