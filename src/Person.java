public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private boolean hasOscar;
    private boolean hasGoldenGlobe;

    public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hasOscar = hasOscar;
        this.hasGoldenGlobe = hasGoldenGlobe; }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public Gender getGender() {return gender;}
    public boolean isHasOscar() {return hasOscar;}
    public boolean isHasGoldenGlobe() {return hasGoldenGlobe;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setGender(Gender gender) {this.gender = gender;}
    public void setHasOscar(boolean hasOscar) {this.hasOscar = hasOscar;}
    public void setHasGoldenGlobe(boolean hasGoldenGlobe) {this.hasGoldenGlobe = hasGoldenGlobe;}

    public String toXMLString(){
        return "<person>"
             + "<firstName>" + this.firstName + "</firstName>"
             + "<lastName>" + this.lastName + "</lastName>"
             + "<gender>" + this.gender + "</gender>"
             + "<hasOscar>" + this.hasOscar + "</hasOscar>"
             + "<hasGoldenGlobe>" + this.hasGoldenGlobe + "</hasGoldenGlobe>"
             + "</person>"; }
}