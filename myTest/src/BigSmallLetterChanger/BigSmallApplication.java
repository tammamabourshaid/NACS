package BigSmallLetterChanger;

public class BigSmallApplication {
    public static void main(String[] args) {
        String text = "intake#04 is the best";

        BigSmallLetterChanger changer = new BigSmallLetterChanger();
        String changed = changer.change(text);

        System.out.println(text);
        System.out.println(changed);

       String randomlyChanged=  changer.changeRandomly(text);

        System.out.println("\n" +text);
        System.out.println(randomlyChanged);
    }
}
