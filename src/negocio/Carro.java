package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    ingreso de informacion
    metodos set()
    "siempre" es void
    siempre recibe un parametro
    parametro generalmente es del mismo tipo del atributo
     */



    public void setPotencia(int potencia){
        if (potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    /*
    sacar informacion
    get()
    siempre retornan valor
    el tipo de retorno generalmente es el del mismo tipo de atributo
     */

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /= 2;
    }
}
