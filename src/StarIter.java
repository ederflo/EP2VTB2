import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StarIter implements  StarIterator {
    private Star star = null;

    public StarIter(Star star) {
        this.star = star;
    }

    @Override
    public boolean hasNext() {
        return star != null;
    }

    @Override
    public Star next() {
        if (hasNext()) {
            Star result = star;
            star = null;
            return result;
        }

        throw new NoSuchElementException("no star element!");
    }
}
