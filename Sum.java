public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum: " + sum);
        avg = (float) sum / 10;
        System.out.println("avg: " + avg);
    }
}

