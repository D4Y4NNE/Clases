public class Policia

{
    public String cargo = " Teniente General";
    public int años_de_educacion = 5;
    public String especializacion = "Antidrogas";

    public String mostrarCargo()
    {
        return cargo;
    }

    public int mostrarAños_de_eduacion()
    {
        return años_de_educacion;
    }

    public String mostrarEspecializacion()
    {
        return especializacion;
    }

    public static void main(String args[])
    {
        Policia policia = new Policia();

        System.out.println(policia);

        System.out.println("Cargo: "+policia.mostrarCargo());

        System.out.println("Años de educacion: "+policia.mostrarAños_de_eduacion());

        System.out.println("Especializacion: "+policia.mostrarEspecializacion());
    }
}