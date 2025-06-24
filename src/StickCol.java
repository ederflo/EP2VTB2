import java.util.LinkedList;

public class StickCol implements StarCollection {
    BalancedStick stick;

    public StickCol(BalancedStick stick) {
        this.stick = stick;
    }

    @Override
    public boolean contains(Star s) {
        for (Star star : stick)
            if (star.equals(s))
                return true;
        return false;
    }

    @Override
    public StarIterator iterator() {
        return stick.iterator();
    }
}