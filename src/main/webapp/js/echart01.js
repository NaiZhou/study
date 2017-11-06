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
                    	data:[{"name":"白浅","info":"九尾白狐族的上神，青丘白止帝君第五女，天孙夜华的未婚妻（三生三世枕上书 中已婚），未来的帝后。 普遍被称尊称为“姑姑”，学艺时曾女扮男装为司音。后为封印擎苍而失去记忆，遇到夜华，夜华帮她取名为素素，生子阿离。"},{"name":"夜华","info":"灵魂是父神之次子，父神嫡子墨渊的弟弟，九重天上天君长孙、太子。杀四大神兽后，继承父神的全部力量。"},{"name":"阿离","info":"白浅渡劫化为凡人素素时同夜华生下的儿子。"},{"name":"素锦","info":"本是天君的妃子，后来做了夜华的侧妃。心机颇深，在白浅还是凡人“素素”的时候，对素素痛下毒手，用计夺走了素素的眼睛。之后也被夜华深深厌恶。"},{"name":"玄女","info":"白浅兄嫂家的亲戚，两人幼时在一起玩，因为羡慕白浅美貌而求白浅同意后化成和她一样的外貌，嫁给离镜。"},{"name":"白止帝君","info":""},{"name":"墨渊","info":"上古天神，父神嫡子，天族掌乐司战的尊神，太子夜华的胞兄，昆仑墟主人，白浅的师父。"},{"name":"天君","info":""},{"name":"令羽","info":"白浅的九师兄，曾被上任鬼君擎苍抓到大紫明宫做鬼后，当时白浅和他一起，所以一起被抓到了大明紫宫，从而认识了离境。"},{"name":"子阑","info":"墨渊座下第十六弟子，白浅的师兄，性格比较顽皮，曾经跟白浅打赌是折颜还是墨渊酿酒更好喝来着。刘芮麟饰演，看剧照来说，角色的贴合度不错。"},{"name":"折颜","info":"远古上神，原身是是开天辟地以来大洪荒时代孕出的第一只凤凰，十里桃林的主人。"},{"name":"白真","info":"青丘白止帝君第四子，白浅四哥，基友折颜。"},{"name":"离镜","info":"鬼君，当二皇子时曾与为男身的白浅有一段断袖情，后娶与白浅容貌相像的玄女为鬼后。"},{"name":"擎苍","info":"剧中他是离镜的爹，原妖族的王。因为墨渊座下的九弟子令羽与墨渊一战，祭出法器东皇钟却依然战败，但也因此导致墨渊魂飞魄散几万年之久。"},{"name":"少辛","info":"白浅救过的一只巴蛇，天性懦弱，服侍过白浅一段时间，后来嫁给跟当时跟白浅有婚约的天族太子桑吉。"},{"name":"桑籍","info":""},{"name":"凤九","info":"凤九率性可爱，自在开朗，是天地间唯一一只红狐狸，眉间有一朵红艳的凤羽花胎记。"},{"name":"东华","info":"东华帝君，性情冷淡，一直生活在三清幻境的菩提净土，世人不敢拉他进十丈红尘。一袭紫衫清贵高华，皓皓银发似青丘冻雪。"},{"name":"离怨","info":"妖族的大皇子，离镜的哥哥，曾在擎苍与墨渊的一战中领兵出战，擎仓被压东皇钟下之后兵败投降。"},{"name":"连宋","info":"连宋是天君的三皇子，夜华的三叔，是个花花公子，和东华的关系非常好，常打趣东华，被东华噎，在东华遇到麻烦时也愿意为东华两肋插刀。"}],
                        links:[{ source:"白止帝君",target:"白浅",value:"幺女"},{ source:"墨渊",target:"白浅",value:"弟子"},{ source:"白浅",target:"夜华",value:"夫妻"},{ source:"白浅",target:"阿离",value:"儿子"},{ source:"白浅",target:"素锦",value:"情敌"},{ source:"白浅",target:"玄女",value:"妹妹"},{ source:"天君",target:"夜华",value:"嫡孙"},{ source:"白浅",target:"夜华",value:"夫妻"},{ source:"夜华",target:"阿离",value:"儿子"},{ source:"夜华",target:"素锦",value:"侧妃"},{ source:"白浅",target:"阿离",value:"儿子"},{ source:"夜华",target:"阿离",value:"儿子"},{ source:"白浅",target:"素锦",value:"情敌"},{ source:"夜华",target:"素锦",value:"侧妃"},{ source:"离镜",target:"玄女",value:"夫妻"},{ source:"白浅",target:"玄女",value:"妹妹"},{ source:"白止帝君",target:"白浅",value:"幺女"},{ source:"白止帝君",target:"白真",value:"四子"},{ source:"白止帝君",target:"凤九",value:"孙女"},{ source:"墨渊",target:"白浅",value:"弟子"},{ source:"墨渊",target:"令羽",value:"弟子"},{ source:"墨渊",target:"子阑",value:"弟子"},{ source:"天君",target:"夜华",value:"嫡孙"},{ source:"天君",target:"桑籍",value:"二皇子"},{ source:"天君",target:"连宋",value:"三皇子"},{ source:"墨渊",target:"令羽",value:"弟子"},{ source:"墨渊",target:"子阑",value:"弟子"},{ source:"白真",target:"折颜",value:"好友"},{ source:"白止帝君",target:"白真",value:"四子"},{ source:"白真",target:"折颜",value:"好友"},{ source:"擎苍",target:"离镜",value:"二皇子"},{ source:"离镜",target:"玄女",value:"夫妻"},{ source:"擎苍",target:"离镜",value:"二皇子"},{ source:"擎苍",target:"离怨",value:"长子"},{ source:"桑籍",target:"少辛",value:"夫妻"},{ source:"天君",target:"桑籍",value:"二皇子"},{ source:"桑籍",target:"少辛",value:"夫妻"},{ source:"白止帝君",target:"凤九",value:"孙女"},{ source:"凤九",target:"东华",value:"喜欢"},{ source:"凤九",target:"东华",value:"喜欢"},{ source:"擎苍",target:"离怨",value:"长子"},{ source:"天君",target:"连宋",value:"三皇子"},]
                    	
                    	}
                    	
	                  
	                ]
	};
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

