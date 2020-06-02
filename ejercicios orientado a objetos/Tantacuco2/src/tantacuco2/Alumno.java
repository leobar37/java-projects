
package tantacuco2;


public class Alumno {
    
    private int  numero= 0;
    private float[] practicas= new float[2];
    private float pracial;
    private float examFinal;  

    public float[] getPracticas() {
        return practicas;
    }

    public void setPracticas(float[] practicas) {
        this.practicas = practicas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPracial() {
        return pracial;
    }

    public void setPracial(float pracial) {
        this.pracial = pracial;
    }

    public float getExamFinal() {
        return examFinal;
    }

    public void setExamFinal(float examFinal) {
        this.examFinal = examFinal;
    }
    public float PromedioPracticas(){
       float practica= 0;
       float promedio;
       for(int i =0; i<practicas.length;i++){
           practica = practica+ + practicas[i];
       }
       promedio = (float)(practica/ practicas.length);
      return promedio;  
    }
}
