//	myChart.showLoading();
//myChart.hideLoading();

//	$.ajax({
//        type : "post",
//        async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
//        url : "EchatsServlet",    //请求发送到Servlet处
//        data : {  },
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
//           	    alert(persons);
//           	    alert(relationships);
//           	    var data1 = eval('('+persons+')');
//           	    var data2 = eval('('+relationships+')');
//           	 myChart.setOption({      
//                 series: [{
//                     data: data1,
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

//	myChart.showLoading();
//myChart.hideLoading();
var result = document.getElementById('str').innerHTML;
var myChart = echarts.init(document.getElementById('main'), 'macarons');
var option = {

	animationDurationUpdate : 1500,
	animationEasingUpdate : 'quinticInOut',

	// tooltip: {
	// formatter: function (x) {
	// return "姓名:"+x.data.name+'<br/>'+"简介："+x.data.info+'<br/>'+
	// "日期："+x.data.date+'<br/>'+"电话："+x.data.tel+'<br/>'+"备注："+x.data.remark;
	// }
	// },

	series : [ {
		type : 'graph',// 关系图
		name : "关系图谱",// 名称，用于tooltip
		layout : 'force',// 力引导布局
		legendHoverLink : true,// 是否启用图例 hover(悬停) 时的联动高亮。
		hoverAnimation : true,// 是否开启鼠标悬停节点的显示动画
		coordinateSystem : null,// 坐标系可选
		xAxisIndex : 0, // x轴坐标 有多种坐标系轴坐标选项
		yAxisIndex : 0, // y轴坐标
		force : { // 力引导图基本配置
			// initLayout: ,//力引导的初始化布局，默认使用xy轴的标点
			repulsion : 50,// 节点之间的斥力因子。支持数组表达斥力范围，值越大斥力越大。
			gravity : 0.012,// 节点受到的向中心的引力因子。该值越大节点越往中心点靠拢。
			edgeLength : 100,// 边的两个节点之间的距离，这个距离也会受 repulsion。[10, 50]
								// 。值越小则长度越长
			layoutAnimation : true,
		// 因为力引导布局会在多次迭代后才会稳定，这个参数决定是否显示布局的迭代动画，在浏览器端节点数据较多（>100）的时候不建议关闭，布局过程会造成浏览器假死。
		},
		draggable : true,
		focusNodeAdjacency : true,// 是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点。
		edgeSymbol : [ 'none', 'none' ],// 边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。默认不显示标记，常见的可以设置为箭头，如下：edgeSymbol:
										// ['circle', 'arrow']
		edgeSymbolSize : 10,// 边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。
		symbolSize : 40,
		itemStyle : {
			normal : {
				// 默认样式
				label : {
					show : true
				},
				borderType : 'solid', // 图形描边类型，默认为实线，支持 'solid'（实线）,
										// 'dashed'(虚线), 'dotted'（点线）。
				borderColor : 'rgba(204,0,255,0.4)', // 设置图形边框颜色,透明度为0.4
				borderWidth : 0, // 图形的描边线宽。为 0 时无描边。
				opacity : 1,
			// 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。默认0.5

			},
			emphasis : {// 高亮状态
				label : {
					show : true
				},
				borderType : 'solid', // 图形描边类型，默认为实线，支持 'solid'（实线）,
										// 'dashed'(虚线), 'dotted'（点线）。
				borderColor : 'rgba(204,0,255,0.4)', // 设置图形边框颜色,透明度为0.4
				borderWidth : 3, // 图形的描边线宽。为 0 时无描边。
				opacity : 1
			}
		},
		lineStyle : {
			normal : {
				color : 'rgba(0,153,255,0.2)',
				width : '3',
				type : 'solid', // 线的类型 'solid'（实线）'dashed'（虚线）'dotted'（点线）
				opacity : 1
			},
			emphasis : {
				color : 'rgba(0,153,255,0.4)',
				width : '5',
				type : 'solid', // 线的类型 'solid'（实线）'dashed'（虚线）'dotted'（点线）
				opacity : 0.5
			}
		},
		label : {// 文本标签
			normal : {
				show : true,
				position : 'inside',
				textStyle : {
					color : 'black', // 字体颜色
					fontStyle : 'normal',// 文字字体的风格 'normal'标准 'italic'斜体
											// 'oblique' 倾斜
					fontWeight : 'bolder',// 'normal'标准'bold'粗的'bolder'更粗的'lighter'更细的或100
											// | 200 | 300 | 400...
					fontFamily : 'sans-serif', // 文字的字体系列
					fontSize : 8, // 字体大小
				}
			}

		},
		edgeLabel : {
			normal : {
				show : true,
				textStyle : {
					color : 'purple',// 字体颜色
					fontStyle : 'normal',// 文字字体的风格 'normal'标准 'italic'斜体
											// 'oblique' 倾斜
					fontWeight : 'bolder',// 'normal'标准'bold'粗的'bolder'更粗的'lighter'更细的或100
											// | 200 | 300 | 400...
					fontFamily : 'sans-serif', // 文字的字体系列
					fontSize : 8, // 字体大小
				},
				formatter : "{c}"
			},
			emphasis : {
				show : true,
				textStyle : {
					color : 'purple',// 字体颜色
					fontStyle : 'normal',// 文字字体的风格 'normal'标准 'italic'斜体
											// 'oblique' 倾斜
					fontWeight : 'bolder',// 'normal'标准'bold'粗的'bolder'更粗的'lighter'更细的或100
											// | 200 | 300 | 400...
					fontFamily : 'sans-serif', // 文字的字体系列
					fontSize : 8, // 字体大小
				},
				formatter : "{c}"
			}
		},
	// data:persons,
	// links:relationship

	}

	]
};
setdata(result);
function setdata(result) {
	// 请求成功时执行该函数内容，result即为服务器返回的json对象
	var data01;
	var relationships;
	var sArray = new Array();
	sArray = result.split("-");
	data01 = sArray[0];
	relationships = sArray[1];
	var data1 = eval('(' + data01 + ')');// 得到的persons无法直接使用， eval方法
	var data2 = eval('(' + relationships + ')');
	myChart.setOption({
		series : [ {
			type : 'graph',// 关系图
			data : data1,
			links : data2,
			categories : [ // symbol name：用于和 legend 对应以及格式化 tooltip 的内容。
							// label有效
			{
				symbol : 'rect',
				label : { // 标签样式

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
			

		} ]
	});
};

myChart.setOption(option);

function appendPath(params) { // 拼接节点关系并显示在左下角，
	var option = myChart.getOption();
	var series = option.series[params.seriesIndex]; // 获取图表
	var nodesOption = series.data;// 获取所有数据
	var links = series.links;// 获取所有连线
	var category = params.data.category;
	if (params.dataType == "node") { // dataType可以是edge(线条)或node(数据)
		var name = params.data.name;
		var info = params.data.info;
		var tel = params.data.tel;
		var date = params.data.date;
		var remark = params.data.remark;
		var str = "姓名:" + name + '<br/>' + "简介：" + info + '<br/>' + "日期："
				+ date + '<br/>' + "电话：" + tel + '<br/>' + "备注：" + remark;
		if (category == 1) {
			var str = "姓名:" + params.data.name + '<br/>' + "家庭住址:"
					+ params.data.jiatingzhuzhi + '<br/>' + "联系电话:"
					+ params.data.lianxidianhua + '<br/>' + "相关简介:"
					+ params.data.xiangguanjianjie + '<br/>' + "燃料类型:"
					+ params.data.ranliaoleixing + '<br/>' + "家庭人数:"
					+ params.data.jiatingrenshu + '<br/>' + "受捐金额:"
					+ params.data.shoujuanjine_yuan + '<br/>' + "贫困原因:"
					+ params.data.pinkunyuanyin;
			return str;
		}
		if (category == 2) {
			var str = "姓名:" + params.data.name + '<br/>' + "联系电话:"
					+ params.data.lianxidianhua + '<br/>' + "单位关系:"
					+ params.data.danweilishuguanxi + '<br/>' + "帮扶开始时间:"
					+ params.data.bangfukaishishijian + '<br/>' + "帮扶结束时间:"
					+ params.data.bangfujieshushijian + '<br/>' + "帮扶单位名称:"
					+ params.data.bangfudanweimingcheng;
			return str;

		}
		if (category == 3) {
			var str = "姓名:" + params.data.name + '<br/>' + "与户主关系:"
					+ params.data.yuhuzhuguanxi + '<br/>' + "务工时间:"
					+ params.data.wugongshijian + '<br/>' + "文化程度:"
					+ params.data.wenhuachengdu + '<br/>' + "劳动能力:"
					+ params.data.laodongnengli;
			return str;
		}
		if (category == 4) {
			var str = "项目名称:" + params.data.name + '<br/>' + "扶持年份:"
					+ params.data.fuchinianfen + '<br/>' + "项目类别:"
					+ params.data.xiangmuleibie + '<br/>' + "资金总额:"
					+ params.data.zijinzonge_yuan + '<br/>' + "建设内容:"
					+ params.data.jiansheneirong;
			return str;
		}
		if (category == 5) {
			var str = "链接:" + '<br/>' + params.data.url + '<br/>';
			return str;

		}

	} else if (params.dataType == "edge") { // 当鼠标停留在连线上时，暂不处理
		return "";
	}
}

function openOrFold(params) { // 该事件会提示节点间关系
	var str = appendPath(params);
	document.getElementById("main_1").innerHTML = str;
	return str;
}
// var ecConfig = echarts.config; echarts2的获取事件方法，当前为echarts3
myChart.on('click', openOrFold);
// myChart.on('click', function (params) {
//	   
// if (params.componentType === 'series') {
// if (params.seriesType === 'graph') {
// if (params.dataType === 'edge') {
// // 点击到了 graph 的 edge（边）上。
// }
// else {
// if(params.name=="张三")
// window.location.assign("Myecharts2.html")
//	            	 
// // 点击到了 graph 的 node（节点）上。
// }
// }
// }
//
// });

