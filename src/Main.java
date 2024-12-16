import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Map<String, Pessoa> mapa = new HashMap<>();
        mapa.put("João", new Pessoa("João", LocalDate.now()));
        mapa.put("Maria", new Pessoa("Maria", LocalDate.now()));
        mapa.put("Pedro", new Pessoa("Pedro", LocalDate.now()));
        System.out.println(mapa.get("João"));
        System.out.println(mapa.get("akjsahdjkas"));

    }
}