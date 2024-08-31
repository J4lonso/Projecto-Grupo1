
import java.util.ArrayList;
import java.util.List;

public class Ubicacion_dentro {
    
    private ubicacion Ubicacion;
    private animales animal;

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private List<animales> Animales;
    private ubicacion[][] cuadrilla;
    private List<animales> animales;

    public Ubicacion_dentro(String name, String location, int capacity,int filas, int columnas) {
        this.nombre = name;
        this.ubicacion = location;
        this.capacidad = capacity;
        this.Animales = new ArrayList<>();


        cuadrilla = new ubicacion[filas][columnas];
        animales = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                cuadrilla[i][j] = new ubicacion(i, j,null);
            }
        }
    }
    

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<animales> getAnimales() {
        return Animales;
    }

    public boolean agregarAnimal(animales animal,int x, int y) {
        if (this.Animales.size() < capacidad) {
            this.Animales.add(animal);
            moverAnimal(animal, x, y);
            return true;
        } else {
            return false;
        }
    }
    
    public void moverAnimal(animales animal, int x, int y) {
        ubicacion nuevaUbicacion = cuadrilla[x][y];
        if (nuevaUbicacion.getAnimal() == null) {
            if (animal.getLocation()!= null) {
                animal.getLocation().getNombre();
            }
            animal.setLocation(nuevaUbicacion);
            nuevaUbicacion.setAnimal(animal);
        } else {
            System.out.println("La ubicación (" + x + ", " + y + ") ya está ocupada.");
        }
    }

    public boolean eliminarAnimal(String name) {
        return Animales.removeIf(animales -> animales.getName().equalsIgnoreCase(name));
    }

    public animales buscarAnimal(String name) {
        for (animales animales : Animales) {
            if (animales.getName().equalsIgnoreCase(name)) {
                return animales;
            }
        }
        return null;
    }
    
    public void mostrarCuadrilla() {
        for (int i = 0; i < cuadrilla.length; i++) {
            for (int j = 0; j < cuadrilla[i].length; j++) {
                ubicacion ubicacion = cuadrilla[i][j];
                System.out.print((ubicacion.getAnimal() != null ? ubicacion.getAnimal().getName(): "vacío") + "\t");
            }
            System.out.println();
        }
    }
    
    public void mostrarUbicaciones() {
        for (animales animal : animales) {
            System.out.println(animal.getName() + " está en " + animal.getLocation());
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (animales animal : Animales) {
            sb.append(animal.toString()).append("\n");
        }
        return sb.toString();
    }
 
}

