/**@author Erina Lara, Eric Truong
 * Date: April 13, 2020
 *
 */

import java.util.ArrayList;

public class Zoo implements ZooSubject {

    private ArrayList<AnimalAddedListener> observers;

    private Animal newAnimal;

    public Zoo() {

        observers = new ArrayList<AnimalAddedListener>();
    }

    @Override
    public void registerAnimalAddedListener(AnimalAddedListener hello){

        observers.add(hello);
    }

    @Override
    public void unregisterAnimalAddedListener(AnimalAddedListener hello){

        observers.remove(hello);
    }

    public void notifyObservers(){

        // for (AnimalAddedListener hi : observers)
        for (int i = 0; i < observers.size(); i++){

            AnimalAddedListener hi = observers.get(i);
            hi.update(newAnimal);
        }
    }

    @Override
    public void addAnimal(Animal animal){

        newAnimal = animal;
        notifyObservers();
    }
}
