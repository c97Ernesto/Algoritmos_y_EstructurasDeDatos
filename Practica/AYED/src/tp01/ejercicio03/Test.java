package tp01.ejercicio03;

public class Test {

	public static void main(String[] args) {
		
		Estudiante [] estudiantes = new Estudiante[2];
		Profesor [] profesores = new Profesor[3];
		
		Estudiante e1 = new Estudiante("Lalo", "Lando", "1", "Calle 1", "estudiante1@gmail.com");
		Estudiante e2 = new Estudiante("Marco", "Polo", "2", "Calle 2", "estudiante2@gmail.com");
		
		Profesor p1 = new Profesor("Profesor1", "ApellidoProfesor1", "p1@gmail.com", "Matematica1", "Informatica");
		Profesor p2 = new Profesor("Profesor2", "ApellidoProfesor2", "p2@gmail.com", "Taller", "Informatica");
		Profesor p3 = new Profesor("Profesor3", "ApellidoProfesor3", "p3@gmail.com", "CADP", "Informatica");
		
		estudiantes[0] = e1;
		estudiantes[1] = e2;
		
		profesores[0] = p1;
		profesores[0] = p2;
		profesores[0] = p3;
		
	}
	
	
}
