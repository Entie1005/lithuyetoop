public class Fish extends Animal{
    Fish(String name) {
        super(name);
    }

    @Override
    boolean CanSwim() {
        return true;
    }

    @Override
    boolean CanWalk() {
        return false;
    }
}
