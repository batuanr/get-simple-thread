public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("count1");
        NumberGenerator num2 = new NumberGenerator("count2");
//        num1.getThread().start();
//        num2.getThread().start();
        num1.getThread().setPriority(Thread.MAX_PRIORITY);
        num2.getThread().setPriority(Thread.MIN_PRIORITY);
        num1.getThread().start();
        num2.getThread().start();
    }
}
