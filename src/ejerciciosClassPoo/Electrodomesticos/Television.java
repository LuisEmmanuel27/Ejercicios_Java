package ejerciciosClassPoo.Electrodomesticos;

public class Television extends Electrodomestico {
    private Double resolucion;
    private Boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 20.0;
        this.sintonizadorTDT = false;
    }

    public Television(Double precioBase, Double peso) {
        super(precioBase, peso);
        this.resolucion = 20.0;
        this.sintonizadorTDT = false;
    }

    public Television(Double resolucion, Boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // * getters y setters

    public Double getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public Boolean getSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // * metodos

    /*
     * precioFinal(): según su consumo energético, aumentará su precio, y según su
     * tamaño, también. Esta funcionalidad será heredada por sus hijas, que
     * aumentarán el precio según su criterio
     */

    public Double precioFinal() {
        Double precioFinal = super.precioFinal();
        if (this.resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }
        if (this.sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }

}
