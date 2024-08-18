import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Persona {
    protected String nombre;
    protected String cedula;
    protected LocalDate fechaNacimiento;
    protected String lugarNacimiento;

    public Persona(String nombre, String cedula, LocalDate fechaNacimiento, String lugarNacimiento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getLugarNacimiento() { return lugarNacimiento; }
    public void setLugarNacimiento(String lugarNacimiento) { this.lugarNacimiento = lugarNacimiento; }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                '}';
    }
}


public class Rector extends Persona {
    private double sueldo;
    private LocalDate fechaIngreso;
    private String nivelEstudio;

    
    public Rector(String nombre, String cedula, LocalDate fechaNacimiento, String lugarNacimiento, double sueldo, LocalDate fechaIngreso, String nivelEstudio) {
        super(nombre, cedula, fechaNacimiento, lugarNacimiento);
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.nivelEstudio = nivelEstudio;
    }

    
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public String getNivelEstudio() { return nivelEstudio; }
    public void setNivelEstudio(String nivelEstudio) { this.nivelEstudio = nivelEstudio; }

    
    public String toString() {
        return "Rector{" +
                "sueldo=" + sueldo +
                ", fechaIngreso=" + fechaIngreso +
                ", nivelEstudio='" + nivelEstudio + '\'' +
                "} " + super.toString();
    }
}

public class Estudiante extends Persona {
    private int codigo;
    private String colegio;
    private LocalDate fechaIngreso;
    private int nivelCarrera;

    // Constructor
    public Estudiante(String nombre, String cedula, LocalDate fechaNacimiento, String lugarNacimiento, int codigo, String colegio, LocalDate fechaIngreso, int nivelCarrera) {
        super(nombre, cedula, fechaNacimiento, lugarNacimiento);
        this.codigo = codigo;
        this.colegio = colegio;
        this.fechaIngreso = fechaIngreso;
        this.nivelCarrera = nivelCarrera;
    }

    // Getters y setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getColegio() { return colegio; }
    public void setColegio(String colegio) { this.colegio = colegio; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public int getNivelCarrera() { return nivelCarrera; }
    public void setNivelCarrera(int nivelCarrera) { this.nivelCarrera = nivelCarrera; }

    public void matricular(Curso curso) {
        if (!curso.getEstudiantes().contains(this)) {
            curso.inscribirEstudiante(this);
        } else {
        }
    }

   
    public String toString() {
        return "Estudiante{" +
                "codigo=" + codigo +
                ", colegio='" + colegio + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", nivelCarrera=" + nivelCarrera +
                "} " + super.toString();
    }
}


public class Profesor extends Persona {
    private double sueldo;
    private LocalDate fechaIngreso;
    private String nivelEstudio;
    private List<Curso> cursos;

    // Constructor
    public Profesor(String nombre, String cedula, LocalDate fechaNacimiento, String lugarNacimiento, double sueldo, LocalDate fechaIngreso, String nivelEstudio) {
        super(nombre, cedula, fechaNacimiento, lugarNacimiento);
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.nivelEstudio = nivelEstudio;
        this.cursos = new ArrayList<>();
    }

    
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public String getNivelEstudio() { return nivelEstudio; }
    public void setNivelEstudio(String nivelEstudio) { this.nivelEstudio = nivelEstudio; }
    public List<Curso> getCursos() { return cursos; }
    public void setCursos(List<Curso> cursos) { this.cursos = cursos; }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        } else {
           
        }
    }

 
    public String toString() {
        return "Profesor{" +
                "sueldo=" + sueldo +
                ", fechaIngreso=" + fechaIngreso +
                ", nivelEstudio='" + nivelEstudio + '\'' +
                ", cursos=" + cursos +
                "} " + super.toString();
    }
}


public class Curso {
    private String nombre;
    private int codigo;
    private List<Estudiante> estudiantes;
    private Profesor profesor;

    // Constructor
    public Curso(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
    public void setEstudiantes(List<Estudiante> estudiantes) { this.estudiantes = estudiantes; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }

    public void inscribirEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        } else {
        	
        }
    }

    @Override    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", estudiantes=" + estudiantes +
                ", profesor=" + profesor +
                '}';
    }
}


public class Carrera {
    private String nombre;
    private int codigo;
    private List<Curso> cursos;

    // Constructor
    public Carrera(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cursos = new ArrayList<>();
    }

  
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public List<Curso> getCursos() { return cursos; }
    public void setCursos(List<Curso> cursos) { this.cursos = cursos; }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        } else {
            
        }
    }

    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", cursos=" + cursos +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Juan Pérez", "12345678", LocalDate.of(1990, 1, 1), "Ciudad de México");
        Rector rector1 = new Rector("María Rodríguez", "98765432", LocalDate.of(1960, 5, 15), "Guadalajara", 50000.0, LocalDate.of(2010, 1, 1), "Doctorado");
        Estudiante estudiante1 = new Estudiante("Pedro García", "11111111", LocalDate.of(1995, 3, 20), "Monterrey", 12345, "Prepa 1", LocalDate.of(2015, 8, 15), 1);
        Profesor profesor1 = new Profesor("Luis Hernández", "22222222", LocalDate.of(1970, 10, 12), "Ciudad de México", 40000.0, LocalDate.of(2005, 1, 1), "Maestría");
        Curso curso1 = new Curso("Matemáticas", 101);
        Carrera carrera1 = new Carrera("Ingeniería en Computación", 1);

        
        estudiante1.matricular(curso1);
        profesor1.agregarCurso(curso1);
        curso1.setProfesor(profesor1);
        carrera1.agregarCurso(curso1);

        
        System.out.println("Persona: " + persona1);
        System.out.println("Rector: " + rector1);
        System.out.println("Estudiante: " + estudiante1);
        System.out.println("Profesor: " + profesor1);
        System.out.println("Curso: " + curso1);
        System.out.println("Carrera: " + carrera1);
    }
}
               
                
               