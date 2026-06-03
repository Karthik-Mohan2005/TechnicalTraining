import java.sql.*;
public class SampleJDBC {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";
        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connection successful");
           /* String query = "Delete from college where id = 4";
            PreparedStatement ps1 = conn.prepareStatement(query);
           
            ps1.executeUpdate();
            System.out.println("Successful");
*/
            String query = "insert into college values(?,?,?)";
          /*  PreparedStatement ps1 = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int id = sc.nextInt();
            int age = sc.nextInt();
            ps1.setString(1,name);
            ps1.setInt(2,id);
            ps1.setInt(3,age);
            ps1.executeUpdate();*/

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from college order by id");
            while(rs.next()){
                String name1 = rs.getString("name");
                int id1 = rs.getInt("id");
                int age1 = rs.getInt("age");
                System.out.println(id1+" "+" "+name1+" "+age1);
            }

        }catch(SQLException e){
            System.out.println(e);
        }    

    }
}