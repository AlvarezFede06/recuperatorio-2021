package ar.edu.unlam.pb2.recuperatorio;

public interface SegurosGenerales {
    Object getNumeroDePoliza = null;
	Integer getNumeroDePoliza();
    Persona getAsegurado();
    Auto getAuto();
    double getPremio();
	void agregarBienAsegurado(Auto auto);
}