package all_java.api.utils.maching.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class IsNumber extends TypeSafeMatcher<String> {

    @Override
    protected boolean matchesSafely(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("is Number");

    }
}
