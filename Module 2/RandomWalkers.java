public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);

        int x = 0;
        int y = 0;

        double randomNum = 0;

        double count = 0;
        double avgSteps = 0;

        for(int i = 0; i < trials; i++) {
            while ((Math.abs(x) + Math.abs(y)) != r) {
                randomNum = Math.random();
                if (randomNum > 0.74) {
                    x++;
                } else if (randomNum > 0.49) {
                    x--;
                } else if (randomNum > 0.24) {
                    y++;
                } else {
                    y--;
                }
                count++;
            }
            avgSteps += count;
            count = 0;
            y = 0;
            x = 0;
        }
        
        if (trials == 0) {
            return;
        } else {
            avgSteps = avgSteps/trials;
            System.out.println("average number of steps = " + avgSteps);
        }
    }
}