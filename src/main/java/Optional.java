import java.util.NoSuchElementException;

public sealed interface Optional<T> {

    T get() throws NoSuchElementException;
    T take() throws NoSuchElementException;
    T exchange(T other);




    record Some<T>(T value) implements Optional {}
    record None<T>() {}
}