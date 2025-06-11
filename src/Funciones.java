public class Funciones {

    // Primer ejercicio
    public void mostrarSaludo()
    {
            System.out.print("Hola");
    }

    // Segundo ejercicio
    public static void saludar(String nombre)
    {
        System.out.println("Hola" + nombre);
    }

    // Tercer Ejercicio
    public static double AR(double base, double altura)
    {
        double area = base * altura;
        System.out.println("El área es: " + area);
        return area;
    }

    // Cuarto Ejercicio
    public static String AMayusc(String texto)
    {
        return texto.toUpperCase();
    }

    // Quinto Ejercicio
    public static void MenuRandom()
    {
        System.out.println("Hola");
        System.out.println("Profe");
        System.out.println("D:");
    }

    // Sexto Ejercicio
    public static boolean esPar(int numero)
    {
        if (numero % 2 == 0)
        {
            System.out.println("Es par");
            return true;
        }
        else
        {
            System.out.println("Es Impar");
            return false;
        }
    }

    // Septimo Ejercicio
    public static int Cuadrado(int numero)
    {
        int resultado = numero * numero;
        return resultado;
    }

    // Octavo Ejercicio (no)

    // Noveno Ejercicio
    public static int sumarNumeros(int... numeros) { //el... es para no poner parametros
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // DEcimo Ejercicio
    public static double promedioArray(double[] numeros)
    {
        double suma = 0;

        for (double num : numeros) {
            suma += num;
        }

        double promedio = suma / numeros.length;
        return promedio;
    }

    // Onceavo Ejercicio
    public static boolean buscarValor(int[] array, int numeroBuscado) {
        for (int num : array) {
            if (num == numeroBuscado) {
                return true;
            }
        }
        return false;
    }

}