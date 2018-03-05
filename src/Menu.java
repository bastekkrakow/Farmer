import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu(List<Zwierze> animals1, List<Stodola> stodola) {
        int opcja;
        Scanner scannerIntow = new Scanner(System.in);
        Scanner scannerStringow = new Scanner(System.in);

        do {
            System.out.println("Liczba zwierząt: " + animals1.size());
            System.out.println("Witamy w programie Farmer. Proszę wybrać opcję:");
            System.out.println("1) Dodaj zwierzę");
            System.out.println("2) Usuń zwierzę");
            System.out.println("3) Dodaj stodołę");
            System.out.println("4) Usuń stodołę");
            System.out.println("5) Wyświetl 5 najstarszych zwierząt");
            System.out.println("6) Wyświetl 5 najmłodszych zwierząt");
            System.out.println("7) Wyświetl stodołę z największą ilością zwierząt");
            System.out.println("8) Wyświetl najliczniejszy gatunek");
            System.out.println("9) Wyświetl szczepione zwierzęta");
            System.out.println("10) Wyjście z aplikacji i wyświetlenie listy zwierząt");

            opcja = scannerIntow.nextInt();

            switch (opcja) {
                case 1:
                    String gat;
                    int age;
                    boolean szcz;
                    System.out.println("Wybrano opcję nr 1");
                    System.out.println("1) Dodaj zwierzę");
                    System.out.println("Wpisz gatunek: ");
                    gat = scannerStringow.nextLine();
                    System.out.println("Wpisz wiek: ");
                    age = scannerIntow.nextInt();
                    System.out.println("Wpisz czy szczepiony: ");
                    szcz = scannerIntow.nextBoolean();
                    animals1.add(new Zwierze(gat, age, szcz));
                    break;
                case 2:
                    int delete;
                    System.out.println("Wybrano opcję nr 2");
                    System.out.println("2) Usuń zwierzę");
                    Scanner se = new Scanner(System.in);
                    System.out.println("Wpisz numer kolejny zwięrzęcia do usunięcia, oto lista: (pamiętaj że są liczone od zera ");
                    System.out.println("Liczba wszystkich zwierząt: " + (animals1.size() - 1));
                    for (Zwierze animalqq : animals1) {
                        System.out.println(animalqq);
                    }
                    delete = se.nextInt();
                    animals1.remove(delete);
                    break;
                case 3:
                    System.out.println("Dodaj stodołę");
                    for (int i = 0; i < stodola.size(); i++) {
                        System.out.println("Numer stodoły to: " + i + " " + stodola.get(i));
                    }
                    System.out.println("Wpisz ID");
                    int id = scannerIntow.nextInt();
                    System.out.println("Wpisz nazwę");
                    String nazwa = scannerStringow.nextLine();
                    int jakiZwierze = scannerIntow.nextInt();
                    stodola.add(new Stodola(id, nazwa, animals1.get(jakiZwierze)));
                    break;
                case 4:
                    System.out.println("Usuń stodołę");
                    System.out.println("Podaj numer stodoły z listy  do usunięcia");
                    for (int i = 0; i < stodola.size(); i++) {
                        System.out.println("Numer stodoły to: " + i + " " + stodola.get(i));
                    }
                    int remove = scannerIntow.nextInt();
                    stodola.remove(remove);
                case 5:
                    System.out.println("5) Wyświetl 5 najstarszych zwierząt");

                     Collections.sort(animals1);

                    for (int i = animals1.size()-1;i>=animals1.size()-5 ; i--) {
                        System.out.println(animals1.get(i));
                    }
                break;
                case 6:
                    System.out.println("6) Wyświetl 5 najmłodszych zwierząt");
                    Collections.sort(animals1);
                    for (int i = 0; i <= 4; i++) {
                        System.out.println(animals1.get(i));
                    }

                 /*   System.out.println(animals1.stream()
                            .mapToInt(s -> s.getWiek())
                            .min().getAsInt()
                    ); */
                    break;
                case 7:
                  System.out.println("7) Wyświetl stodołę z największą ilością zwierząt");
                  System.out.println(stodola.stream()
                            .map(s -> s.getZwierze())
                            .count()
                    );
                    break;
                case 8:
                    System.out.println("8) Wyświetl najliczniejszy gatunek");
                    System.out.println(animals1.stream()
                            .map(s -> s.getGatunek())
                            .count()
                    );
                    break;
                case 9:
                    System.out.println("9) Wyświetl szczepione zwierzęta");
                    for (int i = 0; i < animals1.size(); i++) {
                        if (animals1.get(i).szczepione == true) System.out.println(animals1.get(i));

                    }
                case 10:
                    System.out.println("Wyjście z aplikacji i wyświetlenie listy zwierząt");
                    for (
                            Zwierze animalqq : animals1)

                    {
                        System.out.println(animalqq);
                    }
                    break;
                default:
                    System.out.println("nieprzewidziana sytuacja");
            }
        }
        while (opcja != 10);
    }
}