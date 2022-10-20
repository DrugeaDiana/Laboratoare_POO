package task1;

public class Complex {

    private int real;
    private int imaginary;

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public Complex(int _real, int _imaginary){
        real = _real;
        imaginary = _imaginary;
    }

    public Complex(){
        new Complex(0,0);
    }

    public Complex(Complex _copy){
        this.real = _copy.getReal();
        this.imaginary = _copy.getImaginary();
    }

    public void showNumber() {
        if (imaginary > 0) {
            System.out.println(this.real + " + " + "i * " + this.imaginary);
        } else if (imaginary < 0) {
            System.out.println(this.real + " - i * " + this.imaginary * -1);
        } else {
            System.out.println(this.real);
        }
    }

    public void addWithComplex(Complex _add) {
        this.real = this.real + _add.getReal();
        this.imaginary = this.imaginary + _add.getImaginary();
    }

}

