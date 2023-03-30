import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ItemMasterDTO implements Serializable, Cloneable, Comparable<ItemMasterDTO> {
	private int itemid;
	private String itemname;
	private String unit;
	private int itemprice;

	@Override
	public int compareTo(ItemMasterDTO o) {
		return this.itemid - o.itemid;
	}

	private static ItemMasterDTO invm_dto;

	synchronized public static ItemMasterDTO getInstance() {
		if (invm_dto == null) {
			invm_dto = new ItemMasterDTO();
			return invm_dto;
		} else {
			return invm_dto.createClone();
		}
	}

	synchronized public ItemMasterDTO createClone() {
		try {
			return (ItemMasterDTO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "ItemMasterDTO [itemid=" + itemid + ", itemname=" + itemname + ", unit=" + unit + ", itemprice=" + itemprice
				+ "]";
	}

	private ItemMasterDTO() {
		System.out.println("item master dto object created...");
	}

	public int getItemId() {
		return itemid;
	}

	public void setItemId(int itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemname;
	}

	public void setItemName(String itemname) {
		this.itemname = itemname;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getItemPrice() {
		return itemprice;
	}

	public void setItemPrice(int itemprice) {
		this.itemprice = itemprice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemprice, itemname, unit, itemid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemMasterDTO other = (ItemMasterDTO) obj;
		return itemprice == other.itemprice && itemname == other.itemname && Objects.equals(unit, other.unit)
				&& itemid == other.itemid;
	}

	

}