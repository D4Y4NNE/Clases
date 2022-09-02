public class Cantante

{

    public String nombre = "Celeste";
    public String premio = "MGMA";
    public int edad = 21;

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarPremio()
    {
        return premio;
    }

    public int mostrarEdad()
    {
        return edad;
    }

    public static void main(String args[])
    {
        Cantante cantante = new Cantante();

        System.out.println(cantante);

        System.out.println("Nombre: "+cantante.mostrarNombre());

        System.out.println("Premio: "+cantante.mostrarPremio());

        System.out.println("Edad: "+cantante.mostrarEdad());
    }
}