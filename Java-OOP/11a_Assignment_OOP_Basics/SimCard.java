public class SimCard {
    private String mobileNumber;
    private String ownerName;
    private double balance;
    private String planName;
    static int totalSims = 0;
    static final String OPERATOR_NAME = "Airtel";

    // 6. Static block
    static {
        System.out.println("QuickTel system loaded...");
    }

    // Constructors + this keyword
    SimCard() {
        this("0000000000", "Unknown", 0, "Basic");
    }

    SimCard(String mobileNumber, String ownerName) {
        this(mobileNumber, ownerName, 0, "Basic");
    }

    SimCard(String mobileNumber, String ownerName, double balance, String planName) {
        this.mobileNumber = mobileNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.planName = planName;
        totalSims++;
    }

    // Getters & Setters
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Enter Corrected Balance");
            return;
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 10) {
            System.out.println("Invalid Mobaile Number");
            return;
        }
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public String getPlanName() {
        return planName;
    }

    // Method Overloading - recharge()
    public void recharge(double amount) {
        setBalance(amount);
        System.out.println("Balance Added");
    }

    public void recharge(double amount, String planName) {
        setBalance(amount);
        this.planName = planName;
        System.out.println("Balance Added and Plan Nmae Set");
    }

    public void recharge(int packs, double perPackPrice) {
        double totalBalance = this.balance + (packs * perPackPrice);
        System.out.println("total balance" + totalBalance);
    }

    // Methods
    void makeCall(int minutes) {
        if (getBalance() < minutes * 1.5) {
            System.out.println("Insufficient balance");
        } else {
            double currentBalance = getBalance() - minutes * 1.5;
            setBalance(currentBalance);
            System.out.println("Your Current balance" + currentBalance);
        }
    }

    void showDetails() {
        System.out.println("Number: " + this.mobileNumber + " | Owner: " + this.ownerName + "  | Plan: " + this.planName
                + " | Balance: " + this.balance);
    }

    void showTotalSims() {
        System.out.println("Total Sims : " + totalSims);
    }

}
