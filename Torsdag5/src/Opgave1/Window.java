package Opgave1;

public class Window {
    int widthCm;
    int heightCm;

    Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    int getAreaCm2(){
        return widthCm * heightCm;
    }

    @Override
    public String toString(){
        return widthCm + "x" + heightCm + "cm";
    }

}
