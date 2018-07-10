$(function() {
    alert("加载");
    $("#update-hotel").click(function () {
        var hotel_id = $(this).attr("hotel_id");
        alert(hotel_id);
    });
});