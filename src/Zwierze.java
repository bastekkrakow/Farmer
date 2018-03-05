import java.util.Objects;

public class Zwierze implements Comparable<Zwierze>{

    public String gatunek;
    public int wiek;
    public boolean szczepione;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zwierze zwierze = (Zwierze) o;
        return wiek == zwierze.wiek &&
                szczepione == zwierze.szczepione &&
                Objects.equals(gatunek, zwierze.gatunek);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gatunek, wiek, szczepione);
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "gatunek='" + gatunek + '\'' +
                ", wiek=" + wiek +
                ", szczepione=" + szczepione +
                '}';
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isSzczepione() {
        return szczepione;
    }

    public void setSzczepione(boolean szczepione) {
        this.szczepione = szczepione;
    }

    public Zwierze(String gatunek, int wiek, boolean szczepione) {
        this.gatunek = gatunek;
        this.wiek = wiek;
        this.szczepione = szczepione;
    }

    @Override
  /*  public int compareTo(Zwierze o) {
        int porownanie = gatunek.compareTo(o.gatunek);

        return porownanie; } */

    public int compareTo(Zwierze other) {
        if(this.getWiek() > other.getWiek())
            return 1;
        else if (this.getWiek() == other.getWiek())
            return 0 ;
        return -1 ;
    }

    public int getAge() {
        return this.wiek ;
    }
    }

