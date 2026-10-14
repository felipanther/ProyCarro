package negocio;

public class MainCarro {
    static void main() {
        System.out.println("El numero de objetos de tipo Carro creados son; "+Carro.getNumCarros());
        System.out.println("El iva de los vehiculos es: "+Carro.getIva());
        Carro c1 = new Carro(5, 100);
        Carro c2 = new Carro(-20, -2);
        Carro c3 = new Carro(10,250);
        System.out.println("El numero de objetos de tipo Carro creados son; "+Carro.getNumCarros());
        System.out.println("El precio de venta al publico del carro 1 es: "+c1.calcularPrecioTotal(31599));

        /*c1.velocidad = 100;
        c1.potencia = 5;*/


        /*c1.setVelocidad(100);
        c1.setPotencia(5);
        c2.setVelocidad(-20);
        c2.setPotencia(-2);
        c3.setPotencia(10);
        c3.setVelocidad(250);*/



        System.out.println("La velocidad del carro 1 es: "+c1.getVelocidad()+" la potencia del carro 1 es: "+c1.getPotencia());
        System.out.println("La velocidad del carro 2 es: "+c2.getVelocidad()+" la potencia del carro 2  es: "+c2.getPotencia());
        System.out.println("La velocidad del carro 3 es: "+c3.getVelocidad()+" la potencia del carro 3  es: "+c3.getPotencia());
        c1.acelerar();
        c1.acelerar();
        c1.frenar();

    }
}
