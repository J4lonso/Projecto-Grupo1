
// 
import javax.swing.JOptionPane;

public class Menu {

 
    public Menu() {


    }

    public void mostrarMenu() {

        while (true) {
            String menu = "Seleccione una opción:\n"
                    + "1. Información del Zoológico\n"
                    + "2. Gestión de animales\n"
                    + "3. Ubicación actual en el Zoológico\n"
                    + "4. Ubicación de los animales\n"
                    + "5. Solicitar reporte\n"
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

                case 1 ->
                    JOptionPane.showMessageDialog(null, "Información del Zoológico");

                case 2 -> {

                    

                    Menu_animales menu_animales = new Menu_animales();
                    menu_animales.start();

                }

                case 3 -> {

                    JOptionPane.showMessageDialog(null, "Ubicación actual en el Zoológico");

                }

                case 4 -> {
                    
                    JOptionPane.showMessageDialog(null, "Ubicación de los animales");
                    Ubicacion_dentro ubicacion = new Ubicacion_dentro("nombre", "ubicacion", 10);
                    ubicacion.agregarAnimal(new animales("nombreAnimal1", "especie1", 5, "ubicacion1"));
                    ubicacion.agregarAnimal(new animales("nombreAnimal2", "especie2", 3, "ubicacion2"));
                    String reporte = ubicacion.toString();
                    JOptionPane.showMessageDialog(null, reporte);
                    

                }

                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Reporte de animales");
                    
                    
                }

                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Vuelva pronto");
                    System.exit(0);

                }
                default ->
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor ingrese un número del 1 al 6.");
            }
        }
    }
}
