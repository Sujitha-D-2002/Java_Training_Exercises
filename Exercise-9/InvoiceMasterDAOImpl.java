import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Date;

public class InvoiceMasterDAOImpl extends InvoiceMasterDAO implements Cloneable {
	private InvoiceMasterDAOImpl() {
		System.out.println("invoice master dao object created....");
	}

	public static InvoiceMasterDAO getMultiTon() {
		return new InvoiceMasterDAOImpl();
	}

	private static InvoiceMasterDAOImpl dao;

	synchronized public static InvoiceMasterDAO getSingleTon() {
		if (dao == null) {
			dao = new InvoiceMasterDAOImpl();
			return dao;
		} else {
			return dao;
		}
	}

	synchronized public static InvoiceMasterDAO getPrototype() {
		if (dao == null) {
			dao = new InvoiceMasterDAOImpl();
			return dao;
		} else {
			return dao.getClone();
		}
	}

	synchronized public InvoiceMasterDAO getClone() {
		try {
			return (InvoiceMasterDAO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public InvoiceMasterDTO findByPrimaryKey(int id, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from inv_master where invid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int invid = rs.getInt(1);
				Date date = rs.getDate(2);
				int custid = rs.getInt("custid");
				int invamt = rs.getInt("invamt");
				int discount = rs.getInt(5);
				InvoiceMasterDTO dto = InvoiceMasterDTO.getInstance();
				dto.setInvid(invid);
				dto.setInvdate(date);
				dto.setAmount(invamt);
				dto.setDiscount(discount);
				dto.setCustid(custid);
				return dto;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			JDBCUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public Collection<InvoiceMasterDTO> findByCustomerID(int custid, Connection con) {
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
	public Collection<InvoiceMasterDTO> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateInvoiceMasterDTO(InvoiceMasterDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceMasterDTO(int id, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(InvoiceMasterDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}
}