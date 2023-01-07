package bl.com.moodanalyser;

public class MoodAnalyser {
    static String message;

    /**
     * @param message- will pass to the method
     * @return - it will "HAPPY" or "SAD"
     */
    public String analysemood(String message) {
        if (message.equalsIgnoreCase("I am in sad Mood"))
             return "SAD";
        else if (message.equalsIgnoreCase("I am in happy Mood"))
                return "HAPPY";
        else
            return "No match";


    }
        }



