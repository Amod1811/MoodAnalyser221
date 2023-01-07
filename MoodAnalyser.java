package bl.com.moodanalyser;

public class MoodAnalyser {

    //variable declaration
    static String message;

    // Default constructor
    public MoodAnalyser() {
        message = null;
    }

    //parameterised constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // setter
    public static void setMessage(String message) {
        MoodAnalyser.message = message;
    }

    // check mood weathe Happy or sad
    public String analysemood(String message) {

        try {
            if (message.equalsIgnoreCase("I am in sad Mood"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException exception) {
            return "Happy";


        }

    }
        }



