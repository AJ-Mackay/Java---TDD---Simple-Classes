public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int volume(){
        return this.volume;
    }

    public int drink(){
        return this.volume - 10;
    }

    public int empty(){
        return this.volume - 100;
    }

    public int full(){
        if(this.volume == 0)
          this.volume = 100;
        return this.volume;
    }
}