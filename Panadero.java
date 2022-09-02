public class Panadero

{
    public String nombre = "Jake";
    public String educacion = "Merchandising Panaderias";
    public String experiencia = "6 meses";

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarEducacion()
    {
        return educacion;
    }

    public String mostrarExperiencia()
    {
        return experiencia;
    }

    public static void main(String args[])
    {
        Panadero panadero = new Panadero();

        System.out.println(panadero);

        System.out.println("nombre: "+panadero.mostrarNombre());

        System.out.println("Educacion: "+panadero.mostrarEducacion());

        System.out.println("Experiencia: "+panadero.mostrarExperiencia());
    }
}