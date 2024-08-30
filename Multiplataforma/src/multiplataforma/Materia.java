/*
 La Materia tiene
un idMateria, un nombre
de la materia y año al que
pertenece, tiene además
un constructor que
inicializa sus propiedades
y métodos get y set para
cada uno de sus
atributos.
 */
package multiplataforma;

import java.util.HashSet;

public class Materia {
    private int idMateria;
    private String nombre;
    private int año;
    private HashSet<Alumno> alumnosInscriptos;

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.alumnosInscriptos = new HashSet<>();
        
    }

    // Getters y Setters
    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int hashCode() {
        return idMateria;  // Se usa idMateria para identificar la materia
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Materia materia = (Materia) obj;
        return idMateria == materia.idMateria;
    }
    
    public void agregarAlumno(Alumno alumno) {
        alumnosInscriptos.add(alumno);
    }
}
