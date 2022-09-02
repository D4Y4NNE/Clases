public class Impresora

{

    public String marca = "Epson";
    public int precio = 1229;
    public String tipo = "Multifuncional";

    public String mostrarMarca()
    {
        return marca;
    }

    public int mostrarPrecio()
    {
        return precio;
    }

    public String mostrarTipo()
    {
        return tipo;
    }

    public static void main(String args[])
    {
        Impresora impresora = new Impresora();

        System.out.println(impresora);

        System.out.println("Marca: "+impresora.mostrarMarca());

        System.out.println("Precio: "+impresora.mostrarPrecio());

        System.out.println("Tipo: "+impresora.mostrarTipo());
    }
}