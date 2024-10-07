import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Animal> Farm;

    public Main() {
        Farm=new ArrayList<>();
    }

    public void addAnimal(Animal cattle) {
        Farm.add(cattle);
    }

    public void printAnimal() {
        for(Animal cattle : Farm) {
            if(cattle.CanSwim() || cattle.CanWalk()) {
                System.out.println(cattle);
            }
        }
    }

    public static void main(String[] args) {
        Main farm = new Main();
        farm.addAnimal(new Pig("Pig 1"));
        farm.addAnimal(new Duck("Duck 1"));
        farm.addAnimal(new Fish("Fish 1"));

        farm.printAnimal();
    }
}
