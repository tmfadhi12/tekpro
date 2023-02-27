public class Staff {
    StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];

        staffList[0] = new Executive("Faris", "Palembang", "555-0101", "987-65-4321", 1246.15);

        staffList[1] = new Employee("Farhan", "Garut", "555-0202", "123-45-6789", 1246.20);

        staffList[2] = new Employee("Najib", "Bandung", "555-0202", "000-45-6789", 1846.20);

        staffList[3] = new Hourly("Alimudin", "Bandung Barat", "555-2323", "123-45-3434", 34.20);

        staffList[4] = new Volunteer("Ferdi", "Jakarta", "888-2322");

        staffList[5] = new Volunteer("Sambo", "Depok", "343-5454");

        staffList[6] = new Comission("Ronaldo", "Cimahi", "08123", "1232-596-344", 6.25, 0.2);

        staffList[7] = new Comission("Messi", "Padalarang", "08323", "6453-434-565", 9.75, 0.15);

        ((Executive)staffList[0]).awardBonus(500.00);
        ((Hourly)staffList[3]).addHours(40);
        ((Hourly)staffList[6]).addHours(35);
        ((Hourly)staffList[7]).addHours(40);
        ((Comission)staffList[6]).addSales(400);
        ((Comission)staffList[7]).addSales(950);
    }

    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay(); //polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid : " + amount);
            }

            System.out.println("----------------------------------");
        }
    }
}
