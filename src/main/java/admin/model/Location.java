package admin.model;

public class Location extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column location.location_id
     *
     * @mbggenerated
     */
    private Integer locationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column location.lon
     *
     * @mbggenerated
     */
    private Double lon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column location.lat
     *
     * @mbggenerated
     */
    private Double lat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column location.comments
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column location.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    public Location(Integer locationId, Double lon, Double lat, String comments, String status) {
        this.locationId = locationId;
        this.lon = lon;
        this.lat = lat;
        this.comments = comments;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    public Location() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column location.location_id
     *
     * @return the value of location.location_id
     *
     * @mbggenerated
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column location.location_id
     *
     * @param locationId the value for location.location_id
     *
     * @mbggenerated
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column location.lon
     *
     * @return the value of location.lon
     *
     * @mbggenerated
     */
    public Double getLon() {
        return lon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column location.lon
     *
     * @param lon the value for location.lon
     *
     * @mbggenerated
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column location.lat
     *
     * @return the value of location.lat
     *
     * @mbggenerated
     */
    public Double getLat() {
        return lat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column location.lat
     *
     * @param lat the value for location.lat
     *
     * @mbggenerated
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column location.comments
     *
     * @return the value of location.comments
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column location.comments
     *
     * @param comments the value for location.comments
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column location.status
     *
     * @return the value of location.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column location.status
     *
     * @param status the value for location.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}