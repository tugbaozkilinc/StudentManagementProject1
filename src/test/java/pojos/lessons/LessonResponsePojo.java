package pojos.lessons;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LessonResponsePojo {

    private Array[] LessonAddPojo;

    public LessonResponsePojo() {
    }

    public LessonResponsePojo(Array[] lessonAddPojo) {
        LessonAddPojo = lessonAddPojo;
    }

    public Array[] getLessonAddPojo() {
        return LessonAddPojo;
    }

    public void setLessonAddPojo(Array[] lessonAddPojo) {
        LessonAddPojo = lessonAddPojo;
    }

    @Override
    public String toString() {
        return "LessonResponsePojo{" +
                "LessonAddPojo=" + Arrays.toString(LessonAddPojo) +
                '}';
    }

}
