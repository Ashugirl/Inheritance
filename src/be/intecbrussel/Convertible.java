package be.intecbrussel;

public class Convertible extends Car {

    private String sunroof;

    public void switchToNoRoof(){
        System.out.println("Putting the top down on our convertible");
    }

    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }
}
