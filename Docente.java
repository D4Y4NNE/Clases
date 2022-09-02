public class Docente

{

    public String nacionalidad = "China";
    public int salario = 3000;
    public String curso = "Fisica";

    public String mostrarNacionalidad()
    {
        return nacionalidad;
    }

    public int mostrarSalario()
    {
        return salario;
    }

    public String mostrarCurso()
    {
        return curso;
    }

    public static void main(String args[])
    {
        Docente docente = new Docente();

        System.out.println(docente);

        System.out.println("Nacionalidad: "+docente.mostrarNacionalidad());

        System.out.println("Salario: "+docente.mostrarSalario());

        System.out.println("Curso: "+docente.mostrarCurso());
    }
}