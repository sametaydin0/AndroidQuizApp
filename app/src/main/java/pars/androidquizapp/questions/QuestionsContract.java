package pars.androidquizapp.questions;

import java.util.List;

import pars.androidquizapp.BasePresenter;
import pars.androidquizapp.BaseView;
import pars.androidquizapp.data.Question;


public interface QuestionsContract {

    interface View extends BaseView<QuestionsContract.Presenter>{

        void showAllQuestions(List<Question> questions);

        void showEmptyMessage();

        void showAddQuestion();

        void showQuestionToUpdate(long questionId);
    }

    interface Presenter extends BasePresenter {

        void fetchQuestions(long categoryId);

        void addQuestion();

        void getQuestionToUpdate(long questionId);

        void deleteQuestion(Question question);
    }
}
