/**@author Erina Lara, Eric Truong
 * Date: April 13, 2020
 *
 */

public class PrintNameAnimalAddedListener implements AnimalAddedListener {

    private ZooSubject zoo;

    public PrintNameAnimalAddedListener(){

    }

    public PrintNameAnimalAddedListener(ZooSubject Zoo){

        this.zoo = zoo;
        zoo.registerAnimalAddedListener(this);
    }

    public void update(Object newState){

        Animal newestAnimal = (Animal) newState;
        display(newestAnimal);
    }

    public void display(Animal newAnimal){

        System.out.println("Added animal: " + newAnimal.getAnimal());
    }
}
