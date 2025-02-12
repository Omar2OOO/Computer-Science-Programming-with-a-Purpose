public class GeneralizedHarmonic {
    public static void main(String[] args) {

        double n = Double.parseDouble(args[0]);
        int r = Integer.parseInt(args[1]);

        double total = 0;

        for (int i = 1; i <= n; i++)
            total += (1 / (Math.pow(i, r)));

        System.out.println(total);
    
    }

}