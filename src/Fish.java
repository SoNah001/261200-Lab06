public abstract class Animal {
    public abstract void sound();
}


class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Moo!");
    }
}