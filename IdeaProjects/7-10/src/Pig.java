public class Pig extends Animal {
    Pig(String name) {
        super(name);
    }

    @Override
    boolean CanSwim() {
        return false;
    }

    @Override
    boolean CanWalk() {
        return false;
    }
}
