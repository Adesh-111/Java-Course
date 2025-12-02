import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/student";
        String uname= "postgres";
        String pass = "adeshabin1251";

        Connection con = DriverManager.getConnection(
                url,
                uname,
                pass
        );
        System.out.println("Connection Established successfully");
        Statement s = con.createStatement();
        String q1 = "select sname from studentData where sid =1";
        ResultSet rs = s.executeQuery(q1);
        rs.next();
        System.out.println(rs.getString("sname"));
        String q2 = "select * from studentData";
        rs = s.executeQuery(q2);
        System.out.println("All the values");
        while(rs.next()) System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
        String q3 = "update studentData set sid = 2 where sname = 'Abin'";
        s.execute(q3);
        System.out.println("Updated successfully");
        String q4 = "insert into studentData values (3, 'Jones', 'Bio-tech')";
        s.execute(q4);
        System.out.println("Inserted successfully");
        String q5 = "delete from studentData where sid = 3";
        s.execute(q5);
        System.out.println("Deleted Successfully");
        String q6 = "update studentData set sname = ? where sid =?";
        PreparedStatement ps = con.prepareStatement(q6);
        ps.setString(1,"Sanjay");
        ps.setInt(2,2);
        ps.execute();
        System.out.println("Updated the value by prepared statement");
        con.close();
        System.out.println("Connection Terminated");
    }
}