public class TV{

    public int channel;
    public int volume;
    public boolean on;

    TV(){
        channel=1;
        volume=4;
        on=false;
    }

    TV(int newChannel, int newVolume, boolean newOn){
        channel=newChannel; volume=newVolume; on=newOn;
    }

    void turnOn(){
        on=true;
    }

    void turnOff(){
        on=false;
    }

    void setChannel(int newChannel){
        if(newChannel>120||newChannel<1) System.out.println("The range of channels is 1 to 120");
        else channel=newChannel;
    }

    void setVolume(int newVolume){
        if(newVolume>7){ volume=7; System.out.println("The max volume is 7");}
        else volume=newVolume;
    }

    void channelUp(){
        if(channel<120) channel++;
        else channel=1;
    }

    void channelDown(){
        if(channel>1) channel--;
        else channel=120;
    }

    void volumeUp(){
        if(volume<7) volume++;
    }

    void volumeDown(){
        if(volume>0) volume--;
    }

    public String Status(){
        return "Channel: "+channel+" Volume: "+volume+" TV is on: "+on;
    }

    public void showStatus(){
        System.out.println(Status());
    }

}