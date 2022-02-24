package animals;

public class Fish extends Animal{

    public Fish(){
        this(null);
    }
    public Fish(String name){
        this.getName();
    }

    @Override
    public void move() {
        System.out.println("Keep on swimming swimming swimming");;
    }

    @Override
    public void makeNoise() {
        System.out.println("Glub glub glub...");
    }
}
