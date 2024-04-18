package ie.atu;

public class Playstation extends Gamepass{

    private String version;

    public Playstation(){
        super();
        version =  "PlayStation 5";
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
        return super.toString() + "console is " + version;
    }


}
