package ie.atu;

public class PC extends Gamepass{
    private String version;


    public PC(){
        super();
        version =  "PC ";
        count++;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public String toString() {
        return super.toString() + "The device is a " + version;
    }


}
