import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ElkaTry toy = new Round("Кружок", Colour.RED);
        Figure dedMoroz = new Figure("ДедМороз", Colour.RED, true);
        Star star1 = new Star("Звезда", Colour.WHITE);
        ElkaTry star2 = new Star("Звезда2", Colour.BLACK);
        Elka elka = new Elka("елка");
        elka.addToy(toy);
        elka.addToy(dedMoroz);
        elka.addToy(star1);
        elka.addToy(star2);
        System.out.println(elka.countToysOfColor(Colour.BLACK));
        System.out.println(elka.countToysOfColor(Colour.RED));

        Collections.sort(elka.getToys());

        Comparator<ElkaTry> colorsComparator = new Comparator<ElkaTry>() {
            @Override
            public int compare(ElkaTry o1, ElkaTry o2) {
                if (o1 == null && o2 == null) {
                    return 0;

                }
                if (o1 != null && o2 == null) {
                    return 1;
                }
                if (o1 == null && o2 != null) {
                    return -1;
                }
                return o1.getColour().compareTo(o2.getColour());
            }
        };
                Collections.sort(elka.getToys(), colorsComparator);
            }
        }







