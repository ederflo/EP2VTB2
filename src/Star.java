/**
 * Leaf node of a mobile. The actual decoration of a mobile.
 * A {@code Star} has a specified weight, that can not be changed after
 * initialisation. {@code Star} implements {@link Decoration}.
 */
//
// TODO: Complete the methods in 'Star'.
//       You can define further classes and methods for the implementation.
//       You may use the Java-Collection framework.
//
public class Star implements Decoration //TODO: activate clause.
{

    //TODO: define missing parts of the class.
    private int weight = 0;

    /**
     * Initializes {@code this} with its weight.
     *
     * @param weight the weight of this star.
     */
    public Star(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    /**
     * Returns a readable representation of {@code this} with the
     * symbol {@code *} followed by the weight of this star.
     */
    @Override
    public String toString() {
        return "*" + weight;
    }

    @Override
    public StarIterator iterator() {
        return getStarCollection().iterator();
    }

    @Override
    public StarCollection getStarCollection() {
        return new StarCol(this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override
    public int hashCode() {
        return weight;
    }
}
