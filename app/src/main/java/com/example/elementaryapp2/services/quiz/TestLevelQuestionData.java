package com.example.elementaryapp2.services.quiz;

import com.example.elementaryapp2.R;
import com.example.elementaryapp2.classes.Answer;
import com.example.elementaryapp2.classes.MathEquation;
import com.example.elementaryapp2.classes.test_question_classes.MainQuestion;
import com.example.elementaryapp2.classes.test_question_classes.SubQuestion;
import com.example.elementaryapp2.classes.test_question_classes.TestLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLevelQuestionData {

    public static List<TestLevel> testLevelQuestionData = new ArrayList<>();

    // Level 1
    public static List<MainQuestion> mainQuestion_1 = new ArrayList<>();
    // Set 1
    public static List<SubQuestion> subQuestion_1_1 = new ArrayList<>();

    static List<Answer> answers_1_1_1 = new ArrayList<>(Arrays.asList(
            new Answer("2යි", null),
            new Answer("1යි", null),
            new Answer("4යි", null)
    ));
    static SubQuestion subQuestion_1_1_1 = new SubQuestion("maths", "කිරිල්ලී මාදම් ගස් කීයක් දුටුවාද?", "1යි", "normal", answers_1_1_1, "text", null);

    static List<Answer> answers_1_1_2 = new ArrayList<>(Arrays.asList(
            new Answer("1", R.drawable.madam_image),
            new Answer("2", R.drawable.purple_traingle_image),
            new Answer("3", R.drawable.red_oval_image)
    ));
    static SubQuestion subQuestion_1_1_2 = new SubQuestion("maths","දම් පාට මාදම් ගෙඩිය තෝරන්න.", "1", "normal", answers_1_1_2, "image", null);

    static {
        subQuestion_1_1.add(subQuestion_1_1_1);
        subQuestion_1_1.add(subQuestion_1_1_2);
    }
    // Set 2
    public static List<SubQuestion> subQuestion_1_2 = new ArrayList<>();

    static List<Answer> answers_1_2_1 = new ArrayList<>(Arrays.asList(
            new Answer("1", R.drawable.happy_bird),
            new Answer("2", R.drawable.angry_bird)
    ));
    static SubQuestion subQuestion_1_2_1 = new SubQuestion("sinhala","සතුටින් සිටින් කුරුල්ලා තෝරන්න.", "1", "normal", answers_1_2_1, "image", null);

    static SubQuestion subQuestion_1_2_2 = new SubQuestion("maths","පහත ඇති මුලු අතු ගණන කොපමණද?", "5", "normal", null, "calc", new MathEquation(3, "+", 2, 5));

    static {
        subQuestion_1_2.add(subQuestion_1_2_1);
        subQuestion_1_2.add(subQuestion_1_2_2);
    }

    static {
        mainQuestion_1.add(new MainQuestion("එක දවසක් කොණ්ඩ කිරිල්ලක් කූඩුවක් හදන්නේ කොහේ ද කියා කල්පනා කළා. සොයා ගෙන, සොයා ගෙන යන විට හරි අපූරු මා දං ගහක් දැක්කා.", subQuestion_1_1));
        mainQuestion_1.add(new MainQuestion("කිරිල්ලී කැලය පුරා ඉගිලෙමින් කෝටුව, කෝටුව බැගින් කඩාගෙන ආවා. ඒවා මා දං ගහේ මුදුනේ අත්තෙක එකිනෙ තබා කූඩුවක් තැනුවා. ඊට පසු පුලුන් ගෙනැවින් කූඩුවට දමා සනීප මෙට්ටයක් හැදුවා.", subQuestion_1_2));

    }

    // Level 2
    public static List<MainQuestion> mainQuestion_2 = new ArrayList<>();

    // Set 1
    public static List<SubQuestion> subQuestion_2_1 = new ArrayList<>();

    static SubQuestion subQuestion_2_1_1 = new SubQuestion("maths","මිතුරන් කීදෙනෙක් සිටිනවාද? නිවැරදි පිළිතුර ඇතුලත් කරන්න.", "2", "normal", null, "enter", null);

    static SubQuestion subQuestion_2_1_2 = new SubQuestion("sinhala","'ලස්සන' යන වචනය කොපි කර පහතින් ඇතුලත් කරන්න.", "ලස්සන", "normal", null, "enter", null);

    static {
        subQuestion_2_1.add(subQuestion_2_1_1);
        subQuestion_2_1.add(subQuestion_2_1_2);
    }

    // Set 2
    public static List<SubQuestion> subQuestion_2_2 = new ArrayList<>();

    static List<Answer> answers_2_2_1 = new ArrayList<>(Arrays.asList(
            new Answer("1", R.drawable.cry_friends_image),
            new Answer("2", R.drawable.scared_friends_image)

    ));

    static SubQuestion subQuestion_2_2_1 = new SubQuestion("sinhala","බය වී සිටින් මිතුරන්ව තෝරන්න.", "2", "normal", answers_2_2_1, "image", null);

    static List<Answer> answers_2_2_2 = new ArrayList<>(Arrays.asList(
            new Answer("1", R.drawable.bear_image),
            new Answer("2", R.drawable.panda_image)
    ));

    static SubQuestion subQuestion_2_2_2 = new SubQuestion("sinhala","වළසාව තෝරන්න.", "1", "normal", answers_2_2_2, "image", null);

    static {
        subQuestion_2_2.add(subQuestion_2_2_1);
        subQuestion_2_2.add(subQuestion_2_2_2);
    }

    static {
        mainQuestion_2.add(new MainQuestion("දවසක් යාළුවෝ දෙන්නෙක් ගමනක් යන්න පිටත් වුණා. යන පාර තිබුණේ කැළෑව මැදින්. යාළුවෝ දෙන්නා කැළේ ලස්සන බල බලා ඉස්සරහට ගියා. කැළේ මැද්දෙන් අමුතු සද්දයක් ඇහුණා.", subQuestion_2_1));
        mainQuestion_2.add(new MainQuestion("යාළුවෝ දෙන්නා හොඳටම බය වුණා. ටිකෙ ටික, යාළුවෝ දෙන්නා ගමන නතර කර වට පිට බැලුවා. එක පාරටම ඈතින් සතෙක් මතු වුණා. වළහෙක් !", subQuestion_2_2));

    }

    // Level 3
    public static List<MainQuestion> mainQuestion_3 = new ArrayList<>();

    // Set 1
    public static List<SubQuestion> subQuestion_3_1 = new ArrayList<>();

    static SubQuestion subQuestion_3_1_1 = new SubQuestion("sinhala","'හඳ' යන වචනය කොපි කර පහතින් ඇතුලත් කරන්න.", "හඳ", "normal", null, "enter", null);

    static List<Answer> answers_3_1_2 = new ArrayList<>(Arrays.asList(
            new Answer("1", R.drawable.red_box),
            new Answer("2", R.drawable.green_box),
            new Answer("3", R.drawable.white_box)
    ));

    static SubQuestion subQuestion_3_1_2 = new SubQuestion("maths","හඳෙහි පාට තෝරන්න.", "3", "normal", answers_3_1_2, "image", null);

    static {
        subQuestion_3_1.add(subQuestion_3_1_1);
        subQuestion_3_1.add(subQuestion_3_1_2);
    }

    // Set 2
    public static List<SubQuestion> subQuestion_3_2 = new ArrayList<>();

    static List<Answer> answers_3_2_1 = new ArrayList<>(Arrays.asList(
            new Answer("චන්ද්\u200Dර යානා", null),
            new Answer("ගුවන් යානා", null),
            new Answer("වායු බැලුන්", null)
    ));

    static SubQuestion subQuestion_3_2_1 = new SubQuestion("sinhala","හඳට යන යානා වලට කියන නම තෝරන්න.", "චන්ද්\u200Dර යානා", "normal", answers_3_2_1, "text", null);

    static SubQuestion subQuestion_3_2_2 = new SubQuestion("maths","පහත රූපයේ හඳවල් කීයක් තියෙනවාද?", "3", "withImage", R.drawable.sun_moon_stars_image, null, "enter", null);

    static {
        subQuestion_3_2.add(subQuestion_3_2_1);
        subQuestion_3_2.add(subQuestion_3_2_2);
    }

    static {
        mainQuestion_3.add(new MainQuestion("එදා පසළොස්වක පොහොය දවසක්. සඳරුවන් සුදුම සුදු පාට හඳ දිහා බලාගෙන සිටියා. මුලින්ම හඳ ගැන තොරතු සොයා ගන්නේ දුරේක්ෂ වලින්. ඉන් පස්සේ නොයෙකුත් දේවල් හඳට යැව්වා.", subQuestion_3_1));
        mainQuestion_3.add(new MainQuestion("ඒවායේ සවි කළ කැමරා වලින් ඡායාරූප ලබා ගත්තා. හඳට යන්නේ චන්ද්\u200Dර යානා වලින්. හඳට පා තැබූ මුල්ම මිනිසා ඇමෙරිකානු ජාතිකයෙක් එයාගේ නම නීල් ආම්ස්ට්\u200Dරෝන්. හඳට ගිය මිනිසුන් අපූරු තොරතුරු ගොඩාක් සොයා ගෙන තියෙනවා.", subQuestion_3_2));
    }



    static {
        testLevelQuestionData.add(new TestLevel("පළමු අදියර", mainQuestion_1));
        testLevelQuestionData.add(new TestLevel("දෙවන අදියර", mainQuestion_2));
        testLevelQuestionData.add(new TestLevel("තෙවන අදියර", mainQuestion_3));
    }
}
