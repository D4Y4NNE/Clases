import javax.swing.*;

public class Comisaria

{

    public String nombre = "Comisaria de Huanuco";

    public int aforo = 3;
    public int cantidad_de_celdas = 50;

    public String mostrarNombre()
    {
        return nombre;
    }

    public int mostrarAforo()
    {
        return aforo;
    }

    public int mostraCantidad_de_celdas()
    {
        return cantidad_de_celdas;
    }

    public static void main(String args[])
    {
        Comisaria comisaria = new Comisaria();

        System.out.println(comisaria);

        System.out.println("Nombre: "+comisaria.mostrarNombre());

        System.out.println("Aforo: "+ comisaria.mostrarAforo());

        System.out.println("Cantida de celdas: "+comisaria.mostraCantidad_de_celdas());
    }
}