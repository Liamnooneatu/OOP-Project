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

        //XBOX
        if (GamepassCode.equalsIgnoreCase("NBA 2K24")) {
            XBOX myXBOX = new XBOX();
            myXBOX.setCode(GamepassCode);
            myXBOX.setName("NBA 2K24");
            myXBOX.setDevoloper("Visual concepts");
            myXBOX.setPrice(90.00);
            mygamepass = myXBOX;
        }
        else if (GamepassCode.equalsIgnoreCase("Madden NFL 24")) {
            XBOX myXBOX = new XBOX();
            myXBOX.setCode(GamepassCode);
            myXBOX.setName("Madden NFL 24");
            myXBOX.setDevoloper("EA Sports");
            myXBOX.setPrice(110.00);
            mygamepass = myXBOX;
        }

        //PC
        if (GamepassCode.equalsIgnoreCase("FORTNITE")) {
            PC myPC = new PC();
            myPC.setCode(GamepassCode);
            myPC.setName("FORTNITE");
            myPC.setDevoloper("epic games ");
            myPC.setPrice(0.00);
            mygamepass = myPC;
        }
        else if (GamepassCode.equalsIgnoreCase("MINECRAFT")) {
            PC myPC = new PC();
            myPC.setCode(GamepassCode);
            myPC.setName("MINECRAFT");
            myPC.setDevoloper("Mojang studios ");
            myPC.setPrice(30.00);
            mygamepass = myPC;
        }




        return mygamepass;


    }




}
