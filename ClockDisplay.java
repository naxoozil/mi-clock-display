/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;
    // Guarda el dia 
    private NumberDisplay dia;
    // Guarda el mes 
    private NumberDisplay mes;
    // Guarda el aÃ±o en 2 digitos
    private NumberDisplay ano;
    // Permite elegir si estamos en formato 12 horas(true) o 24 horas(false)
    private boolean relojDe12Horas;
    // Guarda las horas, minutos, dias, meses y años  
    private String fechaActual;

    /**
     * Crea un objeto ClockDisplay
     * Crea el objeto ClockDisplay  con hora por defecto 00:00 y fecha por defecto de 01/01/01
     * El reloj funciona en modo 12 horas si reloj24Horas es true
     * Si es false, el reloj será de 24 horas
     */
    public ClockDisplay(boolean reloj12Horas)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new NumberDisplay(31);
        mes = new NumberDisplay(13);
        ano = new NumberDisplay(99);
        dia.setValue(1);
        mes.setValue(1);
        ano.setValue(01);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue() + "-" + horaActual;
    }

    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     * Crea el obeto ClockDisplay con una fecha dada por el usuario
     * El reloj funciona en modo 12 horas si reloj24Horas es true
     * Si es false, el reloj será de 24 horas
     */
    public ClockDisplay (int horasX, int minutosX, boolean reloj12Horas, int diaX, int mesX, int anoX)
    {
        horas =   new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new NumberDisplay(31);
        mes = new NumberDisplay(13);
        ano = new NumberDisplay(99);
        horas.setValue(horasX);
        minutos.setValue(minutosX);
        dia.setValue(diaX);
        mes.setValue(mesX);
        ano.setValue(anoX);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue() + "-" + horaActual;
    }

    /**
     * Fija la hora del reloj a la hora, minutos, dias, meses y año 
     * Que el usuario desee
     */
    public void setTime(int horaY, int minutoY, int diaY, int mesY, int anoY)
    {
        horas.setValue(horaY);  
        minutos.setValue(minutoY);
        dia.setValue(diaY);
        mes.setValue(mesY);
        ano.setValue(anoY);
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue() + "-" + horaActual;
    }

    /**
     * Devuelve la fecha y hora del reloj como una cadena de 5 caracteres
     */
    public String getTime()
    {
        return fechaActual;
    }

    /**
     * Hace avanzar 1 minuto
     */
    public void timeTick()
    {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
        }
        
        if (horas.getValue() == 0) {
            dia.increment();
        }
        
        if (dia.getValue() == 0){
            dia.increment();
            mes.increment();
        }
        
        if (mes.getValue() == 0){
            mes.increment();
            ano.increment();
        }
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue() + "-" + horaActual;
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     */
    public void updateHoraActual()
    {
        if (relojDe12Horas) {
            String formato = "a.m";
            int horaAhora = horas.getValue(); 
            if (horaAhora >= 12){
                formato = "p.m.";
            }

            if (horaAhora > 12) {
                horaAhora = horaAhora - 12;
            }
            else if (horaAhora == 0) {
                horaAhora = 12;
            }
            horaActual = horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
        }
        else {
            horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();     
        }
    }
    
    /**
     * Metodo que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
        relojDe12Horas = !relojDe12Horas;
        updateHoraActual();
        fechaActual = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue() + "-" + horaActual;
    }   
}                                                                                                                                                                                                                                                                                                                                               