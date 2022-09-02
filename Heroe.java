public class Heroe

{

    public String nombre = "Stan_Lee";
    public String poder = "Mental";
    public int edad = 30;

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarPoder()
    {
        return poder;
    }

    public int mostrarEdad()
    {
        return edad;
    }

    public static void main(String args[])
    {
        Heroe heroe = new Heroe();

        System.out.println(heroe);

        System.out.println("Nombre: "+heroe.mostrarNombre());

        System.out.println("Poder: "+heroe.mostrarPoder());

        System.out.println("Edad: "+heroe.mostrarEdad());
    }
}