package edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.service;

import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.model.Classroom;

public interface ClassroomService {
    public abstract Classroom addNewClassroom(Classroom classroom);

    public abstract Classroom getClassroom(Long classroomId);
}
