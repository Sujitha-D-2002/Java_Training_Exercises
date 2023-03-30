
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Date;

public class CustomerMasterDAOImpl extends CustomerMasterDAO implements Cloneable {
	private CustomerMasterDAOImpl() {
		System.out.println("customer master dao object created....");
	}

	public static CustomerMasterDAO getMultiTon() {
		return new CustomerMasterDAOImpl();
	}

	private static CustomerMasterDAOImpl dao;

	synchronized public static CustomerMasterDAO getSingleTon() {
		if (dao == null) {
			dao = new CustomerMasterDAOImpl();
			return dao;
		} else {
			return dao;
		}
	}

	synchronized public static CustomerMasterDAO getPrototype() {
		if (dao == null) {
			dao = new CustomerMasterDAOImpl();
			return dao;
		} else {
			return dao.getClone();
		}
	}

	synchronized public CustomerMasterDAO getClone() {
		try {
			return (CustomerMasterDAO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public CustomerMasterDTO findByPrimaryKeyCustomerID(int id, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from customer_master where custid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int custid = rs.getInt("custid");
				String custname=rs.getString("custname");
				String custaddress=rs.getString("custaddress");
				String custcity=rs.getString("cuscity");
				CustomerMasterDTO dto = CustomerMasterDTO.getInstance();
				
				dto.setCustid(custid);
				dto.setCustname(custname);
				dto.setCutsaddress(custaddress);
				dto.setCustcity(custcity);
				return dto;
			} else {
				JDBCUtility.closeConnection(null, null);
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			JDBCUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public Collection<CustomerMasterDTO> findByCustomerID(int custid, Connection con) {
		try {

			JDBCUtility.closeConnection(null, null);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			JDBCUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public Collection<CustomerMasterDTO> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCustomerMasterDTO(CustomerMasterDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomerMasterDTO(int id, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(CustomerMasterDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}
}