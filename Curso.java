public class Curso

{

    public String tutor = "Carlos";
    public String nombre = "Ingles";
    public int horas = 3;

    public String mostrarTutor()
    {
        return tutor;
    }

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarHoras()
    {
        return horas;
    }

    public static void main(String args[])
    {
        Curso curso = new Curso();

        System.out.println(curso);

        System.out.println("Tutor: "+curso.mostrarTutor());

        System.out.println("Nombre: "+curso.mostrarNombre());

        System.out.println("Horas: "+curso.mostrarHoras());
    }
}