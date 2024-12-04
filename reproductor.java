
import java.util.ArrayList;
import java.util.List;

public class ReproductorMusica {
    private List<String> canciones;
    private int indiceActual;
    private boolean reproduciendo;

    public ReproductorMusica(String[] canciones) {
        this.canciones = new ArrayList<>();
        for (String cancion : canciones) {
            this.canciones.add(cancion);
        }
        this.indiceActual = 0;
        this.reproduciendo = false;
    }

    public void devolverCancion() {
        if (!canciones.isEmpty()) {
            System.out.println("Canción actual: " + canciones.get(indiceActual));
        }
    }

    public void agregarCancionesFavoritas() {
        System.out.println("Canción agregada a favoritas: " + canciones.get(indiceActual));
    }

    public void proximaCancion() {
        if (indiceActual < canciones.size() - 1) {
            indiceActual++;
            System.out.println("Próxima canción: " + canciones.get(indiceActual));
        } else {
            System.out.println("No hay más canciones.");
        }
    }

    public void cambiarEstadoReproduccion() {
        reproduciendo = !reproduciendo;
        if (reproduciendo) {
            System.out.println("Reproduciendo: " + canciones.get(indiceActual));
        } else {
            System.out.println("Pausado: " + canciones.get(indiceActual));
        
        
