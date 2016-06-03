package nightglyuk.gojavaonline.task2;

public class Temperature {
    public double amountOfDegrees;
    public boolean isFarenheit;
    private double trancfereMethod (double Temperature,boolean isFarenheit) {
        if (isFarenheit) {
            Temperature = 9 / 5 * Temperature + 32;
            isFarenheit=false;}
        else
        {
            Temperature= 5/9*(Temperature-32);
            isFarenheit=true;
        }
        return Temperature;
    }
}
