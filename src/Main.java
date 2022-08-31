public class Main {
    public static void main(String[] args) {

//Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int spending : arr) {
            sum += spending;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sum);

//Задание 2
        int min = arr[0];
        int max = arr[0];
        for (int spending : arr) {
            if (min > spending) {
                min = spending;
            } else if (max < spending) {
                max = spending;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей\n", min, max);

//Задание 3
        double averageSpending = (double) sum / arr.length;
        String average = String.format("%.2f", averageSpending);
        System.out.println("Средний расход за день " + average);

//Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;

    }

}
