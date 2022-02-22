package graphics;

import java.util.Scanner;

public class Square extends Rectangle{


    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }
@Override
    public void setHeight(int height){
        setSide(height);
    }
    @Override
    public void setWidth(int width){
        setSide(width);
    }
    /*public void setSide(int side) {
        setHeight(side);
        setWidth(side);
    }*/

    public int getSide(){
        return getHeight();
    }

    /*public void setWidth(int width){
        setSide(width);
    }*/


}




