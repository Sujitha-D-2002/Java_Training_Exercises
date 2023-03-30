import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransactionDTO implements Serializable, Cloneable, Comparable<InvoiceTransactionDTO> {
	private int invid;
	private int itemid;
	private int qty;
	private int price;

	@Override
	public int compareTo(InvoiceTransactionDTO o) {
		return this.invid - o.invid;
	}

	private static InvoiceTransactionDTO invt_dto;

	synchronized public static InvoiceTransactionDTO getInstance() {
		if (invt_dto == null) {
			invt_dto = new InvoiceTransactionDTO();
			return invt_dto;
		} else {
			return invt_dto.createClone();
		}
	}

	synchronized public InvoiceTransactionDTO createClone() {
		try {
			return (InvoiceTransactionDTO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private InvoiceTransactionDTO() {
		System.out.println("Invoice Transaction dto object created...");
	}

	public int getInvid() {
		return invid;
	}

	public void setInvid(int invid) {
		this.invid = invid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "InvoiceTransactionDTO [invid=" + invid + ", itemid=" + itemid + ", qty=" + qty + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(invid, itemid, price, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransactionDTO other = (InvoiceTransactionDTO) obj;
		return invid == other.invid && itemid == other.itemid && price == other.price && qty == other.qty;
	}

	
	

}