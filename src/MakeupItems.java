public class MakeupItems {
    private int price;
    private boolean discount;
    private int addedMakeupItem = 40;

    public MakeupItems(boolean discount) {
        this.discount = discount;

        if (this.discount) {
            this.price = 50;
        } else {
            this.price = 100;
        }
    }

    public void addFreeSample() {
        System.out.println("Free sample added, enjoy!");
    }

    public void addMakeupItem() {
        System.out.println("Item added to cart!");
        this.price += addedMakeupItem;
    }

    public void getBill() {
        System.out.println(this.price);
    }

//    public void getMakeupItemsPrice() {
//        System.out.println(this.price);
//    }
}
