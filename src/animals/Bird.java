package animals;

public class Bird extends Animal {

    public Bird(){
        this(null);
    }
    public Bird(String name){
        this.getName();
    }

    @Override
    public void move(){
        System.out.println("Birds flying high!");

    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp chirp");

    }
}
