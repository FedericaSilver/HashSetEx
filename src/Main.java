/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeHashSet());
        HashSet<String> elenco2 = makeHashSet();
        String b = "Luigi";
        elenco2.add(b);
        if(elenco2.contains(b)){
        System.out.println(elenco2);
    }
    }
    public static HashSet<String> makeHashSet(){
        HashSet<String> elenco = new HashSet<>();
        elenco.add("Marco");
        elenco.add("Simone");
        elenco.add("Federica");
        elenco.add("Maria");

        return elenco;
    }
}