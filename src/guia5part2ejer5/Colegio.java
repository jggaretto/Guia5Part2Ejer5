
package guia5part2ejer5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Colegio {
    
private ArrayList<Alumno> alumnos;

    public Colegio() {
        alumnos = new ArrayList<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
            return true;
        } else {
            System.out.println("El alumno ya se encuentra registrado en el colegio.");
            return false;
        }
    }

    public boolean quitarAlumno(int legajo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getLegajo() == legajo) {
                alumnos.remove(alumno);
                return true;
            }
        }
        System.out.println("No se encontró un alumno con el legajo especificado.");
        return false;
    }

    public void listarAlumnosOrdenados() {
        ArrayList<Alumno> alumnosOrdenados = new ArrayList<>(alumnos);
        Collections.sort(alumnosOrdenados, Comparator.comparing(Alumno::getApellido));
        for (Alumno alumno : alumnosOrdenados) {
            System.out.println(alumno.toString());
        }
    }

    public void listarAlumnosPorApellido(char inicial) {
        for (Alumno alumno : alumnos) {
            if (alumno.getApellido().charAt(0) == inicial) {
                System.out.println(alumno.toString());
            }
        }
    }
}
