
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import modelo.Conexion;

 
public class Region {
  private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return this.region;
    }

    
   public Vector VectorContinente(String continente){
       PreparedStatement pr =null;
       Connection con =null;
       ResultSet rs = null;
       Vector<Region> miVector = new Vector<Region>();
       
       try{
          
        Region obj;
        Conexion conexion = new Conexion();
        con = conexion.geConnection();
        pr = con.prepareStatement("select PaisRegion from Pais where PaisContinente='"+continente+"'");
        rs = pr.executeQuery();
        while(rs.next()){
           obj = new Region();
           obj.setRegion(rs.getString("PaisRegion"));
           miVector.add(obj);
          
        }
        rs.close();
       }catch(Exception ex){
           System.err.println("Error, "+ex);  
       }
    return miVector;
   }
 
  
  
  
  
}
