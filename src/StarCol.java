import java.util.ArrayList;
import java.util.List;

public class StarCol implements StarCollection {
    private Star star;

    public StarCol(Star star) {
        this.star = star;
    }

    @Override
    public boolean contains(Star s) {
        return star.equals(s);
    }

    @Override
    public StarIterator iterator() {
        return new StarIter(star);
    }
}
