/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Profesor extends Trabajador {

    int añosExper;
    Curso[] cursos;

    public Profesor() {

    }

    public Profesor(int añosExper,float salario, String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, int FechaNacmto) {
        super(salario, cedula, nombre1, nombre2, Apellido1, Apellido2, FechaNacmto);
        this.añosExper = añosExper;
    }

    public int getAñosExper() {
        return this.añosExper;
    }

    public void setAñosExper(int añosExper) {
        this.añosExper = añosExper;
    }

    public Curso[] getCursos() {
        return this.cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor\n" + super.toString() + "\n-Años Experiencia:" + this.añosExper;
    }
}
