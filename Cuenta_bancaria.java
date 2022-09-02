public class Cuenta_bancaria

{

    public String nombre = "Interbank";

    public String tipo = "Tarjeta de debito";
    public int clave = 12345678;

    public String mostrarNombre()
    {
        return nombre;
    }

    public String mostrarTipo()
    {
        return tipo;
    }

    public int mostrarClave()
    {
        return clave;
    }

    public static void main(String args[])
    {
        Cuenta_bancaria cuenta_bancaria = new Cuenta_bancaria();

        System.out.println(cuenta_bancaria);

        System.out.println("Nombre: "+cuenta_bancaria.mostrarNombre());

        System.out.println("Tipo: "+cuenta_bancaria.mostrarTipo());

        System.out.println("Clave: "+cuenta_bancaria.mostrarClave());
    }
}