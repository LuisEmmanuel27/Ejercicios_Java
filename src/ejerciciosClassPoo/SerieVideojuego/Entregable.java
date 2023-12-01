package ejerciciosClassPoo.SerieVideojuego;

public interface Entregable {
    // entregar(): cambia el atributo entregado a true.

    public void entregar();

    // devolver(): cambia el atributo entregado a false.

    public void devolver();

    // isEntregado(): devuelve el estado del atributo entregado.

    public boolean isEntregado();

    // compareTo(Object a): devuelve un entero negativo si el objeto comparado es
    // menor que el objeto actual, un entero positivo si es mayor, y 0 si son
    // iguales.

    public default int compareTo(Object a) {
        // Código de comparación aquí
        return 0;
    }
}
