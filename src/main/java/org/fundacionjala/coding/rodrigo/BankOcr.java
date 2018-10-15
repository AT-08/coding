package org.fundacionjala.coding.rodrigo;

/**
 * KataBankOCR.
 */
public final class BankOcr {
    static final String[] DIGITS = {
            " _ | ||_|",    //zero
            "     |  |",    //one
            " _  _||_ ",    //two
            " _  _| _|",    //three
            "   |_|  |",    //four
            " _ |_  _|",    //five
            " _ |_ |_|",    //six
            " _   |  |",    //seven
            " _ |_||_|",    //eight
            " _ |_| _|"};   //nine

    /**
     * Empty Constructor.
     */
    private BankOcr() {
    }

    /**
     * @param account input like 7 segment.
     * @return processed digits.
     */
    public static String convertOcrToNumber(final String account) {
        final int numsep = 3;
        String[] line = account.split("\n");
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < line[0].length() / numsep; i++) {
            StringBuilder aux = new StringBuilder();
            aux.append(line[0], numsep * i, numsep + (numsep * i))
                    .append(line[1], numsep * i, numsep + (numsep * i))
                    .append(line[2], numsep * i, numsep + (numsep * i));
            number.append(searchDigit(aux.toString()));
        }

        return number.toString();
    }

    /**
     * @param account String account.
     * @return The number processed with ILL or ERR verification.
     */
    public static String verificationIllErr(final String account) {
        if (account.contains("?")) {
            return account.concat(" ILL");
        }
        if (!isValidCheckSum(account)) {
            return account.concat(" ERR");
        }
        return account;
    }

    /**
     * Search if exist a digit in the constant array.
     *
     * @param ocr the Ocr input.
     * @return The number in string.
     */
    private static String searchDigit(final String ocr) {
        for (int i = 0; i < DIGITS.length; i++) {
            if (ocr.equals(DIGITS[i])) {
                return Integer.toString(i);
            }
        }
        return "?";
    }

    /**
     * @param account Input acc.
     * @return the checksum.
     */
    public static boolean isValidCheckSum(final String account) {
        final int checknum = 11;
        String[] parts = account.split("");
        int checksum = 0;
        for (int i = 0; i < parts.length; i++) {
            int number = Integer.parseInt(parts[i]);
            checksum += number * (parts.length - i);
        }
        return checksum % checknum == 0;
    }
}
