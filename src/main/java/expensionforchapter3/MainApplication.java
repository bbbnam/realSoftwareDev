package expensionforchapter3;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        final BankTransactionsAnalyzerLowCoupling bankStatementAnalyzer
                = new BankTransactionsAnalyzerLowCoupling();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);
    }
}
