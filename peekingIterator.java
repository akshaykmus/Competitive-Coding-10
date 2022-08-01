//Time : O(1)
//S:O(1)

class PeekingIterator implements Iterator<Integer> {
    Integer curr = null;
    Iterator<Integer> it = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.it = iterator;
        curr = it.next();

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return curr;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer res = curr;
        curr = it.hasNext() ? it.next() : null;
        return res;

    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }
}