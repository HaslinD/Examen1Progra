package haslindavila_.examen1;

public class Estudiantes extends Personas{
    private String carreras;

    public Estudiantes() {
        super();
    }

    public Estudiantes(String carreras, String nombre, int edad, long id, String idloteria, String departamentos, double dinero) {
        super(nombre, edad, id, idloteria, departamentos, dinero);
        this.carreras = carreras;
    }
    
    public String getCarreras() {
        return carreras;
    }

    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "carreras=" + carreras + '}';
    }
    
}
