// Кастомный функциональный интерфейс
// возвращает новый объект Калькулятора
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
