/*
 Se pide:
En el método main de una
clase de nombre Colegio:
1. Crear las materias:
a. Ingles I de primer año.
b. Matemáticas de primer año.
c. Laboratorio 1 de primer año
2. Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.
3. Inscribir a López en las 3 materias.
4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
5. Visualizar la cantidad de materias a las que está inscripto cada alumno. */
package multiplataforma;

/**
 *
 * @author flor7
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia inglesI = new Materia(1, "Inglés I", 1);
        Materia matematicas = new Materia(2, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);

       
        Alumno lopezMartin = new Alumno(1001, "López", "Martin");
        Alumno martinezBrenda = new Alumno(1002, "Martínez", "Brenda");
        
        lopezMartin.agregarMateria(inglesI);
        lopezMartin.agregarMateria(matematicas);
        lopezMartin.agregarMateria(laboratorio1);
        martinezBrenda.agregarMateria(inglesI);
        martinezBrenda.agregarMateria(matematicas);
        martinezBrenda.agregarMateria(laboratorio1);
        martinezBrenda.agregarMateria(laboratorio1);
        
        System.out.println("López Martin está inscripto en " + lopezMartin.cantidadMaterias() + " materias.");
        System.out.println("Martínez Brenda está inscripto en " + martinezBrenda.cantidadMaterias() + " materias.");
    }
}
