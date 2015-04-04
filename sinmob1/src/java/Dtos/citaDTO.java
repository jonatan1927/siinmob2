/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

/**
 *
 * @author jonatan
 */
public class citaDTO {
    protected int id=0;
    private int cliente=0;
    private int inmueble=0;
    private int interes=0;
    private String FechaVisita="";
    private String nom="";
    private String dir="";

    public citaDTO() {
    }
      public citaDTO(String dir ,String nom , int interes, String FechaVisita) {
        this.dir=dir;
        this.nom=nom;
        this.interes=interes;
        this.FechaVisita=FechaVisita;
    }
    public citaDTO(int id,int cliente, int inmueble, int interes) {
        this.cliente=cliente;
        this.id=id;
        this.inmueble=inmueble;
        this.interes=interes;
    }
  public citaDTO( String FechaVisita , int interes) {
        this.FechaVisita=FechaVisita;
        this.interes=interes;
    }
  
    
    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getInmueble() {
        return inmueble;
    }

    public void setInmueble(int inmueble) {
        this.inmueble = inmueble;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    public String getFechaVisita() {
        return FechaVisita;
    }

    public void setFechaVisita(String FechaVisita) {
        this.FechaVisita = FechaVisita;
    }

    @Override
    public String toString() {
        return "citaDTO{" + "id=" + id + ", cliente=" + cliente + ", inmueble=" + inmueble + ", interes=" + interes +
                ", FechaVisita=" + FechaVisita + ", nom=" + nom + ", dir=" + dir + '}';
    }


    
}
