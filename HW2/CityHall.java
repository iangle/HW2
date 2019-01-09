/**@author Isaac Angle
 * This class inherits from the Building base class
 * and implements an array of occupants*/
package HW2.edu.whitworth.spokane;

public class CityHall extends Building {
	//PT -- First, try ArrayList (it's like C++ vector).
	//  Second, it'd useful to add and remove occupants.
	//  (Maybe have occupants be on the Building object, since all buildings likely have occupants?
	private Police occupants[];
	
	/**@param name,address,occupants. the name, address and the occupants of City Hall*/
	CityHall(String name, String address, Police occupants[]) {
		super(name, address);
		this.occupants = occupants;
	}
	/**@return returns the occupants of CityHall*/
	public Police[] getOccupants() {
		return occupants;
	}

}
