
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
    private String amOPm;
    /**
     * Constructor that fixes the time to 00:00
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        minutos.setValue(0);
        horaAc = "12:00 am";
    }

    /**
     * Constructor that fixes the hour to the time that you want
     */
    public ClockDisplay(int horas2, int minutos2, String amOPmAc)
    {
        if (horas2 > 12){
            horas2 = horas2 - 12;
            amOPmAc = "pm";
        }    
        horas = new NumberDisplay(24);
        horas.setValue(horas2);
        minutos = new NumberDisplay(60);
        minutos.setValue(minutos2);
        amOPm = amOPmAc;
        horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + amOPm;
    }
    
    /**
     * Method that fixes a time that you want  
     */
    public void setTime (int horas3, int minutos3)
    {
        if (horas3 > 12){
            horas3 = horas3 - 12;
            minutos.setValue(minutos3);
            amOPm = "pm";
        }
        else if (horas3 == 12 && minutos3 == 0){
            horas.setValue(horas3);
            minutos.setValue(minutos3);
            horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " m";
        }
        else if (horas3 < 12){
            horas.setValue(horas3);
            minutos.setValue(minutos3);
            horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " am";
        }
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
        if (minutos3 == 59 && horas3 < 11 ) {
            minutos.increment();
            horas.increment();
            horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + amOPm ;
        }
        else if( minutos3() == 59 && horas3 = 11){
            horas++;
            minutos = 0;
            horaAc = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " m";
        }
    }
    }

