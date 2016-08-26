package admin.model;

public class Venues extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.venues_id
     *
     * @mbggenerated
     */
    private Integer venuesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.venues_name
     *
     * @mbggenerated
     */
    private String venuesName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.venuesType_id
     *
     * @mbggenerated
     */
    private Integer venuestypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.address
     *
     * @mbggenerated
     */
    private Integer address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.comments
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.start
     *
     * @mbggenerated
     */
    private String start;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venues.location
     *
     * @mbggenerated
     */
    private Integer location;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public Venues(Integer venuesId, String venuesName, Integer venuestypeId, Integer address, String comments, String start, Integer location) {
        this.venuesId = venuesId;
        this.venuesName = venuesName;
        this.venuestypeId = venuestypeId;
        this.address = address;
        this.comments = comments;
        this.start = start;
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public Venues() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.venues_id
     *
     * @return the value of venues.venues_id
     *
     * @mbggenerated
     */
    public Integer getVenuesId() {
        return venuesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.venues_id
     *
     * @param venuesId the value for venues.venues_id
     *
     * @mbggenerated
     */
    public void setVenuesId(Integer venuesId) {
        this.venuesId = venuesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.venues_name
     *
     * @return the value of venues.venues_name
     *
     * @mbggenerated
     */
    public String getVenuesName() {
        return venuesName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.venues_name
     *
     * @param venuesName the value for venues.venues_name
     *
     * @mbggenerated
     */
    public void setVenuesName(String venuesName) {
        this.venuesName = venuesName == null ? null : venuesName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.venuesType_id
     *
     * @return the value of venues.venuesType_id
     *
     * @mbggenerated
     */
    public Integer getVenuestypeId() {
        return venuestypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.venuesType_id
     *
     * @param venuestypeId the value for venues.venuesType_id
     *
     * @mbggenerated
     */
    public void setVenuestypeId(Integer venuestypeId) {
        this.venuestypeId = venuestypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.address
     *
     * @return the value of venues.address
     *
     * @mbggenerated
     */
    public Integer getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.address
     *
     * @param address the value for venues.address
     *
     * @mbggenerated
     */
    public void setAddress(Integer address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.comments
     *
     * @return the value of venues.comments
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.comments
     *
     * @param comments the value for venues.comments
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.start
     *
     * @return the value of venues.start
     *
     * @mbggenerated
     */
    public String getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.start
     *
     * @param start the value for venues.start
     *
     * @mbggenerated
     */
    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venues.location
     *
     * @return the value of venues.location
     *
     * @mbggenerated
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venues.location
     *
     * @param location the value for venues.location
     *
     * @mbggenerated
     */
    public void setLocation(Integer location) {
        this.location = location;
    }
}