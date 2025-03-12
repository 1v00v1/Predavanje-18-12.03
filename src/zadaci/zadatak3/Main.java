package zadaci.zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Polaznik p1 = new Polaznik("Goran", "Ivo", 40);
        Polaznik p2 = new Polaznik("Marko", "Marković", 22);
        Polaznik p3 = new Polaznik("Ivana", "Perić", 43);

        List<Polaznik> polaznici = new ArrayList<>(List.of(p1, p2, p3));
        System.out.println(polaznici);


        polaznici.sort((o1, o2) -> (o1.getDob() - o2.getDob()));
        System.out.println(polaznici);
    }
}