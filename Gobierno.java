public class Gobierno

{

    public String ubicacion = "Lima";
    public String responsables = "Ministro";
    public String pais = "Peru";

    public String mostrarUbicacion()
    {
        return ubicacion;
    }

    public String mostrarResponsables()
    {
        return responsables;
    }

    public String mostrarPais()
    {
        return pais;
    }

    public static void main(String args[])
    {
        Gobierno gobierno = new Gobierno();

        System.out.println(gobierno);

        System.out.println("Ubicacion: "+gobierno.mostrarUbicacion());

        System.out.println("Responsables: "+gobierno.mostrarResponsables());

        System.out.println("Pais: "+gobierno.mostrarPais());
    }
}