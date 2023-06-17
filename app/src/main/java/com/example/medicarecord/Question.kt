package com.example.medicarecord

enum class QuestionType {
    SINGLE_CHOICE,  // 单选题
    MULTI_CHOICE    // 多选题
}

data class Question(
    val text: String,
    val options: List<String>,
    val type: QuestionType,   // 题目类型
    val selectedOptions: List<Boolean>  // 仅在多选题时使用，表示选项的选中状态
)





