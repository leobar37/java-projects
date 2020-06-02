/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikachu;

import javax.swing.JLabel;

/**
 *
 * @author JOSE
 */
public class Cronometro implements Runnable{
private  boolean  cronometroActivo;
private JLabel tiempo= new JLabel();
private Integer minutos=0;
private Integer segundos= 0;
private Integer mili = 0;

    public Integer getMili() {
        return mili;
    }

    public void setMili(Integer mili) {
        this.mili = mili;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }


    public boolean isCronometroActivo() {
        return cronometroActivo;
    }

    public void setCronometroActivo(boolean cronometroActivo) {
        this.cronometroActivo = cronometroActivo;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }
    

    @Override
    public void run() {
            Integer  milesimas = 0;
        String min="", seg="", mil="";
        try
        {
          
            while( cronometroActivo )
            {
                Thread.sleep(4);
                
                milesimas += 4;

                if( milesimas == 1000 )
                {
                    milesimas = 0;
                    segundos += 1;
           
                    if( segundos == 60 )
                    {
                        segundos = 0;
                        minutos++;
                    }
                }

             
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();

                if( milesimas < 10 ) mil = "00" + milesimas;
                else if( milesimas < 100 ) mil = "0" + milesimas;
                else mil = milesimas.toString();

               
                tiempo.setText( min + ":" + seg + ":" + mil );
            }
        }catch(InterruptedException e){}
       
              tiempo.setText( "00:00:000" );
    
            }
   
    
}
