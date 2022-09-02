public class Camion

{

    public String placa = "1B80";
    public String marca = "Tesla";
    public String potencia = "620_hp";

    public String mostrarPlaca()
    {
        return placa;
    }

    public String mostrarMarca()
    {
        return marca;
    }

    public String mostrarPotencia()
    {
        return potencia;
    }

    public static void main(String args[])
    {
        Camion camion = new Camion();

        System.out.println(camion);

        System.out.println("Placa: "+camion.mostrarPlaca());

        System.out.println("Marca: "+camion.mostrarMarca());

        System.out.println("Potencia: "+camion.mostrarPotencia());
    }
}