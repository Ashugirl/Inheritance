package animals;

public class Cat extends Animal {

    public Cat(){
        this(null);
    }
    public Cat(String name){
        this.getName();

    }
    @Override
    public void move(){
        System.out.println("The cat jumps on the couch.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meeeeeeoooowww!");
    }
}
