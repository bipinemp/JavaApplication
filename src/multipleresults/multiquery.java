
package multipleresults;
import java.sql.*;



public class multiquery {
    public static void main(String[] args){
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java?allowMultiQueries=true";
        Connection con = DriverManager.getConnection(url,"root","");
        Statement st = con.createStatement();
        boolean results = st.execute("select * from javacrud where id=3 ; select * from javacrud where id=4");
        do{
            if(results){
                ResultSet rs = st.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getString(3));
                }
                rs.close();
                results = st.getMoreResults();
            }
        }while(results);
        st.close();
        con.close();
       }catch(Exception e){
           System.out.println(e);
                   
       }    
    }  
}
