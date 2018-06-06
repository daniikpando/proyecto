package Capa_Logica;
import Capa_Datos.Conexion;
import Capa_Presentacion.Consulta_Cliente;
import Capa_Presentacion.Iniciar_Sesion;
import Capa_Presentacion.Producto_Admin;
import Capa_Presentacion.*;

import javax.swing.*;
import java.sql.*;
public class Inicio_Sesion {
    public String Iniciar(String correo,String pass){
        Registrar_Usuario registro = new Registrar_Usuario();
        Conexion conex = new Conexion();
        String Cap="";
        String Cad="select * from registro where correo='"+correo+"' && contraseña='"+pass+"'";
        try
        {
           ResultSet rs= conex.Listar(Cad);
           while(rs.next())
           {
               Cap=rs.getString("Tipo_Usuario");
           }
           if(Cap.equals("Admin"))
           {
               JOptionPane.showMessageDialog(null,"Bienvenido admin ");
               Producto_Admin Pro_admin = new Producto_Admin();
               Pro_admin.setVisible(true);
           }
           if(Cap.equals("Cliente"))
           {
               JOptionPane.showMessageDialog(null, "Bienvenido sr ");
               Consulta_Cliente consulta = new Consulta_Cliente();
               consulta.setVisible(true);
               
           }
           if((!Cap.equals("Admin")) && (!Cap.equals("Cliente")))
           {
               JOptionPane.showMessageDialog(null,"Error, Verifique su usuario y contraseña");
               Iniciar_Sesion iniciar = new Iniciar_Sesion();
               iniciar.setVisible(true);
           }
        }
        catch(Exception e)
        {
        }
        return(conex.Ejecutar(Cad));
    }
}
