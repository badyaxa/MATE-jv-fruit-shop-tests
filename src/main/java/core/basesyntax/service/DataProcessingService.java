package core.basesyntax.service;

import core.basesyntax.model.Transaction;
import java.util.List;

public interface DataProcessingService {
    void processData(List<Transaction> activities);
}