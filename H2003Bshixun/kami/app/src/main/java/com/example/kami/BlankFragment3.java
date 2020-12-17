package com.example.kami;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragment3 extends Fragment {

    private FragmentActivity activity;
    private RecyclerView rcy3;
    private ArrayList<Person> list;
    private MyRcyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = getActivity();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank3, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        list.add(new Person(
                "苟富而骄，苟免无耻，认恩推过。\n" +
                "嫁祸卖恶。\n" +
                "沽买虚誉，包贮险心。\n" +
                "挫人所长，护己所短。\n" +
                "乘威迫胁，纵暴杀伤。\n" +
                "无故剪裁，非礼烹宰。\n" +
                "散弃五谷，劳扰众生。\n" +
                "破人之家。\n" +
                "取其财宝。\n" +
                "决水放火，以害民居，紊乱规模，以败人功，损人器物，以穷人用。\n" +
                "见他荣贵，愿他流贬。\n" +
                "见他富有，愿他破散。\n" +
                "见他色美，起心私之。\n" +
                "负他货财，原他身死。\n" +
                "干求不遂，便生咒恨。\n" +
                "见他失便，便说他过。"+"见他体相不具而笑之。\n" +
                "见他才能可称而抑之。\n" +
                "埋蛊厌人，用药杀树。\n" +
                "恚怒师傅，抵触父兄。\n" +
                "强取强求，好侵好夺。\n" +
                "掳掠致富，巧诈求迁。\n" +
                "赏罚不平，逸乐过节。\n" +
                "苛虐其下，恐吓於他。\n" +
                "怨天尤人，呵风骂雨。\n" +
                "斗合争讼，妄逐朋党。\n" +
                "用妻妾语，违父母训。\n" +
                "得新忘故。\n" ));
        adapter.notifyDataSetChanged();

    }

    private void initView(View view) {
        rcy3 = view.findViewById(R.id.rcy3);
        rcy3.setLayoutManager(new LinearLayoutManager(activity));
        list = new ArrayList<>();
        adapter = new MyRcyAdapter(activity, list);
        rcy3.setAdapter(adapter);
    }
}