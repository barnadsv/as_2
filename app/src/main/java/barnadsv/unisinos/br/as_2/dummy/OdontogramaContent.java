package barnadsv.unisinos.br.as_2.dummy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class OdontogramaContent {

//    public Map<String, OdontogramaItem> item_map = new HashMap<String, OdontogramaItem>();
//    public List<OdontogramaItem> items = new ArrayList<OdontogramaItem>();
//
//    public OdontogramaContent() {
//        montaOdontogramas();
//    }
//
//    public void montaOdontogramas() {
//        for (int i = 1; i <= 25; i++) {
//            items.add(i, createOdontogramaItem(i));
//        }
//        Collections.sort(items);
//        for (int i = 1; i <= 25; i++) {
//            item_map.put(String.valueOf(i), items.get(i));
//        }
//    }
    /**
     * An array of sample (dummy) items.
     */
    public static final List<OdontogramaItem> ITEMS = new ArrayList<OdontogramaItem>();

    public static final String[] NOMES = {"Pipoca", "Tiziu", "Bob", "Sacolé", "Pimpolho", "Zeca", "Peteca", "Sansão", "Rex"};
    public static final String[] PESOS = {"5kg", "8kg", "6kg", "5kg", "3kg", "20kg", "25kg", "15kg", "13kg"};
    public static final String[] NOMES_PROPRIETARIOS = {"Maria Alice", "Carlos Alberto", "Leonardo", "Eduarda", "José João", "Fernanda", "Tiago", "Ana Maria", "George"};

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, OdontogramaItem> ITEM_MAP = new HashMap<String, OdontogramaItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createOdontogramaItem(i));
        }
//        Collections.sort(ITEMS);
    }

    private static void addItem(OdontogramaItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static OdontogramaItem createOdontogramaItem(int position) {
        return new OdontogramaItem(String.valueOf(position), /*makeRandomDateTime(),*/"Odontograma " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Data do Odontograma: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class OdontogramaItem /*implements Comparable<OdontogramaItem> */ {
        public final String id;
//        public final String dthOdontograma;
//        public final String raca;
//        public final String nome;
//        public final String peso;
//        public final String nomeProprietario;
        public final String content;
        public final String details;

        public OdontogramaItem(String id,
//                               String dthOdontograma,
//                               String raca,
//                               String nome,
//                               String peso,
//                               String nomeProprietario,
                               String content,
                               String details) {
            this.id = id;
//            this.dthOdontograma = dthOdontograma;
//            this.raca = raca;
//            this.nome = nome;
//            this.peso = peso;
//            this.nomeProprietario = nomeProprietario;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return "Odontograma " + content;
        }

//        @Override
//        public int compareTo(OdontogramaItem odontogramaItem) {
//            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
//            int result = 0;
//            try {
//                return formatter.parse(this.dthOdontograma).compareTo(formatter.parse(odontogramaItem.dthOdontograma));
//            } catch (ParseException e) {
//                e.printStackTrace();
//                return result;
//            }
//        }
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static String makeRandomDateTime() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1990, 2016);
        gc.set(gc.YEAR, year);
        int month = randBetween(1, 12);
        gc.set(gc.MONTH, month);
        int maxDay = gc.getActualMaximum(gc.DAY_OF_MONTH);
        int day = randBetween(1, maxDay);
        gc.set(gc.DAY_OF_MONTH, day);
//        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
//        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        int hour = randBetween(8, 18);
        int minute = randBetween(0, 59);
        int second = randBetween(0, 59);
        return String.format("%02d", gc.get(gc.DAY_OF_MONTH)) + "/" + String.format("%02d", gc.get(gc.MONTH)) + "/" + gc.get(gc.YEAR) + " " + String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
}
