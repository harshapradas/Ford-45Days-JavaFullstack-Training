abstract class AbstractAnimal  implements  Animal{
    public void eat(){
        System.out.println("Animals eat");
    }
    public void sleep(){
        System.out.println("Animals sleep");
    }

}
public interface Animal {
    public void eat();
    public void move();
    public void sleep();


}
class AnimalTrainer{
    public void  train(Animal animal){
        System.out.println("training bird");
        animal.move();
        System.out.println("trained bird");

    }}
class Bird extends AbstractAnimal{
    @Override
    public void move() {
        System.out.println("bird flies on wings");
    }

    public static void main(String[] args) {
        Bird b1=new Bird();
        b1.eat();
        b1.sleep();
        b1.move();
    }
}
class Fish extends AbstractAnimal{
    @Override
    public void move() {
            System.out.println("fish swims on water");

    }
    public static void main(String[] args) {
        Fish f1=new Fish();
        f1.eat();
        f1.sleep();
        f1.move();
    }
}
