# COEN280: oracleDB-jdbc-javax UI(Netbean)

//Author: Bowei Liang
//May 31, 2018

//UI from NETBEAN

//oracle DB from virtual machine: ORACLE DEVELOPMENT VM

//Terminal Connection :

    SSH -P 2222 oracle@127.0.0.1;
    
    SQL;
    
    username : hr
    
    Password : oracle
    
//JDBC Connection: 

private Connection openConnection() throws SQLException, ClassNotFoundException {

        String host = "127.0.0.1";
        
        String port = "1521";
        
        String dbName = "orcl";
        
        String userName = "hr";
        
        String password = "oracle";
        
        // Construct the JDBC URL
        
        String dbURL = "jdbc:oracle:thin:@" + host + ":" + port + "/" + dbName;
        
        return DriverManager.getConnection(dbURL, userName, password);
        
    }

