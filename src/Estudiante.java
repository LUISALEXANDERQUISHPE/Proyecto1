/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Estudiante extends Persona {

    float promCalifi;
    String direccion;
    Curso[] cursos;

    public Estudiante(float promCalifi, String direccion, Curso[] cursos, String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, int FechaNacmto) {
        super(cedula, nombre1, nombre2, Apellido1, Apellido2, FechaNacmto);
        this.promCalifi = promCalifi;
        this.direccion = direccion;
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudiante" + super.toString() + "\n-Promedio:" + this.promCalifi
                + "\n-Dirección:" + this.direccion
                + "\n-Curso:";
    }

}
