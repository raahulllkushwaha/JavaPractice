// import java.util.Scanner;

class MyEmployee {

    private int id;
    public String name;

    public MyEmployee() {
        id = 78;
        name = "Rahul";
    }

    public MyEmployee(String myName) {
        id = 12;
        name = myName;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
        MyEmployee emp = new MyEmployee("Rahul Kushwaha");

        System.out.println(emp.getId());
        System.out.println(emp.getName());

        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
    }
}
