package ejerciciosTestsPoo;

import ejerciciosClassPoo.Electrodomesticos.Electrodomestico;
import ejerciciosClassPoo.Electrodomesticos.Lavadora;
import ejerciciosClassPoo.Electrodomesticos.Television;

/**
 * Crea una clase ejecutable que realice lo siguiente:
 * 
 * Crea un array de Electrodomésticos de 10 posiciones. Asigna a cada posición
 * un
 * objeto de las clases anteriores con los valores que desees.
 * 
 * Ahora, recorre este array y ejecuta el método precioFinal ().
 * 
 * Deberás mostrar el precio de cada clase, es decir, el precio de todas las
 * televisiones por un lado, el de las lavadoras por otro y la suma de los
 * Electrodomésticos (puedes crear objetos Electrodoméstico, pero recuerda que
 * Television y Lavadora también son electrodomésticos). Recuerda el uso
 * operador instanceof.
 * 
 * Por ejemplo, si tenemos un Electrodoméstico con un precio final de 300, una
 * lavadora de 200 y una televisión de 500, el resultado final será de 1000
 * (300+200+500) para electrodomésticos, 200 para lavadora y 500 para
 * televisión.
 */
public class TestElectrodomesticos {

    public static void main(String[] args) {
        Electrodomestico electrodomesticos[];
        electrodomesticos = new Electrodomestico[10];

        // * Asigna a cada posición un objeto de las clases anteriores con los valores
        // que desees.

        electrodomesticos[0] = new Television(200.0, 10.0);
        electrodomesticos[1] = new Lavadora(150.0, 20.0);
        electrodomesticos[2] = new Television(300.0, 30.0);
        electrodomesticos[3] = new Lavadora(250.0, 40.0);
        electrodomesticos[4] = new Television(350.0, 50.0);
        electrodomesticos[5] = new Lavadora(400.0, 60.0);
        electrodomesticos[6] = new Television(450.0, 70.0);
        electrodomesticos[7] = new Lavadora(500.0, 80.0);
        electrodomesticos[8] = new Television(550.0, 90.0);
        electrodomesticos[9] = new Lavadora(600.0, 100.0);

        // * Recorre el array y ejecuta el método precioFinal().

        Double sumaElectrodomesticos = 0.0;
        Double sumaTelevisiones = 0.0;
        Double sumaLavadoras = 0.0;

        for (int i = 0; i < electrodomesticos.length; i++) {
            if (electrodomesticos[i] instanceof Television) {

                sumaTelevisiones += electrodomesticos[i].precioFinal();
                System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones + "\n");

            } else if (electrodomesticos[i] instanceof Lavadora) {

                sumaLavadoras += electrodomesticos[i].precioFinal();
                System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras + "\n");

            }
            sumaElectrodomesticos += electrodomesticos[i].precioFinal();
        }

        System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomesticos);
    }
}
