package com.example.medicarecord
val zhengZhuanglieBiao=listOf("发热", "咳嗽咳痰", "咯血", "呼吸困难", "头痛", "胸痛", "腹痛", "关节痛", "腰背痛", "颈肩痛", "心悸", "水肿", "恶心呕吐", "呕血便血", "腹泻", "消瘦", "黄疸", "少尿无尿", "多尿", "尿频尿急尿痛", "血尿", "癫痫发作与惊厥", "眩晕", "意识障碍", "皮肤黏膜出血")
val jiBinglieBiao = listOf("脑出血", "脑梗死", "颈椎病", "腰椎间盘突出")


var questions_faRe = listOf(
        Question("起病诱因、病因", listOf("xx前无明显诱因出现发热", "xx前感冒后出现发热", "xx前受凉后出现发热","xx前创伤后出现发热","xx前感咽痛不适，后出现发热","xx前蚊虫叮咬后出现发热"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("发热程度", listOf("发热，最高温度达？℃", "高热，最高温度达？℃", "低热，最高温度达？℃","发热程度详解"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("发热的特点", listOf("呈持续性低热", "呈稽留热", "呈弛张热", "呈间歇热", "呈波状热", "呈回归热", "呈不规则热","发热的特点详解"),QuestionType.SINGLE_CHOICE,emptyList()),
        Question("伴随症状", listOf("寒战","咳嗽", "咳痰", "肌肉关节痛", "头痛", "头晕", "胸痛", "胸闷", "腹痛", "尿频、尿急、尿痛", "咯血", "皮疹", "皮肤黏膜出血","其他不适"),QuestionType.MULTI_CHOICE,List(14) { false })
    )
val faRechengDuxiangJie = "发热程度分为:\n" +
        "①低热:37.3~38°C;\n" +
        "②中度发热:38.1~39°C ;\n" +
        "③高热:39.1~41°C;④超高热:41°C以上。\n"
val reXingxiangJie ="1.稽留热(continued fever) 是指体温明显升高达39～40℃以上，24小时内体温波动相差不超过1℃，常见于伤寒、大叶性肺炎、流行性脑脊髓膜炎、恙虫病等的症状明显期。\n" +
        "2.弛张热(remittent fever) 是指24小时内体温波动相差超过2℃，但最低点未达正常水平的体温曲线类型，常见于伤寒的缓解期、败血症、风湿热、细菌性肝脓肿等。\n" +
        "3.间歇热(intermittent fever) 体温骤然升达高峰，持续数小时，又迅速降至正常水平，无热期可持续1天至数天，如此高热期与无热期反复交替出现，见于疟疾、急性肾盂肾炎等。\n" +
        "4.回归热(recurrent fever) 是指高热持续数日后自行消退，但数日后又再出现的体温曲线类型，可见于回归热、霍奇金病等。\n" +
        "5.波状热(undulant fever) 体温逐渐上升达39℃或以上，数天后又逐渐下降至正常水平，持续数天后又逐渐升高，如此反复多次。常见于布氏杆菌病。\n" +
        "6.不规则热(irregular fever) 发热的体温曲线无一定规律，可见于结核病、风湿热、支气管肺炎、渗出性胸膜炎等。"
val tanYanseXiangjie ="1、绿色痰：通常判断与铜绿假单胞菌感染的可能性较高；\n" +
        "2、黄脓痰：可能是肺炎链球菌、金黄色葡萄球菌，或革兰氏阳性球菌、革兰氏阴性杆菌感染；\n" +
        "3、白色脓或白色黏痰：为一般的致病菌如革兰氏阳性菌、革兰氏阴性杆菌感染。部分患者虽然为白痰，但不是脓痰，而是黏液痰，没有黄绿色，分析可能是病毒、结核、真菌感染等\n" +
        "4、浓臭痰，痰液分3层:肺脓肿；分4层:支气管扩张（上：泡沫；中：浑浊；下：脓；最下：坏死物质。）"
val tanLiangxiangJie ="痰多易咯是慢阻肺的特征？ 痰少难咯要注意患者神志，要预防痰卡住呼吸道导致窒息"
val piZhenxiangJie = "发热1天后出疹.多见于水痘;发热4天左右出疹.多见于麻疹;\n" +
        "发热5天至1周出疹,多见于斑疹伤寒和伤寒;\n" +
        "发热伴有环形红斑或结节性红斑.有游走性关节痛.心脏杂音等症状之一，见于风湿热。"






var questions_keShou = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现咳嗽", "xx前感冒后出现咳嗽", "xx前受凉后出现咳嗽","xx前劳累后出现咳嗽","xx前服用阿司匹林、吗啡类、巴比妥类药物后出现咳嗽"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("咳嗽的时间长短和规律", listOf("突发咳嗽", "发作性咳嗽", "慢性长期咳嗽，每年发作总时间大于3个月","咳嗽夜间加重","咳嗽白天加重"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("咳嗽的程度、音色", listOf("声音嘶哑", "鸡鸣样咳嗽", "金属音咳嗽","犬吠样咳嗽", "咳嗽声音低微或无力","干咳为主","湿咳为主", "咳嗽的音色详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("痰的颜色性质", listOf("白黏痰", "黄脓痰", "绿色痰","浓臭痰，痰液分4层","浓臭痰，痰液分3层","颜色不详","痰的颜色性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("痰的量多多少及是否易咯出", listOf("量多易咯", "量少难咯", "痰量及咯出详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("痰中是否带血", listOf("痰中带血", "痰中带血丝", "痰中无血"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热","胸痛", "呼吸困难", "咯血", "头痛", "大量脓痰", "哮鸣音", "杵状指(怀疑支气管扩张时？)","其他不适"),QuestionType.MULTI_CHOICE,List(9) { false })
)
val keShouyinSexiangJie ="1、咳嗽声音嘶哑：多为声带的炎症引起的，如急性咽喉炎、支气管炎等，此外也可能是喉咙处存在肿瘤压迫喉返神经所致；\n" +
        "2、鸡鸣样咳嗽：患者可表现出连续的阵发性剧咳，且伴有高调吸气回声，多见于百日咳、会厌、喉部疾病或支气管受压等情况；\n" +
        "3、金属音咳嗽：咳嗽的声音类似金属间摩擦的声音，常提示有气道梗阻的可能性，多见于纵隔肿瘤、主动脉瘤或支气管癌等直接压迫气管所致；\n" +
        "4、犬吠样咳嗽：又称为哮吼性咳嗽，咳嗽时会出现类似犬吠一样的“空空”声音，且咳嗽音调较高，常见于痉挛性喉炎患者；\n" +
        "5、咳嗽声音低微且无力：咳嗽声音较弱且不是很深，常见于严重肺气肿、声带麻痹、声带水肿及极度衰弱等患者。"





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

val nMRCxiangJie = "Ⅰ级是在剧烈活动之后出现；Ⅱ级是在快走或爬楼梯时出现；Ⅲ级是与同龄的普通人相比，在平地上会走得更慢，或在平地上正常行走时需要停下来呼吸；Ⅳ级是慢走100米以内会出现气短；Ⅴ级是讲话、穿衣等轻微活动时就会出现气短。"






var questions_touTong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现头痛", "xx前剧烈运动后出现头痛", "xx前过度疲劳后出现头痛","xx前用力排便后出现头痛","xx前因情绪激动出现头痛","xx前脑外伤后出现头痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("前额头痛", "偏头痛（左右？）","游走性疼痛","不知痛处","枕部疼痛", "颅顶疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛性质", listOf("呈胀痛", "呈钝痛","搏动性痛(跳痛)", "呈刀割样痛","无法描述","头痛性质详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("加重或缓解的因素", listOf("咳嗽时加重", "打喷嚏时加重", "改变体位时加重","呕吐后可缓解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("呕吐","眩晕", "发热", "意识障碍", "眼球痛或项痛", "癫痫", "焦虑","失眠", "偏瘫", "失语", "其他不适"),QuestionType.MULTI_CHOICE,List(11) { false }),
    Question("与疾病相关的其他病史", listOf("脑血管畸形病史","脑动脉瘤病史", "高血压病史", "发作性头痛史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)

val touTongxingZhixiangJie ="(1)胀痛：为一种钝性疼痛，多呈性全头痛，疼痛的同时伴有头胀大的感觉，或伴以头昏、头沉。常见于神经性头痛、普通型偏头痛、脑积水、头部器官疾病所致的头痛及高血压、脑慢性缺血、头部外伤后头痛等。\n" +
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

val xiongTongxingZhixiangJie ="1、钝痛：如果胸痛呈钝痛，则需要考虑原发性支气管肺癌、纵隔肿瘤等；\n" +
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
val fuTongxingZhixiangJie ="1、腹部胀痛很可能是消化方面的问题，比如食物在胃肠道堆积难以排出或肠道菌群分解不耐受性食物产生气体等情况，包括便秘、积食等都会引起腹部胀痛。\n" +
        "2、腹部钝痛多由腹部炎症或出血性病变引起，比如阑尾炎、肝破裂出血等。\n" +
        "3、腹部绞痛多由空腔器官阻塞、痉挛或扩张引起，比如肠扭转、肠粘黏、肠梗阻、胆道结石、输尿管结石、溃疡、肿瘤等。\n" +
        "4、腹部刺痛很有可能是由胃肠道痉挛引起的。\n" +
        "5、腹部灼烧性疼痛多与化学刺激有关，比如胃酸分泌过多引起的胃部灼烧性疼痛，包括胃溃疡、胃食道反流等疾病会引起腹部灼烧性疼痛。\n" +
        "6、有的腹痛是由疼痛辐射到固定的区域引起的，如急性胆囊炎可以辐射到右肩和背部，阑尾炎引起的疼痛可以从脐转移到右下象限。"



var questions_guanJietong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现关节痛", "xx前过度劳累后出现关节痛", "xx前因饮酒后出现关节痛","xx前天气变冷后出现关节痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("疼痛呈游走性", "疼痛位置固定","不知痛处"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("加重或缓解的因素", listOf("天气变冷时加重", "活动后加重", "活动后缓解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热盗汗、乏力纳差消瘦","红肿热痛", "疼痛对称", "晨僵，持续了30分钟以上", "关节畸形", "饮酒后疼痛", "皮肤红斑、光过敏","皮肤紫癜、腹痛","肌肉疼痛、肌无力、肌萎缩","淋巴结大、肝脾大","其他不适"),QuestionType.MULTI_CHOICE,List(11) { false }),
    Question("与疾病相关的其他病史", listOf("关节外伤史","结核病史","风湿病史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(4) { false })
)

val guanJietongbszzxiangJie ="1.发热盗汗、乏力纳差消瘦:考虑结核\n" +
        "疼痛对称、晨僵，持续了30分钟以上、关节畸形:考虑类风湿关节炎\n" +
        "饮酒后疼痛:考虑痛风\n" +
        "皮肤红斑、光过敏,皮肤紫癜、腹痛,肌肉疼痛、淋巴结大、肝脾大:考虑过敏性紫癜\n" +
        "过敏性紫癜为什么腹痛：过敏性紫癜以后，容易出现肠壁水肿、渗出以及出血的现象，肠壁出血形成的刺激可致肠蠕动亢进，引起肠痉挛，出现腹痛。"


var questions_yaoBeitong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现腰背痛", "xx前不慎扭伤后出现腰背痛", "xx前负重后出现腰背痛","xx前受凉后出现腰背痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("疼痛呈游走性", "疼痛位置固定","不知痛处"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("加重或缓解的因素", listOf("活动后加重","休息后缓解","活动后缓解" ),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热盗汗、乏力纳差消瘦","脊柱畸形", "活动受限", "尿频、尿急、排尿不尽","肾区叩击痛","下肢疼痛","其他不适"),QuestionType.MULTI_CHOICE,List(7) { false }),
    Question("与疾病相关的其他病史", listOf("关节外伤史","结核病史","风湿病史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(4) { false })
)


var questions_jingJiantong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现肩颈痛", "xx前外伤后出现肩颈痛", "xx前早晨起来后出现肩颈痛","xx前劳累后出现肩颈痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("疼痛部位", listOf("疼痛呈游走性", "疼痛位置固定","不知痛处"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性疼痛，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("活动受限","上肢放射痛", "头晕","上肢麻木、疼痛、无力、走路踩棉花样感","其他不适"),QuestionType.MULTI_CHOICE,List(5) { false }),
    Question("与疾病相关的其他病史", listOf("外伤史","结核病史","风湿病史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(4) { false })
)


var questions_xinJi = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现心悸", "xx前感冒后出现心悸", "xx前剧烈运动后出现心悸","xx前劳累后出现心悸"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性发作，发作频率？，持续时间为？", "持续性疼痛"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("心前区疼痛","发热", "晕厥抽搐","头晕乏力","呼吸困难","消瘦、出汗、手抖","其他不适"),QuestionType.MULTI_CHOICE,List(7) { false }),
    Question("与疾病相关的其他病史", listOf("贫血","心脏病", "高血压", "慢性呼吸系统疾病","甲状腺功能亢进","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(6) { false })
)



var questions_shuiZhong = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现水肿", "有无前驱感染", "前驱感染详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("部位", listOf("颜面部水肿，并向下蔓延", "双下肢水肿，并向上蔓延"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("特点", listOf("全身性","局部性", "对称性","凹陷性","特点详解"),QuestionType.MULTI_CHOICE,List(5) { false }),
    Question("伴随症状", listOf("肝区胀痛","泡沫样尿", "呼吸困难及发绀","其他不适","伴随症状详解"),QuestionType.MULTI_CHOICE,List(5) { false }),
    Question("与疾病相关的其他病史", listOf("肝病","心脏病", "肾病", "甲状腺疾病病史","手术或下肢静脉血栓史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(6) { false })
)

val qianQuganRan = "前驱感染就是典型症状出现之前的一般的没有特异性的症状。比如说咳嗽，低烧，疲劳，头痛就是很常见的前驱症状。\n" +
        "上呼吸道感染史1-3周后+血尿+C3补体下降：急性肾小球肾炎\n" +
        "上呼吸道感染史1周内+血尿：IgA肾病"

val shuiZhongteDian = "凹陷性水肿:常见于肾脏病肾病综合征、肝硬化或者心衰患者\n" +
        "非凹陷性水肿：常见于甲状腺疾病、甲状腺功能减退，或者甲状腺功能亢进，还有寄生虫性疾病，会出现淋巴管阻塞，也可以出现非凹陷性水肿。"


val shuiZhongbszzXiangjie ="通常尿液泡沫增多，提示尿液有蛋白质的出现，如果同时患者又存在四肢浮肿，一般最大的可能性是与肾小球疾病有关系。\n" +
        "肾炎综合症：血尿、蛋白尿、水肿、高血压，以血尿为主。\n" +
        "肾病综合征：大量蛋白尿（>3.5g/d）、低蛋白血症、水肿、高血脂，以蛋白尿为主。"


var questions_eXinouTu = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现恶心呕吐","xx前因不洁饮食引起恶心呕吐", "体位变化引起恶心呕吐", "咽部刺激引起恶心呕吐"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性呕吐，发作频率？", "持续性呕吐"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呕吐与进食的关系", listOf("进食后即刻呕吐","餐后数小时后呕吐", "餐后1小时以上出现呕吐","呕吐与进食详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呕吐特点", listOf("干呕","喷射性呕吐","呕吐物为胃内容物", "呕吐物呈鲜红色","呕吐物呈黄色（胆汁反流到胃里）"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("腹痛","腹泻", "头晕","口干、多饮、多尿、消瘦","其他不适"),QuestionType.MULTI_CHOICE,List(5) { false }),
    Question("与疾病相关的其他病史", listOf("胆胰疾病","心脏病", "高血压", "胃炎","消化性溃疡","糖尿病","腹部手术史","食物药物过敏史","已婚有龄妇女早晨呕吐者应注意早孕"),QuestionType.MULTI_CHOICE,List(9) { false })
)

val ouTujinShixiangJie ="进食过程中或进食后即刻呕吐，可能为患者出现了幽门管溃疡或精神性呕吐。\n" +
        "如果患者在餐后1小时以上出现呕吐称为延迟性呕吐，通常提示患者的胃张力下降或胃排空延迟。\n" +
        "餐后呕吐常见于幽门梗阻，呕吐物可有隔夜宿食。\n" +
        "餐后呕吐，特别是集体发病的患者多数是由于食物中毒所导致的。"


var questions_ouXuebianXue = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现呕血便血","xx前因进食粗糙或带刺食物引起呕血便血", "xx前服用非甾体消炎药后出现恶呕血便血", "xx前外伤后引起呕血便血"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性便血，发作频率？持续时间？", "持续性呕吐"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("呕血便血的量、颜色", listOf("量大色鲜红","量大色黑", "量少色鲜红","量少色黑"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("与大便的关系", listOf("便前出血","便后出血","与大便关系详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("上腹痛","腹胀、肝掌、蜘蛛痣", "黄疸、畏寒、发热", "皮肤出血点","呕血伴肠鸣音亢进、黑便（提示活动性出血）","其他不适"),QuestionType.MULTI_CHOICE,List(6) { false }),
    Question("与疾病相关的其他病史", listOf("消化性溃疡","肝炎","血液系统疾病","大量饮酒史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)
val daBianxiangJie = "便后出血:多见于肛门疾病，如痔疮、肛裂。\n" +
        "便前出血:考虑溃疡性结直肠炎等疾病。"


var questions_fuXie = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现腹泻","xx前因不洁饮食引起腹泻", "xx前服用药物后出现腹泻"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性腹泻，发作频率？持续时间？", "持续性呕吐","复发性腹泻"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("大便的性状", listOf("大便呈稀糊状","呈水样便", "呈黏液脓血便","大便中往往混有未消化食物","大便性状详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("腹泻与腹痛的关系", listOf("便后腹痛可缓解","便后腹痛不可缓解","无腹痛","腹泻腹痛详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("发热","里急后重", "消瘦", "皮疹或皮下出血","腹部包块","关节痛、关节肿胀","其他不适"),QuestionType.MULTI_CHOICE,List(7) { false }),
    Question("与疾病相关的其他病史", listOf("慢性细菌性痢疾","阑尾炎","炎症性肠炎","肠寄生虫病","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)

val daBianxingZhuangxiangJie ="1、动力性腹泻，往往表现为腹痛、腹鸣、腹泻，动力性腹泻的大便往往是稀糊状。\n" +
        "2、分泌性腹泻，是指由于细菌毒素刺激肠道，产生大量肠液分泌，往往表现为水样便。\n" +
        "3、渗出性腹泻也叫炎性腹泻，是指各种原因导致肠道的炎症以及黏膜损伤，往往表现为黏液脓血便。\n" +
        "4、渗透性腹泻，往往继发于消化吸收不良，大便中往往混有未消化食物。"



var questions_bianMi = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现便秘","xx前因精神压力大而出现便秘"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性便秘", "持续性便秘","复发性便秘"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("大便的特点", listOf("次数","量", "性状","颜色","加重与缓解的因素"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("腹泻与腹痛的关系", listOf("便后腹痛可缓解","便后腹痛不可缓解","无腹痛","腹泻腹痛详解"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("腹部包块","生活环境的改变", "精神紧张", "依赖泻药排便","其他不适"),QuestionType.MULTI_CHOICE,List(5) { false }),
    Question("与疾病相关的其他病史", listOf("甲状腺功能减退症","糖尿病病史（糖尿病的植物神经病变就会导致胃肠道功能的紊乱）","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(3) { false })
)

val fuXiefuTongxiangJie = "急性腹泻常有腹痛，尤以感染性腹泻明显。\n" +
        "小肠疾病的腹泻疼痛常在脐周，便后腹痛缓解不显；\n" +
        "结肠疾病则疼痛多在下腹，且便后疼痛常可缓解或减轻。\n" +
        "分泌性腹泻往往无明显腹痛。"


var questions_hunangDan = listOf(
    Question("起病诱因、病因", listOf("xx前无明显诱因出现黄疸","xx前因服用（或停用抗病毒药物后）特殊药物后而出现黄疸","xx前因不洁饮食而出现黄疸","xx前因饮酒后出现黄疸"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("发作缓急程度", listOf("急性发作，病程短", "慢性发作，病程长"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("持续时间", listOf("间歇性便秘", "持续性便秘","复发性便秘"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("出黄疸的时间与波动情况", listOf("胆总管结石引起的黄疸多呈间歇性和波动性"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("大小便颜色", listOf("陶土色大便","大小便黄"),QuestionType.SINGLE_CHOICE,emptyList()),
    Question("伴随症状", listOf("畏寒、发热", "腹痛、腹胀","其他不适"),QuestionType.MULTI_CHOICE,List(3) { false }),
    Question("与疾病相关的其他病史", listOf("肝炎","肝胆系统疾病及消化系统疾病","药物服用史","大量饮酒史","食物药物过敏史"),QuestionType.MULTI_CHOICE,List(5) { false })
)




























