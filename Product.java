public abstract class Product {
    
public Product (String name, int price){
    this.name = name;
    this.price = price;
}

    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    public Object getVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVolume'");
    }
    public Object getTemperature() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTemperature'");
    }

    
    
}

