class RaindropConverter {

    String convert(int number) {
        boolean factThree = number % 3 == 0 ? true : false;
        boolean factFive = number % 5 == 0 ? true : false;
        boolean factSeven = number % 7 == 0 ? true : false;
        StringBuilder answer = new StringBuilder();
        if (!factThree && !factFive && !factSeven) {
            answer.append(Integer.toString(number));
        }
        else {
            if(factThree) {
                answer.append("Pling");
            }
            if(factFive) {
                answer.append("Plang");
            }
            if(factSeven) {
                answer.append("Plong");
            }
        }
        return answer.toString();
    }

}
