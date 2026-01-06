package Jan05;

 class Employer {

   private int id;
   private double capital;
   private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer(int id, double capital, String name) {
        this.id = id;
        this.capital = capital;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employer{" + "id=" + id + ", capital=" + capital + ", name=" + name + '}';
    }

   

    void show() {
        System.out.println(id + " " + name + " " + capital);
    }

   
    }



