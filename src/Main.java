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
        System.out.println("8 - Sumar multiples numeros");
        System.out.println("9 - Promedio array");
        System.out.println("10 - Busqueda en array");
        System.out.println("11 - cantidad ocurrencia");
        System.out.println("12 - ");
        System.out.println("13 - ");
        System.out.println("14 - ");


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
            case 9:
                System.out.println("Cant numeros");
                int cantidadPromedio = scanner.nextInt();

                double[] numerosPromedio = new double[cantidadPromedio];

                for (int i = 0; i < cantidadPromedio; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    numerosPromedio[i] = scanner.nextDouble();
                }

                double resultadoPromedio = Funciones.promedioArray(numerosPromedio);
                System.out.println("El promedio es: " + resultadoPromedio);
                break;
            case 10:
                System.out.println("¿Cuántos números quiere cargar en el array?");
                int cantidadBuscar = scanner.nextInt();

                int[] arrayBuscar = new int[cantidadBuscar];

                for (int i = 0; i < cantidadBuscar; i++) {
                    System.out.println("Ingrese el número " + (i + 1) + ":");
                    arrayBuscar[i] = scanner.nextInt();
                }
                System.out.println("Ingrese el número a buscar:");
                int numeroBuscado = scanner.nextInt();

                boolean encontrado = Funciones.buscarValor(arrayBuscar, numeroBuscado);
                if (encontrado) {
                    System.out.println("El numero esta");
                } else {
                    System.out.println("El numero no est{a");
                }
                break;

            case 11:  //en este ya me rendi con los ingresos asi q lo hago yo
                String[] arrayStrings = {"hola", "mundo", "hola", "programacion", "java", "hola"};

                System.out.print("Ingrese el texto a buscar: ");
                scanner.nextLine();
                String clave = scanner.nextLine();

                int ocurrencias = Funciones.contarOcurrencias(arrayStrings, clave);
                System.out.println("El texto aparece " + ocurrencias + " veces.");
                break;

            //mucho sueño
        }
    }
}