import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assignment2DAO {
	protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
	

	public void createAssignment2(Assignment2 ac)throws SQLException {
		try (Connection connection = getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement("insert into khairatmember(memberName,memberID,memberContactNo,memberEmail,memberPassword,memberAddress;) values(?,?,?,?,?,?)");)
	        {
	            preparedStatement.setString(1, ac.getname());
	            preparedStatement.setString(2, ac.getage());
	            preparedStatement.setString(3, ac.getemail());
	            preparedStatement.setString(4, ac.getphoneNumber());
	            preparedStatement.setString(5, ac.getdate());
	            preparedStatement.setString(6, ac.getitem());
	            preparedStatement.setString(7, ac.getbrand());
	            preparedStatement.setString(8, ac.getproblem());
	            preparedStatement.setString(9, ac.getproblemdetails());
	            

	            out.println(preparedStatement);
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	}

	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
	}
	public boolean updateform(Assignment2 form) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("update admin set khairatmembermembername=?,khairatmembermembercontactno=?,khairatmembermemberemail=?, khairatmembermemberpassword=?, khairatmembermemberAddress=? where khairatmembermemberID=?");)
        {
        	statement.setString(1, form.getname());
        	statement.setString(2, form.getage());
            statement.setString(3, form.getemail());
            statement.setString(4, form.getphoneNumber());
            statement.setString(5, form.getdate());
            statement.setString(6, form.getitem());
            statement.setString(7, form.getbrand());
            statement.setString(8, form.getproblem());
            statement.setString(9, form.getproblemdetails());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
	public boolean deleteform(int phoneNumber) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("delete from khairatmember where memberid=?");) {
            statement.setInt(1, phoneNumber);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}
