public class Main {
    public static void main(String[] args) {
        Rectangle my_rect = new Rectangle(new Point(5, 5), new Point(1, 1));
        my_rect.showData();
        my_rect = new Rectangle();
        my_rect.showData();
        my_rect = new Rectangle(10, 10, 0, 5);
        my_rect.showData();

        my_rect.move(10, 10);
        my_rect.showData();
        my_rect = new Rectangle(10, -30, -50, -100);
        my_rect.showData();

    }


}