package pars.androidquizapp.splashscreen;

/**
 * Created by Princess on 07/05/2018.
 */

public interface SplashScreenContract {

    interface View {

        void showMainScreen();
    }

    interface UserActionsListener {

        void takeQuiz();
    }

}
