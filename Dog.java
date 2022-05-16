public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("dog");
    }

    public void bark(){
        System.out.println("gav");
    }
}
