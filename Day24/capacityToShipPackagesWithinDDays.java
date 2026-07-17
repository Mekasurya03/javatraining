public class capacityToShipPackagesWithinDDays {

    public static boolean canShip(int[] weights, int days, int capacity) {

        int requiredDays = 1;
        int currentWeight = 0;

        for (int weight : weights) {

            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return requiredDays <= days;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum Capacity = " + result);
    }
}