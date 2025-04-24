package models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion dierccion;

    public Persona(String nombre, int edad, Direccion dierccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dierccion = dierccion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDierccion() {
        return dierccion;
    }

    public void setDierccion(Direccion dierccion) {
        this.dierccion = dierccion;
    }

    public int getCodigoDierccion() {
        return dierccion.getCodigo();
    }

    public boolean equalsByCodigoDirecion(Persona otraPersona) {
        boolean resp = this.getCodigoDierccion() > otraPersona.getDierccion().getCodigo();
        return resp;
    }

    public boolean equalsByCodigoDirecion(int codigo) {
        return getCodigoDierccion() == codigo;
    }




    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dierccion=" + dierccion + "]";
    }

    

    
}
