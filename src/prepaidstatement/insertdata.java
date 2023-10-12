package prepaidstatement;

import java.sql.*;

public class insertdata {
     public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement pst = con.prepareStatement("insert into javacrud(name,address) values(?,?)");
            
            pst.setString(1, "barun");
            pst.setString(2, "RamNagar");
            int a = pst.executeUpdate();
            System.out.println(a + "row is inserted");
            pst.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
