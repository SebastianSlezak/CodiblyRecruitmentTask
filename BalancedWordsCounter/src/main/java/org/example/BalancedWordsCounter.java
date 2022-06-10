package org.example;

public class BalancedWordsCounter {
    public int count(String input) {

        try {
            int sum = 0;

            if (input.isEmpty()) {
                return 0;
            } else {
                boolean flag;

                for (int i = 0; i < input.length(); i++) {

                    flag = Character.isDigit(input.charAt(i));

                    if (flag) {
                        throw new RuntimeException();
                    }

                    int exponent = ('a' - input.charAt(i)) * (-1);
                    sum += Math.pow(2, exponent);
                }
                return sum;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }


        //TODO dwa sposoby sprawdzenia czy w stringu jest liczba
        //1. rozłożyć stringa na znaki i pętlą sprawdzić czy znajduje się tam liczba, jeżeli w stringu znajduje się liczba to wtedy zwracane jest "RuntimeException".
        //2. sprawdzić stringa za pomocą regex.

    }
}