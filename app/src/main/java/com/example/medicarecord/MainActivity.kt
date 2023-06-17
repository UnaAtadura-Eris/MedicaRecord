package com.example.medicarecord

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button
    private lateinit var detailedExplanationTextView: TextView
    private lateinit var answerToRecordTextView: TextView
    private lateinit var spinner: Spinner
    private var currentQuestionIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionTextView = findViewById(R.id.questionTextView)
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup)
        nextButton = findViewById(R.id.nextButton)
        spinner = findViewById(R.id.spinner)
        detailedExplanationTextView = findViewById(R.id.detailedExplanationTextView)
        answerToRecordTextView = findViewById(R.id.answerToRecordTextView)

        val options = listOf(
            "发热",
            "咳嗽咳痰",
            "咯血",
            "呼吸困难",
            "头痛",
            "胸痛",
            "腹痛",
            "关节痛",
            "腰背痛",
            "颈肩痛",
            "心悸",
            "水肿",
            "恶心呕吐",
            "呕血便血",
            "腹泻",
            "消瘦",
            "黄疸",
            "少尿无尿",
            "多尿",
            "尿频尿急尿痛",
            "血尿",
            "癫痫发作与惊厥",
            "眩晕",
            "意识障碍",
            "皮肤黏膜出血"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                when (selectedItem) {
                    "发热" -> faRe()
                    "咳嗽咳痰" -> keShou()
                    // 根据其他选项添加对应的函数调用
                    // ...

                    else -> {
                        // 处理未知选项的情况
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // 未选中任何选项时的处理
            }
        }
    }

    private fun faRe() {
        showQuestion(questions_faRe[currentQuestionIndex])
        nextButton.setOnClickListener {
            faRewenZen()
        }
    }

    private fun keShou() {
        showQuestion(questions_keShou[currentQuestionIndex])
        nextButton.setOnClickListener {
            keShouwenZen()
        }
    }

    private fun function3() {
        faRe()
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

    private fun faRewenZen() {
        val currentQuestion = questions_faRe[currentQuestionIndex]
        if (currentQuestion.type == QuestionType.SINGLE_CHOICE) {
            val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
            val selectedIndex =
                optionsRadioGroup.indexOfChild(findViewById<RadioButton>(selectedOptionId))

            // 对选中的单选题选项进行处理
            // 例如，根据选中的选项执行相应的操作
            when (val selectedOption = currentQuestion.options[selectedIndex]) {
                "发热程度详解" -> {
                    val detailedExplanation =
                        "发热程度分为:①低热:37.3~38°C;②中度发热:38.1~39°C ;③高热:39.1~41°C;④超高热:41°C以上。"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }

                "发热的特点详解" -> {
                    val detailedExplanation =
                        "1.稽留热(continued fever) 是指体温明显升高达39～40℃以上，24小时内体温波动相差不超过1℃，常见于伤寒、大叶性肺炎、流行性脑脊髓膜炎、恙虫病等的症状明显期。\n" +
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
                    val detailedExplanation =
                        "痰多易咯是慢阻肺的特征？ 痰少难咯要注意患者神志，要预防痰卡住呼吸道导致窒息"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }

                "皮疹特点详解" -> {
                    val detailedExplanation =
                        "发热1天后出疹.多见于水痘;发热4天左右出疹.多见于麻疹;\n" +
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
                            Question(
                                "痰的颜色性质",
                                listOf(
                                    "白黏痰",
                                    "黄脓痰",
                                    "绿色痰",
                                    "浓臭痰，痰液分4层",
                                    "浓臭痰，痰液分3层",
                                    "颜色不详",
                                    "痰的颜色性质详解"
                                ),
                                QuestionType.SINGLE_CHOICE,
                                emptyList()
                            ),
                            Question(
                                "痰的量多多少及是否易咯出",
                                listOf("量多易咯", "量少难咯", "痰量及咯出详解"),
                                QuestionType.SINGLE_CHOICE,
                                emptyList()
                            )
                        )
                        questions_faRe = questions_faRe.plus(newquestions)
                    }

                    "皮疹" -> {
                        val newquestions = listOf(
                            Question(
                                "皮疹特点",
                                listOf(
                                    "发热1天后出疹",
                                    "发热5天至1周出疹",
                                    "发热伴有环形红斑或结节性红斑",
                                    "皮疹特点详解"
                                ),
                                QuestionType.SINGLE_CHOICE,
                                emptyList()
                            )
                        )
                        questions_faRe = questions_faRe.plus(newquestions)
                    }

                    else -> {
//                        currentQuestionIndex += 0
//                        answerToRecordTextView.append("雷狼龙3")
                    }
                }
            }
        }
        currentQuestionIndex++
        if (currentQuestionIndex < questions_faRe.size) {
            showQuestion(questions_faRe[currentQuestionIndex])
        } else {
            answerToRecordTextView.append("ending")
        }
    }

    private fun keShouwenZen() {
        val currentQuestion = questions_keShou[currentQuestionIndex]
        if (currentQuestion.type == QuestionType.SINGLE_CHOICE) {
            val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
            val selectedIndex =
                optionsRadioGroup.indexOfChild(findViewById<RadioButton>(selectedOptionId))

            // 对选中的单选题选项进行处理
            // 例如，根据选中的选项执行相应的操作
            when (val selectedOption = currentQuestion.options[selectedIndex]) {
                "咳嗽的音色详解" -> {
                    val detailedExplanation =
                        "1、咳嗽声音嘶哑：多为声带的炎症引起的，如急性咽喉炎、支气管炎等，此外也可能是喉咙处存在肿瘤压迫喉返神经所致；\n" +
                                "2、鸡鸣样咳嗽：患者可表现出连续的阵发性剧咳，且伴有高调吸气回声，多见于百日咳、会厌、喉部疾病或支气管受压等情况；\n" +
                                "3、金属音咳嗽：咳嗽的声音类似金属间摩擦的声音，常提示有气道梗阻的可能性，多见于纵隔肿瘤、主动脉瘤或支气管癌等直接压迫气管所致；\n" +
                                "4、犬吠样咳嗽：又称为哮吼性咳嗽，咳嗽时会出现类似犬吠一样的“空空”声音，且咳嗽音调较高，常见于痉挛性喉炎患者；\n" +
                                "5、咳嗽声音低微且无力：咳嗽声音较弱且不是很深，常见于严重肺气肿、声带麻痹、声带水肿及极度衰弱等患者。"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }

                "发热的特点详解" -> {
                    val detailedExplanation =
                        "1.稽留热(continued fever) 是指体温明显升高达39～40℃以上，24小时内体温波动相差不超过1℃，常见于伤寒、大叶性肺炎、流行性脑脊髓膜炎、恙虫病等的症状明显期。\n" +
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
                    val detailedExplanation =
                        "痰多易咯是慢阻肺的特征？ 痰少难咯要注意患者神志，要预防痰卡住呼吸道导致窒息"
                    detailedExplanationTextView.text = detailedExplanation
                    currentQuestionIndex -= 1
                }

                "皮疹特点详解" -> {
                    val detailedExplanation =
                        "发热1天后出疹.多见于水痘;发热4天左右出疹.多见于麻疹;\n" +
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
                            Question(
                                "痰的颜色性质",
                                listOf(
                                    "白黏痰",
                                    "黄脓痰",
                                    "绿色痰",
                                    "浓臭痰，痰液分4层",
                                    "浓臭痰，痰液分3层",
                                    "颜色不详",
                                    "痰的颜色性质详解"
                                ),
                                QuestionType.SINGLE_CHOICE,
                                emptyList()
                            ),
                            Question(
                                "痰的量多多少及是否易咯出",
                                listOf("量多易咯", "量少难咯", "痰量及咯出详解"),
                                QuestionType.SINGLE_CHOICE,
                                emptyList()
                            )
                        )
                        questions_keShou = questions_keShou.plus(newquestions)
                    }

                    "皮疹" -> {
                        val newquestions = listOf(
                            Question(
                                "皮疹特点",
                                listOf(
                                    "发热1天后出疹",
                                    "发热5天至1周出疹",
                                    "发热伴有环形红斑或结节性红斑",
                                    "皮疹特点详解"
                                ),
                                QuestionType.SINGLE_CHOICE,
                                emptyList()
                            )
                        )
                        questions_keShou = questions_keShou.plus(newquestions)
                    }

                    else -> {
//                        currentQuestionIndex += 0
//                        answerToRecordTextView.append("雷狼龙3")
                    }
                }
            }
        }
        currentQuestionIndex++
        if (currentQuestionIndex < questions_keShou.size) {
            showQuestion(questions_keShou[currentQuestionIndex])
        } else {
            answerToRecordTextView.append("ending")
        }
    }

}
