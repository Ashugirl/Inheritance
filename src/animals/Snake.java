package animals;

public class Snake extends Animal {

    public Snake(){
        this(null);
    }
    public Snake(String name){
        this.getName();
    }

    @Override
    public void move() {
        System.out.println("Slither slither...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Ssssssssssssssss....");
    }
}
