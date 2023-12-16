public class TVtest{
    
    public static void main(String[] args) {
        TV samsung=new TV(85, 6, false);

        TV LG=new TV();

        TV Apple=new TV(45, 3, true);

        System.out.println("Samsung TV status:");
        samsung.showStatus();

        System.out.println("LG TV status:");
        LG.showStatus();

        System.out.println("Apple TV status:");
        Apple.showStatus();

        samsung.channelDown();
        LG.channelUp();
        Apple.volumeDown();

        System.out.println();        
        System.out.println("Samsung TV status:");
        samsung.showStatus();

        System.out.println("LG TV status:");
        LG.showStatus();

        System.out.println("Apple TV status:");
        Apple.showStatus();

        samsung.turnOn();
        LG.turnOn();
        Apple.turnOff();

        System.out.println();
        System.out.println("Samsung TV status:");
        samsung.showStatus();

        System.out.println("LG TV status:");
        LG.showStatus();

        System.out.println("Apple TV status:");
        Apple.showStatus();


    }
}