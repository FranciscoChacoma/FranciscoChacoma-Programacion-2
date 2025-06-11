import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Funciones Funciones = new Funciones();

        System.out.println("Menu");
        System.out.println("0 - Saludo");
        System.out.println("1 - Saludo y nombre");
        System.out.println("2 - Calcular Area");
        System.out.println("3 - Texto a Mayuscula");
        System.out.println("4 - Menu Random");
        System.out.println("5 - Par o Impar");
        System.out.println("6 - Cuadrado de un Numero");
        System.out.println("7 - Factorial (No anda, no gracias)");
        System.out.println("8 - ");


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
                scanner.nextLine(); // limpar scanner
                System.out.println("Ingrese Base");
                double base = scanner.nextInt();
                System.out.println("Ingrese Altura");
                double altura = scanner.nextInt();
                Funciones.AR(base, altura);
                break;

            case 3:
                scanner.nextLine(); // para limpiar el scannerrrrr
                System.out.println("Ingrese un texto");
                String texto = scanner.nextLine();
                String Resultado = Funciones.AMayusc(texto);
                System.out.println(Resultado);
                break;

            case 4:
                Funciones.MenuRandom();

            case 5:
                System.out.println("Ingrese un numero");
                int numero = scanner.nextInt();
                Funciones.esPar(numero);
                break;

            case 6:
                scanner.nextLine();
                System.out.println("Ingrese un numero:");
                int numeroo = scanner.nextInt();
                int resultado = Funciones.Cuadrado(numeroo);
                System.out.println("El cuadrado es " + resultado);
                break;

            case 8:
                System.out.println("¿Cantidad de numeros?");
                int cantidad = scanner.nextInt();

                int[] numeros = new int[cantidad];
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    numeros[i] = scanner.nextInt();
                }

                int suma = Funciones.sumarNumeros(numeros);
                System.out.println("La suma es: " + suma);
                break;
            default:
                System.out.println("Opcion no valdia");
                break;
        }
    }
}