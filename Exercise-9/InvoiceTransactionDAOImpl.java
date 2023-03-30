
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Date;

public class InvoiceTransactionDAOImpl  extends InvoiceTransactionDAO implements Cloneable {
	private InvoiceTransactionDAOImpl() {
		System.out.println("invoice transaction dao object created....");
	}

	public static InvoiceTransactionDAO getMultiTon() {
		return new InvoiceTransactionDAOImpl();
	}

	private static InvoiceTransactionDAOImpl dao;

	synchronized public static InvoiceTransactionDAO getSingleTon() {
		if (dao == null) {
			dao = new InvoiceTransactionDAOImpl();
			return dao;
		} else {
			return dao;
		}
	}

	synchronized public static InvoiceTransactionDAO getPrototype() {
		if (dao == null) {
			dao = new InvoiceTransactionDAOImpl();
			return dao;
		} else {
			return dao.getClone();
		}
	}

	synchronized public InvoiceTransactionDAO getClone() {
		try {
			return (InvoiceTransactionDAO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public InvoiceTransactionDTO findByPrimaryKeyInvID(int id, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from inv_trans where invid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int invid = rs.getInt(1);
				int itemid = rs.getInt("itemid");
				int qty = rs.getInt("qty");
				int price=rs.getInt("price");
				InvoiceTransactionDTO dto = InvoiceTransactionDTO.getInstance();
				dto.setInvid(invid);
				dto.setItemid(itemid);
				dto.setQty(qty);
				dto.setPrice(price);
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
	public Collection<InvoiceTransactionDTO> findByItemID(int itemid, Connection con) {
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
	public Collection<InvoiceTransactionDTO> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateInvoiceTransactionDTO(InvoiceTransactionDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceTransactionDTO(int id, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(InvoiceTransactionDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}
}