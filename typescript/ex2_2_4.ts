interface Student { grade: number; }
interface Teacher { course: string; }

class TA implements Student, Teacher {
    grade: number = 0;
    course: string = "";
}

class Volunteer implements Student, Teacher {
    grade: number = 0;
    course: string = "";
}

function getGrade(st: Student & Teacher): number {
    let grade: number = st.grade;
    let course: string = st.course;
    return 0;
}

getGrade(new TA());
getGrade(new Volunteer());
