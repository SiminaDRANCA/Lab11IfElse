public class Calculator {

    //instance fields
    double first;
    double second;

    //constructor method
    public double addition(double first, double second) {
        double sum = first + second;
        return sum;
    }

    public double substraction(double first, double second) {
        double difference = first - second;
        return difference;
    }

    public double multiplication (double first, double second) {
        double product = first * second;
        return product;
}

    public double division (double first, double second) {
        double quotient = first / second;
        return quotient;
    }

  public double modulo (double first, double second) {
        double reminder = first % second;
        return reminder;
  }

}
