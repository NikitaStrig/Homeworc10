
public class Main {
    public static void main(String[] args) {
        int[] arr2 = {11, 8, 12, 9};
        int[] arr = generateRandomArray();
        int total = 0;
        int min = arr[0];
        int max = -1;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            average = total / arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
          else if (arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = reverseFullName.length -1; i <= reverseFullName.length && i != -1; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(" ");
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println("Минимальная сумма трат за день составила "  + min + " рублей." +
                " Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

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
