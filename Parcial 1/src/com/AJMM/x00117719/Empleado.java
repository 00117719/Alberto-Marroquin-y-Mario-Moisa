package com.AJMM.x00117719;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado  {

    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos;
    protected double salario;


    public Empleado(String nombre,String puesto,double salario) {
        this.nombre = nombre;
        this.puesto= puesto;
        documentos= new ArrayList<>();
        this.salario= salario;
    }


    public String getNombre() {

        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }

    public List<Documento> getDocumentos() {

        return documentos;
    }


    public void addDocumento(Documento docu)
    {

        documentos.add(docu);

    }

    public String showDocumento(){
        String mensaje= "";
        for(Documento documento:documentos)
            mensaje+=documento.toString() + "\n";
        return mensaje;
    }
    public void removeDocumento(Documento document){
       documentos.remove(document);

    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                " nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
