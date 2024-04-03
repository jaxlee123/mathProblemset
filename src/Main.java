import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        //5x <starting equation
        Main ex = new Main();
    }
    Main(){
//        incrimintsOf(0.1);
//        incrimintsOf(0.01);
        incrimintsOf(0.001);
    }
    public void incrimintsOf(double inc){
        double area =0;
        int counter = 1;
        for(double x =inc; x<1; x=x+inc){
            double rect = inc*(x*5);
            area = area+rect;
            System.out.println(rect);
            rect = 0;
            System.out.println(counter);
            counter++;
        }
        System.out.println(area);
    }
}