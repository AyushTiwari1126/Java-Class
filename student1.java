class Student {
    public long rollno;
    public String name;
    public String course;
    public float m1, m2, m3;

    public float total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() > 80) {
            return 'A';
        } else if (average() > 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public String details() {
        return "Rollno : " + rollno + "\n" + "Name : " + name + "\n" + "Course : " + course;
    }
}

public class student1 {
    public static void main(String[] args) {

        Student st = new Student();

        st.rollno = 433;
        st.name = "Ayush Tiwari";
        st.course = "B.Tech";
        st.m1 = 55;
        st.m2 = 62;
        st.m3 = 76;

        System.out.println("Detais of Student :-\n" + st.details());
        System.out.println("Total marks : " + st.total());
        System.out.println("Average marks : " + st.average());
        System.out.println("Grade : " + st.grade());
    }
}
