import java.sql.Connection;
import java.util.Collection;

public abstract class CustomerMasterDAO {
	public abstract CustomerMasterDTO findByPrimaryKeyCustomerID(int id, Connection con);

	public abstract Collection<CustomerMasterDTO> findByCustomerID(int custid, Connection con);

	public abstract Collection<CustomerMasterDTO> findAll(Connection con);

	public abstract int updateCustomerMasterDTO(CustomerMasterDTO inv, Connection con);

	public abstract int deleteCustomerMasterDTO(int id, Connection con);

	public abstract int save(CustomerMasterDTO inv, Connection con);
}