
package Modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class ConsultasPersona extends Conexion{
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Persona persona) {
        Connection conexion = geConnection();
        try {
            ps = conexion.prepareStatement("insert into persona(clave,nombre,apellido,naciemiento,genero,telefono) values (?,?,?,?,?,?)");
            ps.setInt(1, persona.getClave());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setDate(4, persona.getNacimiento());
            ps.setString(5, persona.getGenero());
            ps.setString(6, persona.getTelefono());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {//finally siempre se ejecuta
            try {
                conexion.close();

            } catch (Exception e) {
            }
        }
    }

    public Persona buscar(int clave) {
        Persona persona = null;
        Connection conexion = geConnection();

        try {
            ps = conexion.prepareStatement("select * from persona  where clave = ?");
            ps.setInt(1, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                //clave,nombre,apellido,naciemiento,genero
                persona = new Persona();
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setNacimiento(rs.getDate("naciemiento"));
                persona.setGenero(rs.getString("genero"));
                persona.setIdPersona(rs.getInt("idpersona"));
                persona.setTelefono(rs.getString("telefono"));
                return persona;
            } else {
                return null;
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return null;
        } finally {
            try {

                conexion.close();
            } catch (Exception e) {
                System.err.println("Error con conexion " + e);
            }
        }
    }

    public boolean Modificar(Persona persona, int id) {
        Connection conexion = geConnection();
        //clave,nombre,apellido,naciemiento,genero
        try {
            ps = conexion.prepareStatement("update persona set nombre =?,clave=?,apellido=?,naciemiento=?,genero=?,telefono=? where idpersona = ?");
            ps.setInt(2, persona.getClave());
            ps.setString(1, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setDate(4, persona.getNacimiento());
            ps.setString(5, persona.getGenero());
            ps.setString(6, persona.getTelefono());
            ps.setInt(7, id);
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error 1, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error 2, " + e);
                return false;
            }
        }

    }

    public boolean Eliminar(int id) {
        Connection conexion = geConnection();
        //clave,nombre,apellido,naciemiento,genero
        try {
            ps = conexion.prepareStatement("delete from persona where idpersona =?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("Error, " + e);
                return false;
            }
        }
    }
    
    public void MostrarTabla(JTable tabla,JTextField caja){
     String where = "";
    if(!"".equals(caja.getText())){
      where = " where clave= "+caja.getText()+"";  
    }     
        
     Connection conexion ;
     DefaultTableModel modelo = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row,int column){
             return false;
         }
     };
     
     tabla.setModel(modelo);
     modelo.addColumn("Dni");
     modelo.addColumn("nombre");
     modelo.addColumn("apellido");
     modelo.addColumn("nacimiento");
     modelo.addColumn("genero");
     modelo.addColumn("telefono");
     TableColumnModel modelo2 = tabla.getColumnModel();
     modelo2.getColumn(2).setPreferredWidth(130);
     modelo2.getColumn(1).setPreferredWidth(130);
     modelo2.getColumn(3).setPreferredWidth(130);
     modelo2.getColumn(4).setPreferredWidth(130);
     modelo2.getColumn(5).setPreferredWidth(130);
     modelo2.getColumn(0).setPreferredWidth(130);
     try{
         conexion =geConnection();
         ps =conexion.prepareStatement("select clave,nombre,apellido,naciemiento,genero,telefono from persona"+where);
         rs =ps.executeQuery();
         while(rs.next()){
            Object fila[] = new Object[6];
            for(int i=0;i<6;i++){
                fila[i] = rs.getObject(i+1);
            }
           modelo.addRow(fila);
         }
         
     }catch(Exception ex){
         System.err.println("Error en mostrar tabla "+ex);  
     }
    }
    
    public boolean ComprobarDni(int dni){
     Connection conexion=null;
     boolean verificacion = true;
     try{
       conexion = geConnection();
       ps = conexion.prepareStatement("select clave from persona");
       rs = ps.executeQuery();
       
       // executQuery(): cuando se hace una consulta 
       //executeUpdate : cuando se quiere actualizar un registro 
       
       while(rs.next()){
          if(dni == rs.getInt("clave")){
              verificacion =false;
          }
       } 
          
     }catch(Exception ex){
         System.err.println("Error "+ ex);
         verificacion = false;
     }finally{
         try{
           conexion.close();
         }catch(Exception ex){
             System.err.println("Error con conexion"+ex);
         }
     }
     
        
    return  verificacion;
    }
}
    
    

