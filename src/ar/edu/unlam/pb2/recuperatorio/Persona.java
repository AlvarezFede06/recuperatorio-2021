package ar.edu.unlam.pb2.recuperatorio;

public class Persona {

	 private String nombre;
	 private Integer dni;
	 private Integer edad;

	    public Persona(String nombre, Integer dni, Integer edad) {
	        this.nombre = nombre;
	        this.dni = dni;
	        this.edad = edad;
	    }

	    // Getter methods

	    public String getNombre() {
	        return nombre;
	    }

	    public int getDni() {
	        return dni;
	    }

	    public int getEdad() {
	        return edad;
	    }

}
