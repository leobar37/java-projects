public class Mensaje {
    private String texto;

    
    public void asignarDatos(String texto){
        this.texto=texto;
    }
    public Mensaje(){
        
    }
    
    public Mensaje(String texto){
        this.texto = texto;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public int hallarLongitud(){
        return texto.length();
    }
    
    public int contarA(){
        
        int cant, i;
        cant = 0;
        
        for(i=0; i<= texto.length()-1; i++){
        
            if(texto.charAt(i)=='a' || texto.charAt(i)=='A'){
                cant = cant +1;
            }
        }
        return cant;
    }
    
    public String conMayusculas(){
        return texto.toUpperCase();
    }
    
    public String invertir(){
        String msjInv;
        int i;
        msjInv="";
        for(i=texto.length()-1; i>=0; i--){
            msjInv= msjInv + texto.charAt(i);
        }
        return msjInv;
    }
    
    
    public String obtenerCadena(int posIni, int posFin){
        return texto.substring(posIni-1, posFin+1);
    }
    
    public int buscarCadena(String cad){
        return texto.indexOf(cad);
    }
    
    public String encriptar(){
        int i;
        String msjEnc;
        msjEnc = "";
        
        for(i=0; i<=texto.length()-1; i++){
            msjEnc= msjEnc + (char) (texto.charAt(i)+3);
        }
        return msjEnc;
    }
    
}
