/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Menu {

    int op;
    public Teclado tec = new Teclado();
    public GestorCentroEductvo gestor = new GestorCentroEductvo();

    public void menu() {
        char opcSn;
        do {
            Opciones();
            System.out.print("Opción:");
            op = tec.Tec().nextInt();
            switch (op) {
                case 1:
                    System.out.println("Bienvenido a la opción 1");
                    break;
                case 2:
                    do {
                        Profesor profesor = new Profesor();
                        pedirDatos(profesor);
                        gestor.registrarProfesor(profesor);
                        System.out.print("Desea Registrar un profesor nuevo\n ¿S/N?:");
                        opcSn = tec.Tec().next().toUpperCase().charAt(0);
                    } while (opcSn == 'S');
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
                    gestor.imprimirProfesores();
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
        } while (op != 7);
    }

    public void Opciones() {
        System.out.println("------U T A---------");
        System.out.println("1)Registro de estudiantes\n"
                + "2)Registro de profesores\n3)Crear cursos"
                + "\n4)Incripción de estudiantes en cursos"
                + "\n------REPORTES----\n5)Estudiantes y profesores "
                + "\n6)Estudiantes en un curso\n7)Salir");
    }

    public Profesor pedirDatos(Profesor profe) {
        System.out.println("---Registro de Profesores-----");
        System.out.print("Cédula:");
        profe.setCedula(tec.Tec().next());
        System.out.print("Primer Nombre:");
        profe.setNombre1(tec.Tec().next());
        System.out.print("Segundo Nombre:");
        profe.setNombre2(tec.Tec().next());
        System.out.print("Apellido Paterno:");
        profe.setApellido1(tec.Tec().next());
        System.out.print("Apellido Materno:");
        profe.setApellido2(tec.Tec().next());
        System.out.print("Fecha de nacimiento(dd/mm/aaaa):");
        profe.setFechaNacmto(tec.Tec().nextInt());
        System.out.print("Años de experiencia:");
        profe.setAñosExper(tec.Tec().nextInt());
        System.out.print("Salario:");
        profe.setSalario(tec.Tec().nextInt());
        return profe;
    }
}
