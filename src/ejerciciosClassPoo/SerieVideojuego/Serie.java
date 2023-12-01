package ejerciciosClassPoo.SerieVideojuego;

/**
 * Clase Serie
 */
public class Serie implements Entregable {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    // * Getters y Setters

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return this.numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    // * toString

    @Override
    public String toString() {
        return "{" + " titulo='" + getTitulo() + "'" + ", numeroTemporadas='" + getNumeroTemporadas() + "'"
                + "'" + ", genero='" + getGenero() + "'" + ", creador='"
                + getCreador() + "'" + "}";
    }

    // * Métodos

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
}
