package com.AJMM.x00117719;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado extends Exception {
    Scanner in= new Scanner(System.in);

    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos;
    protected double salario;


    public Empleado(String nombre,String puesto) {
        this.nombre = nombre;
        this.puesto= puesto;
        documentos= new ArrayList<>();
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


    public void addDocumento(Documento docu){
        documentos.add(docu);
    }
    public void addDocumento(String nombre, Documento empleado) throws NotExistingDocumentException, SubDocumentException{
        Documento empresa= null;
        for(Documento a: documentos){
            if(a.getNombre().equals(nombre)){
                empresa=a;
            }
            if(empresa ==null)
                throw new NotExistingDocumentException("El documento de ese empleado no existe");
        }
    }
    public void removeDocumento(String doc){



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
                "documentos=" + documentos +
                ", in=" + in +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
