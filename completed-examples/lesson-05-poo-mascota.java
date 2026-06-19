class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
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

    public void presentarse() {
        System.out.println("Mi mascota se llama " + nombre + " y tiene " + edad + " anos.");
    }
}

class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Luna", 3);
        mascota.presentarse();
    }
}
