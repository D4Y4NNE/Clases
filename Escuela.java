public class Escuela

{

    public String nombre = "High School";
    public String calle = "Los Manzanos";
    public String direccion = "Av. School";

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarCalle()
    {
        return calle;
    }

    public String mostrarDireccion()
    {
        return direccion;
    }

    public static void main(String args[])
    {
        Escuela escuela = new Escuela();

        System.out.println(escuela);

        System.out.println("Nombre: "+escuela.mostrarNombre());

        System.out.println("Calle: "+escuela.mostrarCalle());

        System.out.println("Direccion: "+escuela.mostrarDireccion());
    }
}