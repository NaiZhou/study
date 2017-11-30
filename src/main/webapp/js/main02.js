
	var myChart = echarts.init(document.getElementById('main'), 'macarons');
	
	
	var option = {
			
				animationDurationUpdate: 1500,
				animationEasingUpdate: 'quinticInOut',
				
	        series:[ {
	        	type:'graph',//关系图
	        	name:"关系图谱",//名称，用于tooltip
	        	layout: 'force',//力引导布局
	        	legendHoverLink: true,//是否启用图例 hover(悬停) 时的联动高亮。
	        	hoverAnimation : true,//是否开启鼠标悬停节点的显示动画
                coordinateSystem : null,//坐标系可选
                xAxisIndex : 0, //x轴坐标 有多种坐标系轴坐标选项
                yAxisIndex : 0, //y轴坐标 
                force : { //力引导图基本配置
                    //initLayout: ,//力引导的初始化布局，默认使用xy轴的标点
                    repulsion :20,//节点之间的斥力因子。支持数组表达斥力范围，值越大斥力越大。
                    gravity : 0.012,//节点受到的向中心的引力因子。该值越大节点越往中心点靠拢。
                    edgeLength :100,//边的两个节点之间的距离，这个距离也会受 repulsion。[10, 50] 。值越小则长度越长
                    layoutAnimation : true,
                //因为力引导布局会在多次迭代后才会稳定，这个参数决定是否显示布局的迭代动画，在浏览器端节点数据较多（>100）的时候不建议关闭，布局过程会造成浏览器假死。
                	},
                    draggable : true,
                    focusNodeAdjacency : true,//是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点。
                    edgeSymbol : [ 'none', 'none' ],//边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。默认不显示标记，常见的可以设置为箭头，如下：edgeSymbol: ['circle', 'arrow']
                    edgeSymbolSize : 10,//边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。
                    symbolSize: 30,
                    itemStyle :{
                    	normal:{
                    		//默认样式
                    		label:{
                    			show:true
                    		},
                    		borderType : 'solid', //图形描边类型，默认为实线，支持 'solid'（实线）, 'dashed'(虚线), 'dotted'（点线）。
                            borderColor : 'rgba(204,0,255,0.4)', //设置图形边框颜色,透明度为0.4
                            borderWidth : 4, //图形的描边线宽。为 0 时无描边。
                            opacity : 1,
                        	// 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。默认0.5

                        },
                        emphasis : {//高亮状态
                        	label:{
                    			show:true
                    		},
							borderType : 'solid', //图形描边类型，默认为实线，支持 'solid'（实线）, 'dashed'(虚线), 'dotted'（点线）。
                            borderColor : 'rgba(204,0,255,0.4)', //设置图形边框颜色,透明度为0.4
                            borderWidth : 6, //图形的描边线宽。为 0 时无描边。
                            opacity : 1
                        			}
                    		},
                    	lineStyle:{
                    		normal:{
                    			color : 'rgba(0,153,255,0.2)',
                                width : '3',
                                type : 'solid', //线的类型 'solid'（实线）'dashed'（虚线）'dotted'（点线）
                                opacity : 1
                    		},
                    		emphasis:{
                    			color : 'rgba(0,153,255,0.4)',
                                width : '5',
                                type : 'solid', //线的类型 'solid'（实线）'dashed'（虚线）'dotted'（点线）
                                opacity : 0.5
                    		}
                    	},
                    	label:{//文本标签
                    		normal:{
                    			show:true,
                    			position:'inside',
                    			textStyle:{
                    				 color : '#cde6c7', //字体颜色
                                     fontStyle : 'normal',//文字字体的风格 'normal'标准 'italic'斜体 'oblique' 倾斜
                                     fontWeight : 'bolder',//'normal'标准'bold'粗的'bolder'更粗的'lighter'更细的或100 | 200 | 300 | 400...
                                     fontFamily : 'sans-serif', //文字的字体系列
                                     fontSize : 8, //字体大小
                    			}
                    		}
                    		
                    	},
                    	edgeLabel:{
                    		normal:{
                    			show:true,
                    			textStyle:{
                      				 color : 'purple',//字体颜色
                                       fontStyle : 'normal',//文字字体的风格 'normal'标准 'italic'斜体 'oblique' 倾斜
                                       fontWeight : 'bolder',//'normal'标准'bold'粗的'bolder'更粗的'lighter'更细的或100 | 200 | 300 | 400...
                                       fontFamily : 'sans-serif', //文字的字体系列
                                       fontSize : 8, //字体大小
                       			},
                    	 	formatter: "{c}"
                    		},
                    		emphasis:{
                    			show:true,
                    			textStyle:{
                   				 color : 'purple',//字体颜色
                                    fontStyle : 'normal',//文字字体的风格 'normal'标准 'italic'斜体 'oblique' 倾斜
                                    fontWeight : 'bolder',//'normal'标准'bold'粗的'bolder'更粗的'lighter'更细的或100 | 200 | 300 | 400...
                                    fontFamily : 'sans-serif', //文字的字体系列
                                    fontSize : 8, //字体大小
                    			},
                    			formatter: "{c}"
                    		}
                    	},
                    	data:[{"id":204818,"name":"李大珍","jiatingzhuzhi":"重庆市万州区钟鼓楼街道附马村委会","lianxidianhua":"15213548657","xiangguanjianjie":"该户长期患有慢性疾病，丧失劳动能力，居住房屋因年久失修垮塌，现无房居住，寄住于儿子家，其子因智力残疾现单生一人，也无经济收入，无赡养能力，该户常年靠救济和城乡居民养老保险金生活。家庭经济困难，生活贫困。","zhufangmianji":"50","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"李大珍","huma":"5001010232010161","ranliaoleixing":"柴草","pinkunyuanyin":"因病","juanzengxuqiuzonge_yuan":"10000.00","jiatingrenshu":"1","jiatingnianrenjunshouru_yuan":"3620.00","shoujuanjine_yuan":"0.00","category":1},{"id":204816,"name":"彭长龙","jiatingzhuzhi":"重庆市万州区钟鼓楼街道桑树居委会","lianxidianhua":"15923812779","xiangguanjianjie":"该户暂无相关简介","zhufangmianji":"75","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"彭长龙","huma":"5001010230080022","ranliaoleixing":"煤炭","pinkunyuanyin":"因残","juanzengxuqiuzonge_yuan":"0.00","jiatingrenshu":"3","jiatingnianrenjunshouru_yuan":"3707.20","shoujuanjine_yuan":"0.00","category":1},
                    		{"id":204814,"name":"汪明福","jiatingzhuzhi":"重庆市万州区太白街道办事处永宁村委会","lianxidianhua":"18623215398","xiangguanjianjie":"汪明福吴昌美夫妇居住万州区太白街道永宁村3组，老伴吴昌美不但常年生病而且还是残疾，生活不能自理，一家人的生活重担全靠一个60多岁的老人，汪明福夫妇育有一女嫁到邻村，女婿因得癌症，花费家里全部积蓄，借了很多外债，很难照顾父母一家。望各界好心人伸出援助之手帮助这对无依无靠的老人吧。","zhufangmianji":"60","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"汪明福","huma":"5001010172010026","ranliaoleixing":"柴草","pinkunyuanyin":"因残","juanzengxuqiuzonge_yuan":"100000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"3629.80","shoujuanjine_yuan":"0.00","category":1},
                    		{"id":204815,"name":"万德福","jiatingzhuzhi":"重庆市万州区太白街道办事处永宁村委会","lianxidianhua":"13594820923","xiangguanjianjie":"万德福家住万州区太白街道永宁村4组，先前一直单身，后来与一位高龄已婚妇女非法生育一对双胞胎儿子，孩子一天天长大，负担重也没有一技之长，靠打零工维持生活，一家人住在一间土坯房内，生活十分艰难，特别是这对聪明可爱，成绩优秀，积极向上的孩子很让人同情。望各界成功人士伸出援助之手帮帮这对可怜的孩子吧。","zhufangmianji":"90","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"万德福","huma":"5001010172010032","ranliaoleixing":"清洁能源","pinkunyuanyin":"因学","juanzengxuqiuzonge_yuan":"20000.00","jiatingrenshu":"3","jiatingnianrenjunshouru_yuan":"6008.18","shoujuanjine_yuan":"0.00","category":1},
                    		{"id":204817,"name":"李良全","jiatingzhuzhi":"重庆市万州区钟鼓楼街道附马村委会","lianxidianhua":"18723547530","xiangguanjianjie":"该户夫妻二人年老多病，妻子残疾丧失劳动能力，小儿子儿媳因病去世多年，大儿媳患有子宫癌，家庭经济困难，无赡养能力，夫妻二人每月只靠城乡居民养老保险金180元生活外，无其他经济来源，每年都需要进行冬令春荒救助。","zhufangmianji":"40","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"李良全","huma":"5001010232010145","ranliaoleixing":"柴草","pinkunyuanyin":"因病","juanzengxuqiuzonge_yuan":"10000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"6545.00","shoujuanjine_yuan":"0.00","category":1},
                    		{"id":268704,"name":"万兵","xingming":"万兵","wugongshijian":"无","huzhu_id":"1795","wenhuachengdu":"小学","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"小学","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268708,"name":"李良全","xingming":"李良全","wugongshijian":"无","huzhu_id":"1797","wenhuachengdu":"小学","yuhuzhuguanxi":"户主","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"丧失劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268700,"name":"汪明福","xingming":"汪明福","wugongshijian":"无","huzhu_id":"1794","wenhuachengdu":"小学","yuhuzhuguanxi":"户主","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":3},{"id":268709,"name":"冉孟秀","xingming":"冉孟秀","wugongshijian":"无","huzhu_id":"1797","wenhuachengdu":"文盲或半文盲","yuhuzhuguanxi":"配偶","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"丧失劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268703,"name":"万军","xingming":"万军","wugongshijian":"无","huzhu_id":"1795","wenhuachengdu":"小学","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"小学","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268705,"name":"彭长龙","xingming":"彭长龙","wugongshijian":"12个月","huzhu_id":"1796","wenhuachengdu":"初中","yuhuzhuguanxi":"户主","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"普通劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268710,"name":"李大珍","xingming":"李大珍","wugongshijian":"无","huzhu_id":"1798","wenhuachengdu":"文盲或半文盲","yuhuzhuguanxi":"户主","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"丧失劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268701,"name":"吴昌美","xingming":"吴昌美","wugongshijian":"无","huzhu_id":"1794","wenhuachengdu":"小学","yuhuzhuguanxi":"配偶","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"丧失劳动力","canjizhenghaoma":"51222319550724004743","category":3},
                    		{"id":268702,"name":"万德福","xingming":"万德福","wugongshijian":"7个月","huzhu_id":"1795","wenhuachengdu":"小学","yuhuzhuguanxi":"户主","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"普通劳动力","canjizhenghaoma":"无","category":3},
                    		{"id":268707,"name":"彭剑","xingming":"彭剑","wugongshijian":"无","huzhu_id":"1796","wenhuachengdu":"文盲或半文盲","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"50010119930301363652","category":3},
                    		{"id":268706,"name":"冉丛凤","xingming":"冉丛凤","wugongshijian":"无","huzhu_id":"1796","wenhuachengdu":"文盲或半文盲","yuhuzhuguanxi":"配偶","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"丧失劳动力","canjizhenghaoma":"51222119700110040651","category":3},
                    		{"id":229054,"name":"D级危房改造","xiangmumingcheng":"D级危房改造","category":4},
                    		{"id":229060,"name":"节日慰问","xiangmumingcheng":"节日慰问","category":4},
                    		{"id":229059,"name":"低保兜低","xiangmumingcheng":"低保兜低","category":4},
                    		{"id":229056,"name":"D保兜底","xiangmumingcheng":"D保兜底","category":4},
                    		{"id":229061,"name":"畜禽养殖","xiangmumingcheng":"畜禽养殖","category":4},
                    		{"id":229057,"name":"助学","xiangmumingcheng":"助学","category":4},
                    		{"id":229053,"name":"低保兜底","xiangmumingcheng":"低保兜底","category":4},
                    		{"id":229055,"name":"慰问金","xiangmumingcheng":"慰问金","category":4},
                    		{"id":229058,"name":"扶贫日慰问","xiangmumingcheng":"扶贫日慰问","category":4},
                    		{"id":196240,"name":"李忠富","bangfurenxingming":"李忠富","category":2},
                    		{"id":196241,"name":"张葇","bangfurenxingming":"张葇","category":2},
                    		{"id":196243,"name":"万良华","bangfurenxingming":"万良华","category":2},
                    		{"id":196244,"name":"程帮菊","bangfurenxingming":"程帮菊","category":2},
                    		{"id":196238,"name":"晏玉国","bangfurenxingming":"晏玉国","category":2},
                    		{"id":196242,"name":"张泽明","bangfurenxingming":"张泽明","category":2},
                    		{"id":196245,"name":"郭荣华","bangfurenxingming":"郭荣华","category":2},
                    		{"id":196239,"name":"何卫平","bangfurenxingming":"何卫平","category":2},
                    		{"id":196246,"name":"朱巧玲","bangfurenxingming":"朱巧玲","category":2},
                    		{"id":231333,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EEF67A430BB0F90E050320AB2002272.jpg","category":5},
                    		{"id":231332,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EEFA6C9D7BAEADFE050320AB2002330.jpg","category":5},
                    		{"id":231321,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA4D39A0ECF9201E050320AB200BAE9.jpg","category":5},
                    		{"id":231319,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA4F4B71377F597E050320AB200BB1C.jpg","category":5},
                    		{"id":231328,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EEF59785C6DD1BBE050320AB2002257.jpg","category":5},
                    		{"id":231323,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA34D2647132A59E050320AB200B773.jpg","category":5},
                    		{"id":231331,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EEFA87731D7CDEBE050320AB200233A.jpg","category":5},
                    		{"id":231322,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0D118B27C8B58EBCE050320AB200F394.jpg","category":5},
                    		{"id":231326,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA46B97A72AB55AE050320AB200BA0A.jpg","category":5},
                    		{"id":231320,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0D0FFBD4CFFB74FFE050320AB200EF92.jpg","category":5},
                    		{"id":231330,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EEEDB33181CF10AE050320AB200217A.jpg","category":5},
                    		{"id":231329,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EEEA332FE08CCDDE050320AB2002101.jpg","category":5},
                    		{"id":231327,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/011AE86447B12E55E050320AB2007D62.jpg","category":5},
                    		{"id":231318,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA4F4B71376F597E050320AB200BB1C.jpg","category":5},
                    		{"id":231324,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA3FEC7D7CB7FEEE050320AB200B92A.jpg","category":5},
                    		{"id":231325,"name":"图片","url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA3FEC7D7D17FEEE050320AB200B92A.jpg","category":5}],
                        links:[{ source:"204816",target:"268707",value:"之子"},
                        	{ source:"204814",target:"231320",value:"图片"},
                        	{ source:"204815",target:"231322",value:"图片"},
                        	{ source:"196246",target:"204818",value:"帮扶人"},
                        	{ source:"204817",target:"268709",value:"配偶"},
                        	{ source:"229054",target:"204815",value:"帮扶项目"},
                        	{ source:"196242",target:"204816",value:"帮扶人"},
                        	{ source:"204816",target:"268706",value:"配偶"},
                        	{ source:"229054",target:"204814",value:"帮扶项目"},
                        	{ source:"204818",target:"268710",value:"户主"},
                        	{ source:"204814",target:"231319",value:"图片"},
                        	{ source:"229056",target:"204815",value:"帮扶项目"},
                        	{ source:"196238",target:"204814",value:"帮扶人"},
                        	{ source:"196245",target:"204817",value:"帮扶人"},
                        	{ source:"204816",target:"231327",value:"图片"},
                        	{ source:"204815",target:"268704",value:"之子"},
                        	{ source:"204815",target:"268702",value:"户主"},
                        	{ source:"196244",target:"204816",value:"帮扶人"},
                        	{ source:"204817",target:"268708",value:"户主"},
                        	{ source:"229058",target:"204815",value:"帮扶项目"},
                        	{ source:"204815",target:"231323",value:"图片"},
                        	{ source:"229053",target:"204814",value:"帮扶项目"},
                        	{ source:"204815",target:"231326",value:"图片"},
                        	{ source:"204815",target:"268703",value:"之子"},
                        	{ source:"196243",target:"204816",value:"帮扶人"},
                        	{ source:"204817",target:"231329",value:"图片"},
                        	{ source:"204815",target:"231324",value:"图片"},
                        	{ source:"204818",target:"231331",value:"图片"},
                        	{ source:"196241",target:"204815",value:"帮扶人"},
                        	{ source:"229055",target:"204815",value:"帮扶项目"},
                        	{ source:"204816",target:"268705",value:"户主"},
                        	{ source:"204814",target:"231318",value:"图片"},
                        	{ source:"204818",target:"231333",value:"图片"},
                        	{ source:"204815",target:"231325",value:"图片"},
                        	{ source:"229055",target:"204814",value:"帮扶项目"},
                        	{ source:"196240",target:"204815",value:"帮扶人"},
                        	{ source:"229059",target:"204816",value:"帮扶项目"},
                        	{ source:"204818",target:"231332",value:"图片"},
                        	{ source:"196239",target:"204814",value:"帮扶人"},
                        	{ source:"229057",target:"204815",value:"帮扶项目"},
                        	{ source:"204814",target:"268700",value:"户主"},
                        	{ source:"229060",target:"204816",value:"帮扶项目"},
                        	{ source:"204817",target:"231330",value:"图片"},
                        	{ source:"196242",target:"204816",value:"帮扶人"},
                        	{ source:"196243",target:"204816",value:"帮扶人"},
                        	{ source:"204814",target:"231321",value:"图片"},
                        	{ source:"204817",target:"231328",value:"图片"},
                        	{ source:"196242",target:"204816",value:"帮扶人"},
                        	{ source:"229061",target:"204817",value:"帮扶项目"},
                        	{ source:"204814",target:"268701",value:"配偶"},],
                    	categories : [ //symbol name：用于和 legend 对应以及格式化 tooltip 的内容。 label有效
                            {
                                symbol : 'rect',
                                label : { //标签样式
                                }
                            }, {
                                symbol : 'rect'
                            }, {
                                symbol : 'roundRect'
                            }, {
                                symbol : 'roundRect'
                            }, {
                                symbol : 'roundRect'
                            } ],
                       
                    	
                    	}
                    	
	                  
	                ]
	};
	

	myChart.setOption(option);
	

