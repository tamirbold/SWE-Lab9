package edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.service;

import edu.miu.cs.cs425.studentmgmt.model.mystudentmgmtapp.model.Transcript;

public interface TranscriptService {
    public abstract Transcript addNewTranscript(Transcript transcript);

    public abstract Transcript getTransctipt(Long transcriptId);
}
