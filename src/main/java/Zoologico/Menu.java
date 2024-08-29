





package Zoologico;


import javax.swing.JOptionPane;

public class Menu {

 
    public Menu() {


    }

    public void mostrarMenu() {

        while (true) {
            String menu = """
                          Seleccione una opci\u00f3n:
                          1. Informaci\u00f3n del Zool\u00f3gico
                          2. Gesti\u00f3n de animales
                          3. Ubicaci\u00f3n actual en el Zool\u00f3gico
                          4. Ubicaci\u00f3n de los animales
                          5. Solicitar reporte
                          6. Salir
                          """;

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

                case 1 ->{
                    JOptionPane.showMessageDialog(null, "Información del Zoológico");
                    
                    
                    
                    
                                        
                }

                case 2 -> {

                    

                    Menu_animales  menu_animales = new Menu_animales();
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
                    
                    Menu_animales menu_animales = new Menu_animales();
                    menu_animales.Reporte();
                    

                    
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