package school.mjc.stage0.conditions.task3;

import java.util.HashSet;
import java.util.Set;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)){
          String vowels = "AEIOUaeiou";
          if (vowels.contains(String.valueOf(character))){
              System.out.println("Vowel");
          } else{
              System.out.println("Consonant");
          }

        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
