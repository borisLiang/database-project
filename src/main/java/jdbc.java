
import org.json.*;

import java.io.*;
import java.sql.*;
import java.util.*;
//import oracle.simplefan.*;
/**
 * This is a simple example that demostrates how to open a database
 * connection before we are trying to execute SQL statements, and
 * close a database connection when we are done. You can build your
 * code using this example as a skeleton.
 */
public class jdbc {
    static Connection con = null;
    public static void main(String args[]) {
        jdbc example = new jdbc();
        example.run();

    }

    public void run() {
        try {
            con = openConnection();
            File user_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/yelp_user.json");
            File bus_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/small_yelp_business.json");
            File review_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/small_yelp_review.json");
            BufferedReader reader = null;
            try {
//                insertData("INSERT INTO yelp_user( user_id) values ('jjj')");
                BufferedReader reader1 = new BufferedReader(new FileReader(user_file));
                BufferedReader reader2 = new BufferedReader(new FileReader(bus_file));
                BufferedReader reader3 = new BufferedReader(new FileReader(review_file));
                User_Builder(reader1);
                Bus_Builder(reader2);
                Review_Builder(reader3);
                reader1.close();
                reader2.close();
                reader3.close();
            }
            catch(FileNotFoundException e) {e.printStackTrace();}
            catch(IOException e) {e.printStackTrace();}
            catch(Exception e) {e.printStackTrace();}
        } catch (SQLException e) {
            System.err.println("Errors occurs when communicating with the database server: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot find the database driver");
        } finally {
            // Never forget to close database connection
            closeConnection();
        }
    }

    public static void insertData(String insertStm) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(insertStm);
        System.out.println("Inserting Data ...");
        System.out.println(insertStm);
//        Boolean isResultSet = stmt.execute("select * from yelp_user");
//        if (isResultSet) {
//            ResultSet rs = stmt.getResultSet();
//            System.out.println(rs);
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();
//            System.out.println(rs.next());
//            while (rs.next()) {
//                for (int i = 1; i <= columnsNumber; i++) {
//                    if (i > 1) System.out.print(" | ");
//                    System.out.print(rs.getString(i));
//                }
//                System.out.println("");
//            }
//        }
        stmt.executeUpdate(insertStm);


        stmt.close();
    }
    private void dropTable() throws SQLException {
        System.out.print("Dropping all tables...");
        PreparedStatement create = con.prepareStatement("DROP TABLE bus_cat");
    }

    /**
     *
     * @return a database connection
     * @throws SQLException when there is an error when trying to connect database
     * @throws ClassNotFoundException when the database driver is not found.
     */
    private Connection openConnection() throws SQLException, ClassNotFoundException {
        // Load the Oracle database driver
//        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

        /*
    Here is the information needed when connecting to a database
    server. These values are now hard-coded in the program. In
        general, they should be stored in some configuration file and
        read at run time.
        */
        String host = "127.0.0.1";
        String port = "1521";
        String dbName = "orcl";
        String userName = "hr";
        String password = "oracle";

        // Construct the JDBC URL
        String dbURL = "jdbc:oracle:thin:@" + host + ":" + port + "/" + dbName;
        return DriverManager.getConnection(dbURL, userName, password);
    }

    /**
     * Close the database connection
     * @param con
     */
    private void closeConnection() {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println("Cannot close connection: " + e.getMessage());
        }
    }

    private static void User_Builder(BufferedReader reader) throws Exception {
        String text = null;
//        insertData("delete from yelp_user");
        while ((text = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(text);
            String yelp_since =     obj.getString("yelping_since");
            Integer votes =         obj.getJSONObject("votes").getInt("funny") +
                    obj.getJSONObject("votes").getInt("useful") +
                    obj.getJSONObject("votes").getInt("cool");
            Integer review_count =  obj.getInt("review_count");//.get("review_count");
            String name =           obj.getString("name");
            String user_id =        obj.getString("user_id");
            Integer num_friends =   obj.getJSONArray("friends").length();
            Double average_stars =  obj.getDouble("average_stars");

            StringBuilder stm = new StringBuilder();
//            String stm = "";
            stm.append("INSERT INTO yelp_user ");
            stm.append("(yelp_since, num_votes, review_count, name, user_id, num_friends, average_star)");
            stm.append(" values (");
            stm.append("TO_DATE('");
            stm.append(yelp_since  + "'" + ", ");
            stm.append("'YYYY-MM'), ");
            stm.append("'" + votes + "'" + ", ");
            stm.append("'" + review_count.toString()+ "'"  + ", ");
            stm.append("'" + name + "'" + ", ");
            stm.append("'" + user_id  + "'" + ", ");
            stm.append("'" + num_friends.toString() + "'" + ", ");
            stm.append("'" + average_stars.toString()+ "'" );
            stm.append(")");
//            System.out.println(stm.toString());
//            insertData(stm.toString());

        }
    }
    private static void Bus_Builder(BufferedReader reader) throws Exception {

        String text = null;
        while ((text = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(text);
            String business_id = obj.getString("business_id");
            Boolean open = obj.getBoolean("open");
            String category = obj.getJSONArray("categories").toString();
            String state = obj.getString("state");
            Integer review_count = obj.getInt("review_count");
            String city = obj.getString("city");
            Double stars = obj.getDouble("stars");
            String name = obj.getString("name").replace("'", "''");
            String attributes = obj.getJSONObject("attributes").toString();

            StringBuilder stm = new StringBuilder();
            stm.append("INSERT INTO bus");
            stm.append("(business_id, open, category, state, review_count, city, stars, name, attributes)");
            stm.append("values (");
            stm.append("'" +business_id + "'" + ", ");
            stm.append("'" +open.toString() + "'"  + ", ");
            stm.append("'" +category + "'"  + ", ");
            stm.append("'" +state + "'"  + ", ");
            stm.append( review_count.toString() + "'"  + ", ");
            stm.append("'" +city + "'"  + ", ");
            stm.append("'" +stars.toString() + "'"  + ", ");
            stm.append("'" +name + "'"  + ", ");
            stm.append("'" +attributes + "'");
            stm.append( ")");
//            System.out.println(stm.toString());
            insertData(stm.toString());
        }
    }
    private static void Review_Builder(BufferedReader reader) throws Exception {


        String text = null;
        while ((text = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(text);

            Integer num_votes = obj.getJSONObject("votes").getInt("funny") +
                    obj.getJSONObject("votes").getInt("useful") +
                    obj.getJSONObject("votes").getInt("cool");
            String user_id = obj.getString("user_id");
            String review_id = obj.getString("review_id");
            Double stars = obj.getDouble("stars");
            String publish_date = obj.getString("date");
            String main_text = obj.getString("text").replace("'", "''");
            String business_id = obj.getString("business_id");


            StringBuilder stm = new StringBuilder();
            stm.append("INSERT INTO review");
            stm.append("(num_votes, user_id, review_id, stars,"
                    + " publish_date, main_text, business_id)");
            stm.append("values (");
            stm.append(num_votes + ", ");
            stm.append(user_id + ", ");
            stm.append(review_id + ", ");
            stm.append(stars.toString() + ", ");
            stm.append(publish_date + ", ");
            stm.append(main_text + ", ");
            stm.append(business_id + ", ");
            stm.append(")");
//            jdbc.insertData(stm.toString());

//            System.out.println(stm.toString());
        }
    }
}



