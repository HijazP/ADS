import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.TimeZone;

public class Grader {
    private int totalHigh, totalMedium, totalLow, totalReject;
    private String rejectStatus;

    public Grader()
    {
        this.totalHigh = 0;
        this.totalMedium = 0;
        this.totalLow = 0;
        this.totalReject = 0;
    }

    public void grading(int weight, String color)
    {
        if (weight > 18 && (Objects.equals(color, "DARK_RED") || Objects.equals(color, "MEDIUM_RED")))
        {
            totalHigh++;
        }
        else if ((weight <= 18 && weight > 12) && (Objects.equals(color, "DARK_RED") || Objects.equals(color, "MEDIUM_RED")))
        {
            totalMedium++;
        }
        else if ((weight <= 12 && weight > 7) && (Objects.equals(color, "DARK_RED")))
        {
            totalLow++;
        }
        else
        {
            totalReject++;
        }
    }

    private double totalRejectRatio()
    {
        return totalReject / (double)totalStrawberry();
    }

    private int totalStrawberry()
    {
        return totalHigh + totalMedium + totalLow + totalReject;
    }

    private String conclusion()
    {
        if (totalRejectRatio() > 0.3)
        {
            rejectStatus = "REJECT";
        }
        else
        {
            rejectStatus = "ACCEPTED";
        }

        return rejectStatus;
    }

    public void printResult()
    {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'WIB' yyyy");

        df.setTimeZone(TimeZone.getDefault());

        System.out.println("***GRADING REPORT***");
        System.out.println("Container Content: " + totalStrawberry() + " Strawberry");
        System.out.println("Grading Time: " + df.format(date));
        System.out.print("\n");
        System.out.println("Grading Details");
        System.out.println("High Grade   : " + totalHigh + " Strawberry");
        System.out.println("Medium Grade : " + totalMedium + " Strawberry");
        System.out.println("Low Grade    : " + totalLow + " Strawberry");
        System.out.println("Reject       : " + totalReject + " Strawberry");
        System.out.print("\n");
        System.out.println("Rejection Ratio: " + totalRejectRatio());
        System.out.println("Conclusion " + conclusion());
    }
}