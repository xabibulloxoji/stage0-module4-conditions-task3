package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'A' || character == 'a' || character == 'E' || character == 'e' || character == 'I' || character == 'i'
        || character == 'O' || character == 'o' || character == 'U' || character == 'u')
            System.out.println("Vowel");
        else if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122))
            System.out.println("Consonant");
        else System.out.println("wrong alphabet!");
    }
}
