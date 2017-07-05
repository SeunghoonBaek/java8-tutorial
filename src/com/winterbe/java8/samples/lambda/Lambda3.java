package src.com.winterbe.java8.samples.lambda;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Common standard functions from the Java API.
 *
 * @author Benjamin Winterberg
 */
public class Lambda3 {

    @FunctionalInterface
    interface Fun {
        void foo();
    }

    public static void main(String[] args) throws Exception {

//        // Predicates
//
//        Predicate<String> predicate = (s) -> s.length() > 0;
//
//        predicate.test("foo");              // true
//        predicate.negate().test("foo");     // false
//
//
//
//        Predicate<String> nonNull = Objects::nonNull;
//
//
//        Predicate<String> isNull = Objects::isNull;
//
//
//        String testStr = "hello";
//        Predicate<String> isEmpty = String::isEmpty;
//        isEmpty.test(testStr);
//
//        Predicate<String> isNotEmpty = isEmpty.negate();
//        isNotEmpty.test(testStr);
//
//
//        // Functions
//
//        Function<String, Integer> toInteger = Integer::valueOf;
//        int valueIs123 = toInteger.apply("123");
//
//
//
//        Function<String, String> backToString = toInteger.andThen(String::valueOf);
//        backToString.apply("123");     // "123"
//
//
//
//        // Suppliers
//
//
//        Supplier<Person> personSupplier = Person::new;
//        Person myPerson = personSupplier.get();   // new Person


//        // Consumers
//
//        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
//        greeter.accept(new Person("Luke", "Skywalker"));
//
//
//
//        // Comparators
//
//        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
//
//        Person p1 = new Person("John", "Doe");
//        Person p2 = new Person("Alice", "Wonderland");
//
//        comparator.compare(p1, p2);
//
//
//        comparator.reversed().compare(p1, p2);  // < 0
//
//
//        // Runnables
//
//        Runnable runnable = () -> System.out.println(UUID.randomUUID());
//        runnable.run();
//
//
//        // Callables
//
//        Callable<UUID> callable = UUID::randomUUID;
//        callable.call();

        String nullString = null;

        Optional<String> optional = Optional.ofNullable(nullString);
        optional.ifPresent((s) -> System.out.println(s));


    }

}
