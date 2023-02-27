import java.text.NumberFormat;
import java.util.Locale;

public class Salesperson implements Comparable{

    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sale){
        firstName = first;
        lastName = last;
        totalSales = sale;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        return String.format("%-10s",lastName) + "," + String.format("%-5s",firstName) + " \t:" + String.format("%20s",nf.format(totalSales));
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson)other).getLastName()) && 
                    firstName.equals(((Salesperson)other).getFirstName()));
    }

    @Override
    public int compareTo(Object other) {
        int res;
        Salesperson ot = (Salesperson) other;
        
        if (totalSales < ot.totalSales) {
            res = -1;
        }else if (totalSales > ot.totalSales) {
            res =  1;
        }else{
            if (firstName.compareTo(ot.firstName) > 0) {
                res = 1;
            }else{
                res =  -1;
            }
        }
        
        return res;
    }
    
}
