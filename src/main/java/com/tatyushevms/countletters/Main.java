package com.tatyushevms.countletters;

public class Main {
    
    public static void main(final String[] args) {
        if (args.length != 1) {
            exitWithError("An only input parameter was expected: a word");
            return;
        }
        
        handle(args[0]);
    }
    
    private static void handle(final String word) {
        final SimpleLetterCounter letterCounter = new SimpleLetterCounter();
        
        System.out.println(letterCounter.count(word));
    }
    
    private static void exitWithError(final String message) {
        System.err.println(message);
        System.exit(1);
    }
    
}
