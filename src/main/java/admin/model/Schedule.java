package admin.model;

import java.util.Date;

public class Schedule extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule.schedule_id
     *
     * @mbggenerated
     */
    private Integer scheduleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule.course_id
     *
     * @mbggenerated
     */
    private Integer courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schedule.stime
     *
     * @mbggenerated
     */
    private Date stime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated
     */
    public Schedule(Integer scheduleId, Integer courseId, Date stime) {
        this.scheduleId = scheduleId;
        this.courseId = courseId;
        this.stime = stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbggenerated
     */
    public Schedule() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule.schedule_id
     *
     * @return the value of schedule.schedule_id
     *
     * @mbggenerated
     */
    public Integer getScheduleId() {
        return scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule.schedule_id
     *
     * @param scheduleId the value for schedule.schedule_id
     *
     * @mbggenerated
     */
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule.course_id
     *
     * @return the value of schedule.course_id
     *
     * @mbggenerated
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule.course_id
     *
     * @param courseId the value for schedule.course_id
     *
     * @mbggenerated
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schedule.stime
     *
     * @return the value of schedule.stime
     *
     * @mbggenerated
     */
    public Date getStime() {
        return stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schedule.stime
     *
     * @param stime the value for schedule.stime
     *
     * @mbggenerated
     */
    public void setStime(Date stime) {
        this.stime = stime;
    }
}