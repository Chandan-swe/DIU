
package diu;

public class DIU {

    public static void main(String[] args) {
      Student s1=new Student("Nosrat","1004", "978","course management","9001");
      Faculty f1= new Faculty ("FS", "9001",30000, (Student) s1);
      
      Administration a1=new Administration("RE","5001",25000, (Faculty) f1);
      
      s1.Show_info();
      f1.Show_info();
      a1.checkasSupervisor(s1, f1);
      
      a1.Show_info();
      a1.cal_salary();
      
    }
    
}
