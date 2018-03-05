import java.util.List;
import java.util.Objects;

public class Stodola {

    int id;
    String nazwaStodoly;
    Zwierze zwierze;

    @Override
    public String toString() {
        return "Stodola{" +
                "id=" + id +
                ", nazwaStodoly='" + nazwaStodoly + '\'' +
                ", zwierze=" + zwierze +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stodola stodola = (Stodola) o;
        return id == stodola.id &&
                Objects.equals(nazwaStodoly, stodola.nazwaStodoly) &&
                Objects.equals(zwierze, stodola.zwierze);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nazwaStodoly, zwierze);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwaStodoly() {
        return nazwaStodoly;
    }

    public void setNazwaStodoly(String nazwaStodoly) {
        this.nazwaStodoly = nazwaStodoly;
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }

    public Stodola(int id, String nazwaStodoly, Zwierze zwierze) {
        this.id = id;
        this.nazwaStodoly = nazwaStodoly;
        this.zwierze = zwierze;
    }

    public static void stodolaList(List<Zwierze> animals1, List<Stodola> stodola) {
        stodola.add(new Stodola(1, "Stodoła 1", animals1.get(0)));
        stodola.add(new Stodola(1, "Stodoła 1", animals1.get(1)));
        stodola.add(new Stodola(1, "Stodoła 1", animals1.get(2)));
        stodola.add(new Stodola(1, "Stodoła 1", animals1.get(3)));
        stodola.add(new Stodola(1, "Stodoła 1", animals1.get(4)));
        stodola.add(new Stodola(2, "Stodoła 2", animals1.get(5)));
        stodola.add(new Stodola(2, "Stodoła 2", animals1.get(6)));
        stodola.add(new Stodola(2, "Stodoła 2", animals1.get(7)));
        stodola.add(new Stodola(2, "Stodoła 2", animals1.get(8)));
        stodola.add(new Stodola(2, "Stodoła 2", animals1.get(9)));
    }

}
