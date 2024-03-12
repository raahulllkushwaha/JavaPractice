public class stringIndexExp {
    public static void main(String[] args) {
        try{
            String str = "hello";
            char c = str.charAt(10);
            System.out.println("Character: " + c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Error");
        }
    }
}
