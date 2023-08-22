package academy.spring.cashcardapplication;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project cashcard-application
 * @created 8/22/2023
 */
import org.springframework.data.annotation.Id;

public record CashCard(@Id Long id, Double amount, String owner) {
}