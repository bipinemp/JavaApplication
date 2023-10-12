
package prepaidstatement;
import java.sql.*;


public class updatedata {
     public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url,uname,pass);
            PreparedStatement pst = con.prepareStatement("update javacrud set name=? , address=? where id=?");
            
            pst.setString(1, "barun");
            pst.setString(2, "RamNagar");
            pst.setInt(3, 2);
            int a = pst.executeUpdate();
            System.out.println(a + " row is updated");
            pst.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
