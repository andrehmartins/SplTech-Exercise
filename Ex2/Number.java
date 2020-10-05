public class Number {

    public void number_in_words(int number) {
        String result = "";
        int thousands = 0;
        int aux = 0;
        String aux2 = "";
        //check if it is hundreds of millions
        result = hundreds_million(number);

        //check if it is dozens of million
        result += dozens_million(number);

        //check if it is decimals of million
        result += decimals_million(number);
        if (!result.equals(""))
            result += " million ";

        //check if it is hundreds of thousand
        aux2 = hundreds_thousand(number);
        if (!aux2.equals(""))
            thousands = 1;
        result += aux2;

        //check if it is dozens of thousand
        aux2 = dozens_thousand(number);
        if (!aux2.equals(""))
            thousands = 1;
        result += aux2;

        //check if it is decimals of thousand
        aux2 = decimals_thousand(number);
        result += aux2;

        if (!aux2.equals(""))
            thousands = 1;

        if (thousands != 0)
            result += " thousand ";

        result += hundred(number);

        aux = (number/10)%10;

        if (aux != 0 && aux != 1) {
            result += dozens(aux);
            if (number % 10 != 0) {
                result += "-";
            }
        }
        if (aux == 1){
            result += ten_to_nineteen(number%10);
        }
        else {
            aux = number % 10;
            result += decimals(aux);
        }

        if (result.equals("")) {
            result = "zero";
        }

        System.out.println(result);
    }

    public String decimals(int number) {
        String result = "";

        switch (number) {
            case 1:
                result += "one";
                break;
            case 2:
                result += "two";
                break;
            case 3:
                result += "three";
                break;
            case 4:
                result += "four";
                break;
            case 5:
                result += "five";
                break;
            case 6:
                result += "six";
                break;
            case 7:
                result += "seven";
                break;
            case 8:
                result += "eight";
                break;
            case 9:
                result += "nine";
                break;
        }
        return result;
    }

    public String ten_to_nineteen(int number) {
        String result = "";

        switch (number) {
            case 0:
                result = "ten";
                break;
            case 1:
                result = "eleven";
                break;
            case 2:
                result = "twelve";
                break;
            case 3:
                result = "thirteen";
                break;
            case 4:
                result = "fourteen";
                break;
            case 5:
                result = "fifteen";
                break;
            case 6:
                result = "sixteen";
                break;
            case 7:
                result = "seventeen";
                break;
            case 8:
                result = "eighteen";
                break;
            case 9:
                result = "nineteen";
                break;
        }
        return result;
    }

    public String dozens(int number) {
        String result = "";

        switch (number) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
        }
        return result;
    }

    public String hundreds_million(int number) {
        String result = "";

        int hundreds_millions = number/100000000;

        if (hundreds_millions != 0) {
            result = decimals(hundreds_millions);
            result += " hundred ";
        }

        return result;
    }

    public String dozens_million(int number) {
        String result = "";

        int dozens_millions = (number/10000000)%10;

        if (dozens_millions != 0 && dozens_millions != 1) {
            result = dozens(dozens_millions);
            if (((number / 1000000) % 10) != 0) {
                result += "-";
            }
        }
        else if (dozens_millions == 1) {
            result = ten_to_nineteen((number / 1000000)%10);
        }

        return result;
    }

    public String decimals_million(int number) {
        String result = "";

        int decimals_millions = (number/1000000)%10;

        if (decimals_millions != 0) {
            result = decimals(decimals_millions);
        }

        return result;
    }

    public String hundreds_thousand(int number) {
        String result = "";

        int hundreds_thousands = (number/100000)%10;

        if (hundreds_thousands != 0) {
            result = decimals(hundreds_thousands);
            result += " hundred ";
        }

        return result;
    }

    public String dozens_thousand(int number) {
        String result = "";

        int dozens_thousands = (number/10000)%10;

        if (dozens_thousands != 0 && dozens_thousands != 1) {
            result = dozens(dozens_thousands);

            if (((number / 1000) % 10) != 0) {
                result += "-";
            }
        }
        else if (dozens_thousands == 1) {
            result = ten_to_nineteen((number / 1000)%10);
        }

        return result;
    }

    public String decimals_thousand(int number) {
        String result = "";

        int decimals_thousands = (number/1000)%10;

        if (decimals_thousands != 0) {
            result = decimals(decimals_thousands);
        }

        return result;
    }

    public String hundred(int number) {
        String result = "";

        int hundreds = (number/100)%10;

        if (hundreds != 0) {
            result = decimals(hundreds);
            result += " hundred ";
        }

        return result;
    }


}
