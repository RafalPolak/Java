package pl.rpolak.fizzbuzz.bo;

/**
 * Created by Rafal Polak on 25.11.2017.
 */
public class FizzBuzzBO implements IFizzBuzzBO {


    @Override
    public String recognizeWords(long number) {

        StringBuilder stringBuilder = new StringBuilder();
        String output;

        for (int index = 1; index <= number; index++) {

            if (index % 3 != 0 && index % 5 != 0) {
                stringBuilder.append(index + " ");
            }

            if (index % 3 == 0) {
                stringBuilder.append("Fizz ");
            }

            if (index % 5 == 0) {
                stringBuilder.append("Buzz ");
            }
        }

        output = stringBuilder.toString();

        return output;
    }

}
