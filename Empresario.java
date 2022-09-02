public class Empresario
{
    public String nombre = "Valentino";
    public String profesion = "Negocios Internacionales";
    public String cargo = "CEO";

    public String mostrarNombre() {
        return nombre;
    }
    public String mostrarProfesion() {
        return profesion;
    }
    public String mostrarCargo() {
        return cargo;
    }

    public static void main(String arg[])
    {
        Empresario empresario = new Empresario();

                System.out.println(empresario);

                System.out.println ("Nombre: " +empresario.mostrarNombre());

                System.out.println ("Profesion: "+empresario.mostrarProfesion());

                System.out.print("Cargo: "+empresario.mostrarCargo());
    }
}