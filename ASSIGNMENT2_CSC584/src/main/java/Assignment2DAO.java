import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assignment2DAO {
	
	String dbURL ="jdbc:postgresql://ec2-23-23-151-191.compute-1.amazonaws.com";
	String user ="jjizbnxhzvxido";
	String pass ="c22c829045cd11c0add3a4e16e338c4eb05eb19a9fad182ae406eb00cacf73f7";
	

	protected Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;

    }
	

	public void createAssignment2(Assignment2 ac)throws SQLException {
		try (Connection connection = getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement("insert into Assignment2(name,age,email,phoneNumber,date,item,brand,problem,problemdetails;) values(?,?,?,?,?,?,?,?,?)");)
	        {
	            preparedStatement.setString(1, ac.getname());
	            preparedStatement.setString(2, ac.getage());
	            preparedStatement.setString(3, ac.getemail());
	            preparedStatement.setString(4, ac.getphoneNumber());
	            preparedStatement.setString(5, ac.getdatee());
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
            statement.setString(5, form.getdatee());
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
