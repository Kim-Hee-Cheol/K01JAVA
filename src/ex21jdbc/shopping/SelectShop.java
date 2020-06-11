package ex21jdbc.shopping;

import ex21jdbc.connect.IConnectImpl;

public class SelectShop extends IConnectImpl{

	public SelectShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			String sql = "SELECT g_idx, goods_name, "
					+ " to_char(goods_price,'9,990,000'), "
					+ " to_char(regidate,'yyyy-mm-dd hh:mi'), p_code "
					+ " FROM sh_goods WHERE 1=1";
			
			String searchStr = scanValue("검색할상품명");
			if(searchStr!=null) {
				sql = sql + " AND goods_name "
						+ " LIKE '%"+ searchStr +"%' ";
			}
			sql = sql + " ORDER BY g_idx DESC";
			rs = stmt.executeQuery(sql);
			System.out.println("No  상품명  가격  등록일  제품코드");
			while(rs.next()) {
				String g_idx = rs.getString(1);
				String goods_name = rs.getString(2);
				String goods_price = rs.getString(3);
				String regidate = rs.getString(4);
				String p_code = rs.getString(5);
				System.out.printf("%d %8s %8s %s %s\n",
						g_idx, goods_name, goods_price, regidate, p_code);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	

	public static void main(String[] args) {
		
		new SelectShop().execute();
	}
}
