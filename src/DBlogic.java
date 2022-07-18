import java.sql.*;
import java.util.Scanner;


public class DBlogic {
    String DB = "jdbc:mysql://localhost:3306/07_crud";
    String USER = "root";
    String PASS = "passpass";

    Scanner scan = new Scanner(System.in);

    //insert private function
    private void insert(){

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt =conn.createStatement();

            System.out.println("e-mail: ");
            String email = scan.next();
            System.out.println("name: ");
            String nName = scan.next();

            String sql = "INSERT INTO users (email, name) VALUES ( '" + email + "' , '" + nName + "')";

            stmt.executeUpdate(sql);
            System.out.println("dati ir ievaditi");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
//    getter for insert function
    public void getInsert() {
        insert();
    }
    //delete
    private void delete(){

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt =conn.createStatement();

            System.out.println("Delete user with e-mail: ");
            String dEmail = scan.next();


            String sql = "DELETE FROM users WHERE email = '" + dEmail + "'" ;

            stmt.executeUpdate(sql);
            System.out.println("dati ir izdzesti");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
//    getter fo Delete function
    public void getDelete(){
        delete();
    }
    //update
    private void update(){

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt =conn.createStatement();

            System.out.println("update user with e-mail: ");
            String upEmail = scan.next();
            System.out.println("e-mail: ");
            String email = scan.next();
            System.out.println("name: ");
            String nName = scan.next();

            String sql = "UPDATE users SET email = '" + email + "', name = '" + nName + "' WHERE email  = '" + upEmail + "'";

            stmt.executeUpdate(sql);
            System.out.println("emails ir atjaunots");
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
//    getter for update function
    public void getUpdate() {
        update();
    }
    //select
    private void select(){

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt =conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, email, name FROM users");



            while(rs.next()) {

                System.out.println("id: " + rs.getInt("id"));
                System.out.println("e-mail: " +rs.getString("email"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("  ");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
    public void getSelect(){
        select();
    }
}
