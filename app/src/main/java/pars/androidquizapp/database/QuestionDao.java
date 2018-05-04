package pars.androidquizapp.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by Princess on 25/04/2018.
 */
@Dao
public interface QuestionDao {

    @Insert(onConflict = REPLACE)
    long insert(Question question);

    @Query("SELECT * FROM questions_table")
    List<Question> getAllQuestions();

    @Query("SELECT * FROM questions_table WHERE questionCategory LIKE (:questionCategory)")
    List<Question> queryQuestion(String questionCategory);

    @Update
    void updateQuestion(Question question);

    @Delete
    void deleteQuestion(Question question);
}