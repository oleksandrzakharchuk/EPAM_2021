package all_java.api.utils.maching.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class IsDateFormat extends TypeSafeMatcher<String> {

    @Override
    protected boolean matchesSafely(String s) {
        try{
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            format.parse(s);
            return  true;

        }catch (ParseException ex) {
            return false;
        }
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Valid data format <yyyy-MM-dd'T'HH:mm:ss.SSS'Z'>");
    }
}
