package lessons_32;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Bark!!!");
    }

    public void showName() {
        System.out.println(name);;
    }
}
