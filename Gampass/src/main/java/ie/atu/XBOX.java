package ie.atu;

public class XBOX extends Gamepass{

    private String version;


    public XBOX(){
        super();
        version =  "XBOX Series x";
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
