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


public class BlankFragment2 extends Fragment {


    private FragmentActivity activity;
    private RecyclerView rcy2;
    private ArrayList<Person> list;
    private MyRcyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity = getActivity();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        list.add(new Person(
                "苟或非义而动，背理而行。\n" +
                "以恶为能，忍作残害。\n" +
                "阴贼良善，暗侮君亲。\n" +
                "慢其先生，叛其所事。\n" +
                "诳诸无识，谤诸同学。\n" +
                "虚诬诈伪，攻讦宗亲。\n" +
                "刚强不仁，狠戾自用。\n" +
                "是非不当，向背乖宜。\n" +
                "虐下取功，谄上希旨。\n" +
                "受恩不感，念怨不休。\n" +
                "轻蔑天民，扰乱国政。\n" +
                "赏及非义，刑及无辜。"+
                 "杀人取财，倾人取位。\n" +
                "诛降戮服，贬正排贤。\n" +
                "凌孤逼寡，弃法受赂。\n" +
                "以直为曲，以曲为直。\n" +
                "入轻为重，见杀加怒。\n" +
                "知过不改，知善不为。\n" +
                "自罪引他，壅塞方术。\n" +
                "讪谤贤圣，侵凌道德。\n" +
                "射飞逐走，发蛰惊栖，填穴覆巢，伤胎破卵。\n"+
                 "愿人有失，毁人成功。\n" +
                "危人自安，减人自益。\n" +
                "以恶易好，以私废公。\n" +
                "窃人之能，蔽人之善。\n" +
                "形人之丑，讦人之私。\n" +
                "耗人货财，离人骨肉。\n" +
                "侵人所爱，助人为非，逞志作威，辱人求胜。\n" +
                "败人苗稼，破人婚姻。\n" ));
        adapter.notifyDataSetChanged();
    }

    private void initView(View view) {
        rcy2 = view.findViewById(R.id.rcy2);
        rcy2.setLayoutManager(new LinearLayoutManager(activity));
        list = new ArrayList<>();
        adapter = new MyRcyAdapter(activity, list);
        rcy2.setAdapter(adapter);

    }
}