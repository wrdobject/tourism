var hotel_id = location.href.substring(location.href.lastIndexOf("/")+1);
alert(hotel_id+"成功");
$(function () {
    if(!isNaN(hotel_id)){
        $.ajax({
            url:'/hotelById1',
            type:'post',
            data:{hotel_id:hotel_id},
            success:function (data) {
                alert(data);
                alert(data.hotel_name);
                $("#hotel_id").val(data.hotel_id);
                $("#hotel_name").val(data.hotel_name);
                $("#hotel_abbreviation").val(data.hotel_abbreviation);
                $("#hotel_phone").val(data.hotel_phone);
                $("#hotel_fax").val(data.hotel_fax);
                $("#hotel_email").val(data.hotel_email);
                $("#hotel_address").val(data.hotel_address);
                $("#hotel_introduce").html(data.hotel_introduce);
                $("#hotel_notice").html(data.hotel_notice);
            }
        })
    }
})