public class Hamming {
    String leftStrand, rightStrand;
    int lenghtOfString;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand =rightStrand;
        lenghtOfString = leftStrand.length();
    }

    int getHammingDistance() {
        int hammingDistance = 0;
        for(int i = 0; i < lenghtOfString; i++) {
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
        return hammingDistance;

    }

}
