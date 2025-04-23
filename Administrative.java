
package main3;

 public class Administrative extends Employee {
private String rank;
private int AdministrativeNO;
private boolean Taken;


  public Administrative(String rank, int AdministrativeNO, boolean Taken,int exp, double salary, String ID, String name, String gender, int age) {
        super(exp, salary, ID, name, gender, age);
        this.rank = rank;
        this.AdministrativeNO = AdministrativeNO;
        this.Taken = Taken;
    }



    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAdministrativeNO() {
        return AdministrativeNO;
    }

    public void setAdministrativeNO(int AdministrativeNO) {
        this.AdministrativeNO = AdministrativeNO;
    }

    public boolean isTaken() {
        return Taken;
    }

    public void setTaken(boolean Taken) {
        this.Taken = Taken;
    }






    @Override
    public String tostring() {
        return "Administrative{" + "rank=" + rank + ", AdministrativeNO=" + AdministrativeNO + ", Taken=" + Taken + '}';
    }
    
    
}
