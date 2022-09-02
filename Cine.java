public class Cine

{

    public String ubicacion = "Golden";

    public String nombre = "Jr. Real";
    public int aforo = 50;

    public String mostrarUbicacion()
    {
        return ubicacion;
    }

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarAforo()
    {
        return aforo;
    }

    public static void main(String args[])
    {
        Cine cine = new Cine();

        System.out.println(cine);

        System.out.println("Ubicacion: "+cine.mostrarUbicacion());

        System.out.println("Nombre: "+cine.mostrarNombre());

        System.out.println("Aforo: "+cine.mostrarAforo());
    }
}