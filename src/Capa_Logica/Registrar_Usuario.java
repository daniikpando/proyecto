package Capa_Logica;
import Capa_Datos.Conexion;
import javax.swing.JOptionPane;
public class Registrar_Usuario {
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Contraseña;
    private String Cedula;
    private String Tipo_Usuario;
    
    public String Añadir(){
        Conexion conex = new Conexion();
        String Cad="insert into Registro values('"+this.Nombre+"','"+this.Apellido+"','"
                +this.Correo+"','"+this.Contraseña+"','"+this.Cedula+"','"+this.Tipo_Usuario+"')";
        
        JOptionPane.showMessageDialog(null,"Usuario '"+this.Nombre+" ' creado correctamente");
        return (conex.Ejecutar(Cad));
    }
    
    public String get_Nombre(){
        return (Nombre);
    }
    public void set_Nombre(String Nombre){
            this.Nombre=Nombre;
        }
    
    public String get_Apellido(){
        return (Apellido);
    }
    public void set_Apellido(String Apellido){
        this.Apellido=Apellido;
    }
    
    public String get_Correo(){
        return (Correo);
    }
    public void set_Correo(String Correo){
        this.Correo=Correo;
    }
    
    public String get_Contraseña(){
        return (Contraseña);
    }
    public void set_Contraseña(String Contraseña){
        this.Contraseña=Contraseña;
    }
    
    public String get_Cedula(){
        return (Cedula);
    }
    public void set_Cedula(String Cedula){
        this.Cedula=Cedula;
    }
    
    public String get_Tipo_Usuario(){
        return (Tipo_Usuario);
    }
    public void set_Tipo_Usuario(String Tipo_Usuario){
        this.Tipo_Usuario=Tipo_Usuario;
    }
}
