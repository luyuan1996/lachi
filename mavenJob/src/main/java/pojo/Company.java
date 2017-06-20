package pojo;

public class Company {
    private String id;

    private String name;

    private String attribute;

    private String vocation;

    private String location;

    private String street;

    private String building;

    private Integer staff;

    private Integer capital;

    private Integer captialtype;

    private String email;

    private String information;

    private Byte showin;

    private Integer permission;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public Integer getStaff() {
        return staff;
    }

    public void setStaff(Integer staff) {
        this.staff = staff;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public Integer getCaptialtype() {
        return captialtype;
    }

    public void setCaptialtype(Integer captialtype) {
        this.captialtype = captialtype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public Byte getShowin() {
        return showin;
    }

    public void setShowin(Byte showin) {
        this.showin = showin;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }
}