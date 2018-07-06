$(function () {
   ajax_wrd();
});

function  ajax_wrd() {
    $.ajax({
        type:"post",
        dataType:"json",
        url:"/cha_wrd",
        success:function (data) {
            var str="";
            for (var i=0;i<data.length;i++){
              str="<div class=\"layui-col-md5 san\" id=\"zhui"+i+"\">\n" +
                    "\n" +
                    "\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"site-demo-active\" data-url=\"ticketing_info\" data-id=\"ticketing_info\" data-title=\"票务详情\" data-type=\"tabAdd\">\n" +
                    "\t\t\t\t\t\t\t\t<img src=\"/img/dog.jpg\" style=\"width: 250px; height: 110px; margin: 2px 3px 1px 16px; border: 1px solid silver;\" />\n" +
                    "\t\t\t\t\t\t\t\t<h5>&nbsp;&nbsp;&nbsp;&nbsp;票务："+data[i].ticketing_name+"</h5>\n" +
                    "\t\t\t\t\t\t\t\t<p>\n" +
                    "\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tit\">联系人："+data[i].relations[0].relation_name+"</span></p>\n" +
                    "\t\t\t\t\t\t\t\t<p>&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tit\">联系方式："+data[i].relations[0].relation_phone+"</span></p>\n" +
                    "\n" +
                    "\t\t\t\t\t\t\t</a>\n" +
                    "\t\t\t\t\t\t</div>";
               $(".layui-row").append(str);
                if(i>0){
                    $("#zhui"+(i+1)+"").after(str);
                }
            }
        },
        error:function () {
            alert("哈哈哈哈或");
        }
    })
}
