
package prepaidstatement;
import java.sql.*;


public class deletedata {
     public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement pst = con.prepareStatement("delete from javacrud where id=?");
            
            pst.setInt(1, 2);
            int a = pst.executeUpdate();
            System.out.println(a + " row is deleted");
            pst.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
