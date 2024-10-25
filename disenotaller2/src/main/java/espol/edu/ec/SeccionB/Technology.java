package espol.edu.ec.SeccionB;

public class Technology implements Iva{
    private double price;
    @Override
    public double calculatorIva() {
        return price * 0.15;
    }

}
