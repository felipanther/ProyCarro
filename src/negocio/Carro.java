package negocio;

public class Carro {
    private int potencia;
    private double velocidad;
    // atributo de clase
    private static int numCarros = 0;
    //constante de la clase
    private static final double IVA = 0.15;

    public Carro(int potencia, double velocidad){
        /*this.potencia = potencia;
        this.velocidad = velocidad;*/
        //si los datos tienen validaciones utilizo el set
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    public Carro() {
        numCarros++;
    }

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

    public void setVelocidad(double velocidad){
        if (velocidad < 0)
            velocidad = 0;
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

    public static int getNumCarros(){
        return numCarros;
    }

    public static double getIva(){
        return IVA;
    }

    public double calcularPrecioTotal(double precio){
        return precio + (precio * IVA);
    }

    public void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /= 2;
    }
}
