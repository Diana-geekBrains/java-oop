public class HotDrink extends Product {

    private int temperature;
    private int volume;
    
    public HotDrink(String name, int price) {
        super(name, price);
        
    }
    public HotDrink(String name, int price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }
    public Object getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public Object getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "HotDrink [temperature=" + temperature + ", volume=" + volume + ", name=" + getName() +"]";
    }
    
    
}
