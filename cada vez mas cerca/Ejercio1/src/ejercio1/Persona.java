/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio1;

/**
 *
 * @author JOSE
 */
public class Persona {
    
    private float  altura;
    private float peso;

    public Persona (float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }
    
    public String CalcularImc() throws NumberFormatException{
        float imc = (float)(peso /Math.pow(altura, 2));
        String resultado = "no se a podido calcular el imc";
        if (imc<16){
            resultado = "Infrapeso: Delgadez severa";
              
        }else{
            if(imc> 16 && imc < 16.99){
                resultado = "Infrapeso: Delgadez moderada";
                
            }else{
                if(imc> 17 && imc < 18.49){
                    resultado = "Infrapeso: Delgadez aceptable";
                }else{
                    if(imc> 18.50 && imc < 24.99){
                        resultado = "Peso normal";
                        
                    }else{
                        if(imc> 25&& imc < 29.99){
                          resultado = "sobrepeso";                            
                        }else{
                            if(imc> 30 && imc < 34.99){
                                resultado = "obeso: tipo I";
                                
                            }else
                                if(imc> 35 && imc < 40){
                                    resultado= "obeso: Tipo II";
                                }else{
                                    if(imc> 40){
                                        resultado = "obeso: Tipo III";
                                        
                                    }
                                }
                                    
                        }
                    }
                }
            }
        }
        
        return resultado;
        
    }
    public boolean Validadcion(){
       boolean resultado = true;
       if((altura == 0)){
           resultado = false;
       }
       return resultado;
    }
    
    
}
