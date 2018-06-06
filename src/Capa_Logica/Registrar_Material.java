package Capa_Logica;
import Capa_Datos.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registrar_Material {
    private String Id_Material;
    private String Tipo_Tela;
    private double Precio_Tela;
    private double Precio_Cremallera;
    private double Precio_Bordado;
    private double Precio_Boton;
    private double Precio_hilo;
    
    public String Añadir_Material(){
        Conexion conex = new Conexion();
        String Cad="insert into materiales values('"+this.Id_Material+"','"+this.Tipo_Tela+"','"+
                this.Precio_Tela+"','"+this.Precio_Cremallera+"','"+this.Precio_Bordado+"','"+
                this.Precio_Boton+"','"+this.Precio_hilo+"')";
        JOptionPane.showMessageDialog(null,"Material registrado correctamente");
        return (conex.Ejecutar(Cad));
    }
    
    public String Editar(){
        Conexion conex = new Conexion();
        String Cad="update materiales set Id_Material='"+this.Id_Material+"',Tipo_Tela='"+this.Tipo_Tela+
                "',Precio_Tela='"+this.Precio_Tela+"',Precio_Cremallera='"+this.Precio_Cremallera+
                "',Precio_Bordado='"+this.Precio_Bordado+"',Precio_Boton='"+this.Precio_Boton+
                "',Precio_hilo='"+this.Precio_hilo+"'";
        JOptionPane.showMessageDialog(null,"Material actualizado correctamente");
        return (conex.Ejecutar(Cad));
    }
    
    public String Eliminar(){
        Conexion conex = new Conexion();
        String Cad="delete from materiales where Id_Material='"+this.Id_Material+"'";
        JOptionPane.showMessageDialog(null,"Eliminado correctamente");
        return (conex.Ejecutar(Cad));
    }
    
    public ArrayList<Registrar_Material> Listar_Material(){
        ArrayList lista2=new ArrayList();
        try
        {
            Conexion conex=new Conexion();
            ResultSet tabla2=conex.Listar("select * from materiales");
            Registrar_Material registro;
            while(tabla2.next())
            {
                registro=new Registrar_Material();
                registro.set_Id_Material(tabla2.getString("Id_Material"));
                registro.set_Tipo_Tela(tabla2.getString("Tipo_Tela"));
                registro.set_Precio_Tela(tabla2.getDouble("Precio_Tela"));
                registro.set_Precio_Cremallera(tabla2.getDouble("Precio_Cremallera"));
                registro.set_Precio_Bordado(tabla2.getDouble("Precio_Bordado"));
                registro.set_Precio_Boton(tabla2.getDouble("Precio_Boton"));
                registro.set_Precio_hilo(tabla2.getDouble("Precio_hilo"));
                lista2.add(registro);
            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lista2;
    }
    
    public String get_Id_Material(){
        return (Id_Material);
    }
    public void set_Id_Material(String Id_Material){
        this.Id_Material=Id_Material;
    }
    
    public String get_Tipo_Tela(){
        return (Tipo_Tela);
    }
    public void set_Tipo_Tela(String Tipo_Tela){
        this.Tipo_Tela=Tipo_Tela;
    }
    
    public double get_Precio_Tela(){
        return (Precio_Tela);
    }
    public void set_Precio_Tela(double Precio_Tela){
        this.Precio_Tela=Precio_Tela;
    }
    
    public double get_Precio_Cremallera(){
        return (Precio_Cremallera);
    }
    public void set_Precio_Cremallera(double Precio_Cremallera)
    {
        this.Precio_Cremallera=Precio_Cremallera;
    }
    
    public double get_Precio_Bordado(){
        return (Precio_Bordado);
    }
    public void set_Precio_Bordado(double Precio_Bordado){
        this.Precio_Bordado=Precio_Bordado;
    }
    
    public double get_Precio_Boton(){
        return (Precio_Boton);
    }
    public void set_Precio_Boton(double Precio_Boton){
        this.Precio_Boton=Precio_Boton;
    }
    
    public double get_Precio_hilo(){
        return (Precio_hilo);
    }
    public void set_Precio_hilo(double Precio_hilo){
        this.Precio_hilo=Precio_hilo;
    }
}