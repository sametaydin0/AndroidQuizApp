package pars.androidquizapp.questions;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pars.androidquizapp.R;
import pars.androidquizapp.data.Question;


public class QuestionsFragment extends Fragment implements QuestionsContract.View{

    private OnFragmentInteractionListener mListener;

    public QuestionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questions, container, false);
    }


    @Override
    public void onResume() {
        super.onResume();
        mListener = null;
    }

    @Override
    public void showQuestions(List<Question> questions) {

    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
