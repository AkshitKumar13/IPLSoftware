package com.model;

/**
 * The type Json model.
 */
public class ProducerModel {
    private long id;
    /**
     * The Result.
     */
    private String result;
    private String  scheduledate;
    private String time;
    private String venue;
    private String team1Description;
    private String team2Description;

    private String team1Wickets;

    /**
     * Gets scheduledate.
     *
     * @return the scheduledate
     */
    public String getScheduledate() {
        return scheduledate;
    }

    /**
     * Sets scheduledate.
     *
     * @param scheduledate the scheduledate
     */
    public void setScheduledate(String scheduledate) {
        this.scheduledate = scheduledate;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Gets venue.
     *
     * @return the venue
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets venue.
     *
     * @param venue the venue
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * Gets team 1 description.
     *
     * @return the team 1 description
     */
    public String getTeam1Description() {
        return team1Description;
    }

    /**
     * Sets team 1 description.
     *
     * @param team1Description the team 1 description
     */
    public void setTeam1Description(String team1Description) {
        this.team1Description = team1Description;
    }

    /**
     * Gets team 2 description.
     *
     * @return the team 2 description
     */
    public String getTeam2Description() {
        return team2Description;
    }

    /**
     * Sets team 2 description.
     *
     * @param team2Description the team 2 description
     */
    public void setTeam2Description(String team2Description) {
        this.team2Description = team2Description;
    }

    /**
     * Gets team 1 wickets.
     *
     * @return the team 1 wickets
     */
    public String getTeam1Wickets() {
        return team1Wickets;
    }

    /**
     * Sets team 1 wickets.
     *
     * @param team1Wickets the team 1 wickets
     */
    public void setTeam1Wickets(String team1Wickets) {
        this.team1Wickets = team1Wickets;
    }

    /**
     * Gets team 2 wickets.
     *
     * @return the team 2 wickets
     */
    public String getTeam2Wickets() {
        return team2Wickets;
    }

    /**
     * Sets team 2 wickets.
     *
     * @param team2Wickets the team 2 wickets
     */
    public void setTeam2Wickets(String team2Wickets) {
        this.team2Wickets = team2Wickets;
    }

    /**
     * Gets team 1 overs.
     *
     * @return the team 1 overs
     */
    public Double getTeam1Overs() {
        return team1Overs;
    }

    /**
     * Sets team 1 overs.
     *
     * @param team1Overs the team 1 overs
     */
    public void setTeam1Overs(Double team1Overs) {
        this.team1Overs = team1Overs;
    }

    /**
     * Gets team 2 overs.
     *
     * @return the team 2 overs
     */
    public Double getTeam2Overs() {
        return team2Overs;
    }

    /**
     * Sets team 2 overs.
     *
     * @param team2Overs the team 2 overs
     */
    public void setTeam2Overs(Double team2Overs) {
        this.team2Overs = team2Overs;
    }

    /**
     * Gets state model.
     *
     * @return the state model
     */
    public String getStateModel() {
        return stateModel;
    }

    /**
     * Sets state model.
     *
     * @param stateModel the state model
     */
    public void setStateModel(String stateModel) {
        this.stateModel = stateModel;
    }

    /**
     * Gets team 1.
     *
     * @return the team 1
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * Sets team 1.
     *
     * @param team1 the team 1
     */
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /**
     * Gets team 2.
     *
     * @return the team 2
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * Sets team 2.
     *
     * @param team2 the team 2
     */
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    private String team2Wickets;
    private Double team1Overs;

    private Double team2Overs;

    private String stateModel;
    private  String team1;

    private String team2;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JsonModel{"
                +
                "id=" + id
                +
                ", result='"
                + result + '\''
                +
                ", scheduledate='"
                + scheduledate
                + '\''
                +
                ", time='"
                + time + '\''
                +
                ", venue='" + venue + '\''
                +
                ", team1Description='" + team1Description + '\''
                +
                ", team2Description='" + team2Description + '\''
                +
                ", team1Wickets='" + team1Wickets + '\''
                +
                ", team2Wickets='" + team2Wickets + '\''
                +
                ", team1Overs=" + team1Overs
                +
                ", team2Overs=" + team2Overs
                +
                ", stateModel='" + stateModel + '\''
                +
                ", team1='" + team1 + '\''
                +
                ", team2='" + team2 + '\''
                +
                '}';
    }
}
