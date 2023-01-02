package bl.com.moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    /**
     * create  MoodAnalyser class object
     * check Message "I am in sad mood" or not
     * if message is "I am in sad mood"
     * @return - it will return SAD
     */

    @Test
    public void givenMessageWhenSadShouldReturnSad(){

        //create object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String expectedValue = "SAD";
        String mood = moodAnalyser.analysemood("I am in sad mood");
        Assert.assertEquals(expectedValue,mood);
    }

    /**
     * create  MoodAnalyser class object
     * check message is "I am in Happy mood" or not
     * if message  is "I am in Happy mood"
     * @return - it will return HAPPY
     */
    @Test
    public void givenMessageWhenHappyShouldReturnHappy(){
        //create object
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String expectedValue = "Happy";
        String mood = moodAnalyser.analysemood("I am in Happy mood");
        Assert.assertEquals(expectedValue,mood);
    }
}
