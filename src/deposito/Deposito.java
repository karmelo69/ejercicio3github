package deposito;

public class Deposito {    

    //Campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;

    //Constructor sin parámetros auxiliar
    /**
     *Constructor sin parámetros auxiliar 
     */
    public Deposito () { //Lo que hace es llamar al constructor con parámetros pasándole valores vacíos
        this(0,0,"");            } //Cierre del constructor


    
    /**
     * Class que pide los parámetros necesarios
     * @param valor_diametro float valor de diametro
     * @param valor_altura float valor de altura
     * @param valor_idDeposito valor de id depsito
     */
    public Deposito (float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado depósito con valores por defecto diametro 10 metros altura 5 metros id 000" );
        }   } //Cierre del constructor
    /**
     * Metodo que reseteea valores del depsito
     * @param valor_diametro float valor de diametro
     * @param valor_altura float valor de altura
     * @param valor_idDeposito valor de id depsito
     */
    public void setValoresDeposito (String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println ("Valores no admisibles. No se han establecido valores para el depósito");
            //Deposito (0.0f, 0.0f, ""); Esto no es posible. Un constructor no es un método y por tanto no podemos llamarlo
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     } //Cierre del método
/**
 * metodo para obtener el diamentro
 * @return diametro
 */
    public float getDiametro () { return diametro; } //Método de acceso
    /**
     * Metodo para obterner altura
     * @return altura
     */
    public float getAltura () { return altura; } //Método de acceso
    /**
     * Metodo para obtener deposito
     * @return deposito
     */
    public String getIdDeposito () { return idDeposito; } //Método de acceso
    /**
     * Metodo para tener el valor de la capacidad
     * @return capacidad
     */
    public float valorCapacidad () { //Método tipo función
        float capacidad;
        float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    
} 
