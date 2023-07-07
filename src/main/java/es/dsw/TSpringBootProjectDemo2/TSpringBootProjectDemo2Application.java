package es.dsw.TSpringBootProjectDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 *[1] - Comprueba como se puede limitar el tiempo máximo de sesión del usuario estableciendo en el fichero
 *      application.properties la propiedad server.servlet.session.timeout. Esto permite indicarles en segundos
 *      el tiempo que como máximo se mantendrán los datos de la sesión del cliente en el servidor.
 *      
 *      Nota: Si el servidor en su configuración tiene otro tiempo máximo de sesión y es inferior al que se indica
 *      en la aplicación, siempre prevalecerá lo configurado en el servidor.
 */
@SpringBootApplication
@ComponentScan(basePackages = "es.dsw")
public class TSpringBootProjectDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(TSpringBootProjectDemo2Application.class, args);
	}

}
