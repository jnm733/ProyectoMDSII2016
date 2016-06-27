/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package diagrama_de_base_de_datos;

import org.orm.*;

public class Linea_ParadaSetCollection extends org.orm.util.ORMSet {
	public Linea_ParadaSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public Linea_ParadaSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persisten objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Linea_Parada value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Linea_Parada value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Linea_Parada value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Linea_Parada[] toArray() {
		return (Linea_Parada[]) super.toArray(new Linea_Parada[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>nombreParada</li>
	 * <li>numeroLinea</li>
	 * <li>distancia</li>
	 * <li>horaPaso</li>
	 * <li>posicion</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Linea_Parada[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>nombreParada</li>
	 * <li>numeroLinea</li>
	 * <li>distancia</li>
	 * <li>horaPaso</li>
	 * <li>posicion</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Linea_Parada[] toArray(String propertyName, boolean ascending) {
		return (Linea_Parada[]) super.toArray(new Linea_Parada[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance();
	}
	
}
