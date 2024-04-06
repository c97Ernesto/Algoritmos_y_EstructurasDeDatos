package tp1.ejercicio03;

public class Test {

	public static void main(String[] args) {
		
		int maxEstudiantes = 2;
		int maxProfesores = 3;
		
		Estudiante [] estudiantes = new Estudiante[2];
		Profesor [] profesores = new Profesor[3];
		
		//Estudiante e1 = new Estudiante("Lalo", "Landa", "1", "Calle 1", "estudiante1@gmail.com");
		Estudiante e1 = new Estudiante();
		e1.setNombre("Lalo");
		e1.setApellido("Landa");
		e1.setComision("1");
		e1.setDireccion("Calle 1");
		e1.setEmail("estudiante1@gmail.com");
		
		Estudiante e2 = new Estudiante("Marco", "Polo", "2", "Calle 2", "estudiante2@gmail.com");
		
		
		//Profesor p1 = new Profesor("NombreProfesor1", "ApellidoProfesor1", "p1@gmail.com", "Matematica1", "Informatica");
		Profesor p1 = new Profesor();
		p1.setNombre("NombreProfesor1");
		p1.setApellido("ApellidoProfesor1");
		p1.setEmail("p1@gmail.com");
		p1.setCatedra("Matematica1");
		p1.setFacultad("Informatica");
		
		
		Profesor p2 = new Profesor("NombreProfesor2", "ApellidoProfesor2", "p2@gmail.com", "Taller", "Informatica");
		Profesor p3 = new Profesor("NombreProfesor3", "ApellidoProfesor3", "p3@gmail.com", "CADP", "Informatica");
		
		estudiantes[0] = e1;
		estudiantes[1] = e2;
		
		profesores[0] = p1;
		profesores[1] = p2;
		profesores[2] = p3;
		
		for (int i = 0; i < maxEstudiantes; i ++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
		System.out.println();
		
		for (int i = 0; i < maxProfesores; i ++) {
			System.out.println(profesores[i].tusDatos());
		}
		
	}
	
	
}
