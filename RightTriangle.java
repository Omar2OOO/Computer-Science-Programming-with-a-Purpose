public class RightTriangle {
    public static void main(String[] args) {
        // These are the 3 inputs from command-line
        // Convert from String to Double
        double nums1 = Double.parseDouble(args[0]);
        double nums2 = Double.parseDouble(args[1]);
        double nums3 = Double.parseDouble(args[2]);

        boolean notNegative = (nums1 > 0) && (nums2 > 0) && (nums3 > 0);

        boolean result = notNegative && (((nums1 * nums1) + (nums2 * nums2)) == (nums3 * nums3)) || (((nums1 * nums1) + (nums3 * nums3)) == (nums2 * nums2)) || (((nums3 * nums3) + (nums2 * nums2)) == (nums1 * nums1));

        System.out.println(result);
        
    }
}
