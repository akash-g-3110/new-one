package com.rank;

public class Ranklist {
    public static void main(String[] args) {
        StudentInfo s1=new StudentInfo(100,80,90,60,0);
        StudentInfo s2=new StudentInfo(101,90,89,67,0);
        StudentInfo s3=new StudentInfo(102,67,89,90,0);

        if (s1.mark1> s2.mark1 &&  s1.mark1 >s3.mark1) {
            System.out.println("1st rank  is: "+"regno  "  +s1.regNo+"  congrats");
        }
        else if (s2.mark1>s1.mark1&& s2.mark1> s3.mark1)
            System.out.println("1st rank  is: "+"regno  "  +s2.regNo+"  congrats");
        else
            System.out.println("1st rank  is: "+"regno  "+s3.regNo+"  congrats");

        if (s1.mark2> s2.mark2 &&  s1.mark2 >s3.mark2) {
            System.out.println("1st rank  is: "+"regno  "+s1.regNo+"  congrats");
        }
        else if (s2.mark2>s1.mark2&& s2.mark2> s3.mark2)
            System.out.println("1st rank  is: "+"  regno"+s2.regNo+"  congrats");
        else
            System.out.println("1st rank  is: "+"  regno"+s3.regNo+"  congrats");

        if (s1.mark3> s2.mark3 &&  s1.mark3 >s3.mark3) {
            System.out.println("1st rank  is: "+"  regno"+s1.regNo+"  congrats");
        }
        else if (s2.mark3>s1.mark3&& s2.mark3> s3.mark3)
            System.out.println("1st rank  is: "+"regno  "+s2.regNo+"  congrats");
        else
            System.out.println("1st rank  is: "+"regno  "+s3.regNo+"  congrats");
        s1.totalMarks();

        System.out.println(s1.total);

    }
}
