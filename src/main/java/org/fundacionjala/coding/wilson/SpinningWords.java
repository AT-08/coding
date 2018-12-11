package org.fundacionjala.coding.wilson;

/**
 *
 */
class SpinningWords {
    /**
     *
     * @param sentence whithout changes
     * @return semtence with changes
     */
    public String spinWords(final String sentence) {
        String[] words = sentence.split(" ");
        final int tam = 4;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > tam) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);

    }

}

