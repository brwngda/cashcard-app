package academy.spring.cashcardapplication;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project cashcard-application
 * @created 8/22/2023
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface CashCardRepository extends CrudRepository<CashCard, Long>, PagingAndSortingRepository<CashCard, Long> {
    CashCard findByIdAndOwner(Long id, String owner);
    Page<CashCard> findByOwner(String owner, PageRequest amount);
    boolean existsByIdAndOwner(Long id, String owner);
}