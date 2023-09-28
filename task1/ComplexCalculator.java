package task1;
class ComplexCalculator extends ComplexNumber{
    private double real;
    private double imaginary;

    ComplexCalculator(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
  
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexCalculator add(ComplexCalculator other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexCalculator(newReal, newImaginary);
    }
    
    public ComplexCalculator multiply(ComplexCalculator other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexCalculator(newReal, newImaginary);
    }

    public ComplexCalculator divide(ComplexCalculator other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexCalculator(newReal, newImaginary);
    }

    @Override
    ComplexCalculator add(ComplexCalculator a, ComplexCalculator b) {
        
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    ComplexCalculator multiply(ComplexCalculator a, ComplexCalculator b) {
        
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    @Override
    ComplexCalculator divide(ComplexCalculator a, ComplexCalculator b) {
       
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }

}