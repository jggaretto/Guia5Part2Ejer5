
package guia5part2ejer5;


public class Alumno {
    
private int legajo;
    private String apellido;
    private String nombre;
    private int añoCursa;

    public Alumno(int legajo, String apellido, String nombre, int añoCursa) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.añoCursa = añoCursa;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñoCursa() {
        return añoCursa;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + ", Apellido: " + apellido + ", Nombre: " + nombre + ", Año que cursa: " + añoCursa;
    }
}
