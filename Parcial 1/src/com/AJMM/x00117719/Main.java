package com.AJMM.x00117719;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte op1 = 0, op2 = 0;
        String nombre="";
        String puesto="";
        double salario= 0;
        String nombreDocumento="";
        String numero= "";
        int mesesContrato= 0;
        int extension=0;
        String nombreDocumento1="";

        List<ServicioProfesional> serv= new ArrayList<>();
        List<PlazaFija> plaza= new ArrayList<>();


        Empresa nuevaEmpresa= new Empresa(nombre);
        Empleado emp= (new Empleado(nombre,puesto,salario) {
        });


        do {
            System.out.println("Que desea hacer?\n1.Agregar empleado\n2.Despedir empleado\n3.Ver lista de empleados\n4.Calcular sueldo\n5.Mostrar totales\n6.Salir");
            op1 = in.nextByte();in.nextLine();

            switch (op1) {

                case 1:
                    System.out.print("Nombre del empleado: ");
                    nombre = in.nextLine();
                    System.out.print("Puesto profesional: ");
                    puesto = in.nextLine();
                    System.out.print("Salario: ");
                    salario = in.nextDouble();
                    in.nextLine();
                    System.out.println("Nombre del documento:");
                    nombreDocumento = in.nextLine();
                    System.out.println("Numero del documento");
                    numero = in.nextLine();
                    
                    System.out.println("Tipo de empleado:\n1.Servicio profesional\n2.Plaza fija");
                    op2 = in.nextByte();
                    in.nextLine();

                    switch (op2) {
                        case 1:
                            System.out.println("Meses contrato: ");
                            mesesContrato = in.nextInt();
                            in.nextLine();
                            nuevaEmpresa.addEmpleado(new Empleado(nombre, puesto, salario) {

                            });
                            emp.addDocumento(new Documento(nombreDocumento, numero));

                            serv.add(new ServicioProfesional(nombre, puesto, salario, mesesContrato));

                            break;
                        case 2:
                            System.out.println("Extension: ");
                            extension = in.nextInt();
                            in.nextLine();

                            nuevaEmpresa.addEmpleado(new Empleado(nombre, puesto, salario) {

                            });
                            emp.addDocumento(new Documento(nombreDocumento, numero));
                            plaza.add(new PlazaFija(nombre, puesto, salario, extension));


                            break;
                        case 0:
                            return;

                    }

                    break;

                case 2:
                    break;

                case 3:
                    System.out.println("Los empleados agregados actualmente son:");
                    System.out.println(nuevaEmpresa.showEmpleados());
                System.out.println(emp.showDocumento());
                serv.forEach(obj -> System.out.println(obj.toString()));
                plaza.forEach(obj -> System.out.println(obj.toString()));



            }
            } while (op1 != 0);

        // write your code here
    }


}
