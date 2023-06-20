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
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var optionsRadioGroup: RadioGroup
    private lateinit var nextButton: Button
    private lateinit var returnButton: Button
    private lateinit var resetButton: Button
    private lateinit var detailedExplanationTextView: TextView
    private lateinit var answerToRecordTextView: TextView
    private lateinit var spinner: Spinner
    private var currentQuestionIndex = 0
    val resultList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionTextView = findViewById(R.id.questionTextView)
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup)
        nextButton = findViewById(R.id.nextButton)
        returnButton = findViewById(R.id.returnButton)
        resetButton = findViewById(R.id.resetButton)
        spinner = findViewById(R.id.spinner)
        detailedExplanationTextView = findViewById(R.id.detailedExplanationTextView)
        answerToRecordTextView = findViewById(R.id.answerToRecordTextView)

        val options = jiBinglieBiao
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

    private fun resetPage(questions: List<Question>) {
        answerToRecordTextView.text = ""  // 清空文本框的文字
        detailedExplanationTextView.text = ""
        resultList.clear()
        currentQuestionIndex = 0  // 重置问题索引为第一页
        showQuestion(questions[currentQuestionIndex])  // 显示第一页的问题
        nextButton.setText("确认")
        nextButton.isEnabled = true// 恢复按钮文本为初始状态
    }

    private fun returnPage(questions: List<Question>){
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--
            resultList.removeAt(currentQuestionIndex)
            val currentQuestion = questions[currentQuestionIndex]
            val resultString = resultList.joinToString("")
            answerToRecordTextView.text = resultString
            showQuestion(currentQuestion)
            nextButton.isEnabled = true
            nextButton.setText("确认")
        }else{
            Toast.makeText(this, "已经是第一页了\ud83d\ude05", Toast.LENGTH_SHORT).show()
        }
    }



    private fun faRe() {
        showQuestion(questions_faRe[currentQuestionIndex])

        nextButton.setOnClickListener {
            val currentQuestion = questions_faRe[currentQuestionIndex]
            if (currentQuestion.type == QuestionType.SINGLE_CHOICE) {
                val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
                val selectedIndex =
                    optionsRadioGroup.indexOfChild(findViewById<RadioButton>(selectedOptionId))

                if (selectedIndex == -1) {
                    // 提示用户选择一个选项
                    currentQuestionIndex -= 1
                    Toast.makeText(this, "请选择一个选项", Toast.LENGTH_SHORT).show()

                } else{
                // 对选中的单选题选项进行处理
                // 例如，根据选中的选项执行相应的操作
                    when (val selectedOption = currentQuestion.options[selectedIndex]) {
                        "发热程度详解" -> {
                            val detailedExplanation = faRechengDuxiangJie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        "发热的特点详解" -> {
                            val detailedExplanation = reXingxiangJie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        "痰的颜色性质详解" -> {
                            val detailedExplanation = tanYanseXiangjie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        "痰量及咯出详解" -> {
                            val detailedExplanation = tanLiangxiangJie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        "皮疹特点详解" -> {
                            val detailedExplanation = piZhenxiangJie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        else -> {
                            // 这里可以根据需求将 answerToRecord 存储到适当的数据结构中
                            resultList.add("$selectedOption，")
                            val resultString = resultList.joinToString("")
                            answerToRecordTextView.text = resultString
                        }
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
//                answerToRecordTextView.append(answerToRecord)
                resultList.add(answerToRecord)
                val resultString = resultList.joinToString("")
                answerToRecordTextView.text = resultString

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
                nextButton.setText("结束")
                nextButton.isEnabled = false


            }
        }

        resetButton.setOnClickListener {
            resetPage(questions_faRe)
        }

        returnButton.setOnClickListener {
            returnPage(questions_faRe)
        }

    }

    private fun keShou() {
        showQuestion(questions_keShou[currentQuestionIndex])

        nextButton.setOnClickListener {
            val currentQuestion = questions_keShou[currentQuestionIndex]
            if (currentQuestion.type == QuestionType.SINGLE_CHOICE) {
                val selectedOptionId = optionsRadioGroup.checkedRadioButtonId
                val selectedIndex =
                    optionsRadioGroup.indexOfChild(findViewById<RadioButton>(selectedOptionId))

                if (selectedIndex == -1) {
                    // 提示用户选择一个选项
                    currentQuestionIndex -= 1
                    Toast.makeText(this, "请选择一个选项", Toast.LENGTH_SHORT).show()

                } else{
                    // 对选中的单选题选项进行处理
                    // 例如，根据选中的选项执行相应的操作
                    when (val selectedOption = currentQuestion.options[selectedIndex]) {
                        "咳嗽的音色详解" -> {
                            val detailedExplanation = keShouyinSexiangJie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        "痰的颜色性质详解" -> {
                            val detailedExplanation = tanYanseXiangjie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        "痰量及咯出详解" -> {
                            val detailedExplanation = tanLiangxiangJie
                            detailedExplanationTextView.text = detailedExplanation
                            currentQuestionIndex -= 1
                        }

                        else -> {
                            // 这里可以根据需求将 answerToRecord 存储到适当的数据结构中
                            resultList.add("$selectedOption，")
                            val resultString = resultList.joinToString("")
                            answerToRecordTextView.text = resultString
                        }
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
//                answerToRecordTextView.append(answerToRecord)
                resultList.add(answerToRecord)
                val resultString = resultList.joinToString("")
                answerToRecordTextView.text = resultString

            }
            currentQuestionIndex++
            if (currentQuestionIndex < questions_keShou.size) {
                showQuestion(questions_keShou[currentQuestionIndex])
            } else {
                nextButton.setText("结束")
                nextButton.isEnabled = false

            }
        }
        resetButton.setOnClickListener {
            resetPage(questions_keShou)
        }

        returnButton.setOnClickListener {
            returnPage(questions_keShou)
        }

    }


}
