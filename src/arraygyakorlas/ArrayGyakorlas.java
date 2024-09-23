package arraygyakorlas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayGyakorlas {
    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();
        ArrayList<Integer> szamok1 = new ArrayList<>();
        ArrayList<Integer> egeszek = new ArrayList<>();
        Random rnd = new Random();

        
        System.out.println("Csak a páros random számok: ");
        for (int i = 10; i <= 20; i++) {
            int random_szamok = rnd.nextInt(10, 21);
            szamok.add(random_szamok);
        }

        szamok.removeIf(n -> n % 2 != 0);
        
        System.out.println(szamok);
        
        
        System.out.println("Páros és páratlan számok: ");
        for (int i = 10; i <= 20; i++) {
            int random_szamok = rnd.nextInt(10, 21);
            szamok.add(random_szamok);
        }

        
        
        System.out.println(szamok);
        
        //Melyikből mennyi van
        HashMap<Integer, Integer>statisztika = new HashMap<>();
        for (int szam : egeszek) {
            int kulcs = szam;
            if(statisztika.containsKey(kulcs)){
                int ertek = statisztika.get(kulcs);
                statisztika.put(kulcs, ertek++);
            } else {
                statisztika.put(kulcs,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : statisztika.entrySet()) {
            int kulcs = 0;
            int ertek = 0;
            String s = "[%d] = %d%n".formatted(kulcs,ertek);
        }
        
    }
}