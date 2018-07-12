$(function () {

    layui.use('form', function() {
        var form = layui.form;


        $(".add").on("click", ".tijiao", function () {
            var hao = $(".hao").val();
            if (hao == null || hao == "") {
                alert("必填框不能为空");
                return false;
            }
            var froms = $("#aa").serialize();
            alert(froms);
            $.ajax({
                type: "GET",
                url: "/add/addsgroups",
                data: froms,
                dataType: "json",
                success: function (data) {
                    if (data.jia == "true") {

                        alert("新增成功");
                    window.location.href = "/one/adjustment"
                    } else if (data.jia == "false") {
                        alert(data);
                        alert("新增失败");
                    }
                }
                ,error:function(){
                    alert("加载失败");
                }

            })


        });

    });


});
