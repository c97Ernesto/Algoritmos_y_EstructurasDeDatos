package tp01.ejercicio03;

public class Test {

	public static void main(String[] args) {
		Estudiante[] arrayEstudientes = new Estudiante[2];
		Profesor[] arrayProfesores = new Profesor[3];
		
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
		
		e1.setApellido("Estudiante1");
		e1.setComision("Comision-Estudiante1");
		e1.setDireccion("Dirección-Estudiante1");
		e1.setEmail("Email-Estudiante1");
		e1.setNombre("Estudiante1");
		
		e2.setApellido("Estudiante2");
		e2.setComision("Comision-Estudiante2");
		e2.setDireccion("Dirección-Estudiante2");
		e2.setEmail("Email-Estudiante2");
		e2.setNombre("Estudiante2");
		
		arrayEstudientes[0] = e1;
		arrayEstudientes[1] = e2;
		
		
		Profesor p1 = new Profesor();
		Profesor p2 = new Profesor();
		Profesor p3 = new Profesor();
		
		p1.setApellido("Profesor1");
		p1.setCatedra("Cátedra-Profesor1");
		p1.setFacultad("Facultad-Profesor1");
		p1.setEmail("Email-Profesor1");
		p1.setNombre("Profesor1");
		
		p2.setApellido("Profesor2");
		p2.setCatedra("Cátedra-Profesor2");
		p2.setFacultad("Facultad-Profesor2");
		p2.setEmail("Email-Profesor2");
		p2.setNombre("Profesor2");
		
		p3.setApellido("Profesor3");
		p3.setCatedra("Cátedra-Profesor3");
		p3.setFacultad("Facultad-Profesor3");
		p3.setEmail("Email-Profesor3");
		p3.setNombre("Profesor3");
		
		arrayProfesores[0] = p1;
		arrayProfesores[1] = p2;
		arrayProfesores[2] = p3;
		
		for (Estudiante e: arrayEstudientes) {
			System.out.println(e.tusDatos());
		}
		
		for (Profesor p: arrayProfesores) {
			System.out.println(p.tusDatos());
		}
	}

}
