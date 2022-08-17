package ob.intro.pkg3;

public class OBIntro3 {

    public static void main(String[] args) {
       persona Persona = new persona();
       
       Persona.setEdad(18);
       Persona.setNombre("Kevin");
       Persona.setTelefono(1144556699);
       
        System.out.println("Edad: "+ Persona.getEdad() );
        System.out.println("Nombre: "+ Persona.getNombre());
        System.out.println("Telefono: "+ Persona.getTelefono());
    }
    
}

class persona{
    private int edad;
    private String nombre;
    private long telefono;

    public persona() {
    }

    public persona(int edad, String nombre, long telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
}