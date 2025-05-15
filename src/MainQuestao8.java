import java.util.LinkedList;
import java.util.List;

public class MainQuestao8 {

    //REPOSTA LETRA A
    public static List<Integer> uniaoSemRepeticao(List<Integer> l1, List<Integer> l2) {
        List<Integer> l3 = new LinkedList<>();

        for (Integer valor : l1) {
            if (!l3.contains(valor)) {
                l3.add(valor);
            }
        }

        for (Integer valor : l2) {
            if(!l3.contains(valor)) {
                l3.add(valor);
            }
        }

        return l3;
    }

    public static List<Integer> intersecao(List<Integer> l1, List<Integer> l2) {
        List<Integer> l4 = new LinkedList<>();
        for (Integer valor : l1) {
            if(l2.contains(valor) && !l4.contains(valor)) {
                l4.add(valor);
            }
        }
        return l4;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);

        List<Integer> l3 = uniaoSemRepeticao(l1, l2);
        List<Integer> l4 = intersecao(l1, l2);

        System.out.println("L1: " + l1);
        System.out.println("L2: " + l2);
        System.out.println("L3 (união sem repetição): " + l3);
        System.out.println("L4 (interseção): " + l4);
    }
}
