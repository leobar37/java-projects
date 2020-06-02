
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import modelo.Conexion;

 
public class pais {
  private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return this.pais;
    }

    

    
   public Vector VectorContinente(String region){
       PreparedStatement pr =null;
       Connection con =null;
       ResultSet rs = null;
       Vector<pais> miVector = new Vector<pais>();
       
       try{
          
        pais obj;
        Conexion conexion = new Conexion();
        con = conexion.geConnection();
        pr = con.prepareStatement("select PaisNombre from Pais where PaisRegion='"+region+"'");
        rs = pr.executeQuery();
        while(rs.next()){
           obj = new pais();
           obj.setPais(rs.getString("PaisNombre"));
           miVector.add(obj);
          
        }
        rs.close();
       }catch(Exception ex){
           System.err.println("Error, "+ex);  
       }
    return miVector;
   }
 
  
  
  
  
}
