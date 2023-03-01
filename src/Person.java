public class Person {

    private String name;
    private String vorname;
    private char geschlecht;

    public Person(String pName, String pVorname, char pGeschlecht){
        name = pName;
        vorname = pVorname;
        geschlecht = pGeschlecht;
    }
    public String getVorname() {
        return vorname;
    }
    public char getGeschlecht() {
        return geschlecht;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", geschlecht=" + geschlecht +
                '}';
    }
}
