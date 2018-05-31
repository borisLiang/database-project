


import java.sql.*;
import java.util.*;
import java.text.MessageFormat;

/**
 */
public class hw3 {


    public hw3() throws SQLException, ClassNotFoundException{

//        run();
    }
    List<String> busList;
    private void run() {
        Connection con = null;
        ResultSet result = null;
        try {
            con = openConnection();
//            UserScene(con, false);

//            ReviewScene(con, bus_id1);
        } catch (SQLException e) {
            System.err.println("Errors occurs when communicating with the database server: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot find the database driver");
        } finally {
            // Never forget to close database connection
            closeConnection(con);
        }
    }


    /**
     * This method will first clean up the table and then
     * populate it with new data.
     * @param con
     * @throws java.sql.SQLException
     */




    //Query
    public String VB1(Connection con) throws SQLException {
        String query = "select DISTINCT MC.catName from mainCat MC";
        return query;
    }
    public String VB2(Connection con, List<String> inputList, Boolean AndOr) throws SQLException {
        StringBuilder query = new StringBuilder();
        String andOr = AndOr ? "INTERSECT" : "UNION";
        for (String i : inputList) {
            if(i != inputList.get(0)) {
                query.append("\n" + andOr + " \n");
            }
            query.append(String.format("SELECT DISTINCT SC.subCatName\n " +
                    "FROM subCat SC, mainCat MC\n " +
                    "WHERE SC.business_id  = MC.business_id AND\n" +
                    "MC.catName = '%s' ", i));
        }

//        System.out.println(query.toString());

        return query.toString();
    }
    public String VB3(Connection con, List<String> inputList,  Boolean AndOr) throws SQLException {
        String andOr = AndOr ? "INTERSECT" : "UNION";
        StringBuilder query = new StringBuilder();

        for (String i : inputList) {
            if(i != inputList.get(0)) {
                query.append(andOr + " ");
            }
            query.append(String.format("SELECT DISTINCT A.attributes " +
                    "FROM subCat SC, attr A  " +
                    "WHERE SC.business_id  = A.business_id AND " +
                    "SC.subCatName = '%s' ", i));
        }

//        System.out.println(query.toString());

        return query.toString();
    }
    //Create View
    public String BUS1(Connection con, List<String> inputList, Boolean AndOr) throws SQLException {
        if (inputList.size() == 0 || inputList == null) {
            return "";
        }
        String andOr = AndOr ? "INTERSECT" : "UNION";
        StringBuilder query = new StringBuilder();
        query.append("CREATE VIEW BUS1 AS \n");

        for (String i : inputList){
            if(i != inputList.get(0)) {
                query.append(andOr + " \n");
            }
            query.append(String.format("SELECT DISTINCT MC.business_id \n" +
                    "FROM mainCat MC \n" +
                    "WHERE MC.catName = '%s' \n", i));
        }
        try {
            read(con, "DROP VIEW BUS1");
        } catch (SQLException e){

        }
        System.out.println(query);
        read(con, query.toString());
        return query.toString();
    }
    public String BUS2(Connection con, List<String> inputList, Boolean AndOr) throws SQLException {
        if (inputList.size() == 0 || inputList == null) {
            return "SELECT DISTINCT * FROM BUS1 ";
        }
        String andOr = AndOr ? "INTERSECT" : "UNION";
        StringBuilder query = new StringBuilder();
        query.append("CREATE VIEW BUS2 AS \n");
        if(inputList.size() != 0) {
            for (String i : inputList) {
                if (i != inputList.get(0)) {
                    query.append(andOr + " \n");
                }
                query.append(String.format("SELECT DISTINCT SC.business_id \n" +
                        "FROM subCat SC \n" +
                        "WHERE SC.subCatName = '%s' \n", i));
            }
            query.append("INTERSECT \n");
        }

        query.append("SELECT DISTINCT * " +
                "FROM BUS1 B1 ");
        try {
            read(con, "DROP VIEW BUS2");
        } catch (SQLException e){

        }
//        System.out.println(query);
        read(con, query.toString());
        return query.toString();
    }
    public String BUS3(Connection con, List<String> inputList, Boolean AndOr) throws SQLException {
        if (inputList.size() == 0 || inputList == null) {
            return "SELECT DISTINCT * FROM BUS2 B2 ";
        }
        String andOr = AndOr ? "INTERSECT" : "UNION";
        StringBuilder query = new StringBuilder();
        query.append("CREATE VIEW BUS3 AS \n");

        for (String i : inputList){
            if(i != inputList.get(0)) {
                query.append(andOr + " \n");
            }
            query.append(String.format("SELECT DISTINCT A.business_id \n" +
                    "FROM attr A \n" +
                    "WHERE A.attributes = '%s' \n", i));
        }
        query.append("INTERSECT \n");

        query.append("SELECT DISTINCT * " +
                "FROM BUS2 B2 ");
        try {
            read(con, "DROP VIEW BUS3");
        } catch (SQLException e){
        }

//        System.out.println(query);
        read(con, query.toString());
        return query.toString();
    }
    // return result of table
    public String busTable(Connection c, String table) throws SQLException{
        String query =  String.format("SELECT B.business_id, B.name, B.city, B.state, B.stars \n" +
                "FROM bus B \n" +
                "WHERE B.business_id in (SELECT * FROM  %s) \n", table);
        return query;
    }
    public String userTable (Connection con, Boolean AndOr, String inputDate,
                            String cond1, String cond2, String cond3, String cond4,
                                 int revCount, int numFriend, Double avgStar, int numVotes) throws SQLException{
        String andOr = AndOr ? "AND" : "OR";
        String query = "SELECT user_id, name, yelp_since, average_star \n" +
                "FROM yelp_user U \n" +
                "WHERE " +
                "yelp_since > to_date(''{1}'','''MM-DD-YYYY''') {0} \n" +
                "review_count {2} {6} {0} \n" +
                "num_friends {3} {7} {0} \n" +
                "average_star {4} {8} {0} \n" +
                "num_votes {5} {9}";

        query = MessageFormat.format(query, andOr, inputDate, cond1, cond2, cond3, cond4,
                revCount, numFriend, avgStar, numVotes);
//        System.out.println(query);
        return query;
    }
    public String busReviewScene(Connection con,Boolean AndOr, String bus_id,
                                     String inputDate1, String inputDate2,
                                     String vote_condition, int numVotes, String star_condition, Double stars) throws SQLException{
        String query = "SELECT R.review_id, U.name, R.stars, R.main_text " +
                "FROM REVIEW R, yelp_user U " +
                "WHERE R.user_id = U.user_id AND " +
                "R.business_id = ''{1}'' {0} " +
                "R.publish_date > to_date(''{2}'','''MM-DD-YYYY''') {0} " +
                "R.publish_date < to_date(''{3}'','''MM-DD-YYYY''') {0} " +
                "R.num_votes {4} {5} {0} " +
                "R.stars {6} {7}";
        String andOr = AndOr ? "AND" : "OR";

        query = MessageFormat.format(query, andOr, bus_id, inputDate1, inputDate2, vote_condition, numVotes, star_condition, stars);
        return query;

    }
    public Object[][] userReviewScene(Connection con, String user_id)  throws SQLException{
        String query = "SELECT R.review_id, B.name, R.stars " +
                "FROM REVIEW R, bus B " +
                "WHERE R.business_id = B.business_id AND " +
                "R.user_id = ''{0}''  ";

        query = MessageFormat.format(query,  user_id);
        return tableDisplay(con, query);

    }
    //Parse Data from DB
    public List<String> execute (Connection con, String query) throws SQLException {
        return toList(read(con, query));
    }
    private ResultSet read(Connection con, String query) throws SQLException{
        if (query.equals("") || query == null) {
            return null;
        }
        Statement stmt = con.createStatement();
        return stmt.executeQuery(query);
    }
    private void desc(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        for (int col = 1; col <= meta.getColumnCount(); col++) {
            System.out.println("Column: " + meta.getColumnName(col) +
                    "\t, Type: " + meta.getColumnTypeName(col));
        }
    }
    private List<String> toList(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        List<String> outputList = new LinkedList<String>();
        while (result.next()) {
            for (int col = 1; col <= meta.getColumnCount(); col++) {
                if (col == 1) {
                    outputList.add(result.getString(col));
                }
            }
        }
        return outputList;
    }

