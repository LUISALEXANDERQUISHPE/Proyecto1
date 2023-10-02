/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class GestorCentroEductvo {

    private Curso[] cursos;
    private Estudiante[] estudiantes;
    private Profesor profesores;
    
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
        for (Persona p : personas) {
            if (p != null) {
                System.out.println(p.Apellido1 + " " + p.nombre1);
            }
        }
    }
}
