public class Student extends Person {
    protected String program;
    protected int year;
    protected double fee;

    public Student(String program, int year, double fee, String name, String address) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
   return "Student{" + "name=" + name + ", address=" + address + ", program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }

   

}
