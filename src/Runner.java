public class Runner {
    public static void main(String[] args) {
        Data data = new Data();
        data.fillWithRandom(1000);
        data.sort(new CompareTime());
        data.draw();
        System.out.println(data);
    }
}
