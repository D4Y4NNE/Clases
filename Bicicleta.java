public class Bicicleta
{

    public int ruedas = 4;
    public String color = "Rosado";
    public String origen = "Aleman";

    public int mostrarRuedas()
    {
        return ruedas;
    }

    public String mostrarColor()
    {
        return color;
    }

    public String mostrarOrigen()
    {
        return origen;
    }

    public static void main(String args[])
    {
        Bicicleta bicicleta = new Bicicleta();

        System.out.println(bicicleta);

        System.out.println("Ruedas: "+bicicleta.mostrarRuedas());

        System.out.println("Color: "+bicicleta.mostrarColor());

        System.out.println("Origen: "+bicicleta.mostrarOrigen());
    }
}