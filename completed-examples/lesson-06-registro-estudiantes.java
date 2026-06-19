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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    public void mostrarNivel() {
        if (edad >= 12 && edad <= 17) {
            System.out.println("Estoy en edad escolar de secundaria.");
        } else {
            System.out.println("No estoy dentro del rango principal de secundaria.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        mostrarNivel();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Registro del estudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            estudiantes[i] = new Estudiante(nombre, edad);
            System.out.println();
        }

        System.out.println("Estudiantes registrados:");

        for (Estudiante estudiante : estudiantes) {
            estudiante.saludar();
            estudiante.mostrarDatos();
            System.out.println();
        }

        scanner.close();
    }
}
