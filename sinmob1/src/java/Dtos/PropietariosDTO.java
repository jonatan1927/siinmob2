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
public class PropietariosDTO extends UsuariosDTO {

    public PropietariosDTO(int cedula, String pNombre, String sNombre, String pApellido, String sApellido, String direccion, String genero, String email, String fecha, int cedulauno) {
        super(cedula, pNombre, sNombre, pApellido, sApellido, direccion, genero, email, fecha, cedulauno);
    }

    public PropietariosDTO() {
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        return super.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsuario(String usuario) {
        super.setUsuario(usuario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsuario() {
        return super.getUsuario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefono() {
        return super.getTelefono(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGenero() {
        return super.getGenero(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContraseña(String contraseña) {
        super.setContraseña(contraseña); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContraseña() {
        return super.getContraseña(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setsApellido(String sApellido) {
        super.setsApellido(sApellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getsApellido() {
        return super.getsApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setpApellido(String pApellido) {
        super.setpApellido(pApellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getpApellido() {
        return super.getpApellido(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setsNombre(String sNombre) {
        super.setsNombre(sNombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getsNombre() {
        return super.getsNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setpNombre(String pNombre) {
        super.setpNombre(pNombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getpNombre() {
        return super.getpNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCedula(int cedula) {
        super.setCedula(cedula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCedula() {
        return super.getCedula(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFecha(String fecha) {
        super.setFecha(fecha); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFecha() {
        return super.getFecha(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
