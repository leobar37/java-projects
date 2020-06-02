
package crud_mvc;

import Controlador.Controladorpersona;
import Modelo.ConsultasPersona;
import Modelo.Persona;
import Vista.vistaPersona;

public class CRUD_MVC {

    public static void main(String[] args) {
        vistaPersona vista=new vistaPersona();
        ConsultasPersona modelo=new ConsultasPersona();
        Persona persona=new Persona();
        Controladorpersona controlador = new Controladorpersona(vista, modelo, persona);
        controlador.iniciar();
     
    }
    
}
