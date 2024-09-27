package poly1;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstname, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstname, lastName, socialSecurityNumber);
        if (wage <0.0){
            throw new IllegalArgumentException("wage cannot be negative");
        }
        if (hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("hours must be between 0.0 and 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }
    public void setWages(double wage) {
        if (wage < 0.0){
            throw new IllegalArgumentException("wage cannot be negative");
        }
        this.wage = wage;
    }
    public double getWage() {return wage;}

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("hours must be between 0.0 and 168.0");
        }
        this.hours = hours;
    }
    public double getHours() {return hours;}

    @Override
    public double earnings(){
        if (getHours() <= 40){
            return getWage() + getHours();
        }
        return 40 * getWage() +(getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }

}
