package Spring_final_m4;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Asesoria {
    protected String nombre;
    private String fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String mostrarEdad() {
        // Cálculo de la edad
        // Supongamos que la fecha de nacimiento tiene el formato DD/MM/AAAA
        String[] partes = fechaNacimiento.split("/");
        int anioNacimiento = Integer.parseInt(partes[2]);
        int anioActual = 2023; // Obtener el año actual de alguna forma
        int edad = anioActual - anioNacimiento;

        return "El usuario tiene " + edad + " años.";
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
    }

	@Override
	public String toString() {
		return "Usuario tipo \n-------------\n";
		
	}

 
   
}
