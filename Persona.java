public class Persona

{
    public String genero = "Femenina";
    public int edad = 22;
    public String nacionalidad = "Peruana";

    public String mostrarGenero()
    {
        return genero;
    }

    public int mostrarEdad()
    {
        return edad;
    }

    public String mostrarNacionalidad()
    {
        return nacionalidad;
    }

    public static void main(String args[])
    {
        Persona persona = new Persona();

        System.out.println(persona);

        System.out.println("Genero: "+persona.mostrarGenero());

        System.out.println("Edad: "+persona.mostrarEdad());

        System.out.println("Nacionalidad: "+persona.mostrarNacionalidad());
    }
}