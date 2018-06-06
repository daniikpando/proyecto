package Capa_Logica;

public class Generar_Codigo {
    private int dato;
    private int cont=1;
    private String num="";
    
    public void generar(int dato){
        this.dato=dato;
        if((this.dato>=100) && (this.dato<100))
        {
            int c=cont+this.dato;
            num="PROD-"+c;
        }
        if((this.dato>=1) && (this.dato<9))
        {
            int c=cont+this.dato;
            num="PROD0-"+c; 
        }
        if(this.dato==0)
        {
           int c=cont+this.dato;
            num="PROD0-"+c; 
        }
    }
    public String get_num(){
        return (this.num);
    }
}
