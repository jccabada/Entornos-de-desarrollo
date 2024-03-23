package cuenta;
/**
 *
 * @author Juan Carlos Cabada
 */

/**
 * En esta class vamos a crear nuestra cuenta y realizar las operaciones que 
 * deseemos realizar
 */
public class Main {

    public static void main(String[] args) {
        /**declaramos las variables*/
        CCuenta cuenta1;
        double saldoActual;
        /**Creamos nuestra cuenta*/
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        /**Comprobamos el saldo actual*/
        saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es" + saldoActual);
        /**Lamamos al método operativa cuenta que hemos definido*/
        operativa_cuenta(cuenta1,2000,695);
    }
    /**Creamos el método operativa_cuenta*/
    public static void operativa_cuenta(CCuenta cuenta,float cantidade,float cantidadi) {
    double saldoActual;
    /**Retiramos la cantidad de dinero que lehemos indicado*/
    try {
        cuenta.retirar(cantidade);
        System.out.println("Extracción en cuenta de: "+cantidade);
    } catch (Exception e) {
        System.out.println("Fallo al retirar: " + e.getMessage());
    }
    /**Ingresamos la cantidad que le hemos indicado*/
    try {
        System.out.println("Ingreso en cuenta de "+cantidadi);
        cuenta.ingresar(cantidadi); /**Ingresamos la cantidad pasada como parámetro*/
    } catch (Exception e) {
        System.out.println("Fallo al ingresar: " + e.getMessage());
    }
    /**Después de las operaciones mostramos el saldo que hay en la cuenta actualmente*/       
    saldoActual = cuenta.getEstado();
    System.out.println("El saldo actual es" + saldoActual);
}
    
}
