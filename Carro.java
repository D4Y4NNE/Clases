public class Carro

{

    public String placa = "w2r43";
    public String color = "Negro";
    public int capacidad = 4;

    public String mostrarPlaca()
    {
        return placa;
    }

    public String mostrarColor()
    {
        return color;
    }

    public int mostrarCapacidad()
    {
        return capacidad;
    }

    public static void main(String args[])
    {
        Carro carro = new Carro();

        System.out.println(carro);

        System.out.println("Placa: "+carro.mostrarPlaca());

        System.out.println("Color: "+carro.mostrarColor());

        System.out.println("Capacidad: "+carro.mostrarCapacidad());
    }
}