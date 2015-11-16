
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas;
    //variable horas
    private NumberDisplay minutos;
    //variable minutos 
    private String horaAc;
    //atributo de tipo string de 5 caracteres

    /**
     * Constructor that fixes the time to 00:00
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
     * Constructor that fixes the hour to the time that you want
     */
    public ClockDisplay(int horas2, int minutos2)
    {
        horas = new NumberDisplay(24);
        horas.setValue(horas2);
        minutos = new NumberDisplay(60);
        minutos.setValue(minutos2);
        horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /**
     * Method that fixes a time that you want  
     */
    public void setTime (int horasAc, int minutosAc)
    {
        horas.setValue(horasAc);
        minutos.setValue(minutosAc);
        horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }  
    
    /**
     * Method that shows you the time
     */
    public String getTime()
    {
        return horaAc;
    }
    
    /**
     * Method that sums up a minute in the clock
     */
    public void timeTick()
    {
        if (minutos.getValue() == 59){
            minutos.increment();
            horas.increment();
            horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        }
        else{
            minutos.increment();
            horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        }
    }
}
