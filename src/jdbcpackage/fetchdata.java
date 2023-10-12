
package jdbcpackage;
import java.sql.*;

public class fetchdata {
    public static void main(String[] args) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            String query= "SELECT * FROM javacrud";
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            ResultSet rs =   st.executeQuery(query);
            while(rs.next()){
                String data="";
                for(int i=1;i<=3;i++){
                    data +=rs.getString(i)+":";
                }
                System.out.println(data);
            }          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
