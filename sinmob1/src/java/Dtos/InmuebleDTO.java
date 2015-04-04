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
public class InmuebleDTO {
    protected int id=0;
    private String  Direccion="";
    private int    Valor=0;
    private String Barrio="";
    private String Localidad="";
    private int Pisos=0;
    private int Habitaciones=0;
    private int Baños=0;
    private int Estrato=0;
    private String Anuncio="";
    private String Construccion="";
    private String nom="";
    private String ape="";
    
    
    
    public InmuebleDTO( int id,String Barrio,String Localidad,int Pisos, int Habitaciones,int Baños,int Estrato,
    String Anuncio,String Construccion,int Valor, String Direccion ) {
        this.id=id;
        this.Barrio=Barrio;
        this.Localidad=Localidad;
        this.Pisos=Pisos;
        this.Habitaciones=Habitaciones;
        this.Baños=Baños;
        this.Estrato=Estrato;
        this.Anuncio=Anuncio;
        this.Construccion=Construccion;
        this.Direccion=Direccion;
        this.Valor=Valor;
    }
     public InmuebleDTO(String Direccion,String nom , String Barrio,String Localidad) {
        this.Direccion=Direccion;
        this.nom=nom;
        this.Barrio=Barrio;
        this.Localidad=Localidad;

    }
        public InmuebleDTO( String Barrio,String Localidad,int Pisos, int Habitaciones,int Baños,int Estrato,
    String Anuncio,String Construccion,int Valor, String Direccion ) {
        this.Barrio=Barrio;
        this.Localidad=Localidad;
        this.Pisos=Pisos;
        this.Habitaciones=Habitaciones;
        this.Baños=Baños;
        this.Estrato=Estrato;
        this.Anuncio=Anuncio;
        this.Construccion=Construccion;
        this.Direccion=Direccion;
        this.Valor=Valor;
    }

    public InmuebleDTO() {
  
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public int getPisos() {
        return Pisos;
    }

    public void setPisos(int Pisos) {
        this.Pisos = Pisos;
    }

    public int getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(int Habitaciones) {
        this.Habitaciones = Habitaciones;
    }

    public int getBaños() {
        return Baños;
    }

    public void setBaños(int Baños) {
        this.Baños = Baños;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }

    public String getAnuncio() {
        return Anuncio;
    }

    public void setAnuncio(String Anuncio) {
        this.Anuncio = Anuncio;
    }

    public String getConstruccion() {
        return Construccion;
    }

    public void setConstruccion(String Construccion) {
        this.Construccion = Construccion;
    }

    @Override
    public String toString() {
        return "InmuebleDTO{" + "id=" + id + ", Direccion=" + Direccion + ", Valor=" + Valor + ", Barrio=" + Barrio + ", Localidad=" + Localidad + ", Pisos=" + Pisos + ", Habitaciones=" + Habitaciones + ", Ba\u00f1os=" + Baños + ", Estrato=" + Estrato + ", Anuncio=" + Anuncio + ", Construccion=" + Construccion + ", nom=" + nom + ", ape=" + ape + '}';
    }

   
    
    
    
}
