public class Duck extends Animal{
    Duck(String name) {
        super(name);
    }

    @Override
    boolean CanSwim() {
        return true;
    }

    @Override
    boolean CanWalk() {
        return true;
    }
}
