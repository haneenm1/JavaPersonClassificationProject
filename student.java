
package main3;

public class student extends Person implements Academic{
    private int studentNo;
    private double rate;
    private String degree ;

   

    public student(int studentNo, double rate, String degree, String name, String gender, int age) {
        super(name, gender, age);
        this.studentNo = studentNo;
        this.rate = rate;
        this.degree = degree;
    }
    

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String tostring() {
         return "student{" + "studentNo=" + studentNo + ", rate=" + rate + ", degree=" + degree + '}';
    }


    @Override
    public String printl() {
       return "student{"+'}'; 
    }

  
    

   
    
    
}
