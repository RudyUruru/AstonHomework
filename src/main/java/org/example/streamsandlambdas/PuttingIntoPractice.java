package org.example.streamsandlambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        System.out.println("Все транзакции за 2011 год, отсортированные по сумме от меньшей к большей:");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        System.out.println("Список неповторяющихся городов, в которых работают трейдеры");
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        System.out.println("Список трейдеров из Кембриджа, отсортированный по именам.");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        //4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        String tradersNames = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("Имена трейдеров, отсортированные в алфавитном порядке " + tradersNames);

        //5. Выяснить, существует ли хоть один трейдер из Милана.
        boolean milanTraderExists = transactions.stream()
                .anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
        System.out.println("Есть ли трейдер из Милана: " + milanTraderExists);

        //6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        int cambridgeTransactionsSum = transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("Сумма всех транзакций из Кембриджа: " + cambridgeTransactionsSum);

        //7. Какова максимальная сумма среди всех транзакций?
        int maxTransaction = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();
        System.out.println("Максимальная транзакция: " + maxTransaction);

        //8. Найти транзакцию с минимальной суммой.
        int minTransaction = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
        System.out.println("Минимальная транзакция: " + minTransaction);
    }
}