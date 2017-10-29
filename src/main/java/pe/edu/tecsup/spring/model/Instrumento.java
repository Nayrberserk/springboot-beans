package pe.edu.tecsup.spring.model;

public class Instrumento {

    private String nombre;
    private String marca;

    public Instrumento(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public Instrumento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void sonido() {
        System.out.println("brbrbrbrb (sonido instrumento)");
    }

}
