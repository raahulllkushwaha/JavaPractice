// import java.util.Scanner;

class MyEmployee{
    private int  id;
    public String name;

    public MyEmployee(){
         id = 12;
         name = "Rahul";
    }
    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
public class Constructor {
 public static void main(String[] args) {
    MyEmployee emp = new MyEmployee();
    System.out.println(emp.getId());
    System.out.println(emp.getName());
 }   
}
