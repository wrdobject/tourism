/*function xinzeng(){
	var a="<tr><td style='width: 100px;'><select name='city' lay-verify='required'><option value=''></option><option value='0'>北京</option></select></td><td><input type='text' class='layui-input' name='' value=''></td><td style='width: 100px;'><a href='javascript:;' style='color: blue;' onclick='shanchu()'>删除</a></td></tr>";

    $("#table").append(a);
}*/


function show(){
	var num=Number($("#shuzi").text());
	//var str="<div id=day_"+num+">"+(num+1)+"天</div>";
	//var str1="<div id=xing_"+num+">"+(num+1)+"天</div>";
	var str="<div id=\"xing"+(num+1)+"\" style=\"height: 500px;\">\n" +
    "                    <div class=\"layui-col-md1\" id=\"daykuang\">\n" +
    "                        <div id=\"day\">Day</div>\n" +
    "                        <div id=\"time\">"+(num+1)+"</div>\n" +
    "                    </div>\n" +
    "                 <!--    行程标题开始 -->\n" +
    "                    <div class=\"layui-col-md11\" style=\"height: 350px;margin-top:5px;\">\n" +
    "                        <div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "                            <div class=\"layui-col-md1\" style=\"text-align: left;font-size: 14px;line-height: 34px;\">\n" +
    "                                行程标题：\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-col-md5\">\n" +
    "                                <div class=\"layui-form-item\">\n" +
    "                                    <input type=\"text\" style=\"height: 30px;\" name=\"\" value=\"\" class=\"layui-input\">\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                        </div>\n" +
    "\n" +
    "                        <div class=\"layui-row\" style=\"margin-left: 82px;\">\n" +
    "                            <div  class=\"layui-col-md2\">\n" +
    "                                <div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "                                    <div class=\"layui-col-md3\" style=\"text-align: center;font-size: 14px;line-height: 34px;\">\n" +
    "                                        <a href=\"javascript:;\" onclick=\"chooseSpot(this)\" class=\"layui-btn\">选择景点</a>\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-col-md2\" style=\"margin-left: 10px;\">\n" +
    "\n" +
    "                                <div class=\"layui-row\">\n" +
    "                                    <div class=\"layui-col-md2\" style=\"line-height: 34px;\">\n" +
    "                                        <a href=\"javascript:;\" class=\"layui-btn\" onclick=\"chooseHotel(this)\">选择酒店</a>\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "\n" +
    "                            </div>\n" +
    "\n" +
    "                        </div>\n" +
    "                        <div class=\"layui-input-block layui-col-md1\" style=\"margin-left:50px;\">\n" +
    "                            用餐：\n" +
    "                        </div>\n" +
    "                        <div class=\"layui-col-md6\" style=\"margin-left: 0px;\">\n" +
    "\n" +
    "                            <div class=\"layui-row\">\n" +
    "                                <div class=\"layui-input-block layui-col-md5\" style=\"margin-left:0px;\">\n" +
    "                                    <div class=\"layui-form-item\" style=\"margin-top:5px;\">\n" +
    "                                        <select name=\"city\" lay-verify=\"required\" style=\"width: 170px;height: 36px;\">\n" +
    "                                            <option value=\"\">早餐类型</option>\n" +
    "                                            <option value=\"0\">中餐</option>\n" +
    "                                            <option value=\"1\">西餐</option>\n" +
    "                                            <option value=\"2\">自助</option>\n" +
    "\n" +
    "                                        </select>\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "                                <div class=\"layui-input-block layui-col-md3\" style=\"margin-left:5px;\">\n" +
    "                                    <div class=\"layui-form-item\">\n" +
    "                                        <input type=\"text\" class=\"layui-input\" placeholder=\"早餐餐标\">\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-row\">\n" +
    "\n" +
    "                                <div class=\"layui-input-block layui-col-md5\" style=\"margin-left:0px;\">\n" +
    "                                    <div class=\"layui-form-item\" style=\"margin-top:5px;\">\n" +
    "                                        <select name=\"city\" lay-verify=\"required\" style=\"width: 170px;height: 36px;\">\n" +
    "                                            <option value=\"\">午餐类型</option>\n" +
    "                                            <option value=\"0\">中餐</option>\n" +
    "                                            <option value=\"1\">西餐</option>\n" +
    "                                            <option value=\"2\">自助</option>\n" +
    "\n" +
    "                                        </select>\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "                                <div class=\"layui-input-block layui-col-md3\" style=\"margin-left:5px;\">\n" +
    "                                    <div class=\"layui-form-item\">\n" +
    "                                        <input type=\"text\" class=\"layui-input\" placeholder=\"午餐餐标\">\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-row\">\n" +
    "                                <div class=\"layui-input-block layui-col-md5\" style=\"margin-left:0px;\">\n" +
    "                                    <div class=\"layui-form-item\" style=\"margin-top:5px;\">\n" +
    "                                        <select name=\"city\" lay-verify=\"required\" style=\"width: 170px;height: 36px;\">\n" +
    "                                            <option value=\"\">晚餐类型</option>\n" +
    "                                            <option value=\"0\">中餐</option>\n" +
    "                                            <option value=\"1\">西餐</option>\n" +
    "                                            <option value=\"2\">自助</option>\n" +
    "\n" +
    "                                        </select>\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "                                <div class=\"layui-input-block layui-col-md3\" style=\"margin-left:5px;\">\n" +
    "                                    <div class=\"layui-form-item\">\n" +
    "                                        <input type=\"text\" class=\"layui-input\" placeholder=\"晚餐餐标\" onmouseout=\"wancan(this)\">\n" +
    "                                    </div>\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                        </div>\n" +
    "                        <div class=\"layui-row\" style=\"margin-left: 50px;\">\n" +
    "                            <div  class=\"layui-col-md1\" style=\"text-align: left;font-size: 14px;line-height: 34px;\">\n" +
    "                                行程内容：\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-col-md8\">\n" +
    "                                <div class=\"layui-input-block\" style=\"margin-left: 0px;\">\n" +
    "                                    <textarea name=\"desc\" id=\"desc"+(num+1)+"\"  placeholder=\"请输入内容\" style=\"height: 150px;\" value=\"\" class=\"layui-textarea\"></textarea>\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                             \n" +
    "                        </div>\n" +
    "                        <div class=\"layui-row\" style=\"margin-left: 50px;margin-top:10px;\">\n" +
    "                 \t\t\t<div class=\"layui-col-md1\" style=\"text-align: left;font-size: 14px;line-height: 34px;\">\n" +
    "                                离 | 抵：\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-col-md2\">\n" +
    "                                <div class=\"layui-form-item\">\n" +
    "                                    <input type=\"text\" style=\"height: 30px;\" name=\"\" value=\"\" class=\"layui-input\">\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-col-md1\">\n" +
    "                                <div class=\"layui-form-item\" style=\"text-align: center;line-height: 28px;\">\n" +
    "                                    ——\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                            <div class=\"layui-col-md2\">\n" +
    "                                <div class=\"layui-form-item\">\n" +
    "                                    <input type=\"text\" style=\"height: 30px;\" name=\"\" value=\"\" class=\"layui-input\">\n" +
    "                                </div>\n" +
    "                            </div>\n" +
    "                 \t\t</div>\n" +
    "                        \n" +
    "                    </div>\n" +
    "\n" +
    "                      <!--    行程标题开始 -->\n" +
    "\n" +
    "                </div>";
	if(num==1){
	    $("#xing1").after(str);
        
	}else{
		/*var ti=$("#xing2"+(num-1)).text();*/
	     $("#xing"+num).after(str);
	}

}
var dayNum=0;
function chooseSpot(obj){
     dayNum=$(obj).parent().parent().parent().parent().parent().parent().index();
        alert(dayNum);
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
    '            <li><input type="radio" name="hotel" value="海纳国际"><i> 海纳国际 </i></li>\n' +
    '            <li><input type="radio" name="hotel" value="黄河京都"><i>黄河京都  </i></li>\n' +
    '            <li><input type="radio" name="hotel" value="aaa"><i> aaa </i></li>\n' +
    '            <li><input type="radio" name="hotel" value="bbb"><i> bbb </i></li>\n' +
    '            <li><input type="radio" name="hotel" value="ccc"><i> ccc </i></li>\n' +
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
