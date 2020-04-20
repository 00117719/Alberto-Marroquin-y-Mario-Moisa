package com.AJMM.x00117719;
import java.util.List;
import java.util.ArrayList;

public final class CalculadoraImpuestos {
    private static double totalRenta;
    private static double totalISS;
    private static double totalAFP;

    List<CalculadoraImpuestos> plan=new ArrayList<>();

     CalculadoraImpuestos() {}



     public double calcularPago (Empleado empleado) {
         if (empleado.getSalario() >= 472.01)
             if (empleado instanceof ServicioProfesional)
                 totalRenta = empleado.getSalario() * 0.1;
         double sueldo = empleado.getSalario() - totalRenta;

         if (empleado.getSalario() >= 472.01)
             if (empleado instanceof PlazaFija)
                 totalRenta = empleado.getSalario() * 0.1;
         double sueldo1 = empleado.getSalario() - totalRenta;
         totalAFP = 0.0625 * empleado.getSalario();
         totalISS = empleado.getSalario() * 0.03;

         return sueldo;

     }
     public String mostrarTotales () {
         String total ="";
         plan.forEach(obj-> System.out.println(obj.toString()));
         return  total;
     }

     @Override
     public String toString () {
         return "CalculadoraImpuestos{" +
                 "totalAFP=" + totalAFP +
                 ", totalISS=" + totalISS +
                 ", totalRenta=" + totalRenta +
                 '}';
     }



}
