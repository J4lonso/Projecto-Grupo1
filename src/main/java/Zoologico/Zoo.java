



package Zoologico;


import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nombre;
    private String ubicacion;
    private int capacidad;

    private String name_Z;
    private String location_Z;
    private int capacity_Z;

    private final List<animales> Animales;
    
    

    public Zoo() {

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

    public String toString() {
        return "Nombre del Zoológico: " + name_Z + "\n"
                + "Localidad: " + location_Z + "\n"
                + "Capacidad Máxima: " + capacity_Z;
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

    void start() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    public String getName_Z() {
        return name_Z;
    }

    public String getLocation_Z() {
        return location_Z;
    }

    public int getCapacity_Z() {
        return capacity_Z;
    }

    public void setName_Z(String name_Z) {
        this.name_Z = name_Z;
    }

    public void setLocation_Z(String location_Z) {
        this.location_Z = location_Z;
    }

    public void setCapacity_Z(int capacity_Z) {
        this.capacity_Z = capacity_Z;
    }

}


