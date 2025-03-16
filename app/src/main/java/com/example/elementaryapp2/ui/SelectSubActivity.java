package com.example.elementaryapp2.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.elementaryapp2.R;
import com.example.elementaryapp2.classes.SubTab;
import com.example.elementaryapp2.services.Services;
import com.example.elementaryapp2.services.quiz.FaceActivityQuestionData;
import com.example.elementaryapp2.services.quiz.MathTuteQuizData;
import com.example.elementaryapp2.services.recycler_view.RecyclerViewAdapterSelectSub;
import com.example.elementaryapp2.services.recycler_view.RecyclerViewAdapterSubTabs;

import java.util.ArrayList;

public class SelectSubActivity extends AppCompatActivity {

    private TextView tvSubPageName;
    private RecyclerView recyclerView;
    private ArrayList<SubTab> list1;
    private RecyclerViewAdapterSelectSub adapter;
    private int subPageType = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sub);

        Services.onPressBack(this);

        subPageType = getIntent().getIntExtra("subtype", 0);

        tvSubPageName = findViewById(R.id.subPageName);
        recyclerView = findViewById(R.id.recyclerView);

        list1 = new ArrayList<>();

        // communication
        if (subPageType == 0) {
            list1.add(new SubTab(R.drawable.animal_12, "ක්\u200Dරියාකාරකම් 1", "කතා කරන විදිය", "greet", 0, R.color.bgClr_2, R.color.bgClr_2_dark, FaceActivityQuestionData.greetings_1));
            list1.add(new SubTab(R.drawable.animal_13, "ක්\u200Dරියාකාරකම් 2", "කතා කරන විදිය", "greet", 1, R.color.bgClr_2, R.color.bgClr_2_dark, FaceActivityQuestionData.greetings_2));
        } else if (subPageType == 1) {
            list1.add(new SubTab(R.drawable.animal_12, "ක්\u200Dරියාකාරකම් 1", "හොඳ පුරුදු", "manners", 0, R.color.bgClr_2, R.color.bgClr_2_dark, FaceActivityQuestionData.manners_1));
            list1.add(new SubTab(R.drawable.animal_13, "ක්\u200Dරියාකාරකම් 2", "හොඳ පුරුදු", "manners", 1, R.color.bgClr_2, R.color.bgClr_2_dark, FaceActivityQuestionData.manners_2));
        }

        // day to day
        else if (subPageType == 2) {
            list1.add(new SubTab(R.drawable.animal_12, "ක්\u200Dරියාකාරකම් 1", "දත් මැදීම", "day_to_day", R.color.bgClr_2, R.color.bgClr_2_dark, FaceActivityQuestionData.brushing_teeth, R.raw.test));
            list1.add(new SubTab(R.drawable.animal_13, "ක්\u200Dරියාකාරකම් 2", "වැසිකිළි භාවිතය", "day_to_day", R.color.bgClr_2, R.color.bgClr_2_dark, FaceActivityQuestionData.use_toilet, R.raw.test));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "අත් සේදීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 4", "මුහුණ සේදීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 5", "ඇඟ සේදීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        } else if (subPageType == 3) {
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 1", "නැඟිටීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 2", "ඇඳ සෑදීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "ඇඳුම් ඇඳීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 4", "කන්ණාඩිය බැලීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        } else if (subPageType == 4) {
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 1", "මේසය සැකසීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 2", "ආම්පන්න භාවිතය", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "හොඳ පුරුදු", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 4", "පිරිසිදු කිරීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        } else if (subPageType == 5) {
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 1", "පිරිසිදු කිරීමේ වේලාව", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 2", "ඇඳුම් නැවීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "වතුර දැමීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 4", "සතුන්ට කෑම දීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        } else if (subPageType == 6) {
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 1", "බෑගය සැකසීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 2", "අයිතම කළමනාකරණය", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "ගෙදර වැඩ", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        } else if (subPageType == 7) {
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 1", "පිජාම ඇඳීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 2", "දත් මැදීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "කතන්දර කියවීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 4", "රාත්\u200Dරී චාරිත්\u200Dරය", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        } else if (subPageType == 8) {
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 1", "පවුලේ අය", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 2", "හැඟීම් ප්\u200Dරකාශ කිරීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 3", "බෙදාගැනීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
            list1.add(new SubTab(R.drawable.premium_logo, "ක්\u200Dරියාකාරකම් 4", "අනුන්ට උදව් කිරීම", "premium", R.color.bgClr_2, R.color.bgClr_2_dark, null, null));
        }

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        layoutManager1.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager1);
        adapter = new RecyclerViewAdapterSelectSub(this, list1, recyclerView);
        recyclerView.setAdapter(adapter);

    }
}