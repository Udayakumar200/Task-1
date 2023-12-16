class Voter {
    public String voterId;
    public String name;
    public int age;

    public Voter(String voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Voter ID: " + voterId + "\nName: " + name + "\nAge: " + age;
    }
}
