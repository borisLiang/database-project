


import java.sql.*;
import java.util.*;
import java.text.MessageFormat;

/**
 */
public class hw3 {
    Connection con = null;
    public static void main(String args[]) {
        hw3 example = new hw3();
        example.run();
    }
    List<String> busList;
    private void run() {

        ResultSet result = null;
        try {
            con = openConnection();
//            UserScene(false);
//            BusinessScene(false);
            String bus_id1 = "58P3oSd8P2QNzHrQmRqQZw";
            String bus_id2 = "4qcd2_d3h2eJmvUwUbmOFg";
            String bus_id3 = "6md4A90THda31wTg1bB3hg";

            ReviewScene(bus_id1);
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

    private void UserScene (Boolean AndOr) {
        String andOr = AndOr ? "AND" : "OR";
        String query = "SELECT name, yelp_since, review_count, num_friends, average_star " +
                "FROM yelp_user U " +
                "WHERE " +
                "yelp_since > to_date(''{1}'','''MM-DD-YYYY''') {0} " +
                "review_count > {2} {0} " +
                "num_friends > {3} {0} " +
                "average_star > {4} {0} " +
                "num_votes > {5}";
        String inputDate = "01-01-2000";
        int revCount = 0;
        int numFriend = 0;
        Double avgStar = 0.;
        int numVotes = 0;
        System.out.println(MessageFormat.format(query, andOr, inputDate, revCount, numFriend, avgStar, numVotes));
//        return toList(read(con, query));
    }
    private void BusinessScene(Boolean AndOr) throws SQLException{
        String andOr = AndOr ? "INTERSECT" : "UNION";
        //VB1 Display
        List<String> VB1out = VB1();

        List<String> VB1in = new LinkedList<String>();
        VB1in.add(VB1out.get(5));
        VB1in.add(VB1out.get(9));

        System.out.println(VB1in);
        BUS1(VB1in, andOr);
        List<String> VB2out = VB2(VB1in);

        List<String> VB2in = new LinkedList<String>();
        VB2in.add(VB2out.get(1));
        VB2in.add(VB2out.get(2));
        System.out.println(VB2in);

        BUS2(VB2in, andOr);
        List<String> VB3out = VB3(VB2in);
//            System.out.println(VB3out);
//            System.out.println(VB3out.size());

        List<String> VB3in = new LinkedList<String>();
        VB3in.add(VB2out.get(1));
        VB3in.add(VB2out.get(2));
        BUS3(VB3in, andOr);

    }


    private List<String> VB1() throws SQLException {
        String query = "select DISTINCT MC.catName from mainCat MC";
        return toList(read(con, query));
    }
    private void BUS1(List<String> inputList, String andOr) throws SQLException {
//        String andOr = AndOr ? "INTERSECT" : "UNION";
        StringBuilder query = new StringBuilder();
//        query.append("(");
        query.append("CREATE VIEW BUS1 AS ");

        for (String i : inputList){
            if(i != inputList.get(0)) {
                query.append(andOr + " ");
            }
            query.append(String.format("SELECT DISTINCT MC.business_id " +
                    "FROM mainCat MC " +
                    "WHERE MC.catName = '%s' ", i));
        }
        try {
            read(con, "DROP VIEW BUS1");
        } catch (SQLException e){

        }
        System.out.println(query);
        read(con, query.toString());
    }
    private List<String> VB2(List<String> inputList) throws SQLException {
        StringBuilder query = new StringBuilder();
//      query.append("(");
        query.append("SELECT DISTINCT SC.subCatName " +
                "FROM subCat SC " +
                "WHERE SC.business_id IN ( SELECT business_id " +
                "FROM bus1)");
//      query.append(")");
        System.out.println(query.toString());
        return toList(read(con, query.toString()));
    }

    private void BUS2(List<String> inputList, String andOr) throws SQLException {
//        String andOr = AndOr ? "UNION" : "INTERSECT";
        StringBuilder query = new StringBuilder();
//        query.append("(");
        query.append("CREATE VIEW BUS2 AS ");

        for (String i : inputList){
            if(i != inputList.get(0)) {
                query.append(andOr + " ");
            }
            query.append(String.format("SELECT DISTINCT SC.business_id " +
                    "FROM subCat SC " +
                    "WHERE SC.subCatName = '%s' ", i));
        }

        query.append("INTERSECT SELECT DISTINCT * " +
                "FROM BUS1 B1 ");
        try {
            read(con, "DROP VIEW BUS2");
        } catch (SQLException e){

        }
        System.out.println(query);
        read(con, query.toString());
    }
    private List<String> VB3(List<String> inputList) throws SQLException {
        StringBuilder query = new StringBuilder();
        query.append("SELECT DISTINCT A.attributes " +
                "FROM attr A " +
                "WHERE A.business_id IN ( SELECT business_id " +
                "FROM bus2)");
        System.out.println(query.toString());
        return toList(read(con, query.toString()));
    }
    private void BUS3(List<String> inputList,String andOr) throws SQLException {
//        String andOr = AndOr ? "UNION" : "INTERSECT";
        StringBuilder query = new StringBuilder();
        query.append("CREATE VIEW BUS3 AS ");

        for (String i : inputList){
            if(i != inputList.get(0)) {
                query.append(andOr + " ");
            }
            query.append(String.format("SELECT DISTINCT A.business_id " +
                    "FROM attr A " +
                    "WHERE A.attributes = '%s' ", i));
        }

        query.append("INTERSECT SELECT DISTINCT * " +
                "FROM BUS2 B2 ");
        try {
            read(con, "DROP VIEW BUS3");
        } catch (SQLException e){
        }

        System.out.println(query);
        read(con, query.toString());

    }
    private ResultSet read(Connection con, String query) throws SQLException{
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
    private void ReviewScene(String bus_id) {
        String query = "SELECT user_id " +
                "FROM REVIEW " +
                "WHERE business_id = ''{1}'' {0} " +
                "publish_date > to_date(''{2}'','''MM-DD-YYYY''') {0} " +
                "publish_date < to_date(''{3}'','''MM-DD-YYYY''') {0} " +
                "num_votes > {4} {0} " +
                "stars > {5}";
        String andOr = "AND";
        String inputDate1 = "01-01-1999";
        String inputDate2 = "01-01-2001";
        int numVotes = 0;
        Double stars = 0.;
        System.out.println(MessageFormat.format(query, andOr, bus_id, inputDate1, inputDate2, numVotes, stars ));
//        return toList(read(con, query));
    }
    private List<String> toList(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        int tupleCount = 1;
        List<String> outputList = new LinkedList<String>();
        while (result.next()) {
//            System.out.print("Tuple " + tupleCount++ + " : ");
            for (int col = 1; col <= meta.getColumnCount(); col++) {
                if (col == 1) {
                    outputList.add(result.getString(col));
                }
//                System.out.print("\"" + result.getString(col) + "\",");
            }
//            System.out.println();
        }
        return outputList;
    }
    private void navigateResult(Connection c) throws SQLException {
         /*
         This will create a Statement that return ResultSets which is:
         1. Scrollablle (can use ResultSet.previous() or ResultSet.absolute())
         2. Read-only (cannot call ResultSet.updateXXX() to change the content)
         */
        Statement stmt = c.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        ResultSet r = stmt.executeQuery("SELECT * FROM info");
        ResultSetMetaData meta = r.getMetaData();

        System.out.print("\nFirst Tuple: ");
        r.next();
        for (int col = 1; col <= meta.getColumnCount(); col++) {
            System.out.print("\"" + r.getString(col) + "\",");
        }

        System.out.print("\nNext Tuple: ");
        r.next();
        for (int col = 1; col <= meta.getColumnCount(); col++) {
            System.out.print("\"" + r.getString(col) + "\",");
        }

        System.out.print("\nPrev. Tuple: ");
        r.previous();
        for (int col = 1; col <= meta.getColumnCount(); col++) {
            System.out.print("\"" + r.getString(col) + "\",");
        }

        System.out.print("\n3rd Tuple: ");
        r.absolute(3);
        for (int col = 1; col <= meta.getColumnCount(); col++) {
            System.out.print("\"" + r.getString(col) + "\",");
        }
    }

    private Connection openConnection() throws SQLException, ClassNotFoundException {
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
    private void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println("Cannot close connection: " + e.getMessage());
        }
    }
}
  