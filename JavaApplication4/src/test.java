
public class test {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(3);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
 
        System.out.println("tv1's channel is  and volume level is " );
        System.out.println("");
        System.out.println("tv2's channel is    and volume level is " );
    }
}

