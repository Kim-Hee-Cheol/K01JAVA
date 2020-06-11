package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{

	public InsertShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			String query = "INSERT INTO sh_goods VALUES (goods_seq.nextval, ?, ?, SYSDATE, ?)";
			psmt = con.prepareStatement(query);
			
			psmt.setString(1, scanValue("상품명"));
			psmt.setString(2, scanValue("상품가격"));
			psmt.setString(3, scanValue("상품코드"));
			
			int affected = psmt.executeUpdate();
			if(affected ==0)
				System.out.println("입력실패");
			else
				System.out.println(affected +"행 입력성공");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			close();
		}
	}
	
	public static void main(String[] args) {
		new InsertShop().execute();

	}

}
