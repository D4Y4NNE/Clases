public class Pelicula

{
    public String nombre = "Arcilla";
    public String origen = "Tailandes";
    public String duracion = "1 hora";

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarOrigen()
    {
        return origen;
    }

    public String mostrarDuracion()
    {
        return duracion;
    }

    public static void main(String args[])
    {
        Pelicula pelicula = new Pelicula();

        System.out.println(pelicula);

        System.out.println("Nombre: "+pelicula.mostrarNombre());

        System.out.println("Origen: "+pelicula.mostrarOrigen());

        System.out.println("Duracion: "+pelicula.mostrarDuracion());
    }
}