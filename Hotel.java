public class Hotel

{

    public String nombre = "Penthouse";
    public int calificado = 5;
    public int pisos = 20;

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarCalificado()
    {
        return calificado;
    }

    public int mostrarPisos()
    {
        return pisos;
    }

    public static void main(String args[])
    {
        Hotel hotel = new Hotel();

        System.out.println(hotel);

        System.out.println("Nombre: "+hotel.mostrarNombre());

        System.out.println("Calificado: "+hotel.mostrarCalificado());

        System.out.println("Pisos: "+hotel.mostrarPisos());
    }
}