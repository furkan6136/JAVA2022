package classesWithAttributes;
public class Main {
//https://www.youtube.com/watch?v=EoXqaSX9nrc&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=32
    public static void main(String[] args) {
    	
        Product product=new Product(1,"Laptop","Asus Laptop",5000,3,"blue");
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("");
        ProductManager productManager=new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
        
        
    }
}
