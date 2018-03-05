import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        File file = new File("farma.txt");

        StringBuilder stringBuilder = new StringBuilder();

        Plik plik = new Plik();

        plik.czytajPlik(file, stringBuilder);

        String listaZwierzat = stringBuilder.toString();

        List<Zwierze> animals1 = plik.getZwierzes(listaZwierzat);

        List<Stodola> stodola = new ArrayList<>();

        Stodola.stodolaList(animals1, stodola);

        Menu menuStodola = new Menu();

        menuStodola.menu(animals1, stodola);

        plik.zapisDoPliku(file, animals1);
    }
}



