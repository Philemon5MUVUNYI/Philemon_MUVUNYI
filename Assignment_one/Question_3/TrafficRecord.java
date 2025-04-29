package Assignment_one.Question3;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId,String driverName,String vehiclePlate, String violationType,double fineAmount,String paymentStatus){
        this.driverId=driverId;
        this.driverName=driverName;
        this.vehiclePlate=vehiclePlate;
        this.violationType=violationType;
        this.fineAmount=fineAmount;
        this.paymentStatus=paymentStatus;

    }

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void  processPayment();
    
}
