public class BotelOfWater extends Product {

    private int volume;

    public BotelOfWater(String name, int price) {
        super(name, price);
        
    }

    public BotelOfWater(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
        
    }

    public Object getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BotelOfWater [volume=" + volume + ", name=" + getName() +"]";
    }

    

    
}