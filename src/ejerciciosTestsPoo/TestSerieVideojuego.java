package ejerciciosTestsPoo;

import ejerciciosClassPoo.SerieVideojuego.Serie;
import ejerciciosClassPoo.SerieVideojuego.Videojuego;

/**
 * Test de la clase Serie y Videojuego
 */
public class TestSerieVideojuego {
    public static void main(String args[]) {
        Serie series[];
        series = new Serie[5];

        Videojuego videojuegos[];
        videojuegos = new Videojuego[5];

        series[0] = new Serie("El juego de los cuatro", 20, "Drama", "Javier");
        series[1] = new Serie("Smallville", 10, "Fantasia", "Warner");
        series[2] = new Serie("The Witcher", 5, "Fantasia", "Netflix");
        series[3] = new Serie("The Last of Us", 3, "Aventura", "Naughty Dog");
        series[4] = new Serie("The Walking Dead", 10, "Drama", "AMC");

        videojuegos[0] = new Videojuego("The Witcher 3", 300, "Rol", "CD Projekt");
        videojuegos[1] = new Videojuego("The Last of Us", 50, "Aventura", "Naughty Dog");
        videojuegos[2] = new Videojuego("The Walking Dead", 30, "Aventura", "Telltale Games");
        videojuegos[3] = new Videojuego("The Last of Us 2", 100, "Aventura", "Naughty Dog");
        videojuegos[4] = new Videojuego("The Walking Dead: Michonne", 10, "Aventura", "Telltale Games");

        series[0].entregar();
        series[2].entregar();

        videojuegos[0].entregar();
        videojuegos[3].entregar();

        procesarEntregasYDevoluciones(series, "series");
        procesarEntregasYDevoluciones(videojuegos, "videojuegos");

        Serie serieConMasTemporadas = series[0];
        Videojuego videojuegoConMasHoras = videojuegos[0];

        for (int i = 0; i < series.length; i++) {
            if (series[i].compareTo(serieConMasTemporadas) == 1) {
                serieConMasTemporadas = series[i];
            }
        }

        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i].compareTo(videojuegoConMasHoras) == 1) {
                videojuegoConMasHoras = videojuegos[i];
            }
        }

        System.out.println("La serie con más temporadas es " + serieConMasTemporadas.getTitulo() + " con "
                + serieConMasTemporadas.getNumeroTemporadas() + " temporadas.");

        System.out.println("El videojuego con más horas es " + videojuegoConMasHoras.getTitulo() + " con "
                + videojuegoConMasHoras.getHorasEstimadas() + " horas.");
    }

    public static void procesarEntregasYDevoluciones(Object[] entregable, String tipo) {
        int entregados = 0;

        for (int i = 0; i < entregable.length; i++) {
            if (entregable[i].getClass().getSimpleName().equals("Serie")) {
                if (((Serie) entregable[i]).isEntregado()) {
                    entregados++;
                    ((Serie) entregable[i]).devolver();
                }
            } else if (entregable[i].getClass().getSimpleName().equals("Videojuego")) {
                if (((Videojuego) entregable[i]).isEntregado()) {
                    entregados++;
                    ((Videojuego) entregable[i]).devolver();
                }
            }
        }

        System.out.println("Hay " + entregados + " " + tipo + " entregados.");
    }
}
