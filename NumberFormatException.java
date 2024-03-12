public class NumberFormatException {
    public static void main(String[] args) {
        int invalid=0;
        int numbers, count = 0;
        for(int i=0;i<args.length;i++){
            try{
                numbers = Integer.parseInt(args[i]);
            } catch(Exception e){
                invalid = invalid + 1;
                System.out.println("Invalid value, " + args[i]);
                continue;
            }
            count = count +1;
        }
        System.out.println("Valid numbers = " +count);
        System.out.println("Invalid numbers = " + invalid);
    }
}
