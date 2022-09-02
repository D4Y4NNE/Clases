public class Ingeniero

{

    public String nombre = "Nikola";
    public String especializacion = "Fisico";
    public String genero = "Masculino";

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarEspecializacion()
    {
        return especializacion;
    }

    public String mostrarGenero()
    {
        return genero;
    }

    public static void main(String args[])
    {
        Ingeniero ingeniero = new Ingeniero();

        System.out.println(ingeniero);

        System.out.println("Nombre: "+ingeniero.mostrarNombre());

        System.out.println("Especializacion: "+ingeniero.mostrarEspecializacion());

        System.out.println("Genero: "+ingeniero.mostrarGenero());
    }
}