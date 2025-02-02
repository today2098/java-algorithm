package algorithm.utils;

import java.util.Objects;

public class Pair<F, S> {
    public F first;
    public S second;

    public Pair() {
        this(null, null);
    }

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair))
            return false;
        Pair<?, ?> another = (Pair<?, ?>) obj;
        return Objects.equals(first, another.first) && Objects.equals(second, another.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    };

    @Override
    public String toString() {
        return String.format("{%s, %s}", first.toString(), second.toString());
    };
}
