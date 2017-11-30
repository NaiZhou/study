
	function find(){
		var srname = {"name":$("#srchText").val()};//传入servlet的搜索内容
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
	                    repulsion : 50,//节点之间的斥力因子。支持数组表达斥力范围，值越大斥力越大。
	                    gravity : 0.002,//节点受到的向中心的引力因子。该值越大节点越往中心点靠拢。
	                    edgeLength :150,//边的两个节点之间的距离，这个距离也会受 repulsion。[10, 50] 。值越小则长度越长
	                    layoutAnimation : true,
	                //因为力引导布局会在多次迭代后才会稳定，这个参数决定是否显示布局的迭代动画，在浏览器端节点数据较多（>100）的时候不建议关闭，布局过程会造成浏览器假死。
	                	},
	                    draggable : true,
	                    focusNodeAdjacency : true,//是否在鼠标移到节点上的时候突出显示节点以及节点的边和邻接节点。
	                    edgeSymbol : [ 'none', 'none' ],//边两端的标记类型，可以是一个数组分别指定两端，也可以是单个统一指定。默认不显示标记，常见的可以设置为箭头，如下：edgeSymbol: ['circle', 'arrow']
	                    edgeSymbolSize : 10,//边两端的标记大小，可以是一个数组分别指定两端，也可以是单个统一指定。
	                    symbolSize: 50,
	                    itemStyle :{
	                    	normal:{
	                    		//默认样式
	                    		label:{
	                    			show:true
	                    		},
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
//	                    	data:persons,
//	                        links:relationship
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
		$.ajax({
	        type : "post",
	        async : true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
	        url : "EchatsServlet2",    //请求发送到Servlet处
	        data :srname,
	        dataType : "text",        //返回数据形式为json
	        success : function(result) {
	            //请求成功时执行该函数内容，result即为服务器返回的json对象
	            if (result) {
	            	var persons;
	            	var relationships;
	            	var sArray=new Array();
	           	    sArray=result.split("-");
	           	    persons=sArray[0];
	           	    relationships=sArray[1];
	           	    alert(persons);
	           	    alert(relationships);
	           	    var data1 = eval('('+persons+')');
	           	    var data2 = eval('('+relationships+')');
	           	 myChart.setOption({ 
	           		 
	                 series: [{
	                     data: data1,
	                     links:data2
	                     }],categories : [ //symbol name：用于和 legend 对应以及格式化 tooltip 的内容。 label有效
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
	                         } ]
	                 	
	                     
	             });
	            }
	            else alert("没有搜索到数据");
	        
	       },
	        error : function(XMLHttpRequest, textStatus, errorThrown) {
	       	 $("#p_test").innerHTML = "there is something wrong!";
	          alert(XMLHttpRequest.status);
	          alert(XMLHttpRequest.readyState);
	          alert(textStatus);
	        }
	   })
		myChart.setOption(option);
		myChart.on('click', openOrFold);
	}