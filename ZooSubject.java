/**@author Erina Lara, Eric Truong
 * Date: April 13, 2020
 *
 */

// This is a subject
public interface ZooSubject {

    public void registerAnimalAddedListener (AnimalAddedListener animalAddedListener);

    public void unregisterAnimalAddedListener (AnimalAddedListener animalAddedListener);

    public void addAnimal (Animal animal);
}
