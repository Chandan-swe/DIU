
package diu;

public class Faculty extends Person implements IcalculateSalary{
    
    Student s1;
    double salary;
    
    Faculty(String name,String id, double salary, Student obj){
        this.name=name;
        this.id=id;
        this.salary=salary;
        s1=obj;
    }

    
    @Override
     void Show_info(){
         System.out.println("\nName of the faculty member is:"+name);
         System.out.println("faculty id: "+id);
         
         
     }
     
    @Override
     public void cal_salary(){
         
         System.out.println("your salary is: "+salary);
         
     }
     
     void showProjectStudent(Student s1){
         System.out.println("your project student id is:");
         System.out.println(""+s1.id +"\n"+s1.memberId);
     }
     
    
    
}
