package day20_Recursion10;

class frogProblem {

    static int FrogProblem(int[] arr, int i) {
        if (i == arr.length - 1)
            return 0;
        if (i == arr.length - 2)
            return Math.abs(arr[i] - arr[i + 1]);

        int singleJump = Math.abs(arr[i] - arr[i + 1]);
        int doubleJump = Math.abs(arr[i] - arr[i + 2]);
        if (singleJump < doubleJump)
            return FrogProblem(arr, i + 1) + singleJump;
        else
            return FrogProblem(arr, i + 2) + doubleJump;
    }

    public static void main(String[] args) {

        int[] kp = { 10, 30, 40, 20 };
        System.out.println(FrogProblem(kp, 0));

    }
}