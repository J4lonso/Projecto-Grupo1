



package Zoologico;


import java.util.ArrayList;
import java.util.List;

public class Ubicacion_dentro {

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private List<animales> Animales;

    public Ubicacion_dentro(String name, String location, int capacity) {
        this.nombre = name;
        this.ubicacion = location;
        this.capacidad = capacity;
        this.Animales = new ArrayList<>();
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

    public boolean agregarAnimal(animales animal) {
        if (this.Animales.size() < capacidad) {
            this.Animales.add(animal);
            return true;
        } else {
            return false;
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
/*
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (animales animal : Animales) {
            sb.append(animal.toString()).append("\n");
        }
        return sb.toString();


    }
*/
    
}


