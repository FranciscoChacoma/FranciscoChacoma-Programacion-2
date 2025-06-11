import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Funciones Funciones = new Funciones();

        System.out.println("Menu");
        System.out.println("1 - Saludo");
        System.out.println("2 - Saludo y nombre");
        int Opciones = scanner.nextInt();

        switch (Opciones)
        {
            case 0:
                Funciones.mostrarSaludo();
                break;

            case 1:
                String nombre = "eteban";
                Funciones.saludar(nombre);
                break;
            default:
                System.out.println("Opcion no valdia");
                break;
        }
    }
}