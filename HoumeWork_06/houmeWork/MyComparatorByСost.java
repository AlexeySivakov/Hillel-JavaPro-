package houmeWork;

import java.util.Comparator;

public class MyComparatorByСost implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return (((Car) o1).getСost() - ((Car) o2).getСost());
    }
}