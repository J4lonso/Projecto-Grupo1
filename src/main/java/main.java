



public class main {



    public static void main(String args[]) {
        // TODO code application logic here
        
        
        Menu_animales menu_animales  = new Menu_animales();
        menu_animales .Info();
        
        Menu menu = new Menu(menu_animales);
        menu.mostrarMenu();
        
        
    }
}
