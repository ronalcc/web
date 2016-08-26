package admin.model;

public class Venuestype extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venuesType.venuesType_id
     *
     * @mbggenerated
     */
    private Integer venuestypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venuesType.venuesType_name
     *
     * @mbggenerated
     */
    private String venuestypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column venuesType.comments
     *
     * @mbggenerated
     */
    private String comments;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venuesType
     *
     * @mbggenerated
     */
    public Venuestype(Integer venuestypeId, String venuestypeName, String comments) {
        this.venuestypeId = venuestypeId;
        this.venuestypeName = venuestypeName;
        this.comments = comments;
    }

    public Venuestype(String venuestypeName, String comments) {
        this.venuestypeName = venuestypeName;
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venuesType
     *
     * @mbggenerated
     */
    public Venuestype() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venuesType.venuesType_id
     *
     * @return the value of venuesType.venuesType_id
     *
     * @mbggenerated
     */
    public Integer getVenuestypeId() {
        return venuestypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venuesType.venuesType_id
     *
     * @param venuestypeId the value for venuesType.venuesType_id
     *
     * @mbggenerated
     */
    public void setVenuestypeId(Integer venuestypeId) {
        this.venuestypeId = venuestypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venuesType.venuesType_name
     *
     * @return the value of venuesType.venuesType_name
     *
     * @mbggenerated
     */
    public String getVenuestypeName() {
        return venuestypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venuesType.venuesType_name
     *
     * @param venuestypeName the value for venuesType.venuesType_name
     *
     * @mbggenerated
     */
    public void setVenuestypeName(String venuestypeName) {
        this.venuestypeName = venuestypeName == null ? null : venuestypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column venuesType.comments
     *
     * @return the value of venuesType.comments
     *
     * @mbggenerated
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column venuesType.comments
     *
     * @param comments the value for venuesType.comments
     *
     * @mbggenerated
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}