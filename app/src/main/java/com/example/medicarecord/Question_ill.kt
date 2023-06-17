package com.example.medicarecord
var questions_faRe = listOf(
        Question("起病诱因、病因", listOf("xx前无明显诱因出现发热", "xx前感冒后出现发热", "xx前受凉后出现发热","xx前创伤后出现发热","xx前感咽痛不适，后出现发热","xx前蚊虫叮咬后出现发热"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("发热程度", listOf("发热，最高温度达？℃", "高热，最高温度达？℃", "低热，最高温度达？℃","发热程度详解"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("发热的特点", listOf("呈持续性低热", "呈稽留热", "呈弛张热", "呈间歇热", "呈波状热", "呈回归热", "呈不规则热","发热的特点详解"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("伴随症状", listOf("寒战","咳嗽", "咳痰", "肌肉关节痛", "头痛", "头晕", "胸痛", "胸闷", "腹痛", "尿频、尿急、尿痛", "咯血", "皮疹", "皮肤黏膜出血","其他不适"),QuestionType.MULTI_CHOICE,List(14) { false })
    )

var questions_keShou = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现咳嗽", "xx前感冒后出现咳嗽", "xx前受凉后出现咳嗽","xx前劳累后出现咳嗽","xx前服用阿司匹林、吗啡类、巴比妥类药物后出现咳嗽"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("咳嗽的时间长短和规律", listOf("突发咳嗽", "发作性咳嗽", "慢性长期咳嗽，每年发作总时间大于3个月","咳嗽夜间加重","咳嗽白天加重"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("咳嗽的程度、音色", listOf("声音嘶哑", "鸡鸣样咳嗽", "金属音咳嗽","犬吠样咳嗽", "咳嗽声音低微或无力","干咳为主","湿咳为主", "咳嗽的音色详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("痰的颜色性质", listOf("白黏痰", "黄脓痰", "绿色痰","浓臭痰，痰液分4层","浓臭痰，痰液分3层","颜色不详","痰的颜色性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("痰的量多多少及是否易咯出", listOf("量多易咯", "量少难咯", "痰量及咯出详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("痰中是否带血", listOf("痰中带血", "痰中带血丝", "痰中无血"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热","胸痛", "呼吸困难", "咯血", "头痛", "大量脓痰", "哮鸣音", "杵状指(怀疑支气管扩张时？)","其他不适"),QuestionType.MULTI_CHOICE,List(9) { false })
)

var questions_kaXue = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现咯血", "xx前感冒后出现咯血", "xx前受凉后出现咯血","xx前劳累后出现咯血"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("咯血的性质与量", listOf("咳血量大，色红", "咳血量少，色红","吐出大量黑血", "吐血量大，色红"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热","胸痛", "呛咳", "脓痰", "皮肤黏膜出血", "杵状指", "皮肤、巩膜黄染","其他不适"),QuestionType.MULTI_CHOICE,List(9) { false })
)

var questions_huXikunNan = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现呼吸困难", "xx前感冒后出现呼吸困难", "xx前接触过敏原后出现呼吸困难", "xx前剧烈运动后出现呼吸困难","xx前劳累后出现呼吸困难"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呼吸困难出现的缓急", listOf("急性发作", "进行性加重","慢性发作"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呼吸困难的性质", listOf("吸气性呼吸困难", "呼气性呼吸困难","混合性呼吸困难"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呼吸困难的程度", listOf("mMRC分级Ⅰ级", "mMRC分级Ⅱ级","mMRC分级Ⅲ级","mMRC分级Ⅳ级","mMRC分级Ⅴ级","mMRC分级详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呼吸困难缓解与加重的因素", listOf("坐起缓解（端坐呼吸）", "活动后加重","其他活动或体位"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呼吸困难发作频率", listOf("间歇性呼吸困难", "持续性呼吸困难","发作间隔时间缩短","跳过"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("哮鸣音","发热", "胸痛", "咳嗽", "咳痰", "意识障碍","其他不适"),QuestionType.MULTI_CHOICE,List(7) { false }),
    Question("诊疗经过", listOf("在xx医院就诊，查（血常规、胸部X线、肺功能、心电图、血气分析），予xx治疗，效果欠佳", "患者自行服用XX药物治疗，效果欠佳","未作任何治疗","有无使用无使用:\n" +
            "抗生素、吸入糖皮质激素和支气管舒张剂"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("一般情况", listOf("患者神情，精神一般，纳食可，睡眠一般，二便调，近一月来体重无明显变化", "患者神情，精神疲倦，纳食欠佳，睡眠欠佳，二便调，近一月来体重无明显变化","一般情况可"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("与疾病相关的其他病史", listOf("慢性肺病","心脏病", "肝病", "肾病", "糖尿病", "高血压","血液系统疾病","下肢深静脉血栓病史或手术史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(9) { false }),
    Question("呼吸困难出现的缓急", listOf("急性发作", "进行性加重","慢性发作"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呼吸困难出现的缓急", listOf("急性发作", "进行性加重","慢性发作"),QuestionType.SINGLE_CHOICE,emptyList()),
)

val daiyong = "Ⅰ级是在剧烈活动之后出现；Ⅱ级是在快走或爬楼梯时出现；Ⅲ级是与同龄的普通人相比，在平地上会走得更慢，或在平地上正常行走时需要停下来呼吸；Ⅳ级是慢走100米以内会出现气短；Ⅴ级是讲话、穿衣等轻微活动时就会出现气短。"


var questions_tuoTong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现头痛", "xx前剧烈运动后出现头痛", "xx前过度疲劳后出现头痛","xx前用力排便后出现头痛","xx前因情绪激动出现头痛","xx前脑外伤后出现头痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("前额头痛", "偏头痛（左右？）","游走性疼痛","不知痛处","枕部疼痛", "颅顶疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛性质", listOf("呈胀痛", "呈钝痛","搏动性痛(跳痛)", "呈刀割样痛","无法描述","头痛性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("加重或缓解的因素", listOf("咳嗽时加重", "打喷嚏时加重", "改变体位时加重","呕吐后可缓解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("呕吐","眩晕", "发热", "意识障碍", "眼球痛或项痛", "癫痫", "焦虑","失眠", "偏瘫", "失语", "其他不适"),QuestionType.MULTI_CHOICE,List(11) { false }),
    Question("与疾病相关的其他病史", listOf("脑血管畸形病史","脑动脉瘤病史", "高血压病史", "发作性头痛史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)

val daiyong2 ="(1)胀痛：为一种钝性疼痛，多呈性全头痛，疼痛的同时伴有头胀大的感觉，或伴以头昏、头沉。常见于神经性头痛、普通型偏头痛、脑积水、头部器官疾病所致的头痛及高血压、脑慢性缺血、头部外伤后头痛等。\n" +
        "(2)钝痛：痛势缓慢，呈持续性，是多种疼痛的概括(如胀痛、紧压痛等)，多见于慢性疾患所致的头痛，系由不敏感的致痛组织所致。\n" +
        "(3)搏动性痛(跳痛)∶疼痛呈规则的搏动性，与脉搏跳动相一致。常见于血管性头痛以及感染、中毒、中暑、头部器官疾患引起的头痛等。\n" +
        "(4)紧压痛：头痛伴有束紧感、压迫感。见于肌紧张性头痛、癔病性头痛、颈椎病性头痛等。\n" +
        "(5)锥痛(或钻痛)、刺痛：在持续性隐痛的过程中，出现的尖锐的、不连续的快速疼痛，重者如锥，轻者如刺。多见于神经血管性头痛、颅神经痛等。\n" +
        "(6)灼痛：在尖锐疼痛的同时伴有灼热感。见于颅神经痛(如三叉神经痛)、偏头痛、癔病性头痛。\n" +
        "(7)牵掣痛：头痛连及周围组织，如有物牵拉，相互加重，甚至有抽动样痛。见于肌紧张性头痛、占位病变所致的压迫性头痛等。\n" +
        "(8)刀割样痛：系尖锐连续性剧痛，似刀割样，呈持续性疼痛阵发性加剧。见于蛛网膜下腔出血、急性脑膜炎等疾病之早期。\n" +
        "(9)电击样痛：为短促而剧烈的锐利疼痛，持续时间为数秒至数分钟不等。见于颅神经病，如三叉神经痛、舌咽神经痛、枕大神经痛等。\n" +
        "(10)捶打痛：为一种不连续的、似重物敲打一样的钝性疼痛。较搏动性头痛之频率为慢，疼痛程度更重。见于高血压性头痛、月经期头痛、偏头痛等血管性头痛。"

var questions_xiongTong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现胸痛", "xx前运动后出现胸痛", "xx前饱餐后出现胸痛","xx前因情绪激动出现胸痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("胸骨后疼痛或心前区疼痛", "胸壁疼痛，部位固定","胸肋部疼痛（左右？）","不知痛处"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛性质", listOf("呈压榨样痛", "呈钝痛","呈酸痛", "呈烧灼样痛","呈针刺样痛","呈刀割样痛","无法描述","胸痛性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("加重或缓解的因素", listOf("呼吸时加重", "排便时加重", "改变体位时加重"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("咳嗽","咳痰", "发热", "呼吸困难", "咯血", "皮肤苍白", "大汗淋漓","头晕", "意识丧失", "反酸", "胃灼热","其他不适"),QuestionType.MULTI_CHOICE,List(12) { false }),
    Question("与疾病相关的其他病史", listOf("糖尿病","心脏病", "高血压", "高血脂病史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)

val daiyong3 ="1、钝痛：如果胸痛呈钝痛，则需要考虑原发性支气管肺癌、纵隔肿瘤等；\n" +
        "2、酸痛：如果胸痛性质为酸痛，通常需要考虑胸壁肌肉劳损，或者胸壁肌肉拉伤等；\n" +
        "3、烧灼样痛：如果胸痛呈灼热感，需要考虑食管炎症或者膈肌发生膈疝；\n" +
        "4、刀割样痛：如果胸痛呈刀割样痛，通常需要考虑肋间神经痛的可能，与病毒感染有关，如带状疱疹病毒；\n" +
        "5、压榨样痛：如果胸痛呈压榨性改变，并且伴有呼吸困难、胸闷，则需要考虑急性心绞痛的可能；\n" +
        "6、针刺样痛：如果胸痛呈针刺样，通常需要考虑心肌缺血、胸膜炎及肋软骨炎症等疾病。"


var questions_fuTong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现腹痛", "xx前劳累后出现腹痛", "xx前因不洁饮食出现腹痛","xx前服用药物（非甾体类）后出现腹痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("左上腹部疼痛", "左下腹部疼痛","右上腹部疼痛","右下腹部疼痛","中腹部疼痛","下腹部疼痛","不知痛处"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛性质", listOf("呈胀痛", "呈钝痛","呈绞痛", "呈刺痛","呈灼烧性疼痛","放射痛到右肩和背部","转移性右下腹痛","无法描述","腹痛性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作时间", listOf("餐前疼痛", "餐后疼痛", "周期性疼痛", "不规律疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("加重或缓解的因素", listOf("呼吸时加重", "排便时加重", "改变体位时加重", "体力活动时加重", "精神紧张时加重"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热","寒战", "皮肤、巩膜黄染", "头晕", "呕吐", "反酸", "腹泻","血尿","其他不适"),QuestionType.MULTI_CHOICE,List(9) { false }),
    Question("与疾病相关的其他病史", listOf("消化系统疾病","结核病史", "胃肠道手术史", "细菌性痢疾、阿米巴痢疾（伴腹泻时）","月经、婚育史（女性）","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)
val daiyong4 ="1、腹部胀痛很可能是消化方面的问题，比如食物在胃肠道堆积难以排出或肠道菌群分解不耐受性食物产生气体等情况，包括便秘、积食等都会引起腹部胀痛。\n" +
        "2、腹部钝痛多由腹部炎症或出血性病变引起，比如阑尾炎、肝破裂出血等。\n" +
        "3、腹部绞痛多由空腔器官阻塞、痉挛或扩张引起，比如肠扭转、肠粘黏、肠梗阻、胆道结石、输尿管结石、溃疡、肿瘤等。\n" +
        "4、腹部刺痛很有可能是由胃肠道痉挛引起的。\n" +
        "5、腹部灼烧性疼痛多与化学刺激有关，比如胃酸分泌过多引起的胃部灼烧性疼痛，包括胃溃疡、胃食道反流等疾病会引起腹部灼烧性疼痛。\n" +
        "6、有的腹痛是由疼痛辐射到固定的区域引起的，如急性胆囊炎可以辐射到右肩和背部，阑尾炎引起的疼痛可以从脐转移到右下象限。"


























