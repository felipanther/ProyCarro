package negocio;

public class carro {
    int potencia;
    double velocidad;

    void acelerar(){
        velocidad += potencia;
    }
    void frenar(){
        velocidad /= 2;
    }
}
