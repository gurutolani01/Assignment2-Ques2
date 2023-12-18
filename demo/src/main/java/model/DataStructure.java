package model;


import java.time.LocalDate;
import java.time.LocalDateTime;

//import java.sql.*;
import java.time.LocalTime;
import java.util.Date;

public class DataStructure {
    Date date;
    String month;
   String team;
   String PanelName;
   String Round;
   String skill;
   Date time;
   String CandidateCurrentLocation;
   String CandidatePrefferedLocation;
   String CandidateName;



    public void setMonth(String month) {

        this.month = month;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPanelName(String panelName) {
        PanelName = panelName;
    }

    public void setRound(String round) {
        Round = round;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setCandidateCurrentLocation(String candidateCurrentLocation) {
        CandidateCurrentLocation = candidateCurrentLocation;
    }

    public void setCandidatePrefferedLocation(String candidatePrefferedLocation) {
        CandidatePrefferedLocation = candidatePrefferedLocation;
    }

    public void setCandidateName(String candidateName) {
        CandidateName = candidateName;
    }

    public void setDate(Date date) {
        this.date=date;
    }
}
