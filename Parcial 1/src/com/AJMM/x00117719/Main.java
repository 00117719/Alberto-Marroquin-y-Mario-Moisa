package com.AJMM.x00117719;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        byte op1=0, op2=0;
        String empleadoNombre= "";


        do {
            System.out.print("Que desea hacer?");
            System.out.print("1.Agregar empleado");
            System.out.print("2.Despedir empleado");
            System.out.print("3.Ver lista de empleados");
            System.out.print("4.Calcular sueldo");
            System.out.println("5.Mostrar totales");
            System.out.println("6.Salir");
            op1=in.nextByte();in.nextLine();
            switch(op1){
                case 1:
                    System.out.println("Nombre del empleado:"); empleadoNombre=in.nextLine();
                    Empresa nuevoEmpleado= new Empresa(empleadoNombre);
            }

        }while(op1!=0);



	// write your code here
    }


}
