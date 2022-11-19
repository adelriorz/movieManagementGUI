package Connector;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author postgresqltutorial.com
 */
public class Link{

    private final String url = "jdbc:postgresql://localhost:5432/demo";
    private final String user = "postgres";
    private final String password = "admin";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    
    public void addUser(String userName, String password) {

        String SQL = "INSERT INTO user VALUES (?, ?)";
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1,userName);
            pstmt.setString(2,password);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("userId"));
                System.out.println(rs.getString("userName"));
                System.out.println(rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int getUserCount() {
        String SQL = "SELECT count(*) FROM user";
        int count = 0;

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
    
    private void displayUsers(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getInt("userId") + "\t"
                    + rs.getString("userName") + "\t"
                    + rs.getString("password"));

        }
    }
    
    public void findUserByID(int userId) {
        String SQL = "SELECT userId,userName,password "
                + "FROM user "
                + "WHERE userId = ?";

        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            displayUsers(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Link link = new Link();
        link.connect();
        link.findUserByID(2);
        //link.addUser("Juan", "contra");
        System.out.println(link.getUserCount());
    }
}

