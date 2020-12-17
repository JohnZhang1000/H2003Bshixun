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


public class BlankFragment4 extends Fragment {

    private ArrayList<Person> list;
    private MyRcyAdapter adapter;
    private RecyclerView rcy4;
    private FragmentActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = getActivity();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank4, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        list.add(new Person(
                "口是心非，贪冒於财，欺罔其上。\n" +
                        "造作恶语，谗毁平人。\n" +
                        "毁人称直，骂神称正，\n" +
                        "弃顺效逆，背亲向疏。\n" +
                        "指天地以证鄙怀，引神明而鉴猥事。\n" +
                        "施与後悔，假借不还。\n" +
                        "分外营求，力上施设。\n" +
                        "淫欲过度，心毒貌慈。\n" +
                        "秽食馁人，左道惑众。\n" +
                        "短尺狭度，轻秤小升。\n" +
                        "以伪杂真，采取奸利。\n" +
                        "压良为贱，谩蓦愚人，\n" +
                        "贪婪无厌，咒诅求直。\n" +
                        "嗜酒悖乱，骨肉忿争。\n" +
                        "男不忠良，女不柔顺。\n" +
                        "不和其室，不敬其夫。\n" +
                        "每好矜夸，常行妒忌。\n" +
                        "无行於妻子，失礼於舅姑，\n" +
                        "轻慢先灵，违逆上命。\n" +
                        "作为无益，怀挟外心。\n" +
                        "自咒咒他，偏憎偏爱。\n" +
                        "越井越灶，跳食跳人。\n" +
                        "损子堕胎，行多隐僻。\n" +
                        "晦腊歌舞，朔旦号怒。\n" +
                        "对北涕唾及溺，对灶吟咏及哭。\n" +
                        "又以灶火烧香，秽柴作食。\n" +
                        "夜起裸露，八节行刑。"));
        adapter.notifyDataSetChanged();

    }

    private void initView(View view) {
        rcy4 = view.findViewById(R.id.rcy4);
        rcy4.setLayoutManager(new LinearLayoutManager(activity));
        list = new ArrayList<>();
        adapter = new MyRcyAdapter(activity, list);
        rcy4.setAdapter(adapter);

    }
}