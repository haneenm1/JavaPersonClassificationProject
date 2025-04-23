
package main3;




 public class Teacher extends Employee implements Academic {
    private String subject;
    private int teacherNo;
   private String degree;

    public Teacher(String subject, int teacherNo, String degree, int exp, double salary, String ID, String name, String gender, int age) {
        super(exp, salary, ID, name, gender, age);
        this.subject = subject;
        this.teacherNo = teacherNo;
        this.degree = degree;
    }


  
   


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeachrNo() {
        return teacherNo;
    }

    public void setTeacherNo(int teacNo) {
        this.teacherNo = teacNo;
    }
    

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

  
    @Override
    public String tostring(){
       return "Teacher{" + "subject=" + subject + ", teacherNo=" + teacherNo + ", degree=" + degree + '}';  
    }

    @Override
    public String printl(){
        return "Teacher{"+'}';  
    }



 
    
    
}
 