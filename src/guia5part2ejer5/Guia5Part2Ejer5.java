/*
Un Colegio nos pide un sistema para llevar un registro de los alumnos que se encuentran
cursando actualmente. Los datos que necesita de un Alumno son: legajo, apellido, nombre y año
que cursa. El sistema debe permitir agregar alumnos al Colegio sin que se repitan, quitar alumnos
en base a su legajo, listar los alumnos ordenados alfabéticamente por su apellido y listar los

alumnos cuyos apellidos comiencen por un carácter en particular. Luego desde el método main de
una clase Test, nos piden:
 Instanciar un Colegio.
 Definir un bucle que crea un objeto Alumno pidiéndole al usuario todos sus datos y
guardándolos en el objeto Alumno. Después, ese Alumno se guarda en el Colegio usado
el método de Colegio que usted implementó y se le pregunta al usuario si quiere crear otro
Alumno o no.
 Quitar uno de los alumnos cargados.
 Listar los alumnos ordenados por apellido.
 Listar los alumnos cuyo apellido comience con la letra que el usuario ingresará por teclado.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java.
 */
package guia5part2ejer5;

import java.util.Scanner;


public class Guia5Part2Ejer5 {

    
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Ingrese los datos del alumno:");
            System.out.print("Legajo: ");
            int legajo = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Año que cursa: ");
            int añoCursa = scanner.nextInt();

            Alumno alumno = new Alumno(legajo, apellido, nombre, añoCursa);
            colegio.agregarAlumno(alumno);

            System.out.print("¿Desea agregar otro alumno? (S/N): ");
            opcion = scanner.next().charAt(0);
        } while (opcion == 'S' || opcion == 's');

        System.out.print("Ingrese el legajo del alumno a quitar: ");
        int legajoQuitar = scanner.nextInt();
        colegio.quitarAlumno(legajoQuitar);

        System.out.println("Alumnos ordenados por apellido:");
        colegio.listarAlumnosOrdenados();

        System.out.print("Ingrese la inicial del apellido para filtrar los alumnos: ");
        char inicial = scanner.next().charAt(0);
        System.out.println("Alumnos cuyo apellido comienza con '" + inicial + "':");
        colegio.listarAlumnosPorApellido(inicial);
    }
    
}
