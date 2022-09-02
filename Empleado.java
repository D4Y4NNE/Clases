public class Empleado

{

    public String nombre = "Carla";
    public String tipo = "Personal administrativo";
    public int meses_de_xperiencia = 3;

    public String mostrarNombre()
    {
        return nombre;
    }
    public String mostrarTipo()
    {
        return tipo;
    }
    public int mostrarMeses_de_experiencia()
    {
        return meses_de_xperiencia;
    }

    public static void main(String args[])
    {
        Empleado empleado = new Empleado();

        System.out.println(empleado);

        System.out.println("Nombre: "+empleado.mostrarNombre());

        System.out.println("Tipo: "+empleado.mostrarTipo());

        System.out.println("Meses de experiencia: "+empleado.mostrarMeses_de_experiencia());
    }
}