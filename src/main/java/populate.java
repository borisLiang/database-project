
import org.json.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.sql.Date;
//import oracle.simplefan.*;
/**
 * This is a simple example that demostrates how to open a database
 * connection before we are trying to execute SQL statements, and
 * close a database connection when we are done. You can build your
 * code using this example as a skeleton.
 */
public class populate {
    static Connection con = null;
    public static void main(String args[]) {
        populate example = new populate();
        example.run();

    }

    public void run() {
        try {
            con = openConnection();
            File user_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/yelp_user.json");
            File bus_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/yelp_business.json");
            File review_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/yelp_review.json");
            BufferedReader reader = null;
            try {

                BufferedReader reader1 = new BufferedReader(new FileReader(user_file));
                BufferedReader reader2 = new BufferedReader(new FileReader(bus_file));
                BufferedReader reader3 = new BufferedReader(new FileReader(review_file));
//                User_Builder(reader1);
//                Bus_Builder(reader2);
//                Review_Builder(reader3);
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

    public static void executeQuery(String insertStm) throws SQLException {
        Statement stmt = con.createStatement();
        System.out.println("You want to " + insertStm + " ? Let me see what I can do.");
        try {
            stmt.executeUpdate(insertStm);

        } catch (SQLException e) {
            System.out.println("Sorry! Cant do that");
            System.out.println(e);
        }
        System.out.println("Successful!");
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
        executeQuery("delete from yelp_user");
        System.out.println("Inserting Data into yelp_user. Please Wait...");
        while ((text = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(text);

            //----------------------------------------------------------------------------

            Date date1 = Date.valueOf(obj.getString("yelping_since") + "-01");
            Integer votes =         obj.getJSONObject("votes").getInt("funny") +
                    obj.getJSONObject("votes").getInt("useful") +
                    obj.getJSONObject("votes").getInt("cool");
            Integer review_count =  obj.getInt("review_count");//.get("review_count");
            String name =           obj.getString("name").replace("'", "''");
            String user_id =        obj.getString("user_id");
            Integer num_friends =   obj.getJSONArray("friends").length();
            Double average_stars =  obj.getDouble("average_stars");

            //----------------------------------------------------------------------------
            String stm = "INSERT INTO yelp_user values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(stm);
            // 7 columns:
            ps.setDate(1,  date1);
            ps.setInt(2, votes);
            ps.setInt(3, review_count);
            ps.setString(4, name);
            ps.setString(5, user_id);
            ps.setInt(6, num_friends);
            ps.setDouble(7, average_stars);

            //----------------------------------------------------------------------------
            ps.execute();
            ps.close();
        }

        System.out.println("You have now inserted All data into yelp_user!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    private static void Bus_Builder(BufferedReader reader) throws Exception {
        executeQuery("delete from mainCat");
        executeQuery("delete from subCat");
        executeQuery("delete from attr");
        executeQuery("delete from bus");

        String text = null;
        System.out.println("Inserting Data into bus & mainCat & subCat & attr. Please Wait...");
        while ((text = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(text);
            //----------------------------------------------------------------------------
            String business_id = obj.getString("business_id");
            boolean open = obj.getBoolean("open");
            String openStr = open ? "true" : "false";
            List<Object> categories = obj.getJSONArray("categories").toList();
            String state = obj.getString("state");
            Integer review_count = obj.getInt("review_count");
            String city = obj.getString("city");
            Double stars = obj.getDouble("stars");
            String name = obj.getString("name").replace("'", "''").replace(","," ");
            Map<String, Object> attributes = obj.getJSONObject("attributes").toMap();
            //----------------------------------------------------------------------------
            String stm1 = "INSERT INTO bus values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(stm1);
            // 7 columns:
            ps.setString(1, business_id);
            ps.setString(2, openStr);
            ps.setString(3, state);
            ps.setDouble(4, review_count);
            ps.setString(5, city);
            ps.setDouble(6, stars);
            ps.setString(7, name);
            //----------------------------------------------------------------------------
            ps.execute();
            ps.close();
            Category_Builder(categories, business_id);
            Atribute_Builder(attributes, business_id);
        }
        System.out.println("You have now inserted All data into bus!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    private static void Review_Builder(BufferedReader reader) throws Exception {
        executeQuery("delete from review");
        String text = null;
        System.out.println("Inserting Data into review. Please Wait...");
        Integer count = 0;
        while ((text = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(text);
            //----------------------------------------------------------------------------
            Integer num_votes = obj.getJSONObject("votes").getInt("funny") +
                    obj.getJSONObject("votes").getInt("useful") +
                    obj.getJSONObject("votes").getInt("cool");
            String user_id = obj.getString("user_id");
            String review_id = obj.getString("review_id");
            Double stars = obj.getDouble("stars");
            String publish_date = obj.getString("date");
            Date date1 = Date.valueOf(publish_date);
            String main_text = obj.getString("text").replace("'", "''");
            String business_id = obj.getString("business_id");
            //----------------------------------------------------------------------------
            String stm1 = "INSERT INTO review values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(stm1);
            // 7 columns:
            ps.setInt(1, num_votes);
            ps.setString(2, user_id);
            ps.setString(3, review_id);
            ps.setDouble(4, stars);
            ps.setDate(5,  date1);
            ps.setString(6, main_text);
            ps.setString(7, business_id);

            //----------------------------------------------------------------------------
//            count ++;
//            System.out.println(count.toString() + "/826190 review inserted");
            ps.execute();
            ps.close();
        }
        System.out.println("You have now inserted All data into review!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    private static void Category_Builder(List<Object> categories, String business_id) throws SQLException {
        Set<String> catSet = new HashSet<>();
        catSet.add("Active Life");
        catSet.add("Arts & Entertainment");
        catSet.add("Automotive");
        catSet.add("Car Rental");
        catSet.add("Cafes");
        catSet.add("Beauty & Spas");
        catSet.add("Convenience Stores");
        catSet.add("Dentists");
        catSet.add("Doctors");
        catSet.add("Drugstores");
        catSet.add("Department Stores");
        catSet.add("Education");
        catSet.add("Event Planning & Services");
        catSet.add("Flowers & Gifts");
        catSet.add("Food");
        catSet.add("Hardware Stores");
        catSet.add("Health & Medical");
        catSet.add("Home Services");
        catSet.add("Home & Garden");
        catSet.add("Hospitals");
        catSet.add("Hotels & Travel");
        catSet.add("Grocery");
        catSet.add("Medical Centers");
        catSet.add("Nurseries & Gardening");
        catSet.add("Nightlife");
        catSet.add("Restaurants");
        catSet.add("Shopping");
        catSet.add("Transportation");

//        System.out.println("Inserting Data into mainCat & subCat. Please Wait...");
        for (Object i : categories) {
            String iStr = i.toString();
//            System.out.println(iStr);
            if (catSet.contains(iStr)){
                String stm = "INSERT INTO mainCat VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(stm);
                ps.setString(1, iStr);
                ps.setString(2, business_id);
                ps.execute();
                ps.close();
            } else {
                String stm = "INSERT INTO subCat VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(stm);
                ps.setString(1, iStr);
                ps.setString(2, business_id);
                ps.execute();
                ps.close();
            }
        }

    }

    private static void Atribute_Builder(Map<String, Object> map, String business_id) throws SQLException{
//        System.out.println(Arrays.toString(map.entrySet().toArray()));
        String stm = "INSERT INTO attr VALUES (?, ?)";

        for (String everyKey : map.keySet()) {
            Object value = map.get(everyKey);

            //attributes has 4 types: int, String, boolean and HashMap
            // if it is HashMap, dig further
            // else: toString
            if (value instanceof HashMap){
                Map<String, Object> newMap = new HashMap<String, Object>((HashMap)value);
                for (String everyKey2 : newMap.keySet()) {
                    Object value1 = newMap.get(everyKey2);
                    String valueStr = value1.toString();
                    PreparedStatement ps = con.prepareStatement(stm);
                    ps.setString(2, business_id);
                    ps.setString(1, everyKey + " " + everyKey2 + " : " + valueStr);

//                    System.out.println(everyKey + " " + everyKey2 + " : " + valueStr);
                    ps.execute();
                    ps.close();

                }
            } else {
                String valueStr = value.toString();
                PreparedStatement ps = con.prepareStatement(stm);
                ps.setString(2, business_id);
                ps.setString(1, everyKey + " : " + valueStr);
//                System.out.println(everyKey + " : " + valueStr);
                ps.execute();
                ps.close();
            }
        }


    }
}




