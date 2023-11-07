package ar.edu.unlam.pb2.recuperatorio;

public class Auto {

	private String marca;
    private String modelo;
    private Integer año;
    private double sumaAsegurada;

    public Auto(String marca, String modelo, Integer año, double sumaAsegurada) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.sumaAsegurada = sumaAsegurada;
    }

    // Getter methods

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getSumaAsegurada() {
        return sumaAsegurada;
    }

}
