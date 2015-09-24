package android.bignerdranch.com.geoquiz_2;

/**
 * Created by Mike on 9/22/15.
 */
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question( int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId( int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue( boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


}
