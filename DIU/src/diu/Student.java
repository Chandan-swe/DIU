
package diu;

public class Student extends Person {
   
    String memberId;
    String projectTopic;
    String supervisorId;
    
    
    
    
    Student(String name,String id, String memberId, String projectTopic,String supervisorId ){
        this.name=name;
        this.id=id;
        this.memberId=memberId;
        this.projectTopic=projectTopic;
        this.supervisorId=supervisorId;
        
        
        
    }
    @Override
     void Show_info(){
System.out.println("Name of the student is:"+name);
System.out.println("Student ID is:"+id);
System.out.println("group member id:"+memberId);
System.out.println("project topic is: "+projectTopic);
System.out.println("assigned faculty id as a project supervisor: "+supervisorId);
     }
     
}
