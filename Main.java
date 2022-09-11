public class Main {

    public static void main(String[] args) {
        int[] weights = {90, 91, 93, 92, 95, 85, 87, 88, 89, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 95, 85, 87, 88, 89, 0, 0, 0};
        weightsCopy[0] = 823;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;

                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("массивы разные");
        }
        int maxWeight = -1;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1  && weights[i + 1] != 0; i++){
            System.out.println(weights[i + 1] - weights[i]);
            }
        }
        }



