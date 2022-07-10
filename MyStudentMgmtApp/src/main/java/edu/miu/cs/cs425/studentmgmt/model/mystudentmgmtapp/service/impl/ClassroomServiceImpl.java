package edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.repository.ClassroomRepository;
import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    ClassroomRepository classroomRepository;

    @Override
    public Classroom addNewClassroom(Classroom classroom) {
        var newClassroom = classroomRepository.save(classroom);
        return newClassroom;
    }

    @Override
    public Classroom getClassroom(Long classroomId) {
        var classroom = classroomRepository.findById(classroomId).orElse(null);
        return classroom;
    }

}
