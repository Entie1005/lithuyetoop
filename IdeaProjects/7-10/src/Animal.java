abstract class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    abstract boolean CanSwim();
    abstract boolean CanWalk();

    @Override
    public String toString() {
        return name;
    }
}
