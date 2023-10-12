package jdbcpackage;

import java.sql.*;


public class insertdata {
      public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            String query= "insert into javacrud(name,address) values('ram','chitwan')";
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            int a = st.executeUpdate(query);    
            System.out.println(a + " row is inserted");
            st.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
