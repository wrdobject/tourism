var jing = location.href.lastIndexOf("#");
var id = 0;
if(jing == -1){
    id = location.href.substring(location.href.lastIndexOf("/")+1);
}else{
    id = location.href.substring(location.href.lastIndexOf("/")+1,jing);
}

var basicId = "";
$(function () {
    $.ajax({
        url:'/selectTeamAll',
        type:'post',
        data:'id='+id,
        success:function (data) {
            basicId = data.basicId;
            $(".xlmc").html(data.basicName);

            $(".cdgs").html(data.qCarName);
            $(".cllx").html(data.qType);
            $(".cph").html(data.qPlateNum);

            $(".zrs").html(data.numPeople);
            $(".qpxm").html(data.qTuanid);
            $(".qpdh").html(data.qTuanid);

            $(".dymc").html(data.username);
            $(".dydh").html(data.phoneno);

            $(".xc").html(data.basicDays);

            $(".jtsj").html(data.jietuanDate);
            $(".stsj").html(data.sendDate);

            $(".jtap").html(data.jietuanxinxi);
            $(".stap").html(data.sotuanxinxi);


            var str = "";
            for (var i = 0; i < data.basicDays; i++) {
                if(i == 0){
                    str += "<li class=\"active\"><a href=\"#section"+(i+1)+"\">第"+(i+1)+"天</a></li>";
                }else{
                    str += "<li><a href=\"#section"+(i+1)+"\">第"+(i+1)+"天</a></li>";
                }
            }
            $(".tianshu").html(str);

            $.ajax({
                url:'/getRouting',
                type:'post',
                data:'basicId='+basicId,
                success:function (data) {
                    var str = "";
                    for (var i = 0; i < data.length; i++) {
                        str += "<div id=\"section"+(i+1)+"\">\n" +
                            "\t\t\t\t\t\t\t<h1>第"+data[i].routingDays+"天 "+data[i].ticketName+"</h1>\n" +
                            "\t\t\t\t\t\t\t<li class=\"layui-timeline-item\">\n" +
                            "\t\t\t\t\t\t\t\t<i class=\"layui-icon layui-timeline-axis\">&#xe63f;</i>\n" +
                            "\t\t\t\t\t\t\t\t<div class=\"layui-timeline-content layui-text\">\n" +
                            "\t\t\t\t\t\t\t\t\t<h3 class=\"layui-timeline-title\">早餐</h3>\n" +
                            "\t\t\t\t\t\t\t\t\t<ul>\n" +
                            "\t\t\t\t\t\t\t\t\t\t<li>"+data[i].routingBreakfastType+"</li>\n" +
                            "\t\t\t\t\t\t\t\t\t\t<li>"+data[i].routingBreakfastPrice+"</li>\n" +
                            "\t\t\t\t\t\t\t\t\t</ul>\n" +
                            "\t\t\t\t\t\t\t\t</div>\n" +
                            "\t\t\t\t\t\t\t</li>\n" +
                            "\n" +
                            "\t\t\t\t\t\t\t<li class=\"layui-timeline-item\">\n" +
                            "\t\t\t\t\t\t\t\t<i class=\"layui-icon layui-timeline-axis\">&#xe63f;</i>\n" +
                            "\t\t\t\t\t\t\t\t<div class=\"layui-timeline-content layui-text\">\n" +
                            "\t\t\t\t\t\t\t\t\t<h3 class=\"layui-timeline-title\">午餐</h3>\n" +
                            "\t\t\t\t\t\t\t\t\t<ul>\n" +
                            "\t\t\t\t\t\t\t\t\t\t<li>"+data[i].routingLunchType+"</li>\n" +
                            "\t\t\t\t\t\t\t\t\t\t<li>"+data[i].routingLunchPrice+"</li>\n" +
                            "\t\t\t\t\t\t\t\t\t</ul>\n" +
                            "\t\t\t\t\t\t\t\t</div>\n" +
                            "\t\t\t\t\t\t\t</li>\n" +
                            "\n" +
                            "\t\t\t\t\t\t\t<li class=\"layui-timeline-item\">\n" +
                            "\t\t\t\t\t\t\t\t<i class=\"layui-icon layui-timeline-axis\">&#xe63f;</i>\n" +
                            "\t\t\t\t\t\t\t\t<div class=\"layui-timeline-content layui-text\">\n" +
                            "\t\t\t\t\t\t\t\t\t<h3 class=\"layui-timeline-title\">晚餐</h3>\n" +
                            "\t\t\t\t\t\t\t\t\t<ul>\n" +
                            "\t\t\t\t\t\t\t\t\t\t<li>"+data[i].routingDinnerType+"</li>\n" +
                            "\t\t\t\t\t\t\t\t\t\t<li>"+data[i].routingDinnerPrice+"</li>\n" +
                            "\t\t\t\t\t\t\t\t\t</ul>\n" +
                            "\t\t\t\t\t\t\t\t</div>\n" +
                            "\t\t\t\t\t\t\t</li>\n" +
                            " <h4>"+data[i].hotelName+" "+data[i].hotelClass+"</h4>"+
                            "\t\t\t\t\t\t</div>";
                    }

                    $(".xlnr").html(str);
                }
            })
        }
    });



})