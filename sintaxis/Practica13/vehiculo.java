package Practica13;

public class vehiculo {
    private String placa;
    private String modelo;
    private Double capacidadCarga;
    private Conductor conductor;

    // Constructores
    public vehiculo(String placa, String modelo, Double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    // Método para asignar un conductor
    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    // Set y Get
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
