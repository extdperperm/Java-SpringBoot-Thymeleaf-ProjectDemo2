package es.dsw.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.dsw.models.*;

/* [2] - GESTIÓN DE VARIABLES DE SESIÓN
 * 
 * La Java Annotation @SessionAttributes indica la/s variables de sesiones que entran en juego en la controladora. Esto significa que a la hora de hacer getAttribute o 
 * addAttribute en el modelo de spring, la persistencia de dicho objeto (modelo de negocio) va mas alla de la petición y respuesta http, es decir, se almacena en memoria de usuario. El tiempo que permanecerá
 * en memoria activa dicha variable de sesión, en este proyecto, será hasta un máximo de 20 minutos (ver fichero application.properties) después de que no se detecte actividad del usuario. 
 * Ddebes recordar, que la configuración en el servidor prevalece a la configuración que se pueda hacer en el respectivo fichero application.properties.
 *  
 * Por lo tanto, en toda controladora que se necesite acceder a una o varias variables de sesión de usuario, se debe indicar explícitamente el nombre de las mismas con @SessionAttributes.
 */
@Controller
@SessionAttributes({"DataGrupo"}) //Se pueden indicar más de una variable de sesión. Ejemplo: @SessionAttributes({"DataGrupo", "OtraVariable"})
public class MainController {
	

	@GetMapping(value = {"/","/index"})
	public String index() {
		return "index";
	}

	//En este ejemplo, se recoge por método post una serie de parámetros y si no existe aún o no está inicializada la variable de sesión DataGrupo, entonces
	//se crea asignandole un objeto de la clase Grupo que implementa una lista de alumnos. Si ya existe, se añaden los datos del nuevo alumno al grupo.
	@PostMapping(value = {"/ejemplo1"})
	public String ejem1(@RequestParam("Nombre") String Nom, @RequestParam("Apellidos") String Apell, @RequestParam("Edad") int Edad, Model objModel) {
		
		if (objModel.getAttribute("DataGrupo") == null) {
			//Si la variable de sesión es nula, entonces se crea y se inicializa por primera vez el ArrayList, con el primer alumno introducido.
			objModel.addAttribute("DataGrupo", (new Grupo(new Alumno(Nom, Apell, Edad))));
		} else {
			Grupo auxGrupo = (Grupo) objModel.getAttribute("DataGrupo");
			//Si la variable de sesión ya está inicializada, se añaden los datos del nuevo alumno introducido. Recordar que en JAVA en paso de parámetros es por
			//referencia. Por ello, en este caso no es necesario un AddAttribute del modelo, pues estamos modificando el contenido del objeto.
			auxGrupo.setAlumno(new Alumno(Nom, Apell, Edad));
		}
		
		return "example1";
	}	

}

