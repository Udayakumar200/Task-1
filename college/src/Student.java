class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;


    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException");
        }
        if (!name.matches("^[a-zA-Z ]+$")) {
            throw new NameNotValidException("NameNotVaildException");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Other methods of the Student class...

    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", age=" + age + ", course='" + course + '\'' + '}';
    }
}

