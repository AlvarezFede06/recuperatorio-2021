package ar.edu.unlam.pb2.recuperatorio;

public class PolizaDeAuto implements SegurosGenerales {

	 private Integer numeroDePoliza;
	    private Persona asegurado;
	    private double sumaAsegurada;
	    private double prima;
	    private Auto auto;

	    public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, double sumaAsegurada, double prima) {
	        this.numeroDePoliza = numeroDePoliza;
	        this.asegurado = asegurado;
	        this.sumaAsegurada = sumaAsegurada;
	        this.prima = prima;
	    }

	    public void agregarBienAsegurado(Auto auto) {
	        this.auto = auto;
	    }

	    // Implementar los métodos de la interfaz SegurosGenerales (si es necesario)

	    public Integer getNumeroDePoliza() {
	        return numeroDePoliza;
	    }

	    public Persona getAsegurado() {
	        return asegurado;
	    }

	    public Auto getAuto() {
	        return auto;
	    }

	    public double getPremio() {
	        return prima;
	    }
	
	    


}

