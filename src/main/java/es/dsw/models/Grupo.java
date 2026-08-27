package es.dsw.models;

import java.util.ArrayList;

public class Grupo {

	private ArrayList<Alumno> Lista = null;
	
	public Grupo() {
		this.Lista = null;
	}
	
	public Grupo(Alumno objAlumno) {
		this.Lista = new ArrayList<Alumno>();
		this.Lista.add(objAlumno);
	}
	
	public void setAlumno(Alumno objAlumno) {
		this.Lista.add(objAlumno);
	}
	
	public int getNumAlumnos() {
		if (this.Lista != null)
			return this.Lista.size();
		else return 0;
	}

	public ArrayList<Alumno> getLista() {
		return this.Lista;
	}


}
