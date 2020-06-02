
import com.sun.xml.internal.ws.config.metro.util.ParserUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;


public class Ventana  extends JFrame{
    public  JPanel panel;
    
   public Ventana(){
       setSize(500, 500);// establecer el tamaño de la ventana
       setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra el programa 
       setTitle("HOLA MUNDO");
     // this.setLocation(1000, 100);
     //this.setBounds(1000, 200, 500, 500);  // recibe la poscion y el tamaño de la ventana 
       setLocationRelativeTo(null); // establcer en el centro de la pantalla 
       //setResizable(false) ;  // sirve para que el usuario no pueda aumentar o dismiunuor el tamaño de la ventana a
       setMinimumSize(new Dimension(300, 300)); //  estable el ninimo del tamaño de la ventana
       
      iniciarCopmponenetes();
       this.getContentPane().setBackground(Color.BLUE);//asingnar un color a nustra ventana 
   }
   private void iniciarCopmponenetes(){
       colocarPaneles();
       listasDespeglables();
      // darleCheak();
       //cajasTexto();
       //botonesActivacion();
       //radioBotones();
       //colocarEtiquetas();
       //colocarBotones();
       colocarTablas();
   }
   private void colocarPaneles(){
        panel = new JPanel();
       
       this.getContentPane().add(panel);//adherimos el panel encima de la ventana 
      
       panel.setBackground(Color.yellow); //establecemos el color de panel 
       panel.setLayout(null);//desactivamos el layaout
   }
   private void colocarEtiquetas(){
              JLabel  text = new JLabel("bienvenido al mundial ",SwingConstants.CENTER);//creamos una etiqueta
      // text.setText("hola personas");// le damos un mensaje String 
       text.setBounds(160,10, 200, 30);// le damos una posicion
       text.setForeground(Color.white); // establecemos un color a la etiqueta 
       panel.add(text);//lo adherimos al panel 
       text.setOpaque(true );//esta linea cambia las propiedades de la etiqueta para cambiar su color 
       text.setFont(new Font( "calibri",Font.PLAIN,20));
       text.setBackground(Color.BLACK);
       
       //estableces una imajen de etiquetas 
       ImageIcon  imajen = new ImageIcon("imajen.jpg");
       JLabel balon  = new JLabel();
       balon.setBounds(60, 50, 300, 300);
       balon.setIcon(new ImageIcon(imajen.getImage().getScaledInstance(balon.getWidth(),balon.getHeight(),Image.SCALE_SMOOTH)));
       
       panel.add(balon);
       
   }
   private void colocarBotones(){
       JButton boton1 = new JButton("mi primer boton xd");//instanciar el boton
       boton1.setEnabled(false);//suspende el boton
       boton1.setMnemonic('a');//la letra que le asigno masl alt activa el boton
       boton1.setBounds(100, 100, 200, 40);
       boton1.setFont(new Font("calibri(cuerpo)", Font.BOLD, 16));//asingnar la fuente de nuestro texto del boton
       boton1.setOpaque(true);
       boton1.setBackground(Color.BLUE);//color al texto
       boton1.setBorder(BorderFactory.createLineBorder(Color.GRAY,3,true));
       panel.add(boton1);//agregarlo al panel xd

       
   } 
   private void radioBotones(){
       JRadioButton  rbt1 = new JRadioButton("opcion 1",false);
       rbt1.setBounds(50, 150, 100, 50);
       panel.add(rbt1);
       
       JRadioButton rbt2 = new JRadioButton("pocion 2 ",false);
       rbt2.setBounds(50,200, 100, 50);
       panel.add(rbt2);
       
       JRadioButton rbt3 = new JRadioButton("opcion 3", false);
       rbt3.setBounds(50,250, 100, 50);
       panel.add(rbt3);
       
       
       ButtonGroup grupoBOtones = new ButtonGroup();
       grupoBOtones.add(rbt1);
       grupoBOtones.add(rbt2);
       grupoBOtones.add(rbt3);
 
   } 
   private void botonesActivacion(){
       JToggleButton boton1 = new JToggleButton("opcion 1", false);
       boton1.setBounds(50, 150, 150, 30);
       panel.add(boton1);
       boton1.setBackground(Color.BLUE);
       boton1.setFont(new Font("calibri",Font.PLAIN,20));
       
       JToggleButton boton2 = new JToggleButton("opcion 2", false);
       boton2.setBounds(50, 200, 150, 30);
       panel.add(boton2);
       boton2.setBackground(Color.BLUE);
       boton2.setFont(new Font("calibri",Font.PLAIN,20));
       
      JToggleButton boton3 = new JToggleButton("opcion 3", false);
       boton3.setBounds(50, 250, 150, 30);
       panel.add(boton3);
       boton3.setBackground(Color.BLUE);
       boton3.setFont(new Font("calibri",Font.PLAIN,20));
       
       ButtonGroup botonesValidacion = new ButtonGroup();
       botonesValidacion.add(boton1);
       botonesValidacion.add(boton2);
       botonesValidacion.add(boton3);
   
   }
   private void cajasTexto(){
       JTextArea textoArea = new JTextArea();
       textoArea.setBounds(20,20, 300, 300);
       textoArea.setText("este es mi texto y no lo puedes borrar");
       textoArea.setEditable(true);
       panel.add(textoArea);
       
      JScrollPane barras = new JScrollPane(textoArea);
      barras.setBounds(20,20, 300, 300);
      barras.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
      barras.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      panel.add(barras);
   }
   
   private void darleCheak(){
       JCheckBox casilla1 = new JCheckBox();
       casilla1.setBounds(10, 20, 90, 30);
       casilla1.setBackground(Color.blue);
       casilla1.setFont(new Font("calibri",Font.BOLD,16));
       casilla1.setText("casillas 1");
       panel.add(casilla1);
       JCheckBox casilla2 = new JCheckBox();
       casilla2.setBounds(10, 40, 90, 30);
       casilla2.setBackground(Color.blue);
       casilla2.setFont(new Font("calibri",Font.BOLD,16));
       casilla2.setText("casillas 2");
       panel.add(casilla2);
       
   
      
   }
   private void listasDespeglables(){
       String[] paises = {"Argentina","Peru", "Ecuador","Chile"};
       JComboBox lista = new JComboBox(paises);
       lista.setBounds(10,20,100,50);
       panel.add(lista);
       
       lista.addItem("Brazil");//añadir objetos a la lista desplegable
       lista.setSelectedItem("Ecuador");
   }
   private void colocarTablas(){
       
   }
}