    public Object[][] tableDisplay(Connection c, String query) throws SQLException{
        ResultSet rs = read(c, query);
        ResultSetMetaData meta = rs.getMetaData();
        List<String[]> list = new ArrayList<>();
        while (rs.next()) {
            String[] temp = new String[meta.getColumnCount()];
            for (int col = 2; col <= meta.getColumnCount(); col++) {
                temp[col - 2] = rs.getString(col);
            }
            list.add(temp);
        }
        Object[][] result = new Object[list.size()][meta.getColumnCount()];
        for (int i = 0; i < list.size(); i ++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public Object[] tableDisplayFirstColumn(Connection c, String query) throws SQLException{
        ResultSet rs = read(c, query);
        ResultSetMetaData meta = rs.getMetaData();
        List<String> list = new ArrayList<>();
        while (rs.next()) {

            for (int col = 1; col <= 1; col++) {
                list.add(rs.getString(col));
            }
        }
        Object[] result = new Object[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public Connection openConnection() throws SQLException, ClassNotFoundException {
        // Load the Oracle database driver
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
   
          /* 
          Here is the information needed when connecting to a database 
          server. These values are now hard-coded in the program. In 
          general, they should be stored in some configuration file and 
          read at run time. 
          */
        String host = "localhost";
        String port = "1521";
        String dbName = "orcl";
        String userName = "hr";
        String password = "oracle";

        // Construct the JDBC URL
        String dbURL = "jdbc:oracle:thin:@" + host + ":" + port + "/" + dbName;
        return DriverManager.getConnection(dbURL, userName, password);
    }
    public void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println("Cannot close connection: " + e.getMessage());
        }
    }
}
  