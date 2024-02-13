import java.util.Scanner;

class showResult {
    //Student 1 information
    String Stu1Name;
    int marks1[]= new int[5];
    public String getStu1Name() {
        return Stu1Name;
    }

    public void setStu1Name(String stu1Name) {
        Stu1Name = stu1Name;
    }

    //Student 2 information
    String Stu2Name;
    int marks2[]= new int[5];
    public String getStu2Name() {
        return Stu2Name;
    }

    public void setStu2Name(String stu2Name) {
        Stu2Name = stu2Name;
    }

    //Student 3 information
    String Stu3Name;
    int marks3[]= new int[5];
    public String getStu3Name() {
        return Stu3Name;
    }

    public void setStu3Name(String stu3Name) {
        Stu3Name = stu3Name;
    }

    //Student 4 information
    String Stu4Name;
    int marks4[]= new int[5];
    public String getStu4Name() {
        return Stu4Name;
    }

    public void setStu4Name(String stu4Name) {
        Stu4Name = stu4Name;
    }

    //Student 5 information
    String Stu5Name;
    int marks5[]= new int[5];
    public String getStu5Name() {
        return Stu5Name;
    }

    public void setStu5Name(String stu5Name) {
        Stu5Name = stu5Name;
    }

   

}

public class result {
    public static void main(String[] args) {
        showResult result = new showResult();
        result.setStu1Name("Rahul");
        System.out.println(result.getStu1Name());

        result.setStu2Name("Abhishek");
        System.out.println(result.getStu2Name());

        result.setStu3Name("Sambhhav");
        System.out.println(result.getStu3Name());

        result.setStu4Name("Prem");
        System.out.println(result.getStu4Name());

        result.setStu5Name("Yash");
        System.out.println(result.getStu5Name());
    }
}
