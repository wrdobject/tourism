var id = location.href.substring(location.href.lastIndexOf("/")+1);
$(function () {

    showid(id);
    showimg(id)
})

function showid(id) {
    $.ajax({
        url:"/selectAllTickets",
        type:'post',
        data:'ticketId='+id,
        success:function (data) {
            $(".tickid").val(data[0].ticketId);
            $(".lb").html(data[0].ticketType);
            $(".dj").html(data[0].ticketClass);
            $(".cz").html(data[0].ticketFax);
            $(".yx").html(data[0].ticketEmail);
            $(".dh").html(data[0].ticketPhone);
            $(".xxdz").html(data[0].ticketProvince+data[0].ticketCity+data[0].ticketCounty);
            $(".fzjd").html(data[0].ticketOwner);
            $(".xgsj").html(data[0].ticketTime);
            $(".jdjs").html(data[0].ticketIntroduce);
            var str = "";
            var name = "";
            var tep = 1;
            var str2 = "";
            for (var i = 0; i < data.length; i++) {
                if(data[i].relationName == name){
                    continue;
                }else{
                    name = data[i].relationName;
                }
                str += "<tr>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+tep+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].relationName+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].relationPhone+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].relationEmail+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].relationOwner+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">\n" +
                    "\t\t\t\t\t\t<button class=\"layui-btn layui-btn-xs\" onclick=\"add('"+data[i].relationName+"','"+data[i].relationPhone+"','"+data[i].relationEmail+"','"+data[i].relationId+"')\">编辑</button>\n" +
                    "\t\t\t\t\t\t<button class=\"layui-btn layui-btn-danger layui-btn-xs\" onclick='deletebyrelaid("+data[i].relationId+")'>删除</button>\n" +
                    "\t\t\t\t\t</td>\n" +
                    "\t\t\t\t</tr>";
                tep = tep + 1;
            }
            $(".lxrlb").html(str);
            tep = 1;
            for (var i = 0; i < data.length; i++) {
                name = data[0].relationName;
                var type = "";
                if(data[i].ticketFareType == 1){
                    type = "成人";
                }else if(data[i].ticketFareType == 2){
                    type = "儿童";
                }else{
                    type = "老人";
                }
                if(data[i].relationName != name){
                    break;
                }
                str2 += "<tr>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+tep+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+type+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].ticketFareCostedPay+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].ticketFareListedPay+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">"+data[i].ticketFareOwner+"</td>\n" +
                    "\t\t\t\t\t<td style=\"text-align: center;\">\n" +
                    "\t\t\t\t\t\t<button class=\"layui-btn layui-btn-xs\" onclick=\"addTicketInfo("+data[i].ticketFareId+","+data[i].ticketFareCostedPay+","+data[i].ticketFareListedPay+")\">编辑</button>\n" +
                    "\t\t\t\t\t\t<button class=\"layui-btn layui-btn-danger layui-btn-xs\" onclick=\"deletebyfareid("+data[i].ticketFareId+")\">删除</button>\n" +
                    "\t\t\t\t\t</td>\n" +
                    "\t\t\t\t</tr>";
                tep = tep + 1;
            }
            $(".mpxx").html(str2);
            
        }
    })
}

function showimg(id) {
    $.ajax({
        url:'/selectImgByOtherId',
        type:'post',
        data:'otherId='+id,
        success:function (data) {
            var str = '';
            for (var i = 0; i < data.length; i++) {
                str += "<div><img class=\"suna\" src=\"/img/"+data[i].imgPath+"\"></div>";
            }
            $(".lbtup").html(str);
        }
    })
}

function deletebyfareid(faceid) {
    if(!confirm("确定删除?")){
        return;
    }
    $.ajax({
        url:'/deletebyfareid',
        data:'ticketFareId='+faceid,
        type:'post',
        success:function (data) {
            showid(id);
        }
    })
}

function deletebyrelaid(relaid) {
    if(!confirm("确定删除?")){
        return;
    }
    $.ajax({
        url:'/deletebyrelaid',
        data:'relationId='+relaid+"&relationTypeId="+id,
        type:'post',
        success:function (data) {
            showid(id);
        }
    })
}

function showupdate() {
    location.href = "/goTicketAdd/"+id;
}