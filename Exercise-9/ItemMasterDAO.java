import java.sql.Connection;
import java.util.Collection;

public abstract class ItemMasterDAO {
	public abstract ItemMasterDTO findByItemId(int id, Connection con);

	public abstract Collection<ItemMasterDTO> findByItemName(int itemname, Connection con);

	public abstract Collection<ItemMasterDTO> findAll(Connection con);

	public abstract int updateItemMasterDTO(ItemMasterDTO inv, Connection con);

	public abstract int deleteItemMasterDTO(int id, Connection con);

	public abstract int save(ItemMasterDTO inv, Connection con);
}