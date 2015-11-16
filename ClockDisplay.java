
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    private String horaAc; 

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        horas.setValue(0);
        minutos = new NumberDisplay(60);
        minutos.setValue(0);
        horaAc = "00:00";
    }

    /**
     * 
     */
    public ClockDisplay(int horas2, int minutos2)
    {
        horas = new NumberDisplay(24);
        horas.setValue(horas2);
        minutos = new NumberDisplay(60);
        minutos.setValue(minutos2);
        horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    public void setTime (int horasAc, int minutosAc)
    {
        horas.setValue(horasAc);
        minutos.setValue(minutosAc);
        horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }  
    
    public String getTime()
    {
        return horaAc;
    }
}
