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
public class UsuariosDTO {
 protected int id=0;   
 private int cedula=0;
 private String pNombre="";
 private String sNombre="";
  private String pApellido="";
 private String sApellido="";
 private String direccion="";
 private String contraseña="";
 private String usuario="";
 private String genero="";
 private String telefono="";
 private String email="";
 private String fecha="";
 
 

    public UsuariosDTO() {
    }
    
    public UsuariosDTO(int id) {
        this.id=id;
     
    }
    public UsuariosDTO( String telefono, int cedulauno ) {
        this.telefono=telefono;
        this.cedula=cedulauno;

    }
  public UsuariosDTO( String pNombre, String sNombre,
            String pApellido, String sApellido, String direccion,String usuario ) {
    this.pNombre=pNombre;
    this.sNombre=sNombre;
    this.pApellido=pApellido;
    this.sApellido=sApellido;
    this.direccion=direccion;
    this.usuario=usuario;
    }
 
    public UsuariosDTO(int cedula, String pNombre, String sNombre,
            String pApellido, String sApellido, String direccion, String genero , String email,String fecha, int cedulauno) {
    this.cedula=cedula;
    this.pNombre=pNombre;
    this.sNombre=sNombre;
    this.pApellido=pApellido;
    this.sApellido=sApellido;
    this.direccion=direccion;
    this.genero=genero;
    this.email=email;
    this.fecha=fecha;
    this.id=cedulauno;
    }
        
    
   public UsuariosDTO( int id, int cedula, String pNombre, String sNombre,
            String pApellido, String sApellido, String direccion,String email) {
    this.id=id;
    this.cedula=cedula;
    this.pNombre=pNombre;
    this.sNombre=sNombre;
    this.pApellido=pApellido;
    this.sApellido=sApellido;
    this.direccion=direccion;
    this.email=email;
    }
    public UsuariosDTO(int cedula, String pNombre, String sNombre,
            String pApellido, String sApellido, String direccion,String email) {
    this.cedula=cedula;
    this.pNombre=pNombre;
    this.sNombre=sNombre;
    this.pApellido=pApellido;
    this.sApellido=sApellido;
    this.direccion=direccion;
    this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuariosDTO{" + "id=" + id + ", cedula=" + cedula + ", pNombre=" + pNombre + ", sNombre=" + sNombre + ", pApellido=" + pApellido + ", sApellido=" + sApellido + ", direccion=" + direccion + ", contrase\u00f1a=" + contraseña + ", usuario=" + usuario + ", genero=" + genero + ", telefono=" + telefono + ", email=" + email + ", fecha=" + fecha + '}';
    }


    


 
 
    
}
