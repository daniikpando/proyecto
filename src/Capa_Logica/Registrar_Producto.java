package Capa_Logica;
import Capa_Datos.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registrar_Producto {
    private String Id_Producto;
    private String Nombre;
    private double Precio;
    private String Genero;
    
    public String Añadir_Producto(){
        Conexion conex = new Conexion();
        String Cad="insert into Producto values ('"+this.Id_Producto+"','"+this.Nombre+"','"+
                this.Precio+"','"+this.Genero+"')";
        JOptionPane.showMessageDialog(null,"Producto registrado correctamente");
        return (conex.Ejecutar(Cad));
    }
    public ArrayList<Registrar_Producto> Listar(){
        ArrayList lista=new ArrayList();
        try
        {
            Conexion conex=new Conexion();
            ResultSet tabla=conex.Listar("select * from producto");
            Registrar_Producto registro;
            while(tabla.next())
            {
                registro=new Registrar_Producto();
                registro.set_ID_Producto(tabla.getString("id_Producto"));
                registro.set_Nombre(tabla.getString("Nombre"));
                registro.set_Precio(tabla.getDouble("Precio"));
                registro.set_genero(tabla.getString("Genero"));
                lista.add(registro);
            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lista;
    }

    public String Editar(){
        Conexion conex=new Conexion();
        String cad="update producto set Id_Producto='"+this.Id_Producto+"', Nombre='"+this.Nombre
                +"', Precio='"+this.Precio+"', Genero='"+this.Genero+"'";
        JOptionPane.showMessageDialog(null,"Producto actualizado correctamente");
        return (conex.Ejecutar(cad));
    }
    
    public String Eliminar(){
        Conexion conex = new Conexion();
        String cad="delete from producto where Id_Producto='"+this.Id_Producto+"'";
        JOptionPane.showMessageDialog(null,"Producto eliminado correctamente");
        return (conex.Ejecutar(cad));
    }
        
    public String get_ID_Producto(){
        return (Id_Producto);
    }
    public void set_ID_Producto(String ID_Producto){
        this.Id_Producto=ID_Producto;
    }
    
    public String get_Nombre(){
        return (Nombre);
    }
    public void set_Nombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public double get_Precio(){
        return (Precio);
    }
    public void set_Precio(double Precio){
        this.Precio=Precio;
    }
    
    public String get_Genero(){
        return (Genero);
    }
    public void set_genero(String Genero){
        this.Genero=Genero;
    }
    
}
