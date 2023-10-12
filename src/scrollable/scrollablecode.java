
package scrollable;
import java.sql.*;

//Scrollable Types : 
//TYPE_FORWARD_ONLY
//TYPE_SCROLL_SENSITIVE
//TYPE_SCROLL_INSENSITIVE

//UPDATABLE TYPES : 
//CONCUR_READ_ONLY
//CONCUR_UPDATABLE


//All ResultSet methods for scrollable
//- first()
//- last()
//- beforeFirst()
//- beforeLast()
//- next()
//- previous()
//- relative()
//- absoulte()

public class scrollablecode {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from javacrud");
            rs.absolute(2);
            System.out.println(rs.getString(2));
            rs.relative(-1);
            System.out.println(rs.getString(2));
            st.close();
            con.close();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
