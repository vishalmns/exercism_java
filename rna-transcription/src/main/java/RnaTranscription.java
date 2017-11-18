import java.util.regex.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        if(Pattern.matches("[GCAT]*",dnaStrand)) {
            dnaStrand = dnaStrand.replace("G", "X");
            dnaStrand = dnaStrand.replace("C", "G");
            dnaStrand = dnaStrand.replace("X", "C");
            dnaStrand = dnaStrand.replace("A", "U");
            dnaStrand = dnaStrand.replace("T", "A");

            return dnaStrand;
        }
        else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

}
