
package main3;


public abstract class Employee extends Person implements Paid {
   int exp;
  double salary;
   String ID;

    

    public Employee(int exp, double salary, String ID, String name, String gender, int age) {
        super(name, gender, age);
        this.exp = exp;
        this.salary = salary;
        this.ID = ID;
    }

    
    
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

  
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
 

    @Override
    public void print() {
        System.out.println("Employee");
    }

    @Override
    public void paidQuantity() {
        System.out.println(this.salary);
    }

    @Override
    public String toString() {
       
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';  
    }
    
    @Override
    public String tostring(){
          return "Employee{" + "exp=" + exp + ", salary=" + salary + ", ID=" + ID + '}';
    }
    
  


    
}
