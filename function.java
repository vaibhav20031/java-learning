public class function {
    public static void main(String[] args) {
        function obj = new function();
        int ans = obj.add(1, 2);
        System.out.println(ans);
    }

    public int add(int num1, int num2) {
        int ans = num1 + num2;
        return ans;
    }
}
