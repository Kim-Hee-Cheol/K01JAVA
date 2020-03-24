package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSQL {

	private Connection con;
	private Statement stmt;
	
	public DeleteSQL() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	public void connect() {
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin://@localhost:1521:orcl",
					"kosmo",
					"1234");
		}
		catch(SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	
	private void execute() {
		connect();
		
		try {
			stmt = con.createStatement();
			String query = "DELETE FROM member WHERE id='test2'";
			int affected = stmt.executeUpdate(query);
			
			System.out.println(affected +"행이 삭제됨");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행 오류");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("자원 반납 완료");
		}
		catch(Exception e) {
			System.out.println("자원 반납시 오류발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DeleteSQL().execute();
	}

}


