import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{

private final List<Product> productList;

private int money;

    public BottleOfWaterVendingMachine(List<Product> productList) {
    this.productList = productList;
}

    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if (product.getName().equals(name)){
                money += product.getPrice();
                return product;
            }
        }        
        return null;
    }

    public BotelOfWater getProduct(String name, int volume){
        for (Product product : productList){
            if (product instanceof BotelOfWater){
                if (product.getName().equals(name) && ((BotelOfWater) product.getVolume() == volume)){
                    return (BotelOfWater) product;
                }
            }  
        }
        return null;        
    }
    
}