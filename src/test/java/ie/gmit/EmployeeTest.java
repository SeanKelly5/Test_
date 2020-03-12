package ie.gmit;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    void testEmployeeTitle() {

        Employee employee = new Employee("", "Sean", "87654321", "468213796", "Part-Time", "22");
}
    @Test
    void testEmployeeName(){
        Employee employee = new Employee("Mr", "", "87654321", "468213796", "Part-Time", "22");
    }
    @Test
    void testEmployeePPS() {
        Employee employee = new Employee("Mr", "Sean", "", "468213796", "Part-Time", "22");
    }
    @Test
    void testEmployeeNumber() {
        Employee employee = new Employee("Mr", "Sean", "87654321", "", "Part-Time", "22");
    }
    @Test
    void testEmployeeEtype() {
        Employee employee = new Employee("Mr", "Sean", "87654321", "468213796", "", "22");
    }
    @Test
    void testEmployeeAge(){
        Employee employee = new Employee("Mr", "Sean", "87654321", "468213796", "Part-Time", "");
      //  if(age>16){

        }
}


