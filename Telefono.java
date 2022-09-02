public class Telefono

{

    public String operador = "Bitel";
    public String cliente = "Dayana";
    public int numero = 123456789;

    public String mostrarOperador()
    {
        return operador;
    }

    public String mostrarCliente()
    {
        return cliente;
    }

    public int mostrarNumero()
    {
        return numero;
    }

    public static void main(String args[])
    {
        Telefono telefono = new Telefono();

        System.out.println(telefono);

        System.out.println("Operador: "+telefono.mostrarOperador());

        System.out.println("Cliente: "+telefono.mostrarCliente());

        System.out.println("Numero: "+telefono.mostrarNumero());
    }
}