public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Buch: Scala lernen");
        cart.addItem("Apfel");
        cart.addItem("Milch");

        System.out.println("Warenkorb: " + cart.getItems());
        System.out.println("Rabatt: " + cart.getDiscountPercentage() + "%");

        cart.removeItem("Buch: Scala lernen");

        System.out.println("Warenkorb nach Entfernen: " + cart.getItems());
        System.out.println("Rabatt nach Entfernen: " + cart.getDiscountPercentage() + "%");
    }
}