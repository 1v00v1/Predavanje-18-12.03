package zadaci.zadatak3;

public class Polaznik {
    private String ime;
    private String prezime;
    private int dob;

    public Polaznik(String ime, String prezime, int dob) {
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
    }

    public int getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", dob=" + dob +
                '}';
    }
}
