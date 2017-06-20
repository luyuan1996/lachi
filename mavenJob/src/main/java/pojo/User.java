package pojo;

public class User {
    private String id;

    private String username;

    private String account;

    private String cartid;

    private String email;

    private Integer phone;

    private boolean state;

    private Integer permission;

    private String address;

    private String password;

    @Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", account="
				+ account + ", cartid=" + cartid + ", email=" + email
				+ ", phone=" + phone + ", state=" + state + ", permission="
				+ permission + ", address=" + address + ", password="
				+ password + "]";
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String string) {
        this.cartid = string;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean b) {
        this.state = b;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}