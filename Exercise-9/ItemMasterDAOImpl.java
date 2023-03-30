import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Date;

public class ItemMasterDAOImpl extends ItemMasterDAO implements Cloneable {
	private ItemMasterDAOImpl() {
		System.out.println("item master dao object created....");
	}

	public static ItemMasterDAO getMultiTon() {
		return new ItemMasterDAOImpl();
	}

	private static ItemMasterDAOImpl dao;

	synchronized public static ItemMasterDAO getSingleTon() {
		if (dao == null) {
			dao = new ItemMasterDAOImpl();
			return dao;
		} else {
			return dao;
		}
	}

	synchronized public static ItemMasterDAO getPrototype() {
		if (dao == null) {
			dao = new ItemMasterDAOImpl();
			return dao;
		} else {
			return dao.getClone();
		}
	}

	synchronized public ItemMasterDAO getClone() {
		try {
			return (ItemMasterDAO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ItemMasterDTO findByItemId(int id, Connection con){
		try {
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int itemid = rs.getInt(1);
				String itemname = rs.getString(2);
				int itemprice = rs.getInt("itemprice");
				String unit = rs.getString("unit");
				
				ItemMasterDTO dto = ItemMasterDTO.getInstance();
				dto.setItemId(itemid);
				dto.setItemName(itemname);
				dto.setItemPrice(itemprice);
				dto.setUnit(unit);
				
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
	public Collection<ItemMasterDTO> findAll(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateItemMasterDTO(ItemMasterDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemMasterDTO(int id, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(ItemMasterDTO inv, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<ItemMasterDTO> findByItemName(int itemname, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}
}