package com.rank;

public class StudentInfo {
    public int regNo;
    int mark1;
    int mark2;
    int mark3;
    int total=0;

    public StudentInfo(int regNo, int mark1, int mark2, int mark3, int total) {
        this.regNo = regNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.total=total;
    }


    public int totalMarks(){
        int total = this.mark1+this.mark2+this.mark3;
        this.total=total;
        return this.total;



    }

}
