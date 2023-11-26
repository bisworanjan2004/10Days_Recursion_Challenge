package day20_Recursion10;

public class combination {
    static void combination(String dig, String[] kp, String res) {
        if (dig.length() == 0) {
            System.out.println(res + " ");
            return;
        }
        int currName = dig.charAt(0) - '0';
        String currChoice = kp[currName];
        for (int i = 0; i < currChoice.length(); i++) {
            combination(dig.substring(1), kp, res + currChoice.charAt(i));
        }

        dig.charAt(0);
    }

    public static void main(String[] args) {
        String s = "23";
        String[] kp = { " ", " ", "abc", "def" };
        combination(s, kp, " ");
    }
}
