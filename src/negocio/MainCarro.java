package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();


        /*c1.velocidad = 100;
        c1.potencia = 5;*/


        c1.setVelocidad(100);
        c1.setPotencia(5);
        c2.setVelocidad(-20);
        c2.setPotencia(-2);



        System.out.println("La velocidad del carro 1 es: "+c1.getVelocidad()+" la potencia del carro 1 es: "+c1.getPotencia());
        System.out.println("La velocidad del carro 2 es: "+c2.getVelocidad()+" la potencia del carro 2  es: "+c2.getPotencia());
        c1.acelerar();
        c1.acelerar();
        c1.frenar();

    }
}
