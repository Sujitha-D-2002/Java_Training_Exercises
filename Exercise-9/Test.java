import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		/*
		 * DB Connectivity
		 */
		Connection con = JDBCUtility.getConnection();
		
		/*
		 * InvoiceMaster table DTO-DAO Implementation
		 */
		InvoiceMasterDAO dao = InvoiceMasterDAOImpl.getPrototype();
		InvoiceMasterDAOImpl.getPrototype();
		InvoiceMasterDAOImpl.getPrototype();
		InvoiceMasterDAOImpl.getPrototype();
		InvoiceMasterDTO dto1 = dao.findByPrimaryKey(10, con);

		con = JDBCUtility.getConnection();
		InvoiceMasterDTO dto2 = dao.findByPrimaryKey(20, con);

		System.out.println(dto1.getAmount() + ":" + dto2.getAmount());

		List<InvoiceMasterDTO> list = Arrays.asList(dto1, dto2);

		Collections.sort(list, (o1, o2) -> {
			return o2.compareTo(o1);
		});

		System.out.println(list);

		System.out.println(dto1.equals(dto2));
		/*
		 * ItemMaster table DTO-DAO Implementation
		 */
		ItemMasterDAO dao3 = ItemMasterDAOImpl.getPrototype();
		ItemMasterDAOImpl.getPrototype();
		ItemMasterDAOImpl.getPrototype();
		ItemMasterDAOImpl.getPrototype();
		ItemMasterDTO dto4 = dao3.findByItemId(40, con);

		con = JDBCUtility.getConnection();
		ItemMasterDTO dto5 = dao3.findByItemId(50, con);


		List<ItemMasterDTO> list1 = Arrays.asList(dto4, dto5);

		Collections.sort(list1, (o3, o4) -> {
			return o4.compareTo(o3);
		});

		System.out.println(list1);

		System.out.println(dto4.equals(dto5));
		/*
		 * CustomerMaster table DTO-DAO Implementation
		 */
		CustomerMasterDAO custdao3 = CustomerMasterDAOImpl.getPrototype();
		CustomerMasterDAOImpl.getPrototype();
		CustomerMasterDAOImpl.getPrototype();
		CustomerMasterDAOImpl.getPrototype();
		CustomerMasterDTO custdto4 = custdao3.findByPrimaryKeyCustomerID(40, con);

		con = JDBCUtility.getConnection();
		CustomerMasterDTO custdto5 = custdao3.findByPrimaryKeyCustomerID(50, con);


		List<CustomerMasterDTO> custlist1 = Arrays.asList(custdto4, custdto5);

		Collections.sort(list1, (o5, o6) -> {
			return o6.compareTo(o5);
		});

		System.out.println(custlist1);

		System.out.println(custdto4.equals(custdto5));
		/*
		 * InvoiceTransaction table DTO-DAO Implementation
		 */
		InvoiceTransactionDAO invdao3 = InvoiceTransactionDAOImpl.getPrototype();
		InvoiceTransactionDAOImpl.getPrototype();
		InvoiceTransactionDAOImpl.getPrototype();
		InvoiceTransactionDAOImpl.getPrototype();
		InvoiceTransactionDTO invdto4 = invdao3.findByPrimaryKeyInvID(44, con);

		con = JDBCUtility.getConnection();
		InvoiceTransactionDTO invdto5 = invdao3.findByPrimaryKeyInvID(55, con);


		List<InvoiceTransactionDTO> invlist1 = Arrays.asList(invdto4, invdto5);

		Collections.sort(list1, (o7, o8) -> {
			return o8.compareTo(o7);
		});

		System.out.println(invlist1);

		System.out.println(invdto4.equals(invdto5));
	}
}