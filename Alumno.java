public class Alumno
{

    public String nombre = "Carl Friedrich Gauss";
    public int codigo = 202220826;
    public int promedio = 20;

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarCodigo()
    {
        return codigo;
    }

    public int mostrarPromedio()
    {
        return promedio;
    }

    public static void main(String args[])
    {
        Alumno alumno = new Alumno();

        System.out.println(alumno);

        System.out.println("Nombre: "+alumno.mostrarNombre());

        System.out.println("Codigo: "+alumno.mostrarCodigo());

        System.out.println("Promedio: "+alumno.mostrarPromedio());
    }
}