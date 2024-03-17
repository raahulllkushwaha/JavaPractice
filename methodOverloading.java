class Student {
    public String name;
    private int age;

   
    public Student() {
        age = 12;
        name = "Rahul";
    }

    public Student(String myName){
        age=19;
        name=myName;
    }
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu = new Student("Rahul");
        
        System.out.println("Name: " + stu1.getName());
        System.out.println("Age: " + stu1.getAge());

        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());

    }
}