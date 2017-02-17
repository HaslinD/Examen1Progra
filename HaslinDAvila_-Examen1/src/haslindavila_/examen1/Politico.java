package haslindavila_.examen1;

public class Politico extends Personas{
    private String afiliacion;

    public Politico() {
        super();
    }

    public Politico(String afiliacion, String nombre, int edad, long id, String idloteria, String departamentos, double dinero) {
        super(nombre, edad, id, idloteria, departamentos, dinero);
        this.afiliacion = afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return "Politico{" + "afiliacion=" + afiliacion + '}';
    }
    
}
