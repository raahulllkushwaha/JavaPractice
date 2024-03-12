public class arithematicExp {
    public static void main(String[] args) {
        try{
            int num = 10/0;
            System.out.println("num is: " + num);
        } catch (ArithmeticException e){
            System.out.println("Error occured");
        }
    }
}
