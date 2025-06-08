package Materia.Controllers;

public class Persona {
 public String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
