
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu_animales {

    private Zoo zoo;
    

    
    public void Info() {
        initializeZoo();
    }
    
    public void start() {
        
        mainMenu();
    }
    
        
    

    private void initializeZoo() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del zoológico:");
        String location = JOptionPane.showInputDialog("Ingrese la localidad del zoológico:");
        int capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad máxima del zoológico para albergar animales:"));

        zoo = new Zoo(name, location, capacity);
        JOptionPane.showMessageDialog(null, zoo.toString());
    }
    
    public void getZoo() {
        
        JOptionPane.showMessageDialog(null, zoo.toString());
        }

    private void mainMenu() {
        String[] options = {"Agregar Animal", "Eliminar Animal", "Mover Animal", "Buscar Animal", "Reporte de Animales", "Salir"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0 ->
                    agregarAnimal();
                case 1 ->
                    eliminarAnimal();
                case 2 ->
                    moverAnimal();
                case 3 ->
                    buscarAnimal();
                case 4 ->
                    generarReporte();
                case 5 ->
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                default ->
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (choice != 5);
    }

    private void agregarAnimal() {
        if (zoo.getAnimales().size() >= zoo.getCapacidad()) {
            JOptionPane.showMessageDialog(null, "Capacidad máxima alcanzada. No se pueden agregar más animales.");
            return;
        }

        String name = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        String species = JOptionPane.showInputDialog("Ingrese la especie del animal:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
        String location = JOptionPane.showInputDialog("Ingrese la ubicación del animal:");

        animales animales = new animales(name, species, age, location);
        zoo.agregarAnimal(animales);

        JOptionPane.showMessageDialog(null, "Animal agregado exitosamente.");
    }

    private void eliminarAnimal() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del animal a eliminar:");
        if (zoo.eliminarAnimal(name)) {
            JOptionPane.showMessageDialog(null, "Animal eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
    }

    private void moverAnimal() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del animal a mover:");
        animales animales = zoo.buscarAnimal(name);
        if (animales != null) {
            String newLocation = JOptionPane.showInputDialog("Ingrese la nueva ubicación del animal:");
            animales.setLocation(newLocation);
            JOptionPane.showMessageDialog(null, "Animal movido exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
    }

    private void buscarAnimal() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del animal a buscar:");
        animales animal = zoo.buscarAnimal(name);
        if (animal != null) {
            JOptionPane.showMessageDialog(null, "Animal encontrado:\nNombre: " + animal.getName()
                    + "\nEspecie: " + animal.getSpecies() + "\nEdad: " + animal.getAge()
                    + "\nUbicación: " + animal.getLocation());
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
    }

    private void generarReporte() {
        List<animales> animales = zoo.getAnimales();
        if (animales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay animales en el zoológico.");
        } else {
            StringBuilder report = new StringBuilder("Reporte de Animales:\n");
            for (animales animal : animales) {
                report.append("Nombre: ").append(animal.getName())
                        .append(", Especie: ").append(animal.getSpecies())
                        .append(", Edad: ").append(animal.getAge())
                        .append(", Ubicación: ").append(animal.getLocation())
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, report.toString());
        }
    }
}
