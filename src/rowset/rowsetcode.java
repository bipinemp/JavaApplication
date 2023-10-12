package rowset;
import java.sql.*;
import javax.sql.rowset.*;



public class rowsetcode {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from javacrud");
            RowSetFactory rsf = RowSetProvider.newFactory();
            CachedRowSet crs = rsf.createCachedRowSet();
            crs.populate(rs);
            con.close();
            while(crs.next() == true){
                System.out.println(crs.getInt(1) + ": " + crs.getString(2) + " " + crs.getString(3));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
