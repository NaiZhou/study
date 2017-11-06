//	myChart.showLoading();
	//myChart.hideLoading();
	var myChart = echarts.init(document.getElementById('main'), 'macarons');
	
	
	var option = {
			
		    
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
                    repulsion : 50,//节点之间的斥力因子。支持数组表达斥力范围，值越大斥力越大。
                    gravity : 0.002,//节点受到的向中心的引力因子。该值越大节点越往中心点靠拢。
                    edgeLength :300,//边的两个节点之间的距离，这个距离也会受 repulsion。[10, 50] 。值越小则长度越长
                    layoutAnimation : true,
                //因为力引导布局会在多次迭代后才会稳定，这个参数决定是否显示布局的迭代动画，在浏览器端节点数据较多（>100）的时候不建议关闭，布局过程会造成浏览器假死。
                	},
                    draggable : true,
                    focusNodeAdjacency : true,//是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点。
                    edgeSymbol : [ 'none', 'none' ],//边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。默认不显示标记，常见的可以设置为箭头，如下：edgeSymbol: ['circle', 'arrow']
                    edgeSymbolSize : 10,//边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。
                    symbolSize: 70,
                    itemStyle :{
                    	normal:{
                    		//默认样式
                    		label:{
                    			show:true
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
                    	data:[{"name":"汪明福","jiatingzhuzhi":"重庆市万州区太白街道办事处永宁村委会","lianxidianhua":"18623215398","xiangguanjianjie":"汪明福吴昌美夫妇居住万州区太白街道永宁村3组，老伴吴昌美不但常年生病而且还是残疾，生活不能自理，一家人的生活重担全靠一个60多岁的老人，汪明福夫妇育有一女嫁到邻村，女婿因得癌症，花费家里全部积蓄，借了很多外债，很难照顾父母一家。望各界好心人伸出援助之手帮助这对无依无靠的老人吧。","zhufangmianji":"60","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"汪明福","huma":"5001010172010026","ranliaoleixing":"柴草","pinkunyuanyin":"因残","juanzengxuqiuzonge_yuan":"100000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"3629.80","shoujuanjine_yuan":"0.00","category":1},{"name":"万德福","jiatingzhuzhi":"重庆市万州区太白街道办事处永宁村委会","lianxidianhua":"13594820923","xiangguanjianjie":"万德福家住万州区太白街道永宁村4组，先前一直单身，后来与一位高龄已婚妇女非法生育一对双胞胎儿子，孩子一天天长大，负担重也没有一技之长，靠打零工维持生活，一家人住在一间土坯房内，生活十分艰难，特别是这对聪明可爱，成绩优秀，积极向上的孩子很让人同情。望各界成功人士伸出援助之手帮帮这对可怜的孩子吧。","zhufangmianji":"90","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"万德福","huma":"5001010172010032","ranliaoleixing":"清洁能源","pinkunyuanyin":"因学","juanzengxuqiuzonge_yuan":"20000.00","jiatingrenshu":"3","jiatingnianrenjunshouru_yuan":"6008.18","shoujuanjine_yuan":"0.00","category":"1"},
                    	{"name":"吴昌美","xingming":"吴昌美","wugongshijian":"无","huzhu_id":"1794","wenhuachengdu":"小学","yuhuzhuguanxi":"配偶","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"非在校生","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"丧失劳动力","canjizhenghaoma":"51222319550724004743","category":2},{"name":"万兵","xingming":"万兵","wugongshijian":"无","huzhu_id":"1795","wenhuachengdu":"小学","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"小学","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":2},{"name":"万军","xingming":"万军","wugongshijian":"无","huzhu_id":"1795","wenhuachengdu":"小学","yuhuzhuguanxi":"之子","xinxingnongcunhezuoyiliao":"无","zaixiaoshengzhuangkuang":"小学","chengxiangjuminyanglaobaoxian":"无","laodongnengli":"无劳动力","canjizhenghaoma":"无","category":2}        
                    	,{"name":"慰问金","xiangmumingcheng":"慰问金","huzhu_id":"1794","fuchinianfen":"2014","xiangmuleibie":"制造业 ","zijinzonge_yuan":"0.00","jiansheneirong":"节日慰问金","category":3},{"name":"D级危房改造","xiangmumingcheng":"D级危房改造","huzhu_id":"1794","fuchinianfen":"2015","xiangmuleibie":"服务业 ","zijinzonge_yuan":"38000.00","jiansheneirong":"一楼一底","category":3},{"name":"低保兜底","xiangmumingcheng":"低保兜底","huzhu_id":"1794","fuchinianfen":"2015","xiangmuleibie":"制造业 ","zijinzonge_yuan":"4080.00","jiansheneirong":"农村低保标准2人","category":3},{"name":"D级危房改造","xiangmumingcheng":"D级危房改造","huzhu_id":"1795","fuchinianfen":"2015","xiangmuleibie":"服务业 ","zijinzonge_yuan":"31000.00","jiansheneirong":"d级危房改造90平米","category":3},{"name":"慰问金","xiangmumingcheng":"慰问金","huzhu_id":"1795","fuchinianfen":"2014","xiangmuleibie":"制造业 ","zijinzonge_yuan":"0.00","jiansheneirong":"节日慰问金","category":3},{"name":"扶贫日慰问","xiangmumingcheng":"扶贫日慰问","huzhu_id":"1795","fuchinianfen":"2014","xiangmuleibie":" ","zijinzonge_yuan":"0.00","jiansheneirong":"扶贫日慰问","category":3},{"name":"助学","xiangmumingcheng":"助学","huzhu_id":"1795","fuchinianfen":"2015","xiangmuleibie":"制造业 ","zijinzonge_yuan":"1580.00","jiansheneirong":"其他","category":3},{"name":"D保兜底","xiangmumingcheng":"D保兜底","huzhu_id":"1795","fuchinianfen":"2015","xiangmuleibie":"制造业 ","zijinzonge_yuan":"4680.00","jiansheneirong":"按农村低保标准托底","category":3}
,{"name":"太白街道","huzhu_id":"1794","bangfukaishishijian":"2015/7/1","lianxidianhua":"58291208","danweilishuguanxi":"","bangfujieshushijian":"0000/0/0","bangfudanweimingcheng":"太白街道","bangfurenxingming":"何卫平","category":4},{"name":"太白街道","huzhu_id":"1794","bangfukaishishijian":"2014/1/1","lianxidianhua":"58290419","danweilishuguanxi":"","bangfujieshushijian":"2015/6/30","bangfudanweimingcheng":"太白街道","bangfurenxingming":"晏玉国","category":4}
,{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA4F4B71376F597E050320AB200BB1C.jpg","category":0},{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA4D39A0ECF9201E050320AB200BAE9.jpg","category":0},{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0D0FFBD4CFFB74FFE050320AB200EF92.jpg","category":0},{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA4F4B71377F597E050320AB200BB1C.jpg","category":0},{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA46B97A72AB55AE050320AB200BA0A.jpg","category":0},{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA3FEC7D7D17FEEE050320AB200B92A.jpg","category":0},{"url":"http://cx.cqfp.gov.cn/huphoto/wz/0EA34D2647132A59E050320AB200B773.jpg","category":0}],

                        
                    	links:[]
                       
                    	
                    	}
                    	
	                  
	                ]
	};
	
//	$.ajax({
//        type : "post",
//        async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
//        url : "EchatsServlet",    //请求发送到Servlet处
//        data : {},
//        dataType : "text",        //返回数据形式为json
//        success : function(result) {
//            //请求成功时执行该函数内容，result即为服务器返回的json对象
//            if (result) {
//            	var persons;
//            	var relationships;
//            	var sArray=new Array();
//           	    sArray=result.split("-");
//           	    persons=sArray[0];
//           	    relationships=sArray[1];
//           	    var data1 = eval('('+persons+')');
//           	    var data2 = eval('('+relationships+')');
//           	 myChart.setOption({      
//                 series: [{
//                     data: [{"name":"汪明福","jiatingzhuzhi":"重庆市万州区太白街道办事处永宁村委会","lianxidianhua":"18623215398","xiangguanjianjie":"汪明福吴昌美夫妇居住万州区太白街道永宁村3组，老伴吴昌美不但常年生病而且还是残疾，生活不能自理，一家人的生活重担全靠一个60多岁的老人，汪明福夫妇育有一女嫁到邻村，女婿因得癌症，花费家里全部积蓄，借了很多外债，很难照顾父母一家。望各界好心人伸出援助之手帮助这对无依无靠的老人吧。","zhufangmianji":"60","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"汪明福","huma":"5001010172010026","ranliaoleixing":"柴草","pinkunyuanyin":"因残","juanzengxuqiuzonge_yuan":"100000.00","jiatingrenshu":"2","jiatingnianrenjunshouru_yuan":"3629.80","shoujuanjine_yuan":"0.00","category":1},{"name":"万德福","jiatingzhuzhi":"重庆市万州区太白街道办事处永宁村委会","lianxidianhua":"13594820923","xiangguanjianjie":"万德福家住万州区太白街道永宁村4组，先前一直单身，后来与一位高龄已婚妇女非法生育一对双胞胎儿子，孩子一天天长大，负担重也没有一技之长，靠打零工维持生活，一家人住在一间土坯房内，生活十分艰难，特别是这对聪明可爱，成绩优秀，积极向上的孩子很让人同情。望各界成功人士伸出援助之手帮帮这对可怜的孩子吧。","zhufangmianji":"90","nonghushuxing":"","zhufangjiegou":null,"huzhuxingming":"万德福","huma":"5001010172010032","ranliaoleixing":"清洁能源","pinkunyuanyin":"因学","juanzengxuqiuzonge_yuan":"20000.00","jiatingrenshu":"3","jiatingnianrenjunshouru_yuan":"6008.18","shoujuanjine_yuan":"0.00","category":1}],
//                     links:data2
//                     }]
//             });
//            }
//        
//       },
//        error : function(XMLHttpRequest, textStatus, errorThrown) {
//       	 $("#p_test").innerHTML = "there is something wrong!";
//          alert(XMLHttpRequest.status);
//          alert(XMLHttpRequest.readyState);
//          alert(textStatus);
//        }
//   })
	myChart.setOption(option);
//	myChart.on('click', function (params) {
//	   
//		if (params.componentType === 'series') {
//	        if (params.seriesType === 'graph') {
//	            if (params.dataType === 'edge') {
//	                // 点击到了 graph 的 edge（边）上。
//	            }
//	            else {
//	            	if(params.name=="张三")
//	            	 window.location.assign("Myecharts2.html")
//	            	 
//	                // 点击到了 graph 的 node（节点）上。
//	            }
//	        }
//	    }
//
//	});	 

