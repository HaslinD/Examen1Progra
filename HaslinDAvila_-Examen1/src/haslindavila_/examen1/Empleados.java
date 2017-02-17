package haslindavila_.examen1;

public class Empleados extends Personas{
    private String empleo;

    public Empleados() {
        super();
    }

    public Empleados(String empleo, String nombre, int edad, long id, int idloteria, String departamentos, double dinero) {
        super(nombre, edad, id, idloteria, departamentos, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return "Empleados{" + "empleo=" + empleo + '}';
    }
    
    
}
