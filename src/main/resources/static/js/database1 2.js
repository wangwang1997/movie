// JavaScript Document
     var db = openDatabase('flimsystem', '1.0', 'Film system', 3 * 1024 * 1024);
	 db.transaction(function (tx) {
	 tx.executeSql('CREATE TABLE IF NOT EXISTS Filmfuture (name unique,image,director,actor,people,time)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS Filmdate (time unique)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS date (time unique)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS Score (name unique,score,degree,people,director,actor,date,image)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS cinema (name unique,location,price,distance)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS filmcinema (name unique,cinema,day,price)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS user (name unique,pwd,like,watched,image)');
	 tx.executeSql('CREATE TABLE IF NOT EXISTS cinemafilm (name unique,film,day,ting,start,price,num,shichang,detail,pic)');
	 //tx.executeSql('CREATE TABLE IF NOT EXISTS people (name unique,paw,want,watched,order,information)');
	 });
	    /*db.transaction(function (tx) {
          tx.executeSql("DROP TABLE cinema");
		});*/
		db.transaction(function (tx) {
        tx.executeSql('INSERT INTO user VALUES("123","234","昨日青空&肆式青春","我不是药神&摩天营救","/image/touxiang1.jpeg")');
		tx.executeSql('INSERT INTO user VALUES("qwer","1234","昨日青空&肆式青春","我不是药神&摩天营救","/image/touxiang2.jpg")');
		tx.executeSql('INSERT INTO user VALUES("zc123456","111","昨日青空&肆式青春","我不是药神&摩天营救","/image/touxiang3.jpg")'); 
		 });
       db.transaction(function (tx) {
        tx.executeSql('INSERT INTO Filmfuture VALUES("肆式青春","/image/qingchun.jpg","李豪凌 易小星 竹内良贵","白客 梁达伟 唐雅菁","58598","2018-08-12")');
		
		 tx.executeSql('INSERT INTO Filmfuture VALUES("爱情公寓","/image/aiqing.jpg","韦正","陈赫 娄艺潇 邓家佳","903040","2018-08-13")');
		 tx.executeSql('INSERT INTO Filmfuture VALUES("昨日青空","/image/qinkong.jpg","奚超","段艺璇 马斑马 大象","142019","2018-08-13")');
		 });
		 db.transaction(function (tx) {
         tx.executeSql('INSERT INTO Filmdate VALUES("2018-08-12")');
		 tx.executeSql('INSERT INTO Filmdate VALUES("2018-08-13")');
		 });
		 db.transaction(function (tx) {
         tx.executeSql('INSERT INTO date VALUES("2018-08-13")');
		 tx.executeSql('INSERT INTO date VALUES("2018-08-12")');
		 tx.executeSql('INSERT INTO date VALUES("2018-08-10")');
		 tx.executeSql('INSERT INTO date VALUES("2018-08-04")');
		 tx.executeSql('INSERT INTO date VALUES("2018-08-03")');
		 tx.executeSql('INSERT INTO date VALUES("2018-07-20")');
		 tx.executeSql('INSERT INTO date VALUES("2018-07-05")');
		 });
		db.transaction(function (tx) {
        tx.executeSql('INSERT INTO Score VALUES("我不是药神","9.4","100%","426112","文牧野","徐峥 周一围 王传君","2018-07-05","/image/yaoshen.jpg")');
	    tx.executeSql('INSERT INTO Score VALUES("摩天营救","8.9","69%","114930","罗森·马歇尔·瑟伯","道恩·强森 内芙·坎贝尔","2018-07-20","/image/motian.jpg")');
	    tx.executeSql('INSERT INTO Score VALUES("风语咒","9.1","75%","124332","刘阔","路知行 阎萌萌 褚珺","2018-08-03","/image/fenyu.jpg")');
	    tx.executeSql('INSERT INTO Score VALUES("一出好戏","9.4","100%","418517","黄渤","黄渤 王宝强 张艺兴","2018-08-10","/image/haoxi.jpg")');
		tx.executeSql('INSERT INTO Score VALUES("巨齿鲨","9.4","100%","261522","乔·德特杜巴","杰森·斯坦森 李冰冰","2018-08-10","/image/jusha.jpg")');
		tx.executeSql('INSERT INTO Score VALUES("肆式青春","无","100%","58598","易小星","白客 梁达伟 唐雅菁","2018-08-12","/image/qingchun.jpg")');
		tx.executeSql('INSERT INTO Score VALUES("爱情公寓","无","100%","903040","韦正","陈赫 娄艺潇 邓家佳","2018-08-13","/image/aiqing.jpg")');
		tx.executeSql('INSERT INTO Score VALUES("昨日青空","无","100%","142019","奚超","段艺璇 马斑马 大象","2018-08-13","/image/qinkong.jpg")');
	   });  
	   
	   db.transaction(function (tx) {
	    tx.executeSql('INSERT INTO cinema VALUES("幸福蓝海IMAX影城（常发广场店）","玄武区红山路88号长发广场5楼","19.9","0.9")');
		tx.executeSql('INSERT INTO cinema VALUES("珠影CC达美影城（太阳宫）","玄武区阳光路3号楼","19.9","1.6")');
	    tx.executeSql('INSERT INTO cinema VALUES("喜满客影城","栖霞区迈皋桥街道华电路一号万谷惠广场4楼","19.9","2.6")');
		tx.executeSql('INSERT INTO cinema VALUES("南京UME国际影城（国际店）","鼓楼区中央路201号金茂汇广场","27.5","3.1")');
	    tx.executeSql('INSERT INTO cinema VALUES("幸福蓝海国际影城（南京商厦店）","玄武区龙蟠路1号南京商厦5楼","32.5","3.2")');
	   });  
	  db.transaction(function (tx) {
        tx.executeSql('INSERT INTO filmcinema VALUES("我不是药神","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","3&3&2&1&4","30.4&26.9&26.9&37.5&37.5")');
	    tx.executeSql('INSERT INTO filmcinema VALUES("摩天营救","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","4&3&0&4&3","29.5&23.9&32.5&33.4&42.5")');
	    tx.executeSql('INSERT INTO filmcinema VALUES("风语咒","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","2&3&1&4&0","25.4&27.9&26.9&39.5&27.9")');
	    tx.executeSql('INSERT INTO filmcinema VALUES("一出好戏","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","2&3&4&1&2","33.5&35.5&32.9&33.5&32.9")');
		tx.executeSql('INSERT INTO filmcinema VALUES("巨齿鲨","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","2&0&1&3&4","29.9&30.5&31.6&34.5&34.9")');
		tx.executeSql('INSERT INTO filmcinema VALUES("肆式青春","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","4&2&3&2&3","31.9&32.9&35.5&28.6&30.9")');
		tx.executeSql('INSERT INTO filmcinema VALUES("爱情公寓","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","2&2&3&4&3","30.5&30.5&34.5&31.5&32.9")');
		tx.executeSql('INSERT INTO filmcinema VALUES("昨日青空","幸福蓝海IMAX影城（常发广场店）&珠影CC达美影城（太阳宫）&喜满客影城&幸福蓝海国际影城（南京商厦店）&南京UME国际影城（国际店）","2&3&4&1&2","32.5&31.5&30.5&32.6&34.9")');
	   });  
	   
	   
	     db.transaction(function (tx) {
	    tx.executeSql('INSERT INTO cinemafilm VALUES("幸福蓝海IMAX影城（常发广场店）","我不是药神&摩天营救&风语咒&一出好戏&巨齿鲨&肆式青春&爱情公寓&昨日青空","3&4&2&2&2&4&2&2","1&2&5&4&3&3&1&2","14:20-16:30-18:40&14:30-16:25-18:20-20:15-22:10&14:10-16:10-18:15&14:10-16:45-19:10-21:30&13:20-15:25-17:25&15:10-16:40-18:00&13:20-15:25-17:25&18:00-19:40-20:20","30.4&29.5&25.4&33.5&29.9&31.9&30.5&32.5","9.4分&8.9分&9.1分&9.4分&9.4分&58598人想看&903040人想看&142019人想看","117&102&105&134&115&74&117&82","分钟|剧情|徐峥 周一围 王传君&分钟|动作|道恩·强森 内芙·坎贝尔&分钟|动画|路知行 阎萌萌 褚珺&分钟|喜剧|黄渤 王宝强 张艺兴&分钟|动作|杰森·斯坦森 李冰冰&分钟|动画|白客 梁达伟 唐雅菁&分钟|喜剧|陈赫 娄艺潇 邓家佳&分钟|动画|段艺璇 马斑马 大象","/image/yaoshen.jpg&image/motian.jpg&image/fenyu.jpg&image/haoxi.jpg&image/jusha.jpg&image/qingchun.jpg&image/aiqing.jpg&image/qinkong.jpg")');
		
		tx.executeSql('INSERT INTO cinemafilm VALUES("珠影CC达美影城（太阳宫）","我不是药神&摩天营救&风语咒&一出好戏&巨齿鲨&肆式青春&爱情公寓&昨日青空","3&3&3&3&0&2&2&3","2&1&3&4&5&1&2&3","14:20-16:30-18:40&14:50-16:55-18:50-20:35-22:30&14:20-16:20-18:25&14:20-16:55-19:20-21:40&13:30-15:35-17:35&16:10-17:40-19:00&12:20-14:25-16:25&19:00-20:40-21:20","26.9&23.9&27.9&35.5&30.5&32.9&30.5&31.5","9.4分&8.9分&9.1分&9.4分&9.4分&58598人想看&903040人想看&142019人想看","117&102&105&134&115&74&117&82","分钟|剧情|徐峥 周一围 王传君&分钟|动作|道恩·强森 内芙·坎贝尔&分钟|动画|路知行 阎萌萌 褚珺&分钟|喜剧|黄渤 王宝强 张艺兴&分钟|动作|杰森·斯坦森 李冰冰&分钟|动画|白客 梁达伟 唐雅菁&分钟|喜剧|陈赫 娄艺潇 邓家佳&分钟|动画|段艺璇 马斑马 大象","/image/yaoshen.jpg&image/motian.jpg&image/fenyu.jpg&image/haoxi.jpg&image/jusha.jpg&image/qingchun.jpg&image/aiqing.jpg&image/qinkong.jpg")');
		
	    tx.executeSql('INSERT INTO cinemafilm VALUES("喜满客影城","我不是药神&摩天营救&风语咒&一出好戏&巨齿鲨&肆式青春&爱情公寓&昨日青空","2&0&1&4&1&3&3&4","3&4&2&1&5&2&3&1","14:10-16:20-18:30&15:30-17:25-19:20-21:15-23:10&14:10-16:10-18:15&14:10-16:45-19:10-21:30&14:20-16:25-18:25&14:10-15:40-17:00&13:20-15:25-17:25&19:10-20:50-21:30","26.9&32.5&26.9&32.9&31.6&35.5&34.5&30.5","9.4分&8.9分&9.1分&9.4分&9.4分&58598人想看&903040人想看&142019人想看","117&102&105&134&115&74&117&82","分钟|剧情|徐峥 周一围 王传君&分钟|动作|道恩·强森 内芙·坎贝尔&分钟|动画|路知行 阎萌萌 褚珺&分钟|喜剧|黄渤 王宝强 张艺兴&分钟|动作|杰森·斯坦森 李冰冰&分钟|动画|白客 梁达伟 唐雅菁&分钟|喜剧|陈赫 娄艺潇 邓家佳&分钟|动画|段艺璇 马斑马 大象","/image/yaoshen.jpg&image/motian.jpg&image/fenyu.jpg&image/haoxi.jpg&image/jusha.jpg&image/qingchun.jpg&image/aiqing.jpg&image/qinkong.jpg")');
		
	    tx.executeSql('INSERT INTO cinemafilm VALUES("幸福蓝海国际影城（南京商厦店）","我不是药神&摩天营救&风语咒&一出好戏&巨齿鲨&肆式青春&爱情公寓&昨日青空","1&4&4&1&3&2&4&1","3&2&1&4&5&2&1&3","14:20-16:30-18:40&14:30-16:25-18:20-20:15-22:10&14:10-16:10-18:15&14:10-16:45-19:10-21:30&13:20-15:25-17:25&15:10-16:40-18:00&13:20-15:25-17:25&18:00-19:40-20:20","37.5&33.4&39.5&33.5&34.5&28.6&31.5&32.6","9.4分&8.9分&9.1分&9.4分&9.4分&58598人想看&903040人想看&142019人想看","117&102&105&134&115&74&117&82","分钟|剧情|徐峥 周一围 王传君&分钟|动作|道恩·强森 内芙·坎贝尔&分钟|动画|路知行 阎萌萌 褚珺&分钟|喜剧|黄渤 王宝强 张艺兴&分钟|动作|杰森·斯坦森 李冰冰&分钟|动画|白客 梁达伟 唐雅菁&分钟|喜剧|陈赫 娄艺潇 邓家佳&分钟|动画|段艺璇 马斑马 大象","/image/yaoshen.jpg&image/motian.jpg&image/fenyu.jpg&image/haoxi.jpg&image/jusha.jpg&image/qingchun.jpg&image/aiqing.jpg&image/qinkong.jpg")');
		
		tx.executeSql('INSERT INTO cinemafilm VALUES("南京UME国际影城（国际店）","我不是药神&摩天营救&风语咒&一出好戏&巨齿鲨&肆式青春&爱情公寓&昨日青空","4&3&0&2&4&3&3&2","4&2&5&1&3&2&3&1","13:20-15:30-17:40&14:10-16:05-18:00-19:55-21:50&14:10-16:10-18:15&15:10-17:45-20:10-22:30&13:20-15:25-17:25&13:10-14:40-16:00&14:20-16:25-18:25&18:00-19:40-20:20","37.5&42.5&27.9&32.9&34.9&30.9&32.9&34.9","9.4分&8.9分&9.1分&9.4分&9.4分&58598人想看&903040人想看&142019人想看","117&102&105&134&115&74&117&82","分钟|剧情|徐峥 周一围 王传君&分钟|动作|道恩·强森 内芙·坎贝尔&分钟|动画|路知行 阎萌萌 褚珺&分钟|喜剧|黄渤 王宝强 张艺兴&分钟|动作|杰森·斯坦森 李冰冰&分钟|动画|白客 梁达伟 唐雅菁&分钟|喜剧|陈赫 娄艺潇 邓家佳&分钟|动画|段艺璇 马斑马 大象","/image/yaoshen.jpg&image/motian.jpg&image/fenyu.jpg&image/haoxi.jpg&image/jusha.jpg&image/qingchun.jpg&image/aiqing.jpg&image/qinkong.jpg")');
	   }); 
	   