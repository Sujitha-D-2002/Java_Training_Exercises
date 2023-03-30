import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable, Cloneable, Comparable<CustomerMasterDTO> {
	private int custid;
	private String custname;
	private String cutsaddress;
	private String custcity;

	@Override
	public int compareTo(CustomerMasterDTO o) {
		return this.custid - o.custid;
	}

	private static CustomerMasterDTO custm_dto;

	synchronized public static CustomerMasterDTO getInstance() {
		if (custm_dto == null) {
			custm_dto = new CustomerMasterDTO();
			return custm_dto;
		} else {
			return custm_dto.createClone();
		}
	}

	synchronized public CustomerMasterDTO createClone() {
		try {
			return (CustomerMasterDTO) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private CustomerMasterDTO() {
		System.out.println("Customer master dto object created...");
	}

	
	@Override
	public String toString() {
		return "CustomerMasterDTO [custid=" + custid + ", custname=" + custname + ", cutsaddress=" + cutsaddress
				+ ", custcity=" + custcity + "]";
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCutsaddress() {
		return cutsaddress;
	}

	public void setCutsaddress(String cutsaddress) {
		this.cutsaddress = cutsaddress;
	}

	public String getCustcity() {
		return custcity;
	}

	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(custcity, custid, custname, cutsaddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMasterDTO other = (CustomerMasterDTO) obj;
		return Objects.equals(custcity, other.custcity) && custid == other.custid
				&& Objects.equals(custname, other.custname) && Objects.equals(cutsaddress, other.cutsaddress);
	}

	

}