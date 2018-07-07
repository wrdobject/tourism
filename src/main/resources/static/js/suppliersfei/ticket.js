$(function () {

    showAll(1,10);

})
 function showAll(pageIndex,pageCount) {
    $.ajax({
        url:'/selectAllTickets',
        type:'post',
        data:$("#queryInfo").serialize()+"&pageIndex="+pageIndex+"&pageCount="+pageCount,
        success:function (data) {
            var str = "";
            var tickname = "";

            for (var i = 0; i < data.length; i++) {
                if(data[i].ticketName == tickname){
                    continue;
                }else{
                    tickname = data[i].ticketName;
                }
                var imgpath = '';
                $.ajax({
                    url:'selectImgByOtherId',
                    type:'post',
                    data:'otherId='+data[i].ticketId,
                    async: false,
                    success:function (datas) {
                        if(datas.length == 0){
                           imgpath = 'dog.jpg'
                        }else{
                            imgpath = datas[0].imgPath
                        }
                    }
                })

                str += "<div class=\"layui-col-md5 san\" onclick='ticketInfo("+data[i].ticketId+")'><a href=\"javascript:;\" class=\"site-demo-active\" data-url=\"ticket_info\" data-id=\"ticket_info\" data-title=\"门票详情\" data-type=\"tabAdd\">"
                str += "<img src='/img/"+imgpath+"' style=\"width: 250px; height: 110px; margin: 2px 3px 1px 16px; border: 1px solid silver;\" class=\"img"+i+"\"/>";
                str+="<h5>&nbsp;&nbsp;&nbsp;&nbsp;【"+data[i].ticketName+"】</h5> <p> &nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tit\">联系人："+data[i].relationName+"</span></p> <p>&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tit\">联系方式："+data[i].relationPhone+"</span></p> </a> </div>";


            }
            $(".layui-row").html(str);

            // layui.use(['form',  'laypage'], function() {
            //
            //     var laypage = layui.laypage;
            //     //分页
            //     laypage.render({
            //         elem: 'demo7',
            //         count: pages,
            //         layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip'],
            //         jump: function(obj) {
            //
            //         }
            //     });
            // });

        }
    })
}

function ticketInfo(id) {
    location.href = "/goTicketInfo/"+id
}