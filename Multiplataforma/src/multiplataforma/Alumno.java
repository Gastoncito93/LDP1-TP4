/*
 Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista HashSet de
materias en las que está inscripto; para ello tiene un método agregarMateria que permite
inscribir al Alumno en una materia determinada (implementar de manera tal que no deje
inscribir un alumno en dos materias iguales.) y otro método cantidadMaterias que devuelve la
cantidad de materias a las que está inscripto el alumno
 */
package multiplataforma;

import java.util.HashSet;

public class Alumno {
    private int nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materiasInscripto;

    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materiasInscripto = new HashSet<>();
    }

    // Getters y Setters
    public int getNroLegajo() {
        return nroLegajo;
    }
    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public HashSet<Materia> getMateriasInscripto() {
        return materiasInscripto;
    }
    
    // agregar materia
    public void agregarMateria(Materia materia) {
        if (materiasInscripto.contains(materia)) {
            System.out.println("El alumno ya está inscripto en la materia: " + materia.getNombre());
        } else {
            materiasInscripto.add(materia);
            System.out.println("Materia " + materia.getNombre() + " agregada con éxito.");
        }
    }

    // obtener la cantidad de materias
    public int cantidadMaterias() {
        return materiasInscripto.size();
    }
}

