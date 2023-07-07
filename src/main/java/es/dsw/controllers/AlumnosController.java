package es.dsw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/* [3] - GESTIÓN DE VARIABLES DE SESIÓN
 * 
 * En esta controladora, se hace uso de la variable de sesión DataGrupo, la cual se accede también desde la controladora MainController. Además
 * se crea un area de aplicación ya que todos los métodos se mapearán bajo la ruta url relativa /alumnos. 
 */

@Controller
@RequestMapping("/alumnos")
@SessionAttributes({"DataGrupo"})
public class AlumnosController {

	//En este ejemplo se delega a la vista la cual accede directamente al contenido de DataGrupo. Si no ha sido creada dicha variable de sesión, no 
	//causa excepción.
	@GetMapping(value={"/ejemplo2"})
	public String ejem2() {
		return "example2";
	}
	
}
