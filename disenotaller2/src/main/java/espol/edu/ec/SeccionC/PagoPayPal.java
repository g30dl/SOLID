package espol.edu.ec.SeccionC;

public class PagoPayPal extends Pago implements Loggeable{
    private boolean loggedIn; //conexion a cuenta Paypal
 
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){
            SingUpLoggin();
        }
        // cargar el monto de compra al medio de pago
    }

     
    public void SingUpLoggin() {
        //lógica de login
    }


}
