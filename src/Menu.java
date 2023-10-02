/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Menu {

    public void Menu() {
        Teclado tec = new Teclado();

        GestorCentroEductvo gestor = new GestorCentroEductvo();
        int op,fechNacmto,aniosExp,salario;
        String cedula,nom1,nom2,apelldo1,apelldo2;

        Opciones();
        System.out.print("Opción:");
        op = tec.Tec().nextInt();
        switch (op) {
            case 1:
                System.out.println("Bienvenido a la opción 1");
                break;
            case 2:
                System.out.println("---Registro de Estudiantes-----");
                System.out.print("Cédula:"); cedula=tec.Tec().next();
                System.out.print("Primer Nombre:"); nom1=tec.Tec().next();
                System.out.print("Segundo Nombre:");nom2=tec.Tec().next();
                System.out.print("Apellido Paterno:"); apelldo1=tec.Tec().next();       
                System.out.print("Apellido Materno:");apelldo2=tec.Tec().next();
                System.out.print("Fecha de nacimiento(dd/mm/aaaa):");fechNacmto=tec.Tec().nextInt();
                System.out.print("Años de experiencia:");aniosExp=tec.Tec().nextInt();
                System.out.print("Salario:");salario=tec.Tec().nextInt();
                break;
            case 3:
                System.out.println("Bienvenido a la opción 3");
                break;
            case 4:
                System.out.println("Bienvenido a la opción 4");
                break;
            case 5:
                System.out.println("-------------Reportes de estudiantes y profesores---------");
                gestor.imprimirPersonas();
                break;
            case 6:
                System.out.println("-----------Estudiantes en un curso-----------");
                gestor.ImprimirReporteInscritos();
                break;
            case 7:
                System.out.println("Buen día");
                System.exit(0);
                break;
            default:
                System.out.println("Opción Incorrecta");
        }

    }

    public void Opciones() {
        System.out.println("------U T A---------");
        System.out.println("1)Registro de estudiantes\n"
                + "2)Registro de profesores\n3)Crear cursos"
                + "\n4)Incripción de estudiantes en cursos"
                + "\n------REPORTES----\n5)Estudiantes y profesores "
                + "\n6)Estudiantes en un curso\n7)Salir");
    }
}
