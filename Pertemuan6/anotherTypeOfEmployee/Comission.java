public class Comission extends Hourly {
    private double totalSales;
    private double comRate;

    public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comRate = comRate;
    }

    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double pay(){
        double pay = super.pay();
        pay += totalSales * comRate;
        totalSales = 0;

        return pay;
    }
    
    public String toString() {
        String res = super.toString();
        res += "\nTotal Sales : " + totalSales;

        return res;
    }
}
