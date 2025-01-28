public class CMYKtoRGB {
    public static void main(String[] args) {
        // this is for the amount of black value to control he saturation value and calculate white
        double black = Double.parseDouble(args[3]);

        // this is the values cyan magenta and yellow used in calculating the red green and blue values
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        
        // int c is constant our value 255 which is the max possible value for rgb
        double c = 255;

        double white = 1 - black;

        double red = c * white * (1 - cyan);
        double green = c * white * (1 - magenta);
        double blue = c * white * (1 - yellow);

        System.out.println("red   = " + Math.round(red));
        
        System.out.println("green = " + Math.round(green));
        
        System.out.println("blue  = " + Math.round(blue));


    }
}
