
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import modelo.Conexion;

 
public class Continente {
  private String continente;

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return this.continente;
    }
  
   public Vector VectorContinente(){
       PreparedStatement pr =null;
       Connection con =null;
       ResultSet rs = null;
       Vector<Continente> miVector = new Vector<Continente>();
       
       try{
          
        Continente obj;
        Conexion conexion = new Conexion();
        con = conexion.geConnection();
        pr = con.prepareStatement("select * from pais");
        rs = pr.executeQuery();
        while(rs.next()){
           obj = new Continente();
          obj.setContinente(rs.getString("PaisContinente"));
          miVector.add(obj);
          
        }
        rs.close();
       }catch(Exception ex){
           System.err.println("Error, "+ex);  
       }
    return miVector;
   }
 
  
  
  
  
}
