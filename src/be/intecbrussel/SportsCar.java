package be.intecbrussel;

public class SportsCar extends Car {

    private String spoiler;

    public void setRaceMode(){
        System.out.println("Switching to race mode.");
    }

    public String getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(String spoiler) {
        this.spoiler = spoiler;
    }
}
