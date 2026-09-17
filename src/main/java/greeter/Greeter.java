package greeter;

import java.util.HashMap;
import java.util.Map;


public class Greeter {

    private static final String DEFAULT_GREETING = "Hello.";

    private static final Map<String, String> PHRASES = new HashMap<>();
    static {
        PHRASES.put("formal", "Good evening, sir.");
        PHRASES.put("casual", "Sup bro?");
        PHRASES.put("intimate", "Hello Darling!");
    }

    private String formality;

    public String greet() {
        return PHRASES.getOrDefault(formality, DEFAULT_GREETING);
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }

    public static void registerFormality(String formality, String phrase) {
        PHRASES.put(formality, phrase);
    }
}