public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        double randomNum = 0;

        int count = 0;

        while((Math.abs(x) + Math.abs(y)) != r) {
            randomNum = Math.random();
            if (randomNum > 0.74) {
                System.out.println("(" + x + ", " + y + ")");
                x++;
            } else if (randomNum > 0.49) {
                System.out.println("(" + x + ", " + y + ")");
                x--;
            } else if (randomNum > 0.24) {
                System.out.println("(" + x + ", " + y + ")");
                y++;
            } else {
                System.out.println("(" + x + ", " + y + ")");
                y--;
            }
            count++;
        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + count);
    }
}