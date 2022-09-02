public class Casa

{

    public String calle = "SKY HOUSE";
    public String direccion = "Av. Castle";
    public int numero = 157;

    public String mostrarCalle()
    {
        return calle;
    }

    public String mostrarDireccion()
    {
        return direccion;
    }

    public int mostrarNumero()
    {
        return numero;
    }

    public static void main(String args[])
    {
        Casa casa = new Casa();

        System.out.println(casa);

        System.out.println("Calle: "+casa.mostrarCalle());

        System.out.println("Direccion: "+casa.mostrarDireccion());

        System.out.println("Numero: "+casa.mostrarNumero());
    }
}