
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        if (guessedLetters.contains(letter)){
            
        } else { 
            guessedLetters += letter;
            if(!word.contains(letter)){
            numberOfFaults++; 
            }
        }
    }

    public String hiddenWord() {
        String hiddenString = "";

        for (int i = 0; i < word.length(); i++) {
            String c = "" + word.charAt(i);
            if(guessedLetters.contains(c)){
                hiddenString += c;
            } else {
                hiddenString += "_";
            }
        }
        return hiddenString;
    }
}
