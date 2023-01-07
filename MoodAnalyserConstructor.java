package bl.com.moodanalyser;

public class MoodAnalyserConstructor {
    String happy="I am in Happy Mood";
    String sad = "I am in Sad Mood";

    public MoodAnalyserConstructor() {

        this.happy = happy;
        this.sad = sad;
    }

    public MoodAnalyserConstructor(String happy, String sad) {
        System.out.println("I am in Happy Mood");
        System.out.println("i am in Sad Mood");
    }

    public static void main(String[] args) {
        MoodAnalyserConstructor obj = new MoodAnalyserConstructor();

        MoodAnalyserConstructor obj1 = new MoodAnalyserConstructor("sad", "happy");

    }

}
