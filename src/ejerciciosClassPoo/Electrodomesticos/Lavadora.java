package ejerciciosClassPoo.Electrodomesticos;

/**
 * Lavadora
 */
public class Lavadora extends Electrodomestico {
    private Integer carga;

    // * constructores
    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(Integer carga) {
        super();
        this.carga = carga;
    }

    // * getters y setters
    public Integer getCarga() {
        return this.carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    // * metodos

    /*
     * precioFinal(): según su consumo energético, aumentará su precio, y según su
     * tamaño, también. Esta funcionalidad será heredada por sus hijas, que
     * aumentarán el precio según su criterio
     */
    public Double precioFinal() {
        Double precioFinal = super.precioFinal();
        if (this.carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
