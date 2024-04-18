package ie.atu;

public class GamepassDB {


    public static Gamepass getGamepass(String GamepassCode){

        Gamepass mygamepass = null;
        if (GamepassCode.equalsIgnoreCase("FIFA 23")) {
            mygamepass = new Gamepass();
            mygamepass.setCode(GamepassCode);
            mygamepass.setName("FIFA 23");
            mygamepass.setDevoloper("EA sports");
            mygamepass.setPrice(60.00);
        }
            else if (GamepassCode.equalsIgnoreCase("GTA 5")) {
                mygamepass = new Gamepass();
                mygamepass.setCode(GamepassCode);
                mygamepass.setName("GTA 5");
                mygamepass.setDevoloper("Rockstar");
                mygamepass.setPrice(80.00);

            }


            //Playstaion
        if (GamepassCode.equalsIgnoreCase("BLACK OPPS 1")) {
            Playstation myPlaystation = new Playstation();
            myPlaystation.setCode(GamepassCode);
            myPlaystation.setName("BLACK OPPS 1");
            myPlaystation.setDevoloper("Activision");
            myPlaystation.setPrice(30.00);
            mygamepass = myPlaystation;
        }
        else if (GamepassCode.equalsIgnoreCase("BLACK OPPS 2")) {
            Playstation myPlaystation = new Playstation();
            myPlaystation.setCode(GamepassCode);
            myPlaystation.setName("BLACK OPPS 2");
            myPlaystation.setDevoloper("Activision");
            myPlaystation.setPrice(50.00);
            mygamepass = myPlaystation;
        }





        return mygamepass;


    }




}
