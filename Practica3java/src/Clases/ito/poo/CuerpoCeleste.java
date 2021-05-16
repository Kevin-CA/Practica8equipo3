/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.ito.poo;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author Kevin
 */
public class CuerpoCeleste {
	public CuerpoCeleste(String nombre, HashSet<Ubicacion> localizaciones, String composicion, int desplazamiento) {
		super();
		this.nombre = nombre;
		this.localizaciones = localizaciones;
		this.composicion = composicion;
		this.desplazamiento = desplazamiento;
	}

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property localizaciones.
	 */
	public HashSet<Ubicacion> localizaciones = new HashSet<Ubicacion>();

	/**
	 * Description of the property composicion.
	 */
	public String composicion = "";

	// Start of user code (user defined attributes for CuerpoCeleste)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}

	/**
	 * Description of the method desplazamiento.
	 * @param float 
	 * @return 
	 */
	public int desplazamiento;
	{
		// Start of user code for method desplazamiento
		// End of user code
	}

	// Start of user code (user defined methods for CuerpoCeleste)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public HashSet<Ubicacion> getLocalizaciones() {
		return this.localizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}

	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [nombre=" + nombre + ", localizaciones=" + localizaciones + ", composicion=" + composicion
				+ ", desplazamiento=" + desplazamiento + "]";
	}

	/**
	 * Description of j.
	 * 
	 * @author Kevin
	 */
	// invalid content
}