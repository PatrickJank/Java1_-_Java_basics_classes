import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

//importing data libraries for the task 3/4.2
 class Human {
    Animal pet;
    String firstName;
    String lastName;

    private Car car;

    private Double salary = 4500.0;

    public Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Information was generated on " + dtf.format(now));
        return (this.salary);
    }
    public Double setSalary(Double value) {
        this.salary = value;
        return value;
    }
}


