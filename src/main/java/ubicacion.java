/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author josea
 */
public class ubicacion {


    private int x;
    private int y;
    private animales animal;

    public ubicacion(int x, int y, animales animal) {
        this.x = x;
        this.y = y;
        this.animal = animal;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public animales getAnimal() {
        return animal;
    }

    public animales setAnimal(){
        return animal;
    }
    
    public String toString() {
        return "Ubicacion{" + "x=" + x + ", y=" + y + ", animal=" + (animal != null ? animal.getName(): "vacío") + '}';
    }
    
}
