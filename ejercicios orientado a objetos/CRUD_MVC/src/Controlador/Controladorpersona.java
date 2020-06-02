
package Controlador;

import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.tablaRegistro;
import Vista.vistaPersona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import otros.Alternos;


public class Controladorpersona implements ActionListener{
    private vistaPersona vista;
    private ConsultasPersona consulta;
    private Persona persona;

    public Controladorpersona(vistaPersona vista, ConsultasPersona consulta, Persona persona) {
        this.vista = vista;
        this.consulta = consulta;
        this.persona = persona;
        vista.btnInsertar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.btnModificar.addActionListener(this);
        vista.btnElimiar.addActionListener(this);
        vista.btnMostrarTabla.addActionListener(this);
        
    }
    public void iniciar(){
        vista.setTitle("Registro de personas");
        vista.setLocationRelativeTo(null);
        vista.idPersonatxt.setVisible(false);
        vista.setVisible(true);
        vista.setResizable(false);
        LimpiarCajas(vista.panel);
        vista.btnElimiar.setVisible(false);
        vista.btnModificar.setVisible(false);
        Alternos.limitarTeclado(vista.txtClave);
        Alternos.limitarTeclado(vista.txtTelefono);
        Alternos.limitarTeclado(vista.txtPass);
                
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.btnInsertar) {
           if(ErrordeInsertar(vista.panel)==true){
            persona.setClave(Integer.parseInt(vista.txtClave.getText()));
            persona.setApellido(vista.txtApellido.getText());
            persona.setGenero(vista.jcboGenero.getSelectedItem().toString());
            String año = vista.cboAño.getSelectedItem().toString();
            int aux = vista.cboMes.getSelectedIndex() + 1;
            String mes = String.valueOf(aux);
            String dia = vista.cboDia.getSelectedItem().toString();
            String fecha = año + "-" + mes + "-" + dia;
            persona.setTelefono(vista.txtTelefono.getText());
            persona.setNacimiento(Date.valueOf(fecha));
            persona.setNombre(vista.txtNOMBRE.getText());
            int DNI =Integer.parseInt(vista.txtClave.getText());
            if(consulta.ComprobarDni(Integer.parseInt(vista.txtClave.getText()))){
              if (consulta.insertar(persona) && DNI == 8 && DNI ==8) {
                JOptionPane.showMessageDialog(null, "registro correcto");
                LimpiarCajas(vista.panel);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }  
            }else{
               JOptionPane.showMessageDialog(null, "Ya existe este usuario"
                                                    + "\n verificar Dni");
                
            }
            
           }else{
            JOptionPane.showMessageDialog(null, "se deben llenar todos los campos");
           }
        }
         if (ae.getSource() == vista.botonBuscar) {
            if(vista.txtPass.getText().equals("")){
               JOptionPane.showMessageDialog(null,"se tiene que ingresar el dni");
            }else{
                if (consulta.buscar(Integer.parseInt(vista.txtPass.getText())) != null) {
                int genero;
                Persona p = consulta.buscar(Integer.parseInt(vista.txtPass.getText()));
                vista.txtNOMBRE.setText(p.getNombre());
                vista.txtApellido.setText(p.getApellido());
                vista.txtClave.setText(vista.txtPass.getText());
                vista.idPersonatxt.setText(String.valueOf(p.getIdPersona()));
                vista.txtTelefono.setText(p.getTelefono());
                if (p.getGenero().equals("masculino")) {
                    genero = 0;                    
                } else {
                    genero = 1;
                }
                vista.jcboGenero.setSelectedIndex(genero);
                SeleccionCBO(String.valueOf(p.getNacimiento()));
                vista.btnElimiar.setVisible(true);
                vista.btnModificar.setVisible(true);
                JOptionPane.showMessageDialog(null, "Encontrado"); 
                
            } else {
                JOptionPane.showMessageDialog(null, "error");
                LimpiarCajas(vista.panel);
            }
            }
            
          }
          if (ae.getSource() == vista.btnLimpiar) {
            LimpiarCajas(vista.panel);
            vista.btnElimiar.setVisible(false);
            vista.btnModificar.setVisible(false);
          }   
          if(ae.getSource() == vista.btnModificar){
           if(ErrordeInsertar(vista.panel)){
                 persona.setClave(Integer.parseInt(vista.txtClave.getText()));
            persona.setApellido(vista.txtApellido.getText());
            persona.setGenero(vista.jcboGenero.getSelectedItem().toString());
            String año = vista.cboAño.getSelectedItem().toString();
            int aux = vista.cboMes.getSelectedIndex() + 1;
            String mes = String.valueOf(aux);
            String dia = vista.cboDia.getSelectedItem().toString();
            String fecha = año + "-" + mes + "-" + dia;
            persona.setNacimiento(Date.valueOf(fecha));
            persona.setNombre(vista.txtNOMBRE.getText());
            persona.setTelefono(vista.txtTelefono.getText());
            if (consulta.Modificar(persona,Integer.parseInt(vista.idPersonatxt.getText()))) {
                JOptionPane.showMessageDialog(null, "Se moodifico correctamente");
                LimpiarCajas(vista.panel);
                vista.btnElimiar.setVisible(false);
                 vista.btnModificar.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                
            }   
           }else{
              JOptionPane.showMessageDialog(null, "se deben llenar todos los campos");
           }
          }
            if(ae.getSource() == vista.btnElimiar){
           
            
            if (consulta.Eliminar(Integer.parseInt(vista.idPersonatxt.getText()))) {
                JOptionPane.showMessageDialog(null, "Se elmino correctamente a "+vista.txtNOMBRE.getText());
                LimpiarCajas(vista.panel);
                vista.btnElimiar.setVisible(false);
                 vista.btnModificar.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar");
                LimpiarCajas(vista.panel);
            }   
          }
        if(ae.getSource() == vista.btnMostrarTabla){
            tablaRegistro vista2 = new tablaRegistro(null, false);
            consulta.MostrarTabla(vista2.tablaRegistro,vista2.txtCajtablaBuscar);
            vista2.setVisible(true);
            vista2.setLocationRelativeTo(null);
            vista2.setResizable(false);
            
            ActionListener evento = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                 consulta.MostrarTabla(vista2.tablaRegistro,vista2.txtCajtablaBuscar);
                }
            };
         vista2.btnTablaBuscar.addActionListener(evento);   
        }
        
       
            
          
          
          
    }
    private void SeleccionCBO(String xd){
      String fecha[] = xd.split("-");
        
       int año =vista.cboAño.getItemCount();
       int mes = vista.cboMes.getItemCount();
      int dia = vista.cboDia.getItemCount();
       
      for(int i=0; i<año;i++){
          String obj = vista.cboAño.getItemAt(i); 
          if(obj.equals(fecha[0])){
            vista.cboAño.setSelectedIndex(i);
          }
      }
        for(int i=0; i<mes;i++){
          int aux = Integer.parseInt(fecha[1])-1;
          if(i == aux){
          vista.cboMes.setSelectedIndex(i);
              
          }
      }
        for(int i=0; i<dia;i++){
            String obj = vista.cboDia.getItemAt(i);
            int d = Integer.parseInt(obj);
            int aux = Integer.parseInt(fecha[2]);
           
          if(d==aux){
            vista.cboDia.setSelectedIndex(i);
          }
      }   
         
    }
    private void LimpiarCajas(JPanel panel){
      for(int i =0;i<panel.getComponents().length;i++){
          if(panel.getComponents()[i] instanceof JTextField){
              JTextField caja = (JTextField)panel.getComponents()[i];
              caja.setText("");
             
             
          }
          if(panel.getComponents()[i] instanceof JComboBox){
              JComboBox cbo = (JComboBox)panel.getComponents()[i];
              cbo.setSelectedIndex(-1);
            
          }
          
      }
     }
    public boolean ErrordeInsertar(JPanel panel){
         boolean verificacion = true;
         for (int i = 0; i < panel.getComponents().length; i++) {
             
             if (panel.getComponents()[i] instanceof JTextField) {
                 JTextField caja = (JTextField) panel.getComponents()[i];
                 if (caja == vista.txtPass || caja == vista.idPersonatxt) {

                 } else {
                     if (caja.getText().equals("")) {
                      
                         verificacion = false;
                     }
                 }

             } else {
                 if (panel.getComponents()[i] instanceof JComboBox) {
                     JComboBox cbo = (JComboBox) panel.getComponents()[i];
                    
                     if (cbo.getSelectedIndex() == -1) {
                         
                         verificacion = false;
                     }
                 }

             }
         }
     return  verificacion;
     }
      

    /* Resumen
      ==========
     ¿Que es el crud?
     Crud es el anonimo de crear leer actualizar y eliminar
     Acronimo = create -read-update-delete
     que refleja las funciones basicas de las bases de datos
     
     ¿Que es mvc(Modelo, Vista, Controlador)?
     El MVC es un patron de arquitectura de software y separa el programa en 3 componentes 
     vista: Formularios es la comunicacion de datos con el usuario
     Controlador: Es el encargado de unir el modelo con la vista,comunicar los datos
     entre ellos
     modelo:Es todo aquello que que tenga que ver con la base de datos 
    */
    
    

}

