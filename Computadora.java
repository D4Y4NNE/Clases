public class Computadora

{

    public String capacidad = "TERABYTE";

    public String marca = "Lenovo";
    public int peso = 50;

    public String mostrarCapacidad()
    {
        return capacidad;
    }

    public String mostrarMarca()
    {
        return marca;
    }

    public int mostrarPeso()
    {
        return peso;
    }

    public static void main(String args[])
    {
        Computadora computadora = new Computadora();

        System.out.println(computadora);

        System.out.println("Capacidad: "+computadora.mostrarCapacidad());

        System.out.println("Marca: "+computadora.mostrarMarca());

        System.out.println("Peso: "+computadora.mostrarPeso());
    }
}