import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            estudiantes[i] = new Estudiante(nombre, edad);
        }

        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarDatos();
            System.out.println();
        }

        scanner.close();
    }
}
