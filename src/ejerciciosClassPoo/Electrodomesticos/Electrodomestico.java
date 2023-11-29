package ejerciciosClassPoo.Electrodomesticos;

/**
 * Electrodomestico
 */
public class Electrodomestico {
    private Double precioBase;
    private Colores color;
    private char consumoEnergetico; // Valor que va de la A a la F
    private Double peso;

    // * constructores
    public Electrodomestico() {
        this.precioBase = 100.0;
        this.color = Colores.BLANCO;
        this.consumoEnergetico = 'F';
        this.peso = 5.0;
    }

    public Electrodomestico(Double precioBase, Double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = Colores.BLANCO;
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(Double precioBase, Colores color, char consumoEnergetico, Double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    // * getters y setters
    public Double getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Colores getColor() {
        return this.color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // * metodos

    /*
     * Comprobar que la letra es correcta, sino es correcta usara la letra por
     * defecto. Se invocará al crear el objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    /*
     * Comprobar que el color es correcto, sino lo es usa el color por defecto. Se
     * invocará al crear el objeto y no será visible.
     */
    public void comprobarColor(String color) {
        try {
            this.color = Colores.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            this.color = Colores.BLANCO;
        }
    }

    /*
     * precioFinal() será el precio final del electrodoméstico. Este se obtiene
     * sumando el precio base al precio del consumo energético, y este a su vez se
     * calcula multiplicando el peso por el precio de los kg. Por ejemplo, si
     * tenemos un electrodoméstico A con un precio base de 100, su precio final será
     * de 115 (100+15).
     */
    public Double precioFinal() {
        Double precioFinal = this.precioBase;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100.0;
                break;
            case 'B':
                precioFinal += 80.0;
                break;
            case 'C':
                precioFinal += 60.0;
                break;
            case 'D':
                precioFinal += 50.0;
                break;
            case 'E':
                precioFinal += 30.0;
                break;
            case 'F':
                precioFinal += 10.0;
                break;
        }
        if (this.peso >= 0 && this.peso <= 19) {
            precioFinal += 10.0;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 50.0;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 80.0;
        } else if (this.peso >= 80) {
            precioFinal += 100.0;
        }
        return precioFinal;
    }
}