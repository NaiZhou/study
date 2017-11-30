	//myChart.showLoading();
	//myChart.hideLoading();
	var myChart = echarts.init(document.getElementById('main'), 'macarons');
	var option = {
//			 
//                     $.ajax({
//                         async : true,//设置异、同步加载
//                         cache : false,//false就不会从浏览器缓存中加载请求信息了
//                         type : 'post',
//                         dataType : "json",
//                         url : path,//请求的action路径  
//                         success : function(data) { //请求成功后处理函数。    
//                             //加工返回后的数据
//                             debugger;
//                             if(category==2){ //当选择端口号时
//                                 var res = 'jvm最大内存值:' + data.memoryMaxSize+'<br/>';
//                                 res+='jvm空闲内存值:'+data.memoryFreeSize+'<br/>';
//                                 res+='jvm内存使用率：'+data.memoryPer+'<br/>';
//                                 res+='空闲线程：'+data.ideThread+'<br/>';
//                                 res+='总线程：'+data.totalThread+'<br/>';
//                                 res+='每秒处理的线程数比率：'+data.throuhput+'<br/>';
//                                 callback(ticket,res);
//                             }else if(category==4){//当选择用户名时
//                                 var res = '当前链接数：'+data.processCount+'<br/>';
//                                 res+='最大链接数：'+data.maxProcessCount+'<br/>';
//                                 callback(ticket,res);
//                             }
//                             
//                         },
//                         error : function() {//请求失败处理函数  
//                         $.messager.alert('警告', '请求失败！', 'warning');
//                         }
//                     });
//                     if(category==2||category==4){ //当选择端口号与用户名时提示加载
//                         return "loading";
//                     }else{                   //其他情况显示所属图例以及名称
//                         return myChart.getOption().series[params.seriesIndex].categories[params.data.category].name+":"+params.name;
//                     }
//                     
//                 }
//             },
				animationDurationUpdate: 1500,
				animationEasingUpdate: 'quinticInOut',
				
				tooltip: {
		                formatter: function (x) {
		                    return x.data.info;
		                }
		            },
	      
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
                    repulsion : 60,//节点之间的斥力因子。支持数组表达斥力范围，值越大斥力越大。
                    gravity : 0.002,//节点受到的向中心的引力因子。该值越大节点越往中心点靠拢。
                    edgeLength :200,//边的两个节点之间的距离，这个距离也会受 repulsion。[10, 50] 。值越小则长度越长
                    layoutAnimation : true,
                //因为力引导布局会在多次迭代后才会稳定，这个参数决定是否显示布局的迭代动画，在浏览器端节点数据较多（>100）的时候不建议关闭，布局过程会造成浏览器假死。
                	},
                    draggable : true,
                    focusNodeAdjacency : true,//是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点。
                    edgeSymbol : [ 'none', 'none' ],//边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。默认不显示标记，常见的可以设置为箭头，如下：edgeSymbol: ['circle', 'arrow']
                    edgeSymbolSize : 10,//边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。
                    symbolSize : 80,
                    itemStyle :{
                    	normal:{
                    		//默认样式
                    		label:{
                    			show:false
                    		},
                    		
                    		color:'purple',
                    		borderType : 'solid', //图形描边类型，默认为实线，支持 'solid'（实线）, 'dashed'(虚线), 'dotted'（点线）。
                            borderColor : 'rgba(204,0,255,0.4)', //设置图形边框颜色,透明度为0.4
                            borderWidth : 4, //图形的描边线宽。为 0 时无描边。
                            opacity : 1
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
                                     fontSize : 12, //字体大小
                                     
                    			},
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
                                       fontSize : 16, //字体大小
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
                                    fontSize : 16, //字体大小
                    			},
                    			formatter: "{c}"
                    		}
                    	},
                    	data:[{"id":205438,"name":"梅龙海","jiatingzhuzhi":"重庆市渝北区大盛镇三新村委会","lianxidianhua":"13752832147","xiangguanjianjie":"我叫梅龙海，今年61岁，家住渝北区大盛镇三新村3组。由于没有读过书导致文化程度低，患有长期慢性病，对新技术接受困难，不能外出务工，对发展附加值高的农业生产也缺乏技术，只能在家种点粮食维持生活，还有子女读书，需要学费，家中生活十分困难。","zhufangmianji":"120","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"梅龙海","huma":"5001121432130279","ranliaoleixing":"柴草","pinkunyuanyin":"缺资金","juanzengxuqiuzonge_yuan":"5000.00","jiatingrenshu":"5","jiatingnianrenjunshouru_yuan":"5750.00","shoujuanjine_yuan":"0.00","category":1},{"id":206517,"name":"李中国","jiatingzhuzhi":"重庆市綦江区赶水镇石房村委会","lianxidianhua":"15320262627","xiangguanjianjie":"本户家庭人口4人，户主身体不好，患有咳嗽病，一直在家吃药，但是一直病根未除，花去了家中积蓄，也无法进行重力劳动，平时种点蔬菜到街上变卖，但是收入甚微，妻子也常年患有妇科病，也在吃药，家中无劳力，无经济收入，一家人靠种菜维持生活，两小孩在读书，学费都交不起，急需社会帮助两小孩读完义务教育","zhufangmianji":"105","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"李中国","huma":"5002221042020006","ranliaoleixing":"柴草","pinkunyuanyin":"因学","juanzengxuqiuzonge_yuan":"30000.00","jiatingrenshu":"4","jiatingnianrenjunshouru_yuan":"6070.25","shoujuanjine_yuan":"0.00","category":1},{"id":207203,"name":"邓会莲","jiatingzhuzhi":"重庆市梁平县城北乡高都村村委会","lianxidianhua":"18776526375","xiangguanjianjie":"邓会莲家住梁平县城北乡高都村4组，家里共4人，户主夫妻年老多病，主要以种殖业为主，儿媳患有智力残疾，无劳动能力，因儿子不务正业，照顾儿媳的任务落在该夫妇身上，如果大家想减轻这对年迈夫妇的重任，请大家伸出援助之手，给这个贫困的家庭提供经济上帮助，帮他们度过难关。","zhufangmianji":"90","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"邓会莲","huma":"5002282062030065","ranliaoleixing":"柴草","pinkunyuanyin":"缺劳力","juanzengxuqiuzonge_yuan":"5000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"4500.00","shoujuanjine_yuan":"0.00","category":1},{"id":207836,"name":"李洪安","jiatingzhuzhi":"重庆市忠县东溪镇华兴村委会","lianxidianhua":"54780687","xiangguanjianjie":"该户两人，户主李洪安现年66岁，身体多处患有慢性病。经常吃药。无法干重活，在家种地维持生活，无法到外地打工赚钱。妻子刘秀兰，现年62岁。身体多处也患有慢性病。没有劳动力，经常吃药。只有在家种点菜维持生活家中没有其他经济收入。一年到头医药费用非常多。家中支付不起，生活非常困难。希望通过大家捐赠，减轻该户的负担。","zhufangmianji":"60","nonghushuxing":"一般贫困户","zhufangjiegou":null,"huzhuxingming":"李洪安","huma":"5002331052000129","ranliaoleixing":"柴草","pinkunyuanyin":"因病","juanzengxuqiuzonge_yuan":"3000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"2858.00","shoujuanjine_yuan":"0.00","category":1},{"id":207571,"name":"谭合春","jiatingzhuzhi":"重庆市丰都县江池镇横梁村委会","lianxidianhua":"15025649030","xiangguanjianjie":"谭合春，男，汉族，现年49岁，家住丰都县江池镇横梁村1组。2010年9月前，谭合春家尽管生活在江池镇横梁山区，但通过谭合春和廖俊淑（三妹）夫妇的辛勤劳动，一家4口（女儿于2011年出嫁）生活较幸福，在横梁村一社属于富裕户。不幸的是，2010年10月谭合春在务工中从屋顶坠落，造成颅骨约30平方厘米粉碎而入住丰都县人民医院，在治疗期间共花费近11万元医药费后，因再没有借到医药费，未进行颅骨修复手术。致使头皮逐渐下陷压迫大脑皮层引发头疼、失声、左眼视力下降等伴随症，长期依靠服用药物减轻病害痛苦。四年来，共花费约8万元的治疗费，其中,2013年10月因忽然昏迷摔倒再次入院花费近4万元（合作医疗报销约9000元），日常药费近5万元。由于治病花费巨大，致使刚满18岁的儿子辍学当了修车学徒；由于治病花费巨大，导致家庭现仍欠债近5万元；由于病人需要护理，导致妻子廖俊淑只能在家打季节工来维系最基本的生活。","zhufangmianji":"153","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"谭合春","huma":"5002301122030080","ranliaoleixing":"柴草","pinkunyuanyin":"因残","juanzengxuqiuzonge_yuan":"3000.00","jiatingrenshu":"4","jiatingnianrenjunshouru_yuan":"6552.50","shoujuanjine_yuan":"0.00","category":1},{"id":208167,"name":"李继奎","jiatingzhuzhi":"重庆市开县五通乡桐林村委会","lianxidianhua":"15023458629","xiangguanjianjie":"夫妻二人离异，现由李继奎抚养2个子女，女儿在上大学，儿子在上小学，学费和生活费用开支较大，父母为减轻其负担没有与其同住，本人由于过度劳累，身体状况也不佳，家庭收入主要来源靠李继奎在家务农和工地做工，家庭确实较为困难，望请社会各界爱心人士予以适当的帮助","zhufangmianji":"126","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"李继奎","huma":"5002342112020143","ranliaoleixing":"柴草","pinkunyuanyin":"因学","juanzengxuqiuzonge_yuan":"20000.00","jiatingrenshu":"3","jiatingnianrenjunshouru_yuan":"8728.17","shoujuanjine_yuan":"0.00","category":1},{"id":207889,"name":"杨成兰","jiatingzhuzhi":"重庆市忠县官坝镇五里村委会","lianxidianhua":"18883659251","xiangguanjianjie":"重庆市忠县官坝镇五里村七组居民杨成兰家，家庭人口2人，户主杨成兰现年61岁，患有慢性病，只能干一些轻活。孙女曹明珠现年16岁，年幼失去父母，只靠奶奶一人养大，现在正上初三，成绩优秀，学费、生活费十分紧缺，希望社会各界人士给予帮助，献出一份爱心，我将感激不尽。","zhufangmianji":"90","nonghushuxing":"一般贫困户","zhufangjiegou":null,"huzhuxingming":"杨成兰","huma":"5002331102110081","ranliaoleixing":"柴草","pinkunyuanyin":"因病","juanzengxuqiuzonge_yuan":"8000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"2966.50","shoujuanjine_yuan":"0.00","category":1},{"id":210248,"name":"李强","jiatingzhuzhi":"重庆市彭水苗族土家族自治县善感乡罗兴村委会","lianxidianhua":"18290475614","xiangguanjianjie":"2000年丧妻,2002年丧子,于2003重组家庭,重组家庭后,妻子换病(乳腺癌、腰椎间盘突出)，丧失劳动力，家中3个小孩上学，还有一体弱多病的老父亲一起生活，家庭经济十分困难，家庭生活的很辛苦，希望得到广大爱心人士的帮助。","zhufangmianji":"125","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"李强","huma":"5002432222040063","ranliaoleixing":"柴草","pinkunyuanyin":"因病","juanzengxuqiuzonge_yuan":"10000.00","jiatingrenshu":"5","jiatingnianrenjunshouru_yuan":"3800.40","shoujuanjine_yuan":"0.00","category":1},{"id":204930,"name":"贺良蓉","jiatingzhuzhi":"重庆市万州区分水镇分水岭居委会","lianxidianhua":"15223426132","xiangguanjianjie":"贺良蓉，女，汉族，现年19岁，家住重庆市万州区分水镇分水岭社区6组，家里共二人。本人在重庆上学，父亲残疾，长期坐轮椅伤失了劳动力，母亲去世多年，家里无固定经济收入，生活靠低保救助来维持。当其他同学背着漂亮的书包上学时，好还在为学费发愁，几次徘徊，几多惆怅，愿社会有识之士伸出援助之手，献出一份爱心，为之撑起一片蓝天。","zhufangmianji":"50","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"贺良蓉","huma":"5001011440030193","ranliaoleixing":"柴草","pinkunyuanyin":"因学","juanzengxuqiuzonge_yuan":"5000.00","jiatingrenshu":"1","jiatingnianrenjunshouru_yuan":"5707.00","shoujuanjine_yuan":"0.00","category":1},{"id":270443,"name":"李强","xingming":"李强","wugongshijian":"无","huzhu_id":"2418","wenhuachengdu":"文盲或半文盲","yuhuzhuguanxi":"之孙子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"学前教育","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":3},{"id":273744,"name":"李强","xingming":"李强","wugongshijian":"无","huzhu_id":"3497","wenhuachengdu":"高中","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":3},{"id":279032,"name":"李强","xingming":"李强","wugongshijian":"无","huzhu_id":"5147","wenhuachengdu":"初中","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"八年级","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":3},{"id":229320,"name":"春节慰问","xiangmumingcheng":"春节慰问","category":4},{"id":229060,"name":"节日慰问","xiangmumingcheng":"节日慰问","category":4},{"id":229209,"name":"小额保险","xiangmumingcheng":"小额保险","category":4},{"id":229071,"name":"医疗救助","xiangmumingcheng":"医疗救助","category":4},{"id":229098,"name":"种植","xiangmumingcheng":"种植","category":4},{"id":196537,"name":"莫延湘","bangfurenxingming":"莫延湘","category":2},],
                    	links:[{ source:"229071",target:"207203",value:"帮扶项目"},{ source:"229209",target:"207836",value:"帮扶项目"},{ source:"196537",target:"204930",value:"帮扶人"},{ source:"229071",target:"204930",value:"帮扶项目"},{ source:"206517",target:"273744",value:"之子"},{ source:"208167",target:"279032",value:"之子"},{ source:"229060",target:"207889",value:"帮扶项目"},{ source:"229098",target:"207203",value:"帮扶项目"},{ source:"229060",target:"208167",value:"帮扶项目"},{ source:"229320",target:"207571",value:"帮扶项目"},{ source:"229320",target:"205438",value:"帮扶项目"},{ source:"229098",target:"210248",value:"帮扶项目"},{ source:"229071",target:"207836",value:"帮扶项目"},{ source:"229071",target:"207571",value:"帮扶项目"},{ source:"229209",target:"206517",value:"帮扶项目"},{ source:"229071",target:"207889",value:"帮扶项目"},{ source:"205438",target:"270443",value:"之孙子"},]

                    	
	        }
                    	
	                  
	                ]
	};
	myChart.setOption(option);
	
	myChart.on('click', function (params) {
	   
		if (params.componentType === 'series') {
	        if (params.seriesType === 'graph') {
	            if (params.dataType === 'edge') {
	                // 点击到了 graph 的 edge（边）上。
	            	
	            }
	            else {
	            	if(params.name=="张三")
	            	 window.location.assign("Myecharts2.html")
	            	 
	                // 点击到了 graph 的 node（节点）上。
	            }
	        }
	    }

	});	 

