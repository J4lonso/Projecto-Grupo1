

import javax.swing.JOptionPane;

public class Menu {

    // Constructor de la clase Menu
    public Menu() {
        // Puedes inicializar variables aquí si es necesario
    }

    // Método para mostrar el menú
    public void mostrarMenu() {
        
        while (true) {
            String menu = "Seleccione una opción:\n"
                    + "1. Bienvenida\n"
                    + "2. Información del Zoológico\n"
                    + "3. Gestión de animales\n"
                    + "4. Ubicación actual en el Zoológico\n"
                    + "5. Ubicación de los animales\n"
                    + "6. Salir\n";

            String opcion = JOptionPane.showInputDialog(menu);
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                System.exit(0);
            }
            int input;
            try {
                input = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La opción no existe. Por favor ingrese un número del 1 al 6.");
                continue;
            }

            switch (input) {
                case 1 -> JOptionPane.showMessageDialog(null, "Bienvenida");
                case 2 -> JOptionPane.showMessageDialog(null, "Información del Zoológico");
                case 3 -> JOptionPane.showMessageDialog(null, "Gestión de animales");
                case 4 -> JOptionPane.showMessageDialog(null, "Ubicación actual en el Zoológico");
                case 5 -> JOptionPane.showMessageDialog(null, "Ubicación de los animales");
                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Opción no válida. Por favor ingrese un número del 1 al 6.");
            }
        }
    }
}

