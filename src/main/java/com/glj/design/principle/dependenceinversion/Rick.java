package com.glj.design.principle.dependenceinversion;

public class Rick {
    StudyClass studyClass;

    public void study (){
        studyClass.studying("rick");
    }

    public void setStudyClass(StudyClass studyClass) {
        this.studyClass = studyClass;
    }
}
