public class Ladrillo

{
    public String material = "Arcilla";
    public String textura = "Dura";
    public String color = "Anaranjado";

    public String mostrarMaterial()
    {
        return material;
    }

    public String mostrarTextura()
    {
        return textura;
    }

    public String mostrarColor()
    {
        return color;
    }

    public static void main(String args[])
    {
        Ladrillo ladrillo = new Ladrillo();

        System.out.println(ladrillo);

        System.out.println("Material: "+ladrillo.mostrarMaterial());

        System.out.println("Textura: "+ladrillo.mostrarTextura());

        System.out.println("Color: "+ladrillo.mostrarColor());
    }
}