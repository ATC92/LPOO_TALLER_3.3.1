abstract class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    // Constuctor
    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    // Getters y Setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    // Metodos Abstractos
    public abstract void registrarse();
    public abstract void verificarPerfil();
}

interface Evaluable {
    void realizarEvaluacion();
    void serEvaluado();
}

class Profesor extends Persona implements Evaluable {
    private String materia;
    private int numAlumnos;

    // Constructor
    public Profesor(String nombre, String direccion, String telefono, String materia, int numAlumnos) {
        super(nombre, direccion, telefono);
        this.materia = materia;
        this.numAlumnos = numAlumnos;
    }

    public void setMateria(String materia) {this.materia = materia;}
    public void setNumAlumnos(int numAlumnos) {this.numAlumnos = numAlumnos;}
    public String getMateria() {return materia;}
    public int getNumAlumnos() {return numAlumnos;}

    @Override
    public void registrarse() {
        System.out.println("El profesor " + nombre + " se ha registrado.");
    }
    @Override
    public void verificarPerfil() {
        System.out.println("Verificacion del perfil del profesor " + nombre);
    }
    @Override
    public void realizarEvaluacion() {
        System.out.println("El profesor " + nombre + " realiza una evaluacion.");
    }
    @Override
    public void serEvaluado() {
        System.out.println("El profesor " + nombre + " es evaluado por los estudiantes.");
    }
}

public class Clase{
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Alan Torres", "Salvatierra", "664105152", "LPOO", 34);

        System.out.println(prof1.getNombre());
        prof1.registrarse();
        prof1.verificarPerfil();
        prof1.realizarEvaluacion();
        System.out.println("Alumno Ejmp#1 saco 90 de calificacion en LPOO.");
    }
}