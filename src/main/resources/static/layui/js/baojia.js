/*function xinzeng(){
	var a="<tr><td style='width: 100px;'><select name='city' lay-verify='required'><option value=''></option><option value='0'>北京</option></select></td><td><input type='text' class='layui-input' name='' value=''></td><td style='width: 100px;'><a href='javascript:;' style='color: blue;' onclick='shanchu()'>删除</a></td></tr>";

    $("#table").append(a);
}*/


function show(){
	var num=Number($("#shuzi").text());
    
	//var str="<div id=day_"+num+">"+(num+1)+"天</div>";
	//var str1="<div id=xing_"+num+">"+(num+1)+"天</div>";
	var str="<div id=\"xing"+(num+1)+"\">\n" +
    "\t\t\t<div class=\"layui-col-md1\" id=\"daykuang\">\n" +
    "\t\t\t\t<div id=\"day\">Day</div>\n" +
    "\t\t\t\t<div id=\"time\">"+(num+1)+"</div>\n" +
    "\t\t\t</div>\n" +
    "\t\t\t<div class=\"layui-col-md11\" style=\"height: 350px;margin-top:5px;\">\n" +
    "\t\t\t\t<div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "\t\t \t \t\t<div class=\"layui-col-md1\" style=\"text-align: left;font-size: 14px;line-height: 34px;\">\n" +
    "\t\t    \t\t行程标题：\n" +
    "\t\t    \t\t</div>\n" +
    "\t\t    \t\t<div class=\"layui-col-md5\">\n" +
    "\t\t      \t\t\t<div class=\"layui-form-item\">  \t\t\t\t\t\n" +
    "\t\t     \t\t\t\t\t<input type=\"text\" style=\"height: 30px;\" name=\"\" value=\"\" class=\"layui-input\">\t\n" +
    " \t\t\t\t\t\t</div>\n" +
    "    \t\t\t\t</div>\n" +
    " \t \t\t\t</div>\n" +
    "        \n" +
    "        <div class=\"layui-row\" style=\"margin-left: 82px;\">\n" +
    "        <div  class=\"layui-col-md2\">\n" +
    "            <div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "              <div class=\"layui-col-md3\" style=\"text-align: center;font-size: 14px;line-height: 34px;\">\n" +
    "                  <a href=\"javascript:;\" onclick=\"chooseSpot(this)\" class=\"layui-btn\">选择景点</a>\n" +
    "                </div>\n" +
    "            </div>\n" +
    "              \n" +
    "          </div>\n" +
    "          <div class=\"layui-col-md2\" style=\"margin-left: 10px;\">\n" +
    "              \n" +
    "            <div class=\"layui-row\">       \n" +
    "                <div class=\"layui-col-md2\" style=\"line-height: 34px;\">\n" +
    "                <a href=\"javascript:;\" class=\"layui-btn\" onclick=\"chooseHotel(this)\">选择酒店</a>\n" +
    "                </div>     \n" +
    "            </div>\n" +
    "            \n" +
    "            </div>\n" +
    "      </div>\n" +
    "      <div class=\"layui-row\" style=\"margin-left: 50px;margin-top: 10px;\">\n" +
    "          <div class=\"layui-col-md1\" style=\"text-align: left;font-size: 14px;line-height: 34px;\">\n" +
    "            离 | 抵：\n" +
    "            </div>\n" +
    "            <div class=\"layui-col-md2\">\n" +
    "                <div class=\"layui-form-item\">           \n" +
    "                  <input type=\"text\" style=\"height: 30px;\" name=\"\" value=\"\" class=\"layui-input\"> \n" +
    "            </div>\n" +
    "            </div>\n" +
    "            <div class=\"layui-col-md1\">\n" +
    "                <div class=\"layui-form-item\" style=\"text-align: center;line-height: 28px;\">           \n" +
    "                  ——  \n" +
    "            </div>\n" +
    "            </div>\n" +
    "            <div class=\"layui-col-md2\">\n" +
    "                <div class=\"layui-form-item\">           \n" +
    "                  <input type=\"text\" style=\"height: 30px;\" name=\"\" value=\"\" class=\"layui-input\">  \n" +
    "            </div>\n" +
    "            </div>\n" +
    "        </div>\n" +
    " \t \t\t\t<div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "\t\t \t \t\t<div  class=\"layui-col-md4\" style=\"text-align: left;font-size: 14px;line-height: 34px;\">\n" +
    "\t\t    \t\t行程内容：\n" +
    "\t\t    \t\t</div>\t\n" +
    " \t \t\t\t</div> \n" +
    " \t \t\t\t<div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "\t\t \t \t\t\n" +
    "\t\t    \t\t<div class=\"layui-col-md4\">\n" +
    "\t\t      \t\t\t<div class=\"layui-form-item\">  \t\t\t\t\t\n" +
    "\t\t     \t\t\t\t<textarea name=\"desc\" id=\"desc"+(num+1)+"\" style=\"height: 150px;width: 800px;z-index: -1;\" placeholder=\"请输入内容\" class=\"layui-textarea\"></textarea> \t\n" +
    " \t\t\t\t\t\t</div>\n" +
    "    \t\t\t\t</div> \t\t\t\t\n" +
    " \t \t\t\t</div>\n" +
    " \t \t\t\n" +
    "\t\t</div>\n" +
    "\t\t</div>";
	if(num==1){
	    $("#xing").after(str);
        
	}else{
		/*var ti=$("#xing2"+(num-1)).text();*/
	     $("#xing"+num).after(str);
	}

}
var dayNum=0;
function chooseSpot(obj){
     dayNum=$(obj).parent().parent().parent().parent().parent().parent().index();
        
     var layer = layui.layer
              ,form = layui.form;
    layer.open({
  type: 1,
  skin: 'layui-layer-rim', //加上边框
  area: ['650px', '340px'], //宽高
  content: '<div class="layui-container" style="margin-top: 30px;width: 620px;">\n' +
    '  \n' +
    '    \n' +
    '    <div class="layui-row" style="margin-left: 0px;margin-top: 10px;">      \n' +
    '          <div class="layui-col-md2" style="text-align: center;font-size: 18px;line-height: 34px;">\n' +
    '          地址：\n' +
    '          </div>\n' +
    '          <div class="layui-input-block layui-col-md2" style="margin-left: 0px;">\n' +
    '            <select name="city" lay-verify="required" style="width: 100px;height: 34px;">\n' +
    '                  <option value="">请选择</option>\n' +
    '                <option value="0">山西</option>\n' +
    '                <option value="1">河北</option>\n' +
    '                \n' +
    '              </select>\n' +
    '          </div>\n' +
    '          <div class="layui-input-block layui-col-md2" style="margin-left: 20px;">\n' +
    '            <select name="city" lay-verify="required" style="width: 100px;height: 34px;">\n' +
    '                  <option value="">请选择</option>\n' +
    '                <option value="0">运城</option>\n' +
    '                <option value="1">榆次</option>\n' +
    '                \n' +
    '              </select>\n' +
    '          </div>\n' +
    '          <div class="layui-input-block layui-col-md2" style="margin-left: 20px;">\n' +
    '            <select name="city" lay-verify="required" style="width: 100px;height: 34px;">\n' +
    '                  <option value="">请选择</option>\n' +
    '                <option value="0">永济市</option>\n' +
    '                <option value="1">介休市</option>\n' +
    '                <option value="2">应县</option>\n' +
    '              </select>\n' +
    '          </div>\n' +
    '          <div class="layui-col-md2" style="text-align: center;font-size: 18px;line-height: 34px;">\n' +
    '          <a href="javascript:;" onclick="chooseSpot()" class="layui-btn" style="height: 34px;line-height: 34px;">搜索</a>\n' +
    '          </div>\n' +
    '    </div>\n' +
    '    <div class="layui-row" style="margin-left: 0px;margin-top: 20px;">\n' +
    '       <div>\n' +
    '    <div class="layui-col-md2" style="text-align: center;font-size: 18px;line-height: 34px;">\n' +
    '          景点：\n' +
    '          </div>\n' +
    '    <div class="layui-col-md10" style="border: 1px gray solid;text-align: left;border-radius: 5px;border-color: #E6E6E6;">\n' +
    '      <center>\n' +
    '\n' +
    '          <ul>\n' +
    '            <li><input type="checkbox" name="spots" value="五台山"><i>五台山  </i></li>\n' +
    '            <li><input type="checkbox" name="spots" value="五老峰"><i>五老峰  </i></li>\n' +
    '            <li><input type="checkbox" name="spots" value="晋祠"><i>晋祠  </i></li>\n' +
    '            <li><input type="checkbox" name="spots" value="雪花山"><i>雪花山  </i></li>\n' +
    '            <li><input type="checkbox" name="spots" value="崛围山"><i>崛围山  </i></li>\n' +
    '          </ul>\n' +
    '</center>\n' +
    '    </div>\n' +
    '  </div>\n' +
    '    </div>\n' +
    '    \n' +
    '</div>',
    btn: ['确认', '取消'],
    yes: function(index, layero) {
        //按钮【按钮一】的回调
        /*关闭*/
        writeSpots();
        layer.close(index);

    },
    btn2: function(index, layero) {
        //按钮【按钮二】的回调
    },
    cancel: function() {
        //右上角关闭回调
        //return false 开启该代码可禁止点击该按钮关闭
    },
    btnAlign: 'c',
    move: false,
    resize: false
});
}
function writeSpots(){
    obj=document.getElementsByName("spots");
    check_val=[];
    for(k in obj){
        if(obj[k].checked){
            check_val.push(obj[k].value);
        }
    }   
    var b=dayNum+1;
    $("#desc"+b).append("景点："+check_val+"\n");
}
var dayNum1
 function chooseHotel(obj){
    dayNum1=$(obj).parent().parent().parent().parent().parent().parent().index();
     var layer = layui.layer
              ,form = layui.form;
    layer.open({
  type: 1,
  skin: 'layui-layer-rim', //加上边框
  area: ['720px', '340px'], //宽高
  content: '<div class="layui-container" style="margin-top: 30px;width: 620px;">\n' +
    '  \n' +
    '    \n' +
    '    <div class="layui-row" style="margin-left: 0px;margin-top: 10px;">      \n' +
    '          <div class="layui-col-md2" style="text-align: center;font-size: 18px;line-height: 34px;">\n' +
    '          地址：\n' +
    '          </div>\n' +
    '          <div class="layui-input-block layui-col-md2" style="margin-left: 0px;">\n' +
    '            <select name="city" lay-verify="required" style="width: 100px;height: 34px;">\n' +
    '                  <option value="">请选择</option>\n' +
    '                <option value="0">山西</option>\n' +
    '                <option value="1">河北</option>\n' +
    '                \n' +
    '              </select>\n' +
    '          </div>\n' +
    '          <div class="layui-input-block layui-col-md2" style="margin-left: 20px;">\n' +
    '            <select name="city" lay-verify="required" style="width: 100px;height: 34px;">\n' +
    '                  <option value="">请选择</option>\n' +
    '                <option value="0">运城</option>\n' +
    '                <option value="1">榆次</option>\n' +
    '                \n' +
    '              </select>\n' +
    '          </div>\n' +
    '          <div class="layui-input-block layui-col-md2" style="margin-left: 20px;">\n' +
    '            <select name="city" lay-verify="required" style="width: 100px;height: 34px;">\n' +
    '                  <option value="">请选择</option>\n' +
    '                <option value="0">永济市</option>\n' +
    '                <option value="1">介休市</option>\n' +
    '                <option value="2">应县</option>\n' +
    '              </select>\n' +
    '          </div>\n' +
    '          <div class="layui-col-md2" style="text-align: center;font-size: 18px;line-height: 34px;">\n' +
    '          <a href="javascript:;" onclick="chooseSpot()" class="layui-btn" style="height: 34px;line-height: 34px;">搜索</a>\n' +
    '          </div>\n' +
    '    </div>\n' +
    '    <div class="layui-row" style="margin-left: 0px;margin-top: 20px;">\n' +
    '       <div>\n' +
    '    <div class="layui-col-md2" style="text-align: center;font-size: 18px;line-height: 34px;">\n' +
    '          酒店：\n' +
    '          </div>\n' +
    '    <div class="layui-col-md10" style="border: 1px gray solid;text-align: left;border-radius: 5px;border-color: #E6E6E6;">\n' +
    '      <center>\n' +
    '\n' +
    '          <ul>\n' +
    '            <li><input type="checkbox" name="hotel" value="海纳国际"><i> 海纳国际 </i></li>\n' +
    '            <li><input type="checkbox" name="hotel" value="黄河京都"><i>黄河京都  </i></li>\n' +
    '            <li><input type="checkbox" name="hotel" value="aaa"><i> aaa </i></li>\n' +
    '            <li><input type="checkbox" name="hotel" value="bbb"><i> bbb </i></li>\n' +
    '            <li><input type="checkbox" name="hotel" value="ccc"><i> ccc </i></li>\n' +
    '          </ul>\n' +
    '</center>\n' +
    '    </div>\n' +
    '  </div>\n' +
    '    </div>\n' +
    '    \n' +
    '</div>',
        btn: ['确认', '取消'],
    yes: function(index, layero) {
        //按钮【按钮一】的回调
        /*关闭*/
        writeHotel();
        layer.close(index);

    },
    btn2: function(index, layero) {
        //按钮【按钮二】的回调
    },
    cancel: function() {
        //右上角关闭回调
        //return false 开启该代码可禁止点击该按钮关闭
    },
    btnAlign: 'c',
    move: false,
    resize: false
});
}
function writeHotel(){
    obj=document.getElementsByName("hotel");
    check_val=[];
    for(k in obj){
        if(obj[k].checked){
            check_val.push(obj[k].value);
        }
    }   

    var b=dayNum1+1;
    $("#desc"+b).append("酒店："+check_val+"\n");
}
function del_show(){
    var num=Number($("#shuzi").text());
    
        if(num>1){
        $("#xing"+num).remove();
        }   
}

