package haslindavila_.examen1;

public class Personas {
    private String nombre;
    private int edad;
    private long id;
    private int idloteria;
    private String departamentos;
    private double dinero;

    public Personas() {
    }

    public Personas(String nombre, int edad, long id, int idloteria, String departamentos, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.idloteria = idloteria;
        this.departamentos = departamentos;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIdloteria() {
        return idloteria;
    }

    public void setIdloteria(int idloteria) {
        this.idloteria = idloteria;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", idloteria=" + idloteria + ", departamentos=" + departamentos + ", dinero=" + dinero + '}';
    }

}
