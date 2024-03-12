public class nullPointerExp {
    public static void main(String[] args) {
        try{

            String str = null;
            int length = str.length();
            System.out.println("Length is: " + length);
        } catch(NullPointerException e){
            System.out.println("Error");
        }
    }
}
