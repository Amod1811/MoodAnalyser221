package bl.com.moodanalyser;

public class MoodAnalyserConstructor {

    String sad = "I am in Sad Mood";

    public MoodAnalyserConstructor() {


        this.sad = sad;
    }

    public MoodAnalyserConstructor( String sad) {

        System.out.println("SAD");
    }

    public static void main(String[] args) {
        MoodAnalyserConstructor obj = new MoodAnalyserConstructor();

        MoodAnalyserConstructor obj1 = new MoodAnalyserConstructor("i am in Sad Mood");

    }

}
