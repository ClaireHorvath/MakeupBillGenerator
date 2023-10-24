public class MakeupItems {
    private int price;
    private boolean discount;

    public MakeupItems(boolean discount) {
        this.discount = discount;

        if (this.discount) {
            this.price = 50;
        } else {
            this.price = 100;
        }
    }

    public void getMakeupItemsPrice() {
        System.out.println(this.price);
    }
}
