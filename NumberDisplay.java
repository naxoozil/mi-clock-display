
/**
 * Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
Un método setter que fija el valor actual del display al valor pasado como parámetro (nombre del método: setValue).
Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres (nombre del método: getDisplayValue).
Un método que devuelve el valor actual del display como entero (nombre del método: getValue),
Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite (nombre del método: increment)
Una vez que hayas comprobado que funciona, sube el repositorio a GitHub e indica la URL del último commit como respuesta de esta actividad.
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    private int limite;
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limiteDisplay)
    {      
        display = 0;
        limite = limiteDisplay;
    }
    
    /**
     * Un método setter que fija el valor actual del display al valor pasado como parámetro
     */
    public void setValue (int valorActual) 
    {
       if (valorActual <= limite){
           display = valorActual;
       }
    }
}
