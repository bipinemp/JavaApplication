package jdbcpackage;
import java.sql.*;


public class updatedata {
    public static void main(String[] args) {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String uname = "root";
            String pass = "";
            String query= "update javacrud set name='hello' , address='world' where id=1";
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            int a = st.executeUpdate(query);    
            System.out.println(a + " row is updated");
            st.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
 }
    

