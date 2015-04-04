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
public class TelefonoDTO {
    private int cedula=0;
    private String descripcion="";
    private String numero="";
    
     public TelefonoDTO() {
    }


    public TelefonoDTO(String numero, int cedula) {
        this.numero=numero;
        this.cedula=cedula;
    }

   
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "TelefonoDTO{" + "descripcion=" + descripcion + ", numero=" + numero + '}';
    }
    
    
    
}
