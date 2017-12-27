

class RomanNumeral {
    private int number;
    private String one = "I";
    private String five = "V";
    private String ten = "X";
    private String fifty = "L";
    private String hundered = "C";
    private String fiveHundered = "D";
    private String thousand = "M";

    RomanNumeral(int number) {
        this.number = number;
    }

    public String getRomanNumeral() {
        StringBuilder romanNumber = new StringBuilder();
        int untisPlace = number % 10;
        number = number / 10;
        int tensPlace = number % 10;
        number = number / 10;
        int hundersPlace = number % 10;
        number = number / 10;
        int thousandsPlace = number % 10;
        number = number / 10;

        if (thousandsPlace != 0) {
            for (int digit = 1; digit <= thousandsPlace; digit++) {
                romanNumber.append(thousand);
            }
        }
        if (hundersPlace != 0) {
            if (hundersPlace <= 3) {
                for (int digit = 1; digit <= hundersPlace; digit++) {
                    romanNumber.append(hundered);
                }
            } else if (hundersPlace == 4) {
                romanNumber.append(hundered);
                romanNumber.append(fiveHundered);
            } else if (hundersPlace == 9) {
                romanNumber.append(hundered);
                romanNumber.append(thousand);
            } else {
                romanNumber.append(fiveHundered);
                for (int digit = 6; digit <= hundersPlace; digit++) {
                    romanNumber.append(hundered);
                }
            }
        }
        if (tensPlace != 0) {
            if (tensPlace <= 3) {
                for (int digit = 1; digit <= tensPlace; digit++) {
                    romanNumber.append(ten);
                }
            } else if (tensPlace == 4) {
                romanNumber.append(fifty);
                romanNumber.append(ten);
            } else if (hundersPlace == 9) {
                romanNumber.append(ten);
                romanNumber.append(hundered);
            } else {
                romanNumber.append(fifty);
                for (int digit = 6; digit <= tensPlace; digit++) {
                    romanNumber.append(ten);
                }
            }
        }
        if (untisPlace != 0) {
            if (untisPlace <= 3) {
                for (int digit = 1; digit <= untisPlace; digit++) {
                    romanNumber.append(one);
                }
            } else if (untisPlace == 4) {
                romanNumber.append(five);
                romanNumber.append(one);
            } else if (hundersPlace == 9) {
                romanNumber.append(one);
                romanNumber.append(ten);
            } else {
                romanNumber.append(five);
                for (int digit = 6; digit <= untisPlace; digit++) {
                    romanNumber.append(one);
                }
            }
        }
        return romanNumber.toString();
    }
}