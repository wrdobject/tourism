var id = location.href.substring(location.href.lastIndexOf("/")+1);
$(function () {
    if(!isNaN(id)){
       $.ajax({
           url:'/selectTicketsById',
           type:'post',
           data:'id='+id,
           success:function (data) {
               $(".ticketId").val(data.ticketId);
                $(".ticketName").val(data.ticketName);
               $(".ticketAbbreviation").val(data.ticketAbbreviation);
               $(".ticketFax").val(data.ticketFax);
               $(".ticketEmail").val(data.ticketEmail);
               $(".ticketPhone").val(data.ticketPhone);
               $(".ticketAddress").val(data.ticketAddress);
               $(".ticketIntroduce").html(data.ticketIntroduce);
           }
       })
    }
})

function pinyin() {

    $(".pinyin").val(makePy($(".pinyinname").val()));
}