public class Actriz
{

    public String nombre = "Carla";

    public String nacionalidad = "Peruana";

    public String pelicula = "Eterny";

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarNacionalidad()
    {
        return nacionalidad;
    }

    public String mostrarPelicula()
    {
        return pelicula;
    }

    public static void main(String args[])
    {
        Actriz actriz = new Actriz();

        System.out.println(actriz);

        System.out.println("Nombre: "+actriz.mostrarNombre());

        System.out.println("Nacionalidad: "+actriz.mostrarNacionalidad());

        System.out.println("Pelicula: "+actriz.mostrarPelicula());
    }
}