package espol.edu.ec.SeccionB;

public class Clothing implements Iva {
    private double price;
    @Override
    public double calculatorIva() {
        return price * 0.12;
    }

}
