
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
class Persona {

    String cedula;
    String nombre1;
    String nombre2;
    String Apellido1;
    String Apellido2;
    int FechaNacmto;

    public Persona(String cedula, String nombre1, String nombre2, String Apellido1, String Apellido2, int FechaNacmto) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.FechaNacmto = FechaNacmto;
    }

    public int Edad(int anioP, int mesP, int diaP) {
        Date fecha = new Date();
        int dia, mes, anio, anioCal;
        dia = fecha.getDate();
        mes = fecha.getMonth() + 1;
        anio = fecha.getYear() + 1900;
        anioCal = anio - anioP;
        if (mes <= mesP) {
            if (mes == mesP) {
                if (diaP > dia) {
                    anioCal++;
                }

            }

        }
        return anioCal;
    }

    public String nomApell() {
        return this.Apellido1 + " " + this.Apellido2
                + " " + this.nombre1 + " " + this.Apellido2;
    }

    @Override
    public String toString() {
        return "Cédula:" + this.cedula
                + "\nNombres y Apellidos:" + nomApell()
                + "\nEdad:" + Edad(12, 12, 12);
    }

}
