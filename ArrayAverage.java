public class ArrayAverage {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5, "a", 7};
        int sum = 0;
        int count = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Integer) {
                    sum += (Integer) arr[i];
                    count++;
                } else {
                    throw new NumberFormatException("Неверные данные в массиве на индексе " + i);
                }
            }

            double average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла неизвестная ошибка: " + e.getMessage());
        }
    }
}
