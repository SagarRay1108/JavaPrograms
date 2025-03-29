import java.sql.*;
public class JdbcServices
{
    public static void main(String[] args)
    {

        try
        {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

Statement st=con.createStatement();
// String query="insert into login values('asd','111')";

String s="kkkk";
String s1="jjjj";

String query="insert into login values('"+s+"','"+s1+"')";

st.executeUpdate(query);
        System.out.println("Ok");
        con.close();
        }catch(Exception e)
        {
                e.printStackTrace();
        }
    }
}
