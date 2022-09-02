public class Presidente

{
    public String nombre = "Pedro Castillo";
    public int salario = 15500;
    public String cargo = "Presidente de la Republica";

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarSalario()
    {
        return salario;
    }

    public String mostrarCargo()
    {
        return cargo;
    }

    public static void main(String args[])
    {
        Presidente presidente = new Presidente();

        System.out.println(presidente);

        System.out.println("Nombre: "+presidente.mostrarNombre());

        System.out.println("Salario: "+presidente.mostrarSalario());

        System.out.println("Cargo: "+presidente.mostrarCargo());
    }
}