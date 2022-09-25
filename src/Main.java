public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Rafael");
        persona.setTelefono(1132569978);

        var edad = persona.getEdad();
        var nombre = persona.getNombre();
        var telefono = persona.getTelefono();

        System.out.println(edad);
        System.out.println(nombre);
        System.out.println(telefono);



    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}