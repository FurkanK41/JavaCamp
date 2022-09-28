public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"laptop","asus laptop",3, 2,"siyah");



        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());



    }
}
