/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clases.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Ubicacion.
 * 
 * @author Kevin
 */
public class Ubicacion {
	public Ubicacion(float longitud, float latitud, String periodo, float distancia, int desplazamiento) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
		this.periodo = periodo;
		this.distancia = distancia;
		this.desplazamiento = desplazamiento;
	}

	/**
	 * Description of the property longitud.
	 */
	public float longitud = 0F;

	/**
	 * Description of the property latitud.
	 */
	public float latitud = 0F;

	/**
	 * Description of the property periodo.
	 */
	public String periodo = "";

	/**
	 * Description of the property distancia.
	 */
	public float distancia = 0F;

	// Start of user code (user defined attributes for Ubicacion)

	// End of user code

	/**
	 * The constructor.
	 */
	public Ubicacion() {
		// Start of user code constructor for Ubicacion)
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

	// Start of user code (user defined methods for Ubicacion)

	// End of user code
	/**
	 * Returns longitud.
	 * @return longitud 
	 */
	public float getLongitud() {
		return this.longitud;
	}

	/**
	 * Sets a value to attribute longitud. 
	 * @param newLongitud 
	 */
	public void setLongitud(float newLongitud) {
		this.longitud = newLongitud;
	}

	/**
	 * Returns latitud.
	 * @return latitud 
	 */
	public float getLatitud() {
		return this.latitud;
	}

	/**
	 * Sets a value to attribute latitud. 
	 * @param newLatitud 
	 */
	public void setLatitud(float newLatitud) {
		this.latitud = newLatitud;
	}

	/**
	 * Returns periodo.
	 * @return periodo 
	 */
	public String getPeriodo() {
		return this.periodo;
	}

	/**
	 * Sets a value to attribute periodo. 
	 * @param newPeriodo 
	 */
	public void setPeriodo(String newPeriodo) {
		this.periodo = newPeriodo;
	}

	/**
	 * Returns distancia.
	 * @return distancia 
	 */
	public float getDistancia() {
		return this.distancia;
	}

	/**
	 * Sets a value to attribute distancia. 
	 * @param newDistancia 
	 */
	public void setDistancia(float newDistancia) {
		this.distancia = newDistancia;
	}

	@Override
	public String toString() {
		return "Ubicacion [longitud=" + longitud + ", latitud=" + latitud + ", periodo=" + periodo + ", distancia="
				+ distancia + ", desplazamiento=" + desplazamiento + "]";
	}

	/**
	 * Description of i.
	 * 
	 * @author Kevin
	 */
	// invalid content
}
