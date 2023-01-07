package bl.com.moodanalyser;

/**
 * @author Amod
 */
public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser program");

        //Crate object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // pass Happy message
        System.out.println(moodAnalyser.analysemood("I am in Happy Mood"));
        //pass SAD message
        System.out.println(moodAnalyser.analysemood("I am in SAD Mood"));
    }
}
