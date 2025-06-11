import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Funciones Funciones = new Funciones();

        System.out.println("Menu");
        System.out.println("0 - Saludo");
        System.out.println("1 - Saludo y nombre");
        System.out.println("2 - Calcular Area");
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

            case 2:
                System.out.println("Ingrese Base");
                double base = scanner.nextInt();
                System.out.println("Ingrese Altura");
                double altura = scanner.nextInt();
                Funciones.AR(base, altura);
                break;

            case 3:





            default:
                System.out.println("Opcion no valdia");
                break;
        }
    }
}