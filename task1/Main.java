package task1;
public class Main {
    public static void main(String[] args) {
        ComplexCalculator a = new ComplexCalculator(2, 3);
        ComplexCalculator b = new ComplexCalculator(4, 2);

        ComplexCalculator sum = a.add(b);
        ComplexCalculator multi = a.multiply(b);
        ComplexCalculator div = a.divide(b);
        
        System.out.println("Сумма комплексных чисел: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Произведение комплексных чисел: " + multi.getReal() + " + " + multi.getImaginary() + "i");
        System.out.println("Деление комплексных чисел: " + div.getReal() + " + " + div.getImaginary() + "i");

    }
}
