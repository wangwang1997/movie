// JavaScript Document

		var db = openDatabase('flimsystem', '1.0', 'Film system', 3 * 1024 * 1024);
	    var msg;
	    db.transaction(function (tx) {
        tx.executeSql("CREATE TABLE IF NOT EXISTS Filmdetail (name unique,image,image1,director,actor,score)");
		tx.executeSql('CREATE TABLE IF NOT EXISTS Filmimage (name unique,actorpic,actorname,actorjob,filmimage,filmvideo)');
		tx.executeSql('CREATE TABLE IF NOT EXISTS Filmdetails (name unique,English,kind,placetime,date,introduce,pinlun)');
	   });
		/*db.transaction(function (tx) {
		  tx.executeSql("DROP TABLE Filmdetails");
		});*/
		
	  db.transaction(function (tx) {
        tx.executeSql('INSERT INTO Filmdetail VALUES("我不是药神","/image/yaoshen.jpg","/image/yaoshen1.jpg","文牧野","徐峥 周一围 王传君 谭卓","9.4")');
	    tx.executeSql('INSERT INTO Filmdetail VALUES("摩天营救","/image/motian.jpg","/image/motian1.jpg","罗森·马歇尔·瑟伯","道恩·强森 内芙·坎贝尔","8.9")');
	    tx.executeSql('INSERT INTO Filmdetail VALUES("风语咒","/image/fenyu.jpg","/image/fenyu1.jpg","刘阔","路知行 阎萌萌 褚珺 边江","9.1")');
	    tx.executeSql('INSERT INTO Filmdetail VALUES("一出好戏","/image/haoxi.jpg","/image/haoxi1.jpg","黄渤","黄渤 王宝强 张艺兴 舒淇","9.4")');
		tx.executeSql('INSERT INTO Filmdetail VALUES("巨齿鲨","/image/jusha.jpg","/image/jusha1.jpg","乔·德特杜巴", "杰森·斯坦森 李冰冰","9.4")');
	   });  
	   
	  db.transaction(function (tx) {
        tx.executeSql('INSERT INTO Filmimage VALUES("我不是药神","/image/ys01.jpg&image/ys02.jpg&image/ys03.jpg&image/ys04.jpg&image/ys05.jpg&image/ys06.jpg&image/ys07.jpg&image/ys08.jpg&image/ys09.jpg&image/ys10.jpg","文牧野&徐峥&周一围&王传君&谭卓&章宇&杨新鸣&王砚辉&贾晨飞&王佳佳","导演&饰 程勇&饰 曹斌&饰 吕受益&饰 刘思惠&饰 彭浩&饰 刘牧师&饰 张长林&饰 警察&饰 吕受益妻","/image/ys11.jpg&image/ys12.jpg&image/ys13.jpg&image/ys14.jpg&image/ys15.jpg&image/ys16.jpg&image/ys17.jpg&image/ys18.jpg&image/ys19.jpg","9.4")');
	    tx.executeSql('INSERT INTO Filmimage VALUES("摩天营救","/image/mt01.jpg&image/mt02.jpg&image/mt03.jpg&image/mt04.jpg&image/mt05.jpg&image/mt06.jpg&image/mt07.jpg&image/mt08.jpg&image/mt09.jpg&image/mt10.jpg","罗森·马..&道恩·强森&内芙·坎..&黄经汉&昆凌&罗兰·莫勒&诺亚·泰勒&麦肯...&诺亚·科..&文峰","导演&饰 威尔&饰 萨拉&饰 赵明智&饰 杀手夏&饰 博塔& 饰 皮尔斯& 饰 乔治亚& 饰 亨利&饰 吴警官","/image/mt11.jpg&image/mt12.jpg&image/mt13.jpg&image/mt14.jpg&image/mt15.jpg&image/mt16.jpg&image/mt17.jpg&image/mt18.jpg&image/mt19.jpg","8.9")');
	    tx.executeSql('INSERT INTO Filmimage VALUES("风语咒","/image/fy01.jpg&image/fy02.jpg&image/fy03.jpg&image/fy04.jpg&image/fy05.jpg&image/fy06.jpg&image/fy07.jpg&image/fy08.jpg&image/fy09.jpg&image/fy10.jpg","刘阔&路知行&阎萌萌&褚珺&边江&山新&郭政健&张震&苗壮&王冠男","导演&饰 郎明&饰 苏兮&饰 梅冉&饰 假叶&饰 辰月&饰 老村长&饰 郎敬&饰 大山炮&饰 猫腻儿","/image/fy11.jpg&image/fy12.jpg&image/fy13.jpg&image/fy14.jpg&image/fy15.jpg&image/fy16.jpg&image/fy17.jpg&image/fy18.jpg&image/fy19.jpg","9.1")');
	    tx.executeSql('INSERT INTO Filmimage VALUES("一出好戏","/image/hx01.jpg&image/hx02.jpg&image/hx03.jpg&image/hx04.jpg&image/hx05.jpg&image/hx06.jpg&image/hx07.jpg&image/hx08.jpg&image/hx09.jpg&image/hx10.jpg","黄渤&黄渤&舒淇&王宝强&张艺兴&于和伟&王迅&李勤勤&李又麟&魏嘉镁","导演&饰 马进&饰 姗姗&饰 小王&饰 小兴&饰 张总&饰 老潘&饰 张总&无&无&无","/image/hx11.jpg&image/hx12.jpg&image/hx13.jpg&image/hx14.jpg&image/hx15.jpg&image/hx16.jpg&image/hx17.jpg&image/hx18.jpg&image/hx19.jpg","9.4")');
		tx.executeSql('INSERT INTO Filmimage VALUES("巨齿鲨","/image/js01.jpg&image/js02.jpg&image/js03.jpg&image/js04.jpg&image/js05.jpg&image/js06.jpg&image/js07.jpg&image/js08.jpg&image/js09.jpg&image/js10.jpg","乔·德特..&杰森·斯..&李冰冰&雷恩·威..&鲁比·罗丝&赵文瑄&佩吉·肯..&蔡书雅&杰西卡..&罗伯...","导演&饰 乔纳斯..&饰 张苏茵&饰 莫里斯&饰 杰克斯&饰 张博士&饰 DJ&饰 美英&饰 塞莱..&饰 海勒..","/image/js11.jpg&image/js12.jpg&image/js13.jpg&image/js14.jpg&image/js15.jpg&image/js16.jpg&image/js17.jpg&image/js18.jpg&image/js19.jpg","9.4")'); 
        tx.executeSql('INSERT INTO Filmimage VALUES("肆式青春","/image/qc01.jpg&image/qc02.jpg&image/qc03.jpg&image/qc04.jpg&image/qc05.jpg&image/qc06.jpg&image/qc07.jpg&image/qc08.jpg","李豪凌&易小星&竹内良贵&白客&梁达伟&唐雅菁&林美玉&彭师欣","导演&导演&导演&饰 小明&饰 李墨&饰 夏小雨&饰 老奶奶&饰 依琳","/image/qc11.jpg&image/qc12.jpg&image/qc13.jpg&image/qc14.jpg&image/qc15.jpg&image/qc16.jpg&image/qc17.jpg&image/qc18.jpg","9.4")');
		 tx.executeSql('INSERT INTO Filmimage VALUES("爱情公寓","/image/aq01.jpg&image/aq02.jpg&image/aq03.jpg&image/aq04.jpg&image/aq05.jpg&image/aq06.jpg&image/aq07.jpg","韦正&陈赫&娄艺潇&邓家佳&孙艺洲&李佳帆&李金铭","导演&饰 曾小贤&饰 胡一菲&饰 唐悠悠&饰 吕子乔&饰 张伟& 饰 陈美嘉","/image/aq11.jpg&image/aq12.jpg&image/aq13.jpg&image/aq14.jpg&image/aq15.jpg&image/aq16.jpg&image/aq17.jpg&image/aq18.jpg","9.4")');
		 tx.executeSql('INSERT INTO Filmimage VALUES("昨日青空","/image/qk01.jpg&image/qk02.jpg&image/qk03.jpg&image/qk04.jpg","奚超&段艺璇&马斑马&大象","导演&饰 姚哲甜&饰 花生&饰 老陈","/image/qk11.jpg&image/qk12.jpg&image/qk13.jpg&image/qk14.jpg&image/qk15.jpg&image/qk16.jpg&image/qk17.jpg&image/qk18.jpg&image/qk19.jpg","9.4")');
	   }); 
	   
	    
      db.transaction(function (tx) {
        tx.executeSql('INSERT INTO Filmdetails VALUES("我不是药神","Dying To Survive","剧情/喜剧","中国大陆 | 117分钟","2018-07-05在中国大陆上映","一位不速之客的意外到访，打破了神油店老板程勇的平凡人生，他从一个交不起房租的男性保健品商贩，一跃成为印度仿制药“格列宁”的独家代理商。收获巨额利润的他，生活剧烈变化，被病患们冠以“药神”的称号。但是，一场关于救赎的拉锯战也在波涛暗涌中慢慢展开。","幸好没有错过的电影，看完，果然如预期般郁闷，拍得很好。&这些人物形象在现实生活中随处可见，但通过戏剧化的处理却是让我们为他们的命运触动。&我不是药神赤裸裸的揭露了底层百姓的艰难生活，我们国家虽然繁荣富强，但是还是存在太多发展不均衡问题。")');
	    tx.executeSql('INSERT INTO Filmdetails VALUES("摩天营救","Skyscraper","动作/冒险/剧情","美国 | 102分钟","2018-07-20在中国大陆上映","在香港市中心，世界上最高、结构最复杂的摩天大楼遭到破坏，危机一触即发。威尔·索耶（道恩·强森 饰）的妻子萨拉（内芙·坎贝尔 饰）和孩子们在98层被劫为人质，直接暴露在火线上。威尔，这位战争英雄、前联邦调查局救援队员，作为大楼的安保顾问，却被诬陷纵火和谋杀。他必须奋力营救家人，为自己洗脱罪名，关乎生死存亡的高空任务就此展开。","《摩天营救》又是一部适合一家人共同观看的影片，从中能看到家人之爱有多强大。&特效够，剧情紧，惊险足，足够爽！&强森真是让人有安全感啊，救人直播，双击666。")');
	    tx.executeSql('INSERT INTO Filmdetails VALUES("风语咒","The Wind Guardians","动画/冒险/奇幻","中国大陆 | 105分钟","2018-08-03在中国大陆上映","　数千年前，上古四大凶兽为祸人间，被上古侠岚用秘术“风语咒”封印，如今四大凶兽之一“饕餮”即将在千年的沉寂后复苏，然而“风语咒”秘术却早已失传。双目失明但乐观开朗的少年郎明与母亲相依为命，母子二人平日里插科打诨，感情至深。虽然父亲多年前失踪，但郎明始终铭记着父亲传授给自己的一句秘诀，那是传说中的失传秘术“风语咒”…… ","如果常规电影是在讲述一个完整的故事，那么《风语咒》类的电影更像是为我们造一个梦。&如今制作水准已经不是衡量华语动画优劣的标准了，文本才是，画质优秀的国产动画很多了，好故事却没几个。&中国风浓郁，没有不洋不中不伦不类。")');
	    tx.executeSql('INSERT INTO Filmdetails VALUES("一出好戏","The island","喜剧","中国大陆 | 134分钟","2018-08-10在中国大陆上映","马进（黄渤饰）欠下债务，与远房表弟小兴（张艺兴饰）在底层社会摸爬滚打，习惯性的买彩票，企图一夜爆富，并迎娶自己的同事姗姗（舒淇饰）。一日，公司全体员工出海团建，途中，马进收到了彩票中头奖的信息，六千万！就在马进狂喜自己翻身的日子终于到来之际，一场突如其来的滔天巨浪打破了一切。苏醒过来的众人发现身处荒岛，丧失了一切与外界的联系。在封闭小岛的背景下，失去规则、失去阶级、失去财富的他们呈现出人性百态的浮世绘 。","真心希望黄渤能够成功，至少给世人一个成功的期待。这成功不是票房上的，而是艺术上的。&黄渤，这位目前唯一有可能与周星驰比肩的演员，看来是要踏上周星驰的导演之路了。&这么拖家带口地用鸡条的演员，有点担心。")');
		tx.executeSql('INSERT INTO Filmdetails VALUES("巨齿鲨","The Meg","动作/冒险/剧情","美国 | 115分钟","2018-08-10在中国大陆上映","一项由中国主导的国际科研项目正在马里亚纳海沟深处进行，却突遭未知生物攻击，科研人员被困海底。前美国海军陆战队深海潜水专家乔纳斯·泰勒（杰森·斯坦森饰）受命前往营救，再度遭遇数年前曾在深海给自己留下终身难以磨灭记忆的史前生物巨齿鲨。乔纳斯联手科研项目中的中国女科学家张苏茵（李冰冰饰）成功营救了被困人员，但营救行动却发生了一系列意外，当史前巨兽巨齿鲨逃离深海，众人将面临一场史无前例的灾难危机。","影片结局，巨翅鲨被“郭达”乱拳打死后，李冰冰应该顺势来句：“没有买卖，就没有杀害。” &谜巢海洋版(=￣ρ￣=)..zzZZ&怎么感觉像中国特供一样")');
		tx.executeSql('INSERT INTO Filmdetails VALUES("肆式青春","詩季織々","动画","日本，中国大陆 | 74分钟","2018-08-04在中国大陆上映","影片由李豪凌、易小星、竹内良贵三人联合执导,以三段温暖清新的小故事共同组成,从“衣食住行”四个方面来诉说关于青春的故事。绘梦动画创始人李豪凌则为大家带来了上海石库门一对青梅竹马尘封已久的“上海恋”;易小星执导的短篇“三鲜米粉”以北京为舞台,讲述北漂青年与身处故乡的祖母之 间的故事;曾参与制作《你的名字。》的导演竹内良贵则通过“小小时装秀”描绘了在广州相互帮助、共同生活的一对姐妹的生活。","2D好评，其实都是日本作画。&看到青春两个字我就应该狂殴男友并拒绝进电影院 &所以，我哭了，您呢？")');
		tx.executeSql('INSERT INTO Filmdetails VALUES("爱情公寓","Ipartment of Love","喜剧/爱情","中国大陆 | 117分钟","2018-08-10 14:00在中国大陆上映","《爱情公寓》电影版归来，原班人马十年催泪重聚。曾小贤、胡一菲、吕子乔、张伟、唐悠悠、陈美嘉悉数回归，还是熟悉的场景和熟悉的人，嘻嘻哈哈、打打闹闹，笑声从没停过。老朋友的故事将继续展开，印证了电视剧的那句主题语——“最好的朋友在身边，最爱的人就在对面”。不过这一次，他们打算搞个大事情…… ","所以关谷真的消失了吗？&青春的回忆。&故事没有终点。")');
		tx.executeSql('INSERT INTO Filmdetails VALUES("昨日青空","Sky of Yesterday","爱情/动画","中国大陆 | 82分钟","2018在中国大陆上映","中国首部青春题材动画电影《昨日青空》将于2018年暑期全国上映。该片改编自口袋巧克力同名人气漫画作品，由咕咚导演奚超执导。影片以中国南方小镇兰溪为实际取景地，讲述了小镇上的几位高三学生，有关梦想、友谊、亲情和初恋等的成长经历，描绘出一段极具中国风、清新唯美的青春故事。","如果能还原出原绘本的风采，该作至少8.7分 。&老实说，这是我第一次走进电影院看动画电影。这个第一次没有让我失望，它唤醒了我的很多回忆，那些久远的，却永远不会忘记的岁月。&预告片真的大丈夫.......给人一种强烈的基片感觉啊………… ")');
	   });       