public class Autor
{

    public String nombre = "Carl";

    public int edad = 35;

    public String premio = "Lucille Lortel";

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarEdad()
    {
        return edad;
    }

    public String mostrarPremio()
    {
        return premio;
    }

    public static void main(String args[])
    {
        Autor autor = new Autor();

        System.out.println(autor);

        System.out.println("Nombre: "+autor.mostrarNombre());

        System.out.println("Edad: "+autor.mostrarEdad());

        System.out.println("Promedio: "+autor.mostrarPremio());
    }
}