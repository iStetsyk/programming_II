package hashset;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringHashSet implements Set<String> {

    private List<List<String>> buckets;

    public StringHashSet() {
        buckets = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    @Override
    public int size() {
        for (List<String> number : buckets) {
            int retval = buckets.size();
            System.out.println("Size of list = " + retval);
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        for (List<String> bucket : this.buckets) {
            if (!bucket.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(Object element) {
        int hash = element.hashCode();
        int index = Math.abs(hash % buckets.size());
        List<String> bucket = buckets.get(index);
        return bucket.contains(element);
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String potencialMember) {
        int hash = potencialMember.hashCode();
        int index = Math.abs(hash % this.buckets.size());
        List<String> bucket = this.buckets.get(index);
        if (bucket.contains(potencialMember)) {
            return false;
        }
        bucket.add(potencialMember);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (List<String> bucket : this.buckets) {
            bucket.clear();
        }
    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super String> filter) {
        return false;
    }

    @Override
    public Stream<String> stream() {
        return null;
    }

    @Override
    public Stream<String> parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public String toString() {
        return "{" + this.buckets.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining(", ")) + "}";
    }
}
