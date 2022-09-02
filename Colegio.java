public class Colegio

{

    public String ubicacion = "Jr. Angeles";

    public String nombre = "Santa Ines";
    public int salones = 50;

    public String mostrarUbicacion()
    {
        return ubicacion;
    }

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarSalones()
    {
        return salones;
    }

    public static void main(String args[])
    {
        Colegio colegio = new Colegio();

        System.out.println(colegio);

        System.out.println("Ubicacion: "+colegio.mostrarUbicacion());

        System.out.println("Nombre: "+colegio.mostrarNombre());

        System.out.println("Salones: "+colegio.mostrarSalones());
    }
}