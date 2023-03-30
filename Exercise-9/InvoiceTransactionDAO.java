
import java.sql.Connection;
import java.util.Collection;

public abstract class InvoiceTransactionDAO {
	public abstract InvoiceTransactionDTO findByPrimaryKeyInvID(int id, Connection con);

	public abstract Collection<InvoiceTransactionDTO> findByItemID(int itemid, Connection con);

	public abstract Collection<InvoiceTransactionDTO> findAll(Connection con);

	public abstract int updateInvoiceTransactionDTO(InvoiceTransactionDTO inv, Connection con);

	public abstract int deleteInvoiceTransactionDTO(int id, Connection con);

	public abstract int save(InvoiceTransactionDTO inv, Connection con);
}