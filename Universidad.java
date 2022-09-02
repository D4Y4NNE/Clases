public class Universidad

{
    public int salones = 30;
    public int pisos = 5;
    public int edificios = 6;

    public int mostrarSalones()
    {
        return salones;
    }

    public int mostrarPisos()
    {
        return pisos;
    }

    public int mostrarEdificios()
    {
        return edificios;
    }

    public static void main(String args[])
    {
        Universidad universidad = new Universidad();

        System.out.println(universidad);

        System.out.println("Nombre: "+universidad.mostrarSalones());

        System.out.println("Salario: "+universidad.mostrarPisos());

        System.out.println("Cargo: "+universidad.mostrarEdificios());
    }
}