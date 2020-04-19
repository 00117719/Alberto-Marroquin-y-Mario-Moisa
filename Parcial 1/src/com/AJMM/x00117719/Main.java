package com.AJMM.x00117719;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte op1 = 0, op2 = 0;
        String nombre = "";
        String nombreEmpleado = "";
        String puesto = "";
        double salario = 0;

        Empresa nuevaEmpresa= new Empresa(nombre);

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
                    salario = in.nextDouble();in.nextLine();
                    nuevaEmpresa.addEmpleado(new Empleado(nombre,puesto,salario){
                    });
                    break;

                case 2:
                    break;

                case 3:
                    System.out.println(nuevaEmpresa.showEmpleados());
                    break;

                case 0:return;
            }

        } while (op1 != 0);

        // write your code here
    }


}
