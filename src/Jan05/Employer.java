package Jan05;

 class Employer {

    int id;
    double capital;
    String name;

    Employer(int id, double capital, String name) {
        this.id = id;
        this.capital = capital;
        this.name = name;
    }


    void show() {
        System.out.println(id + " " + name + " " + capital);
    }

    @Override
    public boolean equals(Object obj) {
        Employer e = (Employer) obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}


