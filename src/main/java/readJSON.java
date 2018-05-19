import java.io.*;
import java.util.*;
import java.util.List;

import org.json.*;
import org.json.JSONObject;
import org.json.JSONString;
//import org.json.simple.parser.ParseException;


    public class readJSON {
    public static void main(String[] args) {
        File user_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/small_yelp_user.json");
        File bus_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/small_yelp_business.json");
        File review_file = new File("/Users/bliang/GoogleDrive/SCU_Courses/COEN280Database/hw/HW3/YelpDataset/small_yelp_review.json");
        BufferedReader reader = null;
        try {
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
    }


    private static void User_Builder(BufferedReader reader) throws Exception {
        String text = null;
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


            String stm = "";
            stm += "INSERT INTO yelp_user";
            stm += "(yelp_since, num_voters, review_count, name, user_id, average_star)";
            stm +=  "values (";
            stm += yelp_since + ", ";
            stm += votes + ", ";
            stm += review_count.toString() + ", ";
            stm += name + ", ";
            stm += user_id  + ", ";
            stm += num_friends.toString() + ", ";
            stm += average_stars.toString();
            stm += ");\n";
            System.out.println(stm);
        }
    }
    private static String MainCategory(JSONArray categories) {
        System.out.println(categories.toString());
        List<Object> arrList = categories.toList();
        Set<String> mainCat = new HashSet<String>();
        mainCat.add("Active Life");
        return "";
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
            String name = obj.getString("name");
            String attributes = obj.getJSONObject("attributes").toString();

            StringBuilder stm = new StringBuilder();
            stm.append("INSERT INTO bus");
            stm.append("(business_id, open, category, state, review_count, city, stars, name, attributes)");
            stm.append("values (");
            stm.append(business_id + ", ");
            stm.append(open.toString() + ", ");
            stm.append(category + ", ");
            stm.append(state + ", ");
            stm.append(review_count.toString() + ", ");
            stm.append(city + ", ");
            stm.append(stars.toString() + ", ");
            stm.append(name + ", ");
            stm.append(attributes + ", ");
            stm.append( ");\n");
//            System.out.println(stm.toString());
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
            String main_text = obj.getString("text");
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
            stm.append(");");
//            jdbc.insertData(stm.toString());
//            System.out.println(stm.toString());
        }
    }
}