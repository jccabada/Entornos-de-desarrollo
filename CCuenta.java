package cuenta;

/**
 *
 * @author Juan Carlos Cabada
 */

/**
 * En esta class vamos a generar todas las variables y métodos
 * necesarios para crear nuestro objeto cuenta vancaria
 */

public class CCuenta {
    /**Nombre*/
    private String nombre;
    /**Cuenta*/
    private String cuenta; 
    /**Saldo*/
    private double saldo; 
    /**Tipo interes*/
    private double tipoInterés; 

    public CCuenta() {
    }
    /**Declaramos los métodos setter y geterr de la variable nombre*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**Declaramos los métodos setter y geterr de la variable cuenta*/
    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String nombre) {
        this.cuenta = nombre;
    }
    /**Declaramos los métodos setter y geterr de la variable saldo*/
    public double getEstado() {
        return saldo;
    }
    public void setEstado(double saldo) {
        this.saldo = saldo;
    }
    /**Declaramos los métodos setter y geterr de la variable tipoInterés*/
    public double getInteres() {
        return tipoInterés;
    }
    public void setInteres(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /** Método para crear una cuenta*/
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /** Método para ingresar dinero*/
    public void ingresar(double cantidad) throws Exception {
        double nuevo_saldo;
        /**comprobamos que la cantidad sea positiva*/
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        /**realizamos la operación obteniendo el nuevo salgo y modificando la variable*/
        nuevo_saldo = getEstado() + cantidad;
        setEstado(nuevo_saldo);
    }
    /** Método para retirar dinero*/
    public void retirar(double cantidad) throws Exception {
        double nuevo_saldo;
        /**comprobamos que la cantidad sea positiva*/
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        /**Comprobamos que el saldo sea suficiente*/
        if (getEstado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        /**realizamos la operación obteniendo el nuevo salgo y modificando la variable*/
        nuevo_saldo = getEstado() - cantidad;
        setEstado(nuevo_saldo);
    }
    
}
