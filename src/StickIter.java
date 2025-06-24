import java.util.NoSuchElementException;

public class StickIter implements StarIterator {
    private StarIterator iterLeft;
    private StarIterator iterRight;

    public StickIter(Mobile left, Mobile right) {
        this.iterLeft = left.iterator();
        this.iterRight = right.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterLeft.hasNext() || iterRight.hasNext();
    }

    @Override
    public Star next() {
        if (!hasNext())
            throw new NoSuchElementException("no star element!");
        if (iterLeft.hasNext())
            return iterLeft.next();

        return iterRight.next();
    }
}
