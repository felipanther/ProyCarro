package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();


        /*c1.velocidad = 100;
        c1.potencia = 5;*/


        c1.setVelocidad(100);
        c1.setPotencia(5);



        System.out.println("La velocidad es: "+c1.getVelocidad()+" la potencia es: "+c1.getPotencia());
        c1.acelerar();
        c1.frenar();
    }
}
