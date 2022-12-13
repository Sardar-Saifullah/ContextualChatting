public class Staff extends Person {
 protected String school;
 protected double pay;

    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + name + ", address=" + address + " ,school=" + school + ", pay=" + pay + '}';
    }
 
    
}
