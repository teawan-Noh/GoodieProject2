package model;

public class manager {
	private int mcode;
	private String name;
	private String id;
	private String pw;
	
	public manager() {}
	
	public manager(int mcode, String name, String id, String pw) {
		super();
		this.mcode = mcode;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public int getMcode() {
		return mcode;
	}

	public void setMcode(int mcode) {
		this.mcode = mcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}
