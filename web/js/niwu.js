var niwu={};
function getBasePath(){
	 //获取当前网址，如： http://localhost:8083/proj/meun.jsp  
   var curWwwPath = window.document.location.href;  
   //获取主机地址之后的目录，如： proj/meun.jsp  
   var pathName = window.document.location.pathname;  
   var pos = curWwwPath.indexOf(pathName);  
   //获取主机地址，如： http://localhost:8083  
   var localhostPath = curWwwPath.substring(0, pos);  
   //获取带"/"的项目名，如：/proj  
   var projectName = pathName.substring(0, pathName.substr(1).indexOf('/')+1);  
   return localhostPath + projectName;
};



niwu.ajaxRequest=function(requestPath, param, fn){
	var layer, loading;
	layui.use("layer", function(){
		layer = layui.layer;
		loading = layer.load(2);
		
		$.ajax({
			url:getBasePath() + requestPath,
			type:"post",
			dataType:"json",
			data:param,
			success: function(e){			
				layer.close(loading);			
				fn(e);
				if(e.logout != null && e.logout != undefined) {	
					if(self.frameElement != null && self.frameElement.tagName.toLowerCase() == "iframe") {
						window.parent.location.href = e.logout;	
					} else {
						window.location.href = e.logout;
					}
				} else if(e.message != null && e.message != undefined) {
					layer.msg(e.message);
				}
			},
			error:function(){
				layer.msg("服务器异常！");
				layer.close(loading);
			}
		});
	});
};



niwu.formAjaxRequest=function(frmObj, requestPath, fn){
	var layer, loading;
	layui.use("layer", function(){
		layer = layui.layer;
		loading = layer.load(2);
		
		$(frmObj).ajaxSubmit({
			url: getBasePath() + requestPath,
			type: 'post',
			dataType: "json",
			success: function(e){			
				layer.close(loading);			
				fn(e);
				if(e.logout != null && e.logout != undefined) {	
					if(self.frameElement != null && self.frameElement.tagName.toLowerCase() == "iframe") {
						window.parent.location.href = e.logout;	
					} else {
						window.location.href = e.logout;
					}
				} else if(e.message != null && e.message != undefined) {
					layer.msg(e.message);
				}
			},
			error:function(data){
				layer.msg("服务器异常！");
				layer.close(loading);
			}
		});
	});
};



niwu.listPage=function(elem, count, limt, fn){
	var laypage;
	layui.use('laypage', function(){
		laypage = layui.laypage;
		laypage.render({
			elem: elem,
			count: count,
			limit: limt,
			first: '首页',
			last: '尾页',
			groups: 10,
			layout: ['count', 'prev', 'page', 'next'],
			theme: '#FF5722',
			jump: function(obj, first) {
				if(!first) {
					fn(obj.curr);
				}
			}
		});
	});	
}


niwu.orderStatus=function(orderStatus){
	var orderStatusStr = "";
	switch(orderStatus) {
		case 1: orderStatus = "待付款"; break;
		case 2: orderStatus = "待发货"; break;
		case 3: orderStatus = "待收货"; break;
		case 4: orderStatus = "交易完成"; break;
		case 5: orderStatus = "订单关闭"; break;
		case 6: orderStatus = "未付款删除"; break;
		case 7: orderStatus = "已付款删除"; break;
		default: orderStatus = "未知状态";
	}
	return orderStatus;
}