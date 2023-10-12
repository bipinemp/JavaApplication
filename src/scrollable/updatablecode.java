package scrollable;
import java.sql.*;


public class updatablecode {
      public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from javacrud");
            rs.absolute(2);
            String address = rs.getString(3);
            System.out.println("Old Address : " + address);
            String newaddress = "Chitwan";
            rs.updateString(3, newaddress);
            rs.updateRow();
            System.out.println("New address :" + rs.getString(3));
            st.close();
            con.close();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
