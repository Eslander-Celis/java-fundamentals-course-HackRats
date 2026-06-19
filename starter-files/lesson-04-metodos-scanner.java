import java.util.Scanner;

class Main {
    public static void presentarse(String nombre, int edad) {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " anos.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();

        presentarse(nombre, edad);

        scanner.close();
    }
}
