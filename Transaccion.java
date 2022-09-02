public class Transaccion

{

    public String destinatario = "Marcelo Catillos";
    public String banco = "Interbank";
    public int cantidad = 200;

    public String mostrarDestinatario()
    {
        return destinatario;
    }

    public String mostrarBanco()
    {
        return banco;
    }

    public int mostrarCantidad()
    {
        return cantidad;
    }

    public static void main(String args[])
    {
        Transaccion transaccion = new Transaccion();

        System.out.println(transaccion);

        System.out.println("Destinatario: "+transaccion.mostrarDestinatario());

        System.out.println("Banco: "+transaccion.mostrarBanco());

        System.out.println("Cantidad: "+transaccion.mostrarCantidad());
    }
}