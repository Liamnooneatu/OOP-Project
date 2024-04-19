package ie.atu;

import java.sql.*;
import java.util.Scanner;

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

    public void main(String[] args)throws SQLException{

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gamepass", "root", "password");

        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO game (Title,Description,Cost,size_GB,Release_Date,Rating,Original_Language,Platform) VALUES (?,?,?,?,?,?,?,?)");

            Scanner scanner = new Scanner(System.in);

            stmt.setString(1,name);
            stmt.setString(2,description);
            stmt.setString(3,cost);
            stmt.setString(4,sizeGb);
            stmt.setString(5,releaseDate);
            stmt.setString(6,rating);
            stmt.setString(7,language);
            stmt.setString(8,version);
            stmt.executeUpdate();

            System.out.println("Insert completed successfully");
        } catch(SQLException ex){
            System.out.println("Record insert failed");
            ex.printStackTrace();
        }
        conn.close();
    }

    private static int getLastInsertId(Connection conn) throws SQLException{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
        rs.next();
        int id = rs.getInt(1);
        rs.close();
        stmt.close();
        return id;
    }
}