/*var j =[{"jiachuang":0,"jiachuangshu":0,"bujiachuang":0,"bujiachuangshu":0,"zaocan":0,"wucan":0,"wancan":0,"scenicPrice":0,"scenicBanPrice":0,"jipiao":0}];
var chengrenshu=0;
var zhanchuangshu=0;
var buzhanchuangshu=0;
var laorenshu=0;
var quanpeishu=0;
var q=0;
var w=0;
var e=0;
var r=0;
function chengren(obj){
	chengrenshu=$(obj).val();
	if(chengrenshu==null||chengrenshu==''){
		chengrenshu=0;
	}

	
}*/

/*function zhanchuang(obj){
	zhanchuangshu=$(obj).val();
	if(zhanchuangshu==null||zhanchuangshu==''){
		zhanchuangshu=0;
	}
	
}
function buzhanchuang(obj){
	buzhanchuangshu=$(obj).val();
	if(buzhanchuangshu==null||buzhanchuangshu==''){
		buzhanchuangshu=0;
	}
}
function laoren(obj){
	laorenshu=$(obj).val();
	
	if(laorenshu==null||laorenshu==''){
		laorenshu=0;
	}
	
}
function quanpei(obj){
	quanpeishu=$(obj).val();
	if(quanpeishu==null||quanpeishu==''){
		quanpeishu=0;
	}
}

function jiachuang(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	jiachuangshu=$(obj).val();
	var c=$(obj).next().val();
	var d=$(obj).val();
	if(c==null||c==''){
		c=0;
	}
	if(d==null||d==''){
		d=0;
	}
	j[b].jiachuangshu=d;
	j[b].jiachuang=c;
		
}
function bujiachuang(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	bujiachuangshu=$(obj).val();
	var c=$(obj).next().val();
	var d=$(obj).val();
	if(c==null||c==''){
		c=0;
	}
	if(d==null||d==''){
		d=0;
	}
	j[b].bujiachuangshu=d;
	j[b].bujiachuang=c;
	
}
function zaocan(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	var c=$(obj).val();
	if(c==null||c==''){
		c=0;
	}
	j[b].zaocan=c;
	
}
function wucan(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	var c=$(obj).val();
	if(c==null||c==''){
		c=0;
	}
	j[b].wucan=c;
	
}
function wancan(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	var c=$(obj).val();
	if(c==null||c==''){
		c=0;
	}
	j[b].wancan=c;
	
}
function jingdianpiaojia(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	var c=$(obj).next().val();
	var d=$(obj).next().next().val();
	if(c==null||c==''){
		c=0;
	}
	if(d==null||d==''){
		d=0;
	}
	j[b].scenicPrice=d;
	j[b].scenicBanPrice=c;

}
function jipiao(obj){
	var a=$(obj).parent().parent().parent().parent().parent().parent().index();
	var b=a/2;
	if(b<1){
		b=0;
	}
	var c=$(obj).val();
	if(c==null||c==''){
		c=0;
	}
	
	j[b].jipiao=c;
	
}

function ddd(){
	if(chengrenshu==null||chengrenshu==''){
		chengrenshu=0;
	}
	if(zhanchuangshu==null||zhanchuangshu==''){
		zhanchuangshu=0;
	}
	if(buzhanchuangshu==null||buzhanchuangshu==''){
		buzhanchuangshu=0;
	}
	if(laorenshu==null||laorenshu==''){
		laorenshu=0;
	}
	var lyk1=parseInt(chengrenshu);
	var lyk2=parseInt(zhanchuangshu);
	var lyk3=parseInt(buzhanchuangshu);
	var lyk4=parseInt(laorenshu);
	if((lyk1+lyk2+lyk4)==0){
		alert("请输入人数");
		return false;
	}
	var chengrenjia=0;
	var zhanchuangjia=0;
	var buzhanchuangjia=0;
	for (var i = j.length - 1; i >= 0; i--) {
		if(j[i].jiachuang==null||j[i].jiachuang==''){
			j[i].jiachuang=0;
		}
		if(j[i].jiachuangshu==null||j[i].jiachuangshu==''){
			j[i].jiachuangshu=0;
		}
		if(j[i].bujiachuang==null||j[i].bujiachuang==''){
			j[i].bujiachuang=0;
		}
		if(j[i].bujiachuangshu==null||j[i].bujiachuangshu==''){
			j[i].bujiachuangshu=0;
		}
		if(j[i].zaocan==null||j[i].zaocan==''){
			j[i].zaocan=0;
		}
		if(j[i].wucan==null||j[i].wucan==''){
			j[i].wucan=0;
		}
		if(j[i].wancan==null||j[i].wancan==''){
			j[i].wancan=0;
		}
		if(j[i].scenicPrice==null||j[i].scenicPrice==''){
			j[i].scenicPrice=0;
		}
		if(j[i].scenicBanPrice==null||j[i].scenicBanPrice==''){
			j[i].scenicBanPrice=0;
		}
		if(j[i].jipiao==null||j[i].jipiao==''){
			j[i].jipiao=0;
		}

		var aa=parseInt(j[i].jiachuang);
		var ab=parseInt(j[i].jiachuangshu);
		var bb=parseInt(j[i].bujiachuang);
		var bc=parseInt(j[i].bujiachuangshu);
		var cc=parseInt(j[i].zaocan);
		var dd=parseInt(j[i].wucan);
		var ee=parseInt(j[i].wancan);
		var ff=parseInt(j[i].scenicPrice);
		var gg=parseInt(j[i].jipiao);
		var hh=parseInt(j[i].scenicBanPrice);	
		chengrenjia +=(aa*ab+bb*bc)/(lyk1+lyk2+lyk4)+cc+dd+ee+ff+gg;
		zhanchuangjia +=(aa*ab+bb*bc)/(lyk1+lyk2+lyk4)+cc+dd+ee+hh+gg;
		buzhanchuangjia +=cc+dd+ee+gg;
	}
	var f = Math.round(chengrenjia*100)/100;    
	      var s = f.toString();    
	      var rs = s.indexOf('.');    
	      if (rs < 0) {    
	          rs = s.length;    
	          s += '.';    
	      }    
	      while (s.length <= rs + 2) {    
	          s += '0';    
	      }
	      chengrenjia=s;
	var y = Math.round(chengrenjia*100)/100;    
	      var u = y.toString();    
	      var i = u.indexOf('.');    
	      if (i < 0) {    
	          i = u.length;    
	          u += '.';    
	      }    
	      while (u.length <= i + 2) {    
	          u += '0';    
	      }
	      zhanchuangjia=u;
	$("#chengrenbaojia").val(chengrenjia);
	$("#laorenjiage").val(chengrenjia);
	$("#zhanchuangjiage").val(zhanchuangjia);
	$("#buzhanchuangjiage").val(buzhanchuangjia);
	var rr=$("#cheliangjia").val();
	var zong=lyk1*parseInt(chengrenjia)+lyk4*parseInt(chengrenjia)+lyk2*parseInt(zhanchuangjia)+lyk3*parseInt(buzhanchuangjia)+parseInt(rr);
	$("#zongbaojia").val(zong);
}*/



