/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class GestorCentroEductvo {

    private Curso[] cursos = new Curso[10];
    private Estudiante[] estudiantes = new Estudiante[10];
    public Profesor[] profesores = new Profesor[10];
    int cantidadProfesores = 0;

    public void registrarProfesor(Profesor profesor) {
        if (cantidadProfesores < profesores.length) {
            profesores[cantidadProfesores] = profesor;
            cantidadProfesores++;
            System.out.println("Profesor registrado correctamente.");
        } else {
            System.out.println("No es posible registrar más profesores. Se alcanzó la capacidad máxima.");
        }
    }

    void ImprimirReporteInscritos() {
        System.out.println("Reporte de personas Inscritas");
        for (Curso p : cursos) {
            if (p != null) {
                System.out.println(p.nombre);
            }
        }
    }

    void imprimirPersonas() {
        System.out.println("Reporte de Personas");
        System.out.println("Hola");
    }

    public void imprimirProfesores() {
        System.out.println("Lista de Profesores:");
        for (int i = 0; i < cantidadProfesores; i++) {
            Profesor profesor = profesores[i];
            System.out.println("Cédula: " + profesor.getCedula());
            System.out.println("Nombre: " + profesor.getNombre1() + " " + profesor.getNombre2()
                    + " " + profesor.getApellido1() + " " + profesor.getApellido2());
            System.out.println("Fecha de Nacimiento: " + profesor.getFechaNacmto());
            System.out.println("Años de Experiencia: " + profesor.getAñosExper());
            System.out.println("Salario: " + profesor.getSalario());
            System.out.println("-----------------------------");
        }
    }

}
