import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 89, 84, 91};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int score : scores) {
            sum += score;

            if (score > high) high = score;
            if (score < low) low = score;
        }

        double average = (double) sum / scores.length;

        // Sort array for median
        Arrays.sort(scores);

        double median;
        int middle = scores.length / 2;

        // Even number of elements (10 scores)
        median = (scores[middle - 1] + scores[middle]) / 2.0;

        // Difference between average and median
        double difference = average - median;

        // Display results
        System.out.println("Average: " + average);
        System.out.println("High Score: " + high);
        System.out.println("Low Score: " + low);
        System.out.println("Median: " + median);
        System.out.println("Difference (Average - Median): " + difference);
    }
}