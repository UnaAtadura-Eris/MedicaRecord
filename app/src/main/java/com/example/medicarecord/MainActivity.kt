package com.example.medicarecord
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button
    private lateinit var detailedExplanationTextView: TextView
    private lateinit var answerToRecordTextView: TextView



    private var questions = listOf(
        Question("起病诱因、病因", listOf("xx前无明显诱因出现发热", "xx前感冒后出现发热", "xx前受凉后出现发热","xx前创伤后出现发热","xx前感咽痛不适，后出现发热","xx前蚊虫叮咬后出现发热"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("发热程度", listOf("发热，最高温度达？℃", "高热，最高温度达？℃", "低热，最高温度达？℃","发热程度详解"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("发热的特点", listOf("呈持续性低热", "呈稽留热", "呈弛张热", "呈间歇热", "呈波状热", "呈回归热", "呈不规则热","发热的特点详解"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("伴随症状", listOf("寒战","咳嗽", "咳痰", "肌肉关节痛", "头痛", "头晕", "胸痛", "胸闷", "腹痛", "尿频、尿急、尿痛", "咯血", "皮疹", "皮肤黏膜出血","其他不适"),QuestionType.MULTI_CHOICE,List(14) { false })
    )

    private var currentQuestionIndex = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionTextView = findViewById(R.id.questionTextView)
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup)
        nextButton = findViewById(R.id.nextButton)
        detailedExplanationTextView = findViewById(R.id.detailedExplanationTextView)
        answerToRecordTextView = findViewById(R.id.answerToRecordTextView)


        nextButton.setOnClickListener {
            showNextQuestion()
        }

        showQuestion(questions[currentQuestionIndex])
    }

    private fun showQuestion(question: Question) {
        questionTextView.text = question.text
        optionsRadioGroup.removeAllViews()

        for (i in question.options.indices) {
            if (question.type == QuestionType.SINGLE_CHOICE) {
                val radioButton = RadioButton(this)
                radioButton.text = question.options[i]
                optionsRadioGroup.addView(radioButton)
            } else if (question.type == QuestionType.MULTI_CHOICE) {
                val checkBox = CheckBox(this)
                checkBox.text = question.options[i]
                checkBox.isChecked = question.selectedOptions[i]  // 设置选中状态
                optionsRadioGroup.addView(checkBox)
            }
        }
    }

    private fun showNextQuestion() {
        val currentQuestion = questions[currentQuestionIndex]
        if (currentQuestion.type == QuestionType.SINGLE_CHOICE) {
            val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
            val selectedIndex = optionsRadioGroup.indexOfChild(findViewById<RadioButton>(selectedOptionId))

            // 对选中的单选题选项进行处理
            // 例如，根据选中的选项执行相应的操作
            when (val selectedOption = currentQuestion.options[selectedIndex]) {
                "发热程度详解" -> {
                    val detailedExplanation = "发热程度分为:①低热:37.3~38°C;②中度发热:38.1~39°C ;③高热:39.1~41°C;④超高热:41°C以上。"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }
                "发热的特点详解" -> {
                    val detailedExplanation = "1.稽留热(continued fever) 是指体温明显升高达39～40℃以上，24小时内体温波动相差不超过1℃，常见于伤寒、大叶性肺炎、流行性脑脊髓膜炎、恙虫病等的症状明显期。\n" +
                            "2.弛张热(remittent fever) 是指24小时内体温波动相差超过2℃，但最低点未达正常水平的体温曲线类型，常见于伤寒的缓解期、败血症、风湿热、细菌性肝脓肿等。\n" +
                            "3.间歇热(intermittent fever) 体温骤然升达高峰，持续数小时，又迅速降至正常水平，无热期可持续1天至数天，如此高热期与无热期反复交替出现，见于疟疾、急性肾盂肾炎等。\n" +
                            "4.回归热(recurrent fever) 是指高热持续数日后自行消退，但数日后又再出现的体温曲线类型，可见于回归热、霍奇金病等。\n" +
                            "5.波状热(undulant fever) 体温逐渐上升达39℃或以上，数天后又逐渐下降至正常水平，持续数天后又逐渐升高，如此反复多次。常见于布氏杆菌病。\n" +
                            "6.不规则热(irregular fever) 发热的体温曲线无一定规律，可见于结核病、风湿热、支气管肺炎、渗出性胸膜炎等。"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }
                "痰的颜色性质详解" -> {
                    val detailedExplanation = "1、绿色痰：通常判断与铜绿假单胞菌感染的可能性较高；\n" +
                            "2、黄脓痰：可能是肺炎链球菌、金黄色葡萄球菌，或革兰氏阳性球菌、革兰氏阴性杆菌感染；\n" +
                            "3、白色脓或白色黏痰：为一般的致病菌如革兰氏阳性菌、革兰氏阴性杆菌感染。部分患者虽然为白痰，但不是脓痰，而是黏液痰，没有黄绿色，分析可能是病毒、结核、真菌感染等\n" +
                            "4、浓臭痰，痰液分3层:肺脓肿；分4层:支气管扩张（上：泡沫；中：浑浊；下：脓；最下：坏死物质。）"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }
                "痰量及咯出详解" -> {
                    val detailedExplanation = "痰多易咯是慢阻肺的特征？ 痰少难咯要注意患者神志，要预防痰卡住呼吸道导致窒息"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }
                "皮疹特点详解" -> {
                    val detailedExplanation = "发热1天后出疹.多见于水痘;发热4天左右出疹.多见于麻疹;\n" +
                            "发热5天至1周出疹,多见于斑疹伤寒和伤寒;\n" +
                            "发热伴有环形红斑或结节性红斑.有游走性关节痛.心脏杂音等症状之一，见于风湿热"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }
                else -> {
                    // 这里可以根据需求将 answerToRecord 存储到适当的数据结构中
                    answerToRecordTextView.append("$selectedOption，")
                }
            }
        } else if (currentQuestion.type == QuestionType.MULTI_CHOICE) {
            val selectedOptions = mutableListOf<String>()
            val unselectedOptions = mutableListOf<String>()
            for (i in 0 until optionsRadioGroup.childCount) {
                val checkBox = optionsRadioGroup.getChildAt(i) as CheckBox
                val option = currentQuestion.options[i]
                if (checkBox.isChecked) {
                    selectedOptions.add(option)
                } else {
                    unselectedOptions.add(option)
                }
            }
            val selectedOptionsText = if (selectedOptions.isNotEmpty()) {
                "有" + selectedOptions.joinToString("、")
            } else {
                ""
            }
            val unselectedOptionsText = if (unselectedOptions.isNotEmpty()) {
                "无" + unselectedOptions.joinToString("、")
            } else {
                ""
            }
            val answerToRecord = "$selectedOptionsText，$unselectedOptionsText。"
            // 这里可以根据需求将 answerToRecord 存储到适当的数据结构中
            answerToRecordTextView.append(answerToRecord)

            // 对选中的多选题选项进行处理
            // 例如，根据选中的选项执行相应的操作
            for (selectedOption in selectedOptions) {
                when (selectedOption) {
                    "咳痰" -> {
                        val newquestions = listOf(
                            Question("痰的颜色性质", listOf("白黏痰", "黄脓痰", "绿色痰","浓臭痰，痰液分4层","浓臭痰，痰液分3层","颜色不详","痰的颜色性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
                            Question("痰的量多多少及是否易咯出", listOf("量多易咯", "量少难咯", "痰量及咯出详解"),QuestionType.SINGLE_CHOICE,emptyList())
                        )
                        questions = questions.plus(newquestions)
                    }
                    "皮疹" -> {
                        val newquestions = listOf(
                            Question("皮疹特点", listOf("发热1天后出疹", "发热5天至1周出疹", "发热伴有环形红斑或结节性红斑","皮疹特点详解"),QuestionType.SINGLE_CHOICE,emptyList())
                        )
                        questions = questions.plus(newquestions)
                    }
                    else -> {
//                        currentQuestionIndex += 0
//                        answerToRecordTextView.append("雷狼龙3")
                    }
                }
            }
        }
        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            showQuestion(questions[currentQuestionIndex])
        } else {
            answerToRecordTextView.append("雷狼龙4")
        }
    }
/*
    private  fun addAskQuestion() {
        val questions = listOf(
            Question("痰的颜色性质", listOf("白黏痰", "黄脓痰", "绿色痰","浓臭痰，痰液分4层","浓臭痰，痰液分3层","颜色不详","痰的颜色性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
            Question("痰的量多多少及是否易咯出", listOf("量多易咯", "量少难咯", "痰量及咯出详解"),QuestionType.SINGLE_CHOICE,emptyList())
        )
        var addcurrentQuestionIndex = 0
        showQuestion(questions[addcurrentQuestionIndex])
        nextButton.setOnClickListener {
            showNextQuestion()
            addcurrentQuestionIndex++
            if (addcurrentQuestionIndex < questions.size) {
                showQuestion(questions[addcurrentQuestionIndex])
            } else {
                answerToRecordTextView.append("雷狼龙4")
            }
        }
    }
*/
}
