import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plik {

    public void czytajPlik(File file, StringBuilder stringBuilder) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int read;
            while ((read = fileInputStream.read()) != -1) {
                stringBuilder.append((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
            }
        }
    }

    public void zapisDoPliku(File file, List<Zwierze> animals1) {

        Zwierze[] bar = animals1.toArray(new Zwierze[animals1.size()]);


        String doPliku = Arrays.toString(bar);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write((doPliku + "\r\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static List<Zwierze> getZwierzes(String listaZwierzat) {
        String newnapis = listaZwierzat.replace("Zwierze{gatunek=", " ");
        String newnapis0 = newnapis.replace("[", "");
        String newnapis01 = newnapis0.replace("]", "");
        String newnapis1 = newnapis01.replace(" wiek=", " ");
        String newnapis2 = newnapis1.replace(" szczepione=", " ");
        String newnapis3 = newnapis2.replace("}, ", "/");
        String newnapis4 = newnapis3.replace("'", "");
        String newnapis5 = newnapis4.replace(" ", "");

        String[] tablicaZwierzat = newnapis5.split("/");

        Zwierze[] animals = new Zwierze[tablicaZwierzat.length];
        List<Zwierze> animals1 = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            String foo = tablicaZwierzat[i];
            String[] tnij = foo.split(",");
            animals1.add(new Zwierze(tnij[0],
                    Integer.valueOf(tnij[1]),
                    Boolean.parseBoolean(tnij[2])));

        }
        return animals1;
    }
}

