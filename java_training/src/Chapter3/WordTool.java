package Chapter3;

public class WordTool {
    public WordTool() {
    }

    public static void testing() {
        System.out.println("Testing...");
    }

    public static void main(String[] args) {
        //static keyword indicates the var/method belongs to class only and not objects.
        testing();
        WordTool.testing();


        WordTool wc = new WordTool();
        int count = wc.wordCount("testing one two three");
        System.out.println("word count = " + count);
    }

    public int wordCount ( String s ) {
        int count = 0; // variable to count words
        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            // use the split method from the String class to
            // separate the words having the whitespace as separator
            String[] w = s.split("\\s+");
            count = w.length;
            }
        return count;
    }

    public int symbolCount ( String s, boolean withSpaces ) {
        int count = 0; // variable to count symbols
        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if ( !(s == null || s.isEmpty()) ) {
            if (withSpaces) {
                // with whitespaces return the full length
                count = s.length();
                } else {
                // without whitespaces, eliminate whitespaces
                // and get the length on the fly
                count = s.replace(" ", "").length();
                }
            }
        return count;
    }

}
