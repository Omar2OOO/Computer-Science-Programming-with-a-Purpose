public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;
        
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double temp1 = (1 - Math.cos(Math.toRadians(x2) - Math.toRadians(x1)));

        double temp2 = (1 - Math.cos(Math.toRadians(y2) - Math.toRadians(y1)));

        double equation = (2 * r * Math.asin(Math.sqrt((temp1 + (Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * temp2))/2)));

        System.out.println(equation + " kilometers");

    }
}
