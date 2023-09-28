import task1.Complex;

public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 2);

        Complex sum = a.add(b);
        Complex multi = a.multiply(b);
        Complex div = a.divide(b);
        
        System.out.println("Сумма комплексных чисел: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Произведение комплексных чисел: " + multi.getReal() + " + " + multi.getImaginary() + "i");
        System.out.println("Деление комплексных чисел: " + div.getReal() + " + " + div.getImaginary() + "i");

    }
}
