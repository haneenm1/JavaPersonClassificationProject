
package main3;



public class Main3 {

   
    public static void main(String[] args) {
     Person per[]=new Person[2];
    
    per[0]=new Employee(5,2000,"09773443","ahmad","male",30) {}; 
    per[1]=new student(3,90, "school","ali","male",15) {};
     
     
        displayclassperson(per);
        
        
        
    System.out.println("*********************************************************");
     Paid paid[]=new Employee[2];
    paid[0]=new Employee(5,2000,"09773443","ahmad","male",30){};
    paid[1]=new Employee(3,1500, "2324437","ali","male",25){};
       
    
    
    
        displayclasspaid(paid);
      
      
      Academic acadimic[]=new Academic[3];
      acadimic[1]=new Teacher("math",1,"Bsc",12,2300,"244877","Mohammed","male",35);
      acadimic[0]=new student(1,90,"school","omar","male",40);
      acadimic[2]=new Teacher("math",1,"Bsc",12,2300,"244877","Mohammed","male",35);
        System.out.println("***********************************************************");
        
        
       
          sortarray(acadimic); 
         
    
    }

   public static void displayclassperson(Person[] per) {
      for(int i=0;i<per.length;i++){
          System.out.println(per[i].tostring());
      }
        }

   public static void displayclasspaid(Paid[] paid) {
         for(int i=0;i<paid.length;i++){
             System.out.println(paid[i].toString());
         }
    }

    private static void sortarray(Academic[] acadimic) {
         Academic arr[]=new Academic[acadimic.length];
         int indx=0;
         
       for(int i=0;i<acadimic.length;i++){
           if(acadimic[i].printl()=="Teacher{}" ){
               arr[indx]=acadimic[i];
               indx++;
              
           
           }}
           for(int i=0;i<acadimic.length;i++){
               if(acadimic[i].printl()=="student{}")
               arr[indx]=acadimic[i];
               indx++;
           }
       
       
      for(int i=0;i<acadimic.length;i++){
          System.out.println(arr[i].tostring());
      } 
     
    }

   
   }
  
    

