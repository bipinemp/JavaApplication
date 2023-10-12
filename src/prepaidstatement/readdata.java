
package prepaidstatement;
import java.sql.*;


public class readdata {
     public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement pst = con.prepareStatement("select * from javacrud");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getInt(1)+": " + rs.getString(2) + " " + rs.getString(3));
            }
            
            rs.close();
            pst.close();
            con.close();
            
         
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
