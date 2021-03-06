package top.yelbee.www.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.huawei.hiai.asr.AsrRecognizer;

/**
 * 依附在MainActivity中的第三个fragment
 * 功能：语音小游戏、软件版本介绍
 */

public class MFragmentMe extends Fragment implements View.OnClickListener {

    View view;
    LinearLayout start_notebook;
    LinearLayout start_game;
    LinearLayout start_about;
    LinearLayout start_skypeech;
    LinearLayout start_instruction;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.me_fragment,container,false);


        init();
        return view;
    }

    public void init() {

        start_notebook = (LinearLayout) view.findViewById(R.id.start_notebook);
        start_game = (LinearLayout) view.findViewById(R.id.start_game);
        start_about = (LinearLayout) view.findViewById(R.id.start_about);
        start_skypeech = (LinearLayout) view.findViewById(R.id.start_skypeech);
        start_instruction = (LinearLayout) view.findViewById(R.id.start_instruction);

        start_notebook.setOnClickListener(this);
        start_game.setOnClickListener(this);
        start_about.setOnClickListener(this);
        start_skypeech.setOnClickListener(this);
        start_instruction.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_notebook:

                Intent intent1 = new Intent(getActivity(), Notebook.class);
                startActivity(intent1);
                break;

            case R.id.start_game:
                Intent intent2 = new Intent(getActivity(), Game.class);
                startActivity(intent2);
                break;

            case R.id.start_about:
                Intent intent3 = new Intent(getActivity(), AboutSoftware.class);
                startActivity(intent3);
                break;

            case R.id.start_skypeech:
                Intent intent4 = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent4);
                break;

            case R.id.start_instruction:
                Intent intent5 = new Intent(getActivity(), Instruction.class);
                startActivity(intent5);
                break;

        }
    }

}
