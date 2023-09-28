package task1;
abstract class ComplexNumber {
    abstract ComplexCalculator add(ComplexCalculator a, ComplexCalculator b);
    abstract ComplexCalculator multiply(ComplexCalculator a, ComplexCalculator b);
    abstract ComplexCalculator divide(ComplexCalculator a, ComplexCalculator b);
}