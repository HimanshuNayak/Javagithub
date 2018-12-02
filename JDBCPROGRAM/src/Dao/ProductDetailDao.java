package Dao;
import org.springframework.jdbc.core.JdbcTemplate;
import Model.ProductDetail;

public class ProductDetailDao {
    private static final String insert_product="insert into ProductDetail values(?,?,?)";
    String update_product="update productdetail set price=? where id=?";
    private JdbcTemplate jt;
	public JdbcTemplate getJt() {
		return jt;
	}
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public boolean save(ProductDetail pd)
	{
		int count=jt.update(insert_product,pd.getId(),pd.getName(),pd.getPrice());
		
		return(count>0?true :false);
}
  public boolean update_detail(double price,int id) {
	System.out.println(price);
	String sql="update ProductDetail set price=price where id=id";
	 int count=jt.update(sql);
	  System.out.println(count);
	return (count >0?true:false);
  }
  public boolean delete_detail(int id) {
	  String sql="delete from ProductDetail where id=?";
	  int count=jt.update(sql,id);
	  return (count >0?true:false);
  }

}
