public class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
        System.out.println("count=" + count);
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();
        StaticDemo s3 = new StaticDemo();
    }
}
