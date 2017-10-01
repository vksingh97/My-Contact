/**
 * Santosh Mahto
 * ducat.sm@gmail.com
 */
package mycontact.entity;

/**
 * @author santosh
 *
 */
public class Contact {
	
	private String first_name;
	private String last_name;
	private String email;
	private long mobile;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String state;

}
