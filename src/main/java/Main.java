public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Calculator calc = Calculator.instance.get();

        // custom calls
        int multi = calc.multiply.apply(5,10);
        int pow = calc.pow.apply(8);
        int abs = calc.abs.apply(-10);
        boolean isPositive = calc.isPositive.test(-10);
        System.out.printf(" Multiply 5*10 = %d\n Pow 8^2 = %d\n ABS -10 = %d\n isPositive -10 = %b\n", multi, pow, abs, isPositive);

        // required calls
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c;
        // Для устранения останова программы при делении на ноль - перехватываем исключение
        try {
            c = calc.divide.apply(a, b);
            System.out.printf(" Делим: %d / %d = ", a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.printf(" Попытка деления на ноль: %d / %d.\n", a, b);
        }
    }
}
