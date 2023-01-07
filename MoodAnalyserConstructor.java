package bl.com.moodanalyser;

public class MoodAnalyserConstructor {
    String happy="I am in Happy Mood";


    public MoodAnalyserConstructor() {

        this.happy = happy;

    }

    public MoodAnalyserConstructor(String happy) {
        System.out.println("Happy");

    }

    public static void main(String[] args) {
        MoodAnalyserConstructor obj = new MoodAnalyserConstructor();

        MoodAnalyserConstructor obj1 = new MoodAnalyserConstructor("I am in Happy Mood");

    }

}
