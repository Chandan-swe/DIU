
package diu;

public class Administration extends Person implements IcalculateSalary {
    
    Faculty f1;
    
    double salary;
    
    Administration(String name,String id,double salary, Faculty obj){
        this.name=name;
        this.id=id;
        this.salary=salary;
        
        f1=obj;
    }
    @Override
     void Show_info(){
         System.out.println("\n---------------------------------------");
     System.out.println("Name of the administrator is:"+name);
     System.out.println("admistrator id :"+id);
         
     }
     
     public void cal_salary(){
         
         System.out.println("salary is: "+salary);
         
     }
    
     
     void checkasSupervisor(Student s1, Faculty f1){
        if(s1.supervisorId.equals(f1.id)){
            System.out.println("Mr/Mrs " +f1.name+" assigned as a Project Supervisor so, you will apporved to salary");
            f1.showProjectStudent(s1);
            
            f1.cal_salary();
        }
        else{
            System.out.println("Mr/Mrs " +f1.name+" is not assigned a project supervisor"+"\nso, you will not apporoved to salary");
        }
    }
}
