public class DivisionWithLog {
    public static void main(String[] args) {
        try {
            double result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (CustomDivisionException e) {
            System.out.println("Ошибка: " + e.getMessage());
            ExceptionLogger.log(e);
        }
    }

    public static double divide(double a, double b) throws CustomDivisionException {
        if (b == 0) {
            throw new CustomDivisionException("Деление на ноль недопустимо.");
        }
        return a / b;
    }
}
