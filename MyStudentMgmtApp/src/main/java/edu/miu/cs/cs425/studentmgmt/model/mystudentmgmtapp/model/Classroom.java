package edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;

    private String buildingName;
    private String roomNumber;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students = new ArrayList<Student>();

    public Classroom() {
    }

    public Classroom(Long classroomId, String buildingName, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Classroom [buildingName=" + buildingName + ", classroomId=" + classroomId + ", roomNumber=" + roomNumber
                + "]";
    }

}

